package X;

import android.view.View;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ch5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021690ch5 {
    public static final int LIZ(C425220Gls c425220Gls) {
        Pair pairLIZIZ = LIZIZ(c425220Gls);
        int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLIZIZ.getSecond()).intValue();
        if (C426750GoL.LJFF()) {
            return -iIntValue;
        }
        return iIntValue2;
    }

    public static final Pair LIZIZ(C425220Gls c425220Gls) {
        int iComputeHorizontalScrollRange = c425220Gls.computeHorizontalScrollRange() - c425220Gls.computeHorizontalScrollExtent();
        int iComputeHorizontalScrollOffset = c425220Gls.computeHorizontalScrollOffset();
        return new Pair(Integer.valueOf(-iComputeHorizontalScrollOffset), Integer.valueOf(iComputeHorizontalScrollRange - iComputeHorizontalScrollOffset));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[PHI: r1
      0x001c: PHI (r1v4 java.lang.String) = (r1v0 java.lang.String), (r1v5 java.lang.String) binds: [B:12:0x001a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[PHI: r1
      0x0024: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String), (r1v4 java.lang.String) binds: [B:12:0x001a, B:14:0x001e, B:16:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C1021680ch4 r4, int r5) {
        /*
            com.ss.android.ugc.aweme.IAnoleProductTilesService r0 = com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTilesServiceImpl.LIZJ()
            if (r0 != 0) goto L7
            return
        L7:
            r0.LIZIZ(r5)
            X.0cN3 r3 = new X.0cN3
            com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTilesModel r2 = r4.LLJLIL
            if (r2 == 0) goto L18
            com.ss.android.ugc.aweme.component.nativeproducttilescomponent.LogInfo r0 = r2.logInfo
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.tag
            if (r1 != 0) goto L1c
        L18:
            java.lang.String r1 = "draw_ad"
            if (r2 == 0) goto L24
        L1c:
            com.ss.android.ugc.aweme.component.nativeproducttilescomponent.LogInfo r0 = r2.logInfo
            if (r0 == 0) goto L24
            java.lang.String r0 = r0.refer
            if (r0 != 0) goto L26
        L24:
            java.lang.String r0 = "tiles"
        L26:
            r3.<init>(r1, r0)
            X.0cMW r2 = new X.0cMW
            r0 = 1
            r2.<init>(r5, r0, r3)
            X.0cV7 r1 = r4.LLILLL
            X.0brF r0 = new X.0brF
            r0.<init>(r2)
            r1.LJIJ(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1021690ch5.LIZJ(X.0ch4, int):void");
    }

    public static final void LJI(C1021680ch4 c1021680ch4, float f) {
        View view = c1021680ch4.LLJLLL;
        if (view == null || view.getTranslationX() == f) {
            return;
        }
        C786410Ut5.Jc(view, f);
    }

    public static final void LIZLLL(C1021680ch4 c1021680ch4, int i, String str) {
        if (i == c1021680ch4.LLJZIJLIL) {
            return;
        }
        c1021680ch4.LLJZIJLIL = i;
        if (i != -1 && c1021680ch4.LLILZIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBigPhotoPosition position:");
            sbLIZ.append(i);
            sbLIZ.append(" tag:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c1021680ch4.LLILLL.LJIJ(new C989550brF(new C1008970cMZ(i, c1021680ch4.LLILLJJLI.LIZ)), c1021680ch4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(X.C1021680ch4 r19, int r20, X.C425220Gls r21, boolean r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1021690ch5.LJ(X.0ch4, int, X.0Gls, boolean, boolean, boolean):void");
    }

    public static void LJFF(C1021680ch4 c1021680ch4, View view, C425220Gls c425220Gls, boolean z, boolean z2, int i) {
        int left;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i & 4) != 0) {
            z4 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if (C426750GoL.LJFF()) {
            left = view.getRight();
        } else {
            left = view.getLeft();
        }
        LJ(c1021680ch4, left, c425220Gls, z4, false, z3);
    }
}
