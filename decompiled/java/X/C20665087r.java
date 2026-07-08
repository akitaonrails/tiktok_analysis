package X;

import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.087r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C20665087r {
    public final List<InterfaceC20666087s> mObservers = new ArrayList();
    public List<InterfaceC20666087s> mRemoveObservers = new ArrayList();
    public List<InterfaceC20666087s> mAddObservers = new ArrayList();
    public volatile boolean haveRemove = false;
    public volatile boolean haveAdd = false;

    public void setup(Object obj) {
    }

    public void addMessageObserver(InterfaceC20666087s interfaceC20666087s) {
        synchronized (this.mObservers) {
            if (interfaceC20666087s != null) {
                try {
                    if (!this.mAddObservers.contains(interfaceC20666087s)) {
                        this.mAddObservers.add(interfaceC20666087s);
                        this.haveAdd = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void messageDispatchStarting(String str) {
        if (this.haveAdd) {
            synchronized (this.mObservers) {
                try {
                    for (InterfaceC20666087s interfaceC20666087s : this.mAddObservers) {
                        if (!this.mObservers.contains(interfaceC20666087s)) {
                            this.mObservers.add(interfaceC20666087s);
                        }
                    }
                    this.mAddObservers.clear();
                    this.haveAdd = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        for (InterfaceC20666087s interfaceC20666087s2 : this.mObservers) {
            if (interfaceC20666087s2 != null) {
                interfaceC20666087s2.messageDispatchStarting(str);
            }
        }
    }

    public void removeMessageObserver(InterfaceC20666087s interfaceC20666087s) {
        synchronized (this.mObservers) {
            if (interfaceC20666087s != null) {
                try {
                    if (!this.mRemoveObservers.contains(interfaceC20666087s)) {
                        this.mRemoveObservers.add(interfaceC20666087s);
                        this.haveRemove = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void messageDispatched(String str, Message message) {
        for (InterfaceC20666087s interfaceC20666087s : this.mObservers) {
            if (interfaceC20666087s != null) {
                interfaceC20666087s.messageDispatched(str, message);
            }
        }
        if (this.haveRemove) {
            synchronized (this.mObservers) {
                try {
                    for (InterfaceC20666087s interfaceC20666087s2 : this.mRemoveObservers) {
                        this.mObservers.remove(interfaceC20666087s2);
                        this.mAddObservers.remove(interfaceC20666087s2);
                    }
                    this.mRemoveObservers.clear();
                    this.haveRemove = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
