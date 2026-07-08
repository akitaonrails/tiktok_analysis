package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Upu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784440Upu {
    public static volatile C784440Upu LIZIZ;
    public final C11PR<Object> LIZ = new C11RK().LJLLLL();

    public static C784440Upu LIZ() {
        if (LIZIZ == null) {
            synchronized (C784440Upu.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C784440Upu();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(Object obj) {
        this.LIZ.onNext(obj);
    }

    public final C11O8 LJ(Class cls) {
        return this.LIZ.LJJJZ(cls).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public final <T> C0J1N<T> LIZJ(LifecycleOwner lifecycleOwner, Class<T> cls) {
        return (C0J1N) this.LIZ.LJJJZ(cls).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(lifecycleOwner));
    }

    public final <T> C0J1N<T> LJFF(LifecycleOwner lifecycleOwner, Class<T> cls) {
        return (C0J1N) this.LIZ.LJJJZ(cls).LJJJLZIJ(C11S5.LIZLLL).LIZJ(C11RD.LJ(lifecycleOwner));
    }

    public final C0J1N LJI(LifecycleOwner lifecycleOwner, Class cls) {
        return LIZLLL(lifecycleOwner, cls, new InterfaceC19483011Ki() { // from class: X.0Upv
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return true;
            }
        });
    }

    public final <T> C0J1N<T> LIZLLL(LifecycleOwner lifecycleOwner, Class<T> cls, InterfaceC19483011Ki<T> interfaceC19483011Ki) {
        return (C0J1N) this.LIZ.LJJJZ(cls).LJJIL(interfaceC19483011Ki).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(lifecycleOwner));
    }
}
