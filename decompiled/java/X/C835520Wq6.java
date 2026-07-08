package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835520Wq6<TResult> {
    public final C835510Wq5<TResult> LIZ = new C835510Wq5<>();

    public final void LIZ(Exception exc) {
        this.LIZ.LJIIZILJ(exc);
    }

    public final void LIZIZ(TResult tresult) {
        this.LIZ.LJIJ(tresult);
    }

    public final boolean LIZJ(Exception exc) {
        C835510Wq5<TResult> c835510Wq5 = this.LIZ;
        c835510Wq5.getClass();
        C0W3J.LJIIIZ(exc, "Exception must not be null");
        synchronized (c835510Wq5.LIZ) {
            try {
                if (c835510Wq5.LIZJ) {
                    return false;
                }
                c835510Wq5.LIZJ = true;
                c835510Wq5.LJFF = exc;
                c835510Wq5.LIZIZ.LIZ(c835510Wq5);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LIZLLL(TResult tresult) {
        C835510Wq5<TResult> c835510Wq5 = this.LIZ;
        synchronized (c835510Wq5.LIZ) {
            try {
                if (c835510Wq5.LIZJ) {
                    return false;
                }
                c835510Wq5.LIZJ = true;
                c835510Wq5.LJ = tresult;
                c835510Wq5.LIZIZ.LIZ(c835510Wq5);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
