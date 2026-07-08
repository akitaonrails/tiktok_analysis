package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2209821BeG {
    public static final long[] LJ = {180000, 180000, 360000, 360000, 540000, 540000, 720000, 720000};
    public final C2209911BeP LIZ;
    public int LIZIZ;
    public volatile boolean LIZJ;
    public long LIZLLL;

    public abstract boolean LIZJ(int i);

    public abstract String LIZLLL();

    public abstract long[] LJ();

    public abstract boolean LJFF();

    public abstract long LJI();

    public final long LIZIZ() {
        long jLJI = LJI();
        if (LJFF() && !C804420Vh2.LJFF(this.LIZ.LLILLL.LJIIJ)) {
            this.LIZ.LLILLL.LJJZZI.LJII("checkWorkTime {} network not available, will try again next interval!", LIZLLL());
            this.LIZ.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.NO_NETWORK_COUNT, 1);
        } else if (this.LIZJ) {
            jLJI = 0;
            this.LIZLLL = 0L;
            this.LIZJ = false;
        } else {
            int i = this.LIZIZ;
            if (i > 0) {
                long[] jArrLJ = LJ();
                jLJI = jArrLJ[(i - 1) % jArrLJ.length];
            }
        }
        return this.LIZLLL + jLJI;
    }

    public AbstractC2209821BeG(C2209911BeP c2209911BeP) {
        this.LIZ = c2209911BeP;
    }

    public final long LIZ(int i) {
        long jLIZIZ = LIZIZ();
        if (jLIZIZ <= System.currentTimeMillis()) {
            synchronized (this) {
                boolean zLJI = MethodIDManager.LJI(137726);
                try {
                    boolean zLIZJ = LIZJ(i);
                    this.LIZLLL = System.currentTimeMillis();
                    if (!zLIZJ) {
                        this.LIZIZ++;
                    } else {
                        this.LIZIZ = 0;
                    }
                    C2209791BeD c2209791BeD = this.LIZ.LLILLL.LJJZZI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(LIZLLL());
                    sbLIZ.append(" worked: {}");
                    c2209791BeD.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ), Boolean.valueOf(zLIZJ));
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZ.LLILLL.LJJZZI.LJIIZILJ(null, "work failed", th, new Object[0]);
                        this.LIZLLL = System.currentTimeMillis();
                        this.LIZIZ++;
                        C2209791BeD c2209791BeD2 = this.LIZ.LLILLL.LJJZZI;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(LIZLLL());
                        sbLIZ2.append(" worked: {}");
                        c2209791BeD2.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2), Boolean.FALSE);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        this.LIZLLL = System.currentTimeMillis();
                        this.LIZIZ++;
                        C2209791BeD c2209791BeD3 = this.LIZ.LLILLL.LJJZZI;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(LIZLLL());
                        sbLIZ3.append(" worked: {}");
                        c2209791BeD3.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3), Boolean.FALSE);
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                        throw th2;
                    }
                }
                jLIZIZ = LIZIZ();
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
        }
        return jLIZIZ;
    }
}
