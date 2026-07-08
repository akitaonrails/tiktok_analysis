package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q5H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536410q5H {
    public String LIZ;
    public int LIZIZ;
    public long LIZJ;
    public int LJ;
    public int LJFF;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public C1533790q13 LJIIJ;
    public C1532310pyf LJIIJJI;
    public Function1<? super C1533790q13, Unit> LJIIL;
    public Function1<? super C1532310pyf, Unit> LJIILIIL;
    public String LIZLLL = "unknown";
    public String LJI = "";

    public C1536410q5H(String str) {
        this.LIZ = str;
    }

    public final void LIZ(C1536500q5Q c1536500q5Q) {
        synchronized (this) {
            try {
                this.LJIIL = c1536500q5Q;
                C1533790q13 c1533790q13 = this.LJIIJ;
                if (c1533790q13 != null) {
                    LIZJ(null);
                    this.LJIIL = null;
                    if (c1536500q5Q != null) {
                        c1536500q5Q.invoke(c1533790q13);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(C1536510q5R c1536510q5R) {
        synchronized (this) {
            try {
                this.LJIILIIL = c1536510q5R;
                C1532310pyf c1532310pyf = this.LJIIJJI;
                if (c1532310pyf != null) {
                    LIZLLL(null);
                    this.LJIILIIL = null;
                    if (c1536510q5R != null) {
                        c1536510q5R.invoke(c1532310pyf);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(C1533790q13 c1533790q13) {
        synchronized (this) {
            try {
                this.LJIIJ = c1533790q13;
                Function1<? super C1533790q13, Unit> function1 = this.LJIIL;
                if (function1 != null) {
                    LIZ(null);
                    this.LJIIJ = null;
                    if (c1533790q13 != null) {
                        function1.invoke(c1533790q13);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(C1532310pyf c1532310pyf) {
        synchronized (this) {
            try {
                this.LJIIJJI = c1532310pyf;
                Function1<? super C1532310pyf, Unit> function1 = this.LJIILIIL;
                if (function1 != null) {
                    LIZIZ(null);
                    this.LJIIJJI = null;
                    if (c1532310pyf != null) {
                        function1.invoke(c1532310pyf);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
