package X;

import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.ListState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.15jK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20600815jK<T extends InterfaceC1891350zJl> extends ListState<T> {
    public final List<T> LJ = new ArrayList();
    public final ReentrantLock LJFF = new ReentrantLock();
    public C20601415jQ LJI;

    public final List<InterfaceC1891350zJl> LJII() {
        return new ArrayList(this.LJ);
    }

    public final int LJIIIIZZ() {
        return ((ArrayList) this.LJ).size();
    }

    public final void LJFF(Runnable runnable) {
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LJ).clear();
            reentrantLock.unlock();
            ListState.LIZ(this, this.LJ, false, false, runnable, 6);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final T LJI(int i) {
        return (T) ListProtector.get(this.LJ, i);
    }

    public final int LJIIIZ(T t) {
        return ((ArrayList) this.LJ).indexOf(t);
    }

    public static void LIZJ(C20600815jK c20600815jK, InterfaceC1891350zJl interfaceC1891350zJl) {
        ReentrantLock reentrantLock = c20600815jK.LJFF;
        reentrantLock.lock();
        try {
            ((ArrayList) c20600815jK.LJ).add(interfaceC1891350zJl);
            reentrantLock.unlock();
            ListState.LIZ(c20600815jK, c20600815jK.LJ, false, false, null, 6);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void LJIIJ(C20600815jK c20600815jK, Collection collection) {
        ((ArrayList) c20600815jK.LJ).clear();
        ((ArrayList) c20600815jK.LJ).addAll(collection);
        ListState.LIZ(c20600815jK, c20600815jK.LJ, true, false, null, 4);
    }

    public static void LJIIL(C20600815jK c20600815jK, InterfaceC1891350zJl interfaceC1891350zJl) {
        ReentrantLock reentrantLock = c20600815jK.LJFF;
        reentrantLock.lock();
        try {
            ((ArrayList) c20600815jK.LJ).remove(interfaceC1891350zJl);
            reentrantLock.unlock();
            ListState.LIZ(c20600815jK, c20600815jK.LJ, false, false, null, 6);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void LJIILIIL(C20600815jK c20600815jK, int i) {
        ReentrantLock reentrantLock = c20600815jK.LJFF;
        reentrantLock.lock();
        if (i >= 0) {
            try {
                if (i < ((ArrayList) c20600815jK.LJ).size()) {
                    reentrantLock.unlock();
                    ListState.LIZ(c20600815jK, c20600815jK.LJ, false, false, null, 6);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    public final void LIZLLL(Collection<? extends T> collection, Runnable runnable) {
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LJ).addAll(collection);
            reentrantLock.unlock();
            ListState.LIZ(this, this.LJ, false, false, runnable, 6);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJIIJJI(Collection<? extends T> collection, Runnable runnable) {
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LJ).clear();
            ((ArrayList) this.LJ).addAll(collection);
            reentrantLock.unlock();
            ListState.LIZ(this, this.LJ, false, true, runnable, 2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJIILJJIL(int i, T t) {
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        if (i >= 0) {
            try {
                if (i < ((ArrayList) this.LJ).size()) {
                    ((ArrayList) this.LJ).remove(i);
                    ((ArrayList) this.LJ).add(i, t);
                    reentrantLock.unlock();
                    ListState.LIZ(this, this.LJ, false, false, null, 14);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    public final void LJIILL(Collection<? extends T> collection, Runnable runnable) {
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LJ).clear();
            ((ArrayList) this.LJ).addAll(collection);
            reentrantLock.unlock();
            ListState.LIZ(this, this.LJ, false, false, runnable, 6);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJIIZILJ(Collection<? extends T> collection, Runnable runnable) {
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LJ).clear();
            ((ArrayList) this.LJ).addAll(collection);
            reentrantLock.unlock();
            C20600915jL<InterfaceC1891350zJl> c20600915jL = new C20600915jL<>(this.LJ, false, false);
            if (runnable != null) {
                c20600915jL.LIZLLL = Collections.singletonList(new C1891430zJt(runnable));
            }
            C20601415jQ c20601415jQ = this.LJI;
            if (c20601415jQ == null || !((Boolean) c20601415jQ.invoke(c20600915jL)).booleanValue()) {
                ListState.LIZ(this, this.LJ, false, false, runnable, 6);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void LIZIZ(C20600815jK c20600815jK, int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        ReentrantLock reentrantLock = c20600815jK.LJFF;
        reentrantLock.lock();
        if (i >= 0) {
            try {
                if (i <= ((ArrayList) c20600815jK.LJ).size()) {
                    ((ArrayList) c20600815jK.LJ).add(i, interfaceC1891350zJl);
                    reentrantLock.unlock();
                    ListState.LIZ(c20600815jK, c20600815jK.LJ, false, false, null, 6);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    public static void LJ(C20600815jK c20600815jK, int i, Collection collection) {
        ReentrantLock reentrantLock = c20600815jK.LJFF;
        reentrantLock.lock();
        if (i >= 0) {
            try {
                if (i <= ((ArrayList) c20600815jK.LJ).size()) {
                    ((ArrayList) c20600815jK.LJ).addAll(i, collection);
                    reentrantLock.unlock();
                    ListState.LIZ(c20600815jK, c20600815jK.LJ, false, false, null, 6);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    public static void LJIILLIIL(C20600815jK c20600815jK, int i, int i2, Collection collection) {
        ReentrantLock reentrantLock = c20600815jK.LJFF;
        reentrantLock.lock();
        try {
            int iMin = Math.min(i2 + i, ((ArrayList) c20600815jK.LJ).size());
            for (int i3 = i; i3 < iMin; i3++) {
                ((ArrayList) c20600815jK.LJ).remove(i);
            }
            ((ArrayList) c20600815jK.LJ).addAll(i, collection);
            reentrantLock.unlock();
            ListState.LIZ(c20600815jK, c20600815jK.LJ, false, false, null, 6);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
