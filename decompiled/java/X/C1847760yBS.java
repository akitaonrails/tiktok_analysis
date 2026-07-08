package X;

import Y.ARunnableS17S1000000_27;
import com.ss.android.ugc.aweme.nxet.event.EventDispatch;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0yBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847760yBS {
    public static final Map<String, C1847770yBT> LIZ = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:142:0x02bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C1847770yBT r15) {
        /*
            Method dump skipped, instruction units count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1847760yBS.LIZ(X.0yBT):void");
    }

    public static void LIZIZ(C1847770yBT c1847770yBT) {
        if (c1847770yBT.LIZLLL()) {
            return;
        }
        if (c1847770yBT.LIZ.LJII > 0) {
            String strLIZIZ = c1847770yBT.LIZIZ();
            LIZ.put(strLIZIZ, c1847770yBT);
            EventDispatch.LIZ.postDelayed(new ARunnableS17S1000000_27(strLIZIZ, 1), c1847770yBT.LIZ.LJII);
            return;
        }
        LIZ(c1847770yBT);
    }
}
