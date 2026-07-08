package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS8S1000000_13;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0V2E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2E extends AbstractC791320V2k implements C0V2I {
    public static C0V2E LLJ;
    public static C0V2J LLJI;
    public static long LLJIJIL;
    public static boolean LLJILJIL;
    public static boolean LLJILJILJ;
    public static boolean LLJILLL;
    public static boolean LLJJ;
    public static volatile boolean LLJJI;
    public static volatile boolean LLJJIII;
    public static final HashMap<String, String> LLJJIJI = new HashMap<>();
    public C0V2L LLILLJJLI;
    public volatile String LLILLL;
    public final long[] LLILZ = new long[3];
    public volatile long LLILZIL;
    public RunnableC791140V1s LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    public final synchronized void LJIJJ() {
        if (this.LLIZ) {
            return;
        }
        if (LLJILJILJ && LLJILJIL) {
            C791390V2r.LJJIII.LJ(this);
            this.LLIZ = true;
        }
    }

    public final void LJIJ() {
        if (LLJJIII) {
            return;
        }
        List<C0V2I> list = C0V2F.LIZ;
        synchronized (C0V2F.class) {
            ((ArrayList) C0V2F.LIZ).add(this);
        }
        LLJJIII = true;
    }

    public C0V2E(boolean z) {
        if (!z) {
            LJIJ();
        }
        if (LLJ == null) {
            LLJ = this;
        }
    }

    public static void LJIJI(long j) {
        if (j < 70) {
            j = 1000;
        }
        LLJIJIL = j;
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILJJIL(String str) {
        this.LL = true;
        C0V2K.LJIILLIIL = 0;
        C0V2K.LIZLLL(4194302, AbstractC791470V2z.LIZIZ);
        if (AbstractC791470V2z.LIZIZ - this.LLILZIL > 300) {
            this.LLILZIL = AbstractC791470V2z.LIZIZ;
            this.LLILLJJLI = C0V2K.LJ(0L, "EvilMethodTracer#dispatchBegin");
        }
        this.LLILLL = str;
    }

    @Override // X.C0V2I
    public final synchronized void LJIILIIL(long j, boolean z, boolean z2) {
        if (!C791390V2r.LJJIII.LJJIFFI) {
            return;
        }
        LJIJI(j);
        this.LLIZLLLIL = false;
        LLJILJILJ = z;
        LLJJ = z2;
        if (z) {
            C786410Ut5.LJJZZIII(C0VCR.LIZ, new ARunnableS113S0100000_13(this, 236));
            C0V2K.LJI();
        } else {
            C786410Ut5.LJJZZIII(C0VCR.LIZ, new ARunnableS113S0100000_13(this, 237));
            C0V2K.LJII();
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILL(long j, long j2, long j3, long j4, boolean z) {
        String strLIZIZ;
        this.LL = false;
        C0V2K.LJFF(4194302, AbstractC791470V2z.LIZIZ);
        RunnableC791140V1s runnableC791140V1s = this.LLILZLL;
        if (runnableC791140V1s != null) {
            runnableC791140V1s.LLILLJJLI = z;
            runnableC791140V1s.LL = C791390V2r.LJJIII.LIZIZ.LIZIZ();
            C787900UvU.LIZ.LIZJ(this.LLILZLL);
            this.LLILZLL = null;
        }
        if (C0V2K.LIZ >= 2) {
            int i = C0V2K.LJIILLIIL;
            C0V2W[] c0v2wArr = new C0V2W[i];
            System.arraycopy(C0V2K.LJIILL, 0, c0v2wArr, 0, i);
            long j5 = j3 - j;
            if (j5 >= LLJIJIL) {
                C0V2J c0v2j = LLJI;
                if (c0v2j != null) {
                    C0V23 c0v23 = ((C0V2G) c0v2j).LIZ;
                    c0v23.getClass();
                    C791390V2r.LJJIII.LJIILIIL.LIZ(new ARunnableS113S0100000_13(c0v23, j5, z, 190));
                }
                C787900UvU.LIZ.LIZJ(new ARunnableS8S1000000_13("evil_method_begin", 12));
                C0V2L c0v2l = this.LLILLJJLI;
                int i2 = C0V2K.LJ - 1;
                if (c0v2l != null && C0V2K.LIZ != -3) {
                    long[] jArrLIZ = new long[0];
                    try {
                        jArrLIZ = C0V2K.LIZ(c0v2l.LIZ - 1, i2);
                    } catch (OutOfMemoryError e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (jArrLIZ != null && jArrLIZ.length != 0) {
                        System.arraycopy(this.LLILZ, 0, new long[3], 0, 3);
                        String strLIZJ = C314640CVa.LIZJ();
                        if (TextUtils.isEmpty(strLIZJ)) {
                            strLIZIZ = ActivityLifeObserver.getInstance().getTopActivityClassName();
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZJ);
                            sbLIZ.append(",");
                            sbLIZ.append(ActivityLifeObserver.getInstance().getTopActivityClassName());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        String str = this.LLILLL;
                        ActivityLifeObserver.getInstance().isForeground();
                        this.LLILZLL = new RunnableC791140V1s(strLIZIZ, jArrLIZ, j4 - j2, j5, j3, str, System.currentTimeMillis(), C791560V3i.LIZLLL().LJ(), c0v2wArr, this.LLIZLLLIL, LLJJIJI);
                        return;
                    }
                }
                C787900UvU.LIZ.LIZJ(new ARunnableS8S1000000_13("evil_method_data_null", 12));
            }
        }
    }
}
