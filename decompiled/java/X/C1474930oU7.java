package X;

import Y.AObjectS69S0000000_16;
import Y.ARunnableS95S0000000_19;
import Y.ARunnableS98S0000000_23;
import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0oU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474930oU7 {
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static boolean LJFF;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static final ArrayList<Runnable> LIZ = new ArrayList<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS69S0000000_16(3));
    public static volatile boolean LJ = true;
    public static final ARunnableS95S0000000_19 LJI = new ARunnableS95S0000000_19(1);

    public static void LIZ() {
        LJFF = true;
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        int iIntValue = ((Number) C1474810oTv.LLJJIJI.getValue()).intValue();
        if (iIntValue <= 0) {
            C786410Ut5.LJJZZIII((Handler) LIZIZ.getValue(), new ARunnableS98S0000000_23(13));
        } else {
            C786410Ut5.LJLIIL(iIntValue, (Handler) LIZIZ.getValue(), new ARunnableS98S0000000_23(12));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        if (r0 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        X.C1474930oU7.LIZ.add(new Y.ARunnableS123S0100000_23(r4, 95));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r2.equals("TASK_POWER_MONITOR_REGISTER") == false) goto L6;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1474940oU8 r4) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1474930oU7.LIZIZ(X.0oU8):void");
    }
}
