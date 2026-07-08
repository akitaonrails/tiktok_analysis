package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.11NI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11NI implements InterfaceC420801kM, C11S3 {
    public List<InterfaceC420801kM> LL;
    public volatile boolean LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILLJJLI) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI) {
                    return;
                }
                this.LLILLJJLI = true;
                List<InterfaceC420801kM> list = this.LL;
                ArrayList arrayList = null;
                this.LL = null;
                if (list != null) {
                    Iterator<InterfaceC420801kM> it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().dispose();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C11SP.LIZ(th);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th);
                        }
                    }
                    if (arrayList != null) {
                        if (arrayList.size() != 1) {
                            throw new C0VYA(arrayList);
                        }
                        throw C11QG.LIZIZ((Throwable) ListProtector.get(arrayList, 0));
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI;
    }

    @Override // X.C11S3
    public final boolean LIZ(InterfaceC420801kM interfaceC420801kM) {
        if (!this.LLILLJJLI) {
            synchronized (this) {
                try {
                    if (!this.LLILLJJLI) {
                        List linkedList = this.LL;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.LL = linkedList;
                        }
                        linkedList.add(interfaceC420801kM);
                        return true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        interfaceC420801kM.dispose();
        return false;
    }

    @Override // X.C11S3
    public final boolean LIZIZ(InterfaceC420801kM interfaceC420801kM) {
        C1701890uOB.LIZ(interfaceC420801kM, "Disposable item is null");
        if (this.LLILLJJLI) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI) {
                    return false;
                }
                List<InterfaceC420801kM> list = this.LL;
                if (list == null || !((LinkedList) list).remove(interfaceC420801kM)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C11S3
    public final boolean LIZJ(InterfaceC420801kM interfaceC420801kM) {
        if (LIZIZ(interfaceC420801kM)) {
            interfaceC420801kM.dispose();
            return true;
        }
        return false;
    }
}
