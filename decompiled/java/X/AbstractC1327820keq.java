package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0keq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1327820keq<T> implements InterfaceC1328020kfA<T> {
    public boolean LIZ;

    public static boolean LIZLLL(int i) {
        return (i & 1) == 1;
    }

    public static boolean LJIIJ(int i, int i2) {
        return (i & i2) == i2;
    }

    @Override // X.InterfaceC1328020kfA
    public final synchronized void LIZIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        try {
            LJFF();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIZ(e);
        }
    }

    public abstract void LJFF();

    public abstract void LJI(Throwable th);

    public abstract void LJII(int i, Object obj);

    public abstract void LJIIIIZZ(float f);

    public static boolean LJ(int i) {
        return !LIZLLL(i);
    }

    @Override // X.InterfaceC1328020kfA
    public final synchronized void LIZ(float f) {
        if (this.LIZ) {
            return;
        }
        try {
            LJIIIIZZ(f);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIZ(e);
        }
    }

    public final void LJIIIZ(Exception exc) {
        Class<?> cls = getClass();
        if (C1328570kg3.LIZ.LIZIZ(6)) {
            C1328570kg3.LIZ.LIZ(cls.getSimpleName(), exc);
        }
    }

    @Override // X.InterfaceC1328020kfA
    public final synchronized void onFailure(Throwable th) {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        try {
            LJI(th);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIZ(e);
        }
    }

    @Override // X.InterfaceC1328020kfA
    public final synchronized void LIZJ(int i, Object obj) {
        if (this.LIZ) {
            return;
        }
        this.LIZ = LIZLLL(i);
        try {
            LJII(i, obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIZ(e);
        }
    }
}
