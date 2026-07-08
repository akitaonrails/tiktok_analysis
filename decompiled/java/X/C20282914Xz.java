package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS2S0121000_30;
import kotlin.jvm.internal.AwS404S0200000_3;

/* JADX INFO: renamed from: X.14Xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20282914Xz {
    public static final void LIZ(C2015907v3 c2015907v3, boolean z, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(117009104);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c2015907v3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            String strLIZIZ = C0MBB.LIZIZ(R.string.t5e, c13zcLJIIJ);
            C1685380txY c1685380txYLJFF = C1688900u3E.LJFF(C1669660tYC.LLLIILIL, c13zcLJIIJ);
            boolean z3 = c2015907v3.LL;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new AwS404S0200000_3(c2015907v3, context, 11);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1673210tdv.LIZ(null, strLIZIZ, 0, null, z3, false, null, false, c1685380txYLJFF, false, null, z, z2, null, null, null, null, null, C1675010tgp.LIZ(1, 0L, c13zcLJIIJ, (Function0) objLJJ), null, null, null, null, false, C1244560iUY.LIZ, c13zcLJIIJ, 0, (i2 & 112) | (i2 & 896), 24576, 16508653);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0121000_30(c2015907v3, z, z2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(boolean r18, boolean r19, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AnalyticsVM r20, X.InterfaceC1680500tpg r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20282914Xz.LIZIZ(boolean, boolean, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AnalyticsVM, X.0tpg, int, int):void");
    }
}
