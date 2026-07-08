package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XC4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0XC4 {
    public final Context LIZ;
    public final C844770XBz LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public final C0XCI LJ;
    public boolean LJFF;
    public InterfaceC586790Mzt LJI;

    public abstract void LIZ();

    public abstract boolean LIZIZ();

    public abstract String LIZJ();

    public abstract long[] LIZLLL();

    public abstract void LJ();

    public abstract void LJFF();

    public abstract long LJI();

    public abstract void LJII(boolean z);

    public abstract void LJIIIIZZ(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final C844890XCl LJIIIZ() {
        boolean zLIZIZ;
        int i;
        long jLJI;
        LJFF();
        int i2 = 1;
        boolean z = 0;
        z = 0;
        boolean z2 = C2106408Na.LIZ(this.LIZ);
        C844890XCl c844890XCl = new C844890XCl();
        if (z2) {
            long jLJI2 = this.LIZLLL + LJI();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jLJI2 <= 1000 + jCurrentTimeMillis) {
                try {
                    zLIZIZ = LIZIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C844830XCf.LIZLLL(e);
                    zLIZIZ = false;
                }
                if (zLIZIZ) {
                    c844890XCl.LIZLLL = this.LIZJ;
                    this.LIZJ = 0;
                    this.LIZLLL = System.currentTimeMillis();
                    jLJI = LJI();
                    i = 0;
                } else {
                    long[] jArrLIZLLL = LIZLLL();
                    i = 4;
                    if (jArrLIZLLL.length == 0) {
                        c844890XCl.LIZLLL = 0;
                        jLJI = 0;
                        i2 = 0;
                    } else {
                        int i3 = this.LIZJ;
                        int i4 = i3 + 1;
                        this.LIZJ = i4;
                        int length = i3 % jArrLIZLLL.length;
                        jLJI = jArrLIZLLL[length];
                        if (length == jArrLIZLLL.length - 1) {
                            c844890XCl.LIZLLL = i4;
                        } else {
                            i = 3;
                        }
                        i2 = 0;
                    }
                }
                String str = LIZJ() + " worked:" + zLIZIZ + " " + jLJI;
                InterfaceC844900XCm interfaceC844900XCm = C844830XCf.LIZIZ;
                if (interfaceC844900XCm != null) {
                    interfaceC844900XCm.LIZIZ(str, null);
                }
                z = i2;
                i2 = i;
            } else {
                jLJI = jLJI2 - jCurrentTimeMillis;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("time not ready. need ");
                sbLIZ.append(jLJI);
                C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                i2 = 2;
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("network not ready. delay ");
            jLJI = 60000;
            sbLIZ2.append(60000L);
            sbLIZ2.append(" ms do ");
            sbLIZ2.append(LIZJ());
            C844830XCf.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        c844890XCl.LIZIZ = i2;
        c844890XCl.LIZ = z;
        c844890XCl.LIZJ = jLJI;
        return c844890XCl;
    }

    public C0XC4(Context context, C844770XBz c844770XBz) {
        this.LIZ = context;
        this.LIZIZ = c844770XBz;
        this.LJ = C0XCI.LJII(String.valueOf(c844770XBz.LIZ));
    }

    public C0XC4(Context context, C844770XBz c844770XBz, long j) {
        this.LIZ = context;
        this.LIZIZ = c844770XBz;
        this.LIZLLL = j;
        this.LJ = C0XCI.LJII(String.valueOf(c844770XBz.LIZ));
    }
}
