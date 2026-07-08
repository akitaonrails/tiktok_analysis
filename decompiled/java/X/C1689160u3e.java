package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S0131000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0u3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689160u3e {
    public static final void LIZ(C2025007wW c2025007wW, boolean z, boolean z2, boolean z3, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String str;
        C1685380txY c1685380txYLJFF;
        int iIntValue;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1504315789);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c2025007wW)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            if (z) {
                str = c2025007wW.LLILLJJLI;
            } else {
                str = c2025007wW.LL;
            }
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(c2025007wW.LLILZ, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new AwS426S0200000_25(context, c05p0LJIIIIZZ, 47);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            Function0 function0LIZ = C1675010tgp.LIZ(1, 0L, c13zcLJIIJ, (Function0) objLJJ);
            String strLIZIZ = c2025007wW.LLIZLLLIL;
            c13zcLJIIJ.LJJIIJZLJL(1756521513);
            if (strLIZIZ == null) {
                Integer num = c2025007wW.LLILZLL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                strLIZIZ = C0MBB.LIZIZ(iIntValue, c13zcLJIIJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            if (str != null && str.length() != 0) {
                c13zcLJIIJ.LJJIIJZLJL(-1382300125);
                c1685380txYLJFF = C1670540tZc.LIZLLL(new C1175204ik(str), null, null, null, null, null, c13zcLJIIJ, 0, 62);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-1382218285);
                C1668880tWw c1668880tWw = c2025007wW.LLILZIL;
                if (c1668880tWw == null) {
                    c1668880tWw = C1668100tVg.LIZ;
                }
                c1685380txYLJFF = C1688900u3E.LJFF(c1668880tWw, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            }
            int i7 = i2 >> 3;
            C1673210tdv.LIZ(null, strLIZIZ, 0, null, false, false, null, false, c1685380txYLJFF, false, null, z2, z3, null, null, null, null, null, function0LIZ, null, null, null, null, false, C13Z4.LIZJ(-1807626060, new AwS639S0100000_25(c2025007wW, 39), c13zcLJIIJ), c13zcLJIIJ, 0, (i7 & 112) | (i7 & 896), 24576, 16508669);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0131000_25(c2025007wW, z, z2, z3, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(boolean r18, boolean r19, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.OrdersVM r20, X.InterfaceC1680500tpg r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689160u3e.LIZIZ(boolean, boolean, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.OrdersVM, X.0tpg, int, int):void");
    }
}
