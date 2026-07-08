package androidx.lifecycle;

import X.C197077128t;
import X.InterfaceC1294060jmO;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes30.dex */
public abstract class ViewModel {
    public final C197077128t impl;

    public void onCleared() {
    }

    public final void clear$lifecycle_viewmodel_release() {
        C197077128t c197077128t = this.impl;
        if (c197077128t != null && !c197077128t.LIZLLL) {
            c197077128t.LIZLLL = true;
            synchronized (c197077128t.LIZ) {
                try {
                    Iterator it2 = ((LinkedHashMap) c197077128t.LIZIZ).values().iterator();
                    while (it2.hasNext()) {
                        C197077128t.LIZIZ((AutoCloseable) it2.next());
                    }
                    Iterator<AutoCloseable> it3 = c197077128t.LIZJ.iterator();
                    while (it3.hasNext()) {
                        C197077128t.LIZIZ(it3.next());
                    }
                    c197077128t.LIZJ.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        onCleared();
    }

    public ViewModel() {
        this.impl = new C197077128t();
    }

    @InterfaceC1294060jmO
    public void addCloseable(Closeable closeable) {
        C197077128t c197077128t = this.impl;
        if (c197077128t != null) {
            if (c197077128t.LIZLLL) {
                C197077128t.LIZIZ(closeable);
                return;
            }
            synchronized (c197077128t.LIZ) {
                try {
                    c197077128t.LIZJ.add(closeable);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        C197077128t c197077128t = this.impl;
        if (c197077128t != null) {
            synchronized (c197077128t.LIZ) {
                try {
                    t = (T) c197077128t.LIZIZ.get(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return t;
        }
        return null;
    }

    public ViewModel(AutoCloseable... autoCloseableArr) {
        this.impl = new C197077128t((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        C197077128t c197077128t = this.impl;
        if (c197077128t != null) {
            if (c197077128t.LIZLLL) {
                C197077128t.LIZIZ(autoCloseable);
                return;
            }
            synchronized (c197077128t.LIZ) {
                try {
                    c197077128t.LIZJ.add(autoCloseable);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public ViewModel(InterfaceC497601wk interfaceC497601wk) {
        this.impl = new C197077128t(interfaceC497601wk);
    }

    public ViewModel(InterfaceC497601wk interfaceC497601wk, AutoCloseable... autoCloseableArr) {
        this.impl = new C197077128t(interfaceC497601wk, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        C197077128t c197077128t = this.impl;
        if (c197077128t != null) {
            c197077128t.LIZ(str, autoCloseable);
        }
    }
}
