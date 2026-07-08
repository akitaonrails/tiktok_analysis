package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0QNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669290QNb {
    public static double[] LIZ;
    public static boolean LIZIZ;
    public static final C01GW LIZJ;

    static {
        double[] dArr = new double[6];
        int i = 0;
        do {
            dArr[i] = 0.0d;
            i++;
        } while (i < 6);
        LIZ = dArr;
        LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(490));
    }

    public static void LIZIZ() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        String string = ((Keva) LIZJ.getValue()).getString("sug_model_weights_key", "");
        int i = 0;
        if (string.length() > 0) {
            try {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Double.valueOf(CastDoubleProtector.parseDouble((String) it2.next())));
                }
                double[] dArrLLFZ = C13LP.LLFZ(arrayList);
                LIZ = dArrLLFZ;
                if (dArrLLFZ.length != 6) {
                    double[] dArr = new double[6];
                    int i2 = 0;
                    do {
                        dArr[i2] = 0.0d;
                        i2++;
                    } while (i2 < 6);
                    LIZ = dArr;
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                double[] dArr2 = new double[6];
                do {
                    dArr2[i] = 0.0d;
                    i++;
                } while (i < 6);
                LIZ = dArr2;
            }
        }
    }

    public static double LIZJ(double[] dArr) {
        LIZIZ();
        double d = 0.0d;
        if (dArr.length != 6) {
            return 0.0d;
        }
        boolean[] zArrLIZ = AnonymousClass0503.LIZ();
        int length = LIZ.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.LJFF(C13LQ.LJJII(i, zArrLIZ), Boolean.TRUE)) {
                d += LIZ[i] * dArr[i];
            }
        }
        return 1.0d / (Math.exp(-d) + 1.0d);
    }

    public static double[] LIZ(C669330QNf c669330QNf, double d) {
        return new double[]{c669330QNf.LIZ, c669330QNf.LIZIZ, c669330QNf.LIZJ, c669330QNf.LIZLLL, c669330QNf.LJ, C13LZ.LIZJ(d / 10000.0d, 0.0d, 1.0d)};
    }
}
