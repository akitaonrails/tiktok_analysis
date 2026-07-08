package X;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S0131000_25;
import kotlin.jvm.internal.AwS66S0500000_2;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0u3J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688950u3J {
    public static final void LIZ(C2017707vL c2017707vL, boolean z, boolean z2, boolean z3, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z4;
        int iIntValue;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1958727376);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c2017707vL)) {
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
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1677470tkn.LIZ(0.0f);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C1677480tko c1677480tko = (C1677480tko) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ2;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p0 = (C05P0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 220255724;
                }
                objLJJ4 = new C1685910tyP(C1685850tyJ.LIZIZ(iIntValue));
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            long j = ((C1685910tyP) objLJJ4).LIZ;
            c13zcLJIIJ.LJJJJL(false);
            Boolean boolValueOf = Boolean.valueOf(z3);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            if ((i2 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zLJII = z4 | c13zcLJIIJ.LJII(c1677480tko);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ5 == c1680520tpi) {
                objLJJ5 = new C05ST(c1677480tko, c05p0, null, z3);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ5, c13zcLJIIJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                String strLIZIZ = C0MBB.LIZIZ(c2017707vL.LIZ().intValue(), c13zcLJIIJ);
                C1685380txY c1685380txYLJFF = C1688900u3E.LJFF(c2017707vL.LL, c13zcLJIIJ);
                Function2<Context, String, Unit> function2 = c2017707vL.LLILZLL;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(function2);
                Object objLJJ6 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ || objLJJ6 == c1680520tpi) {
                    objLJJ6 = new AwS66S0500000_2(interfaceC497601wk, (InterfaceC497601wk) c2017707vL, (C2017707vL) context, (Context) c1677480tko, (C1677480tko<Float, C1677280tkU>) c05p0, (C05P0<Boolean>) 2);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1673210tdv.LIZ(null, strLIZIZ, 0, null, false, false, null, false, c1685380txYLJFF, false, null, z, z2, null, null, null, null, null, C1675010tgp.LIZ(1, 0L, c13zcLJIIJ, (Function0) objLJJ6), null, null, null, null, false, C1244780iUu.LIZ, c13zcLJIIJ, 0, (i2 & 112) | (i2 & 896), 24576, 16508669);
                c13zcLJIIJ.LJJIIJZLJL(1756406483);
                if (((Boolean) c05p0.getValue()).booleanValue()) {
                    k.LIZ(C1675980tiO.LIZIZ(c1672220tcK.LIZ(c1685760tyA), C1685910tyP.LIZJ(C1685910tyP.LJFF(j) * ((Number) c1677480tko.LIZLLL()).floatValue(), j), C1669430tXp.LIZ), c13zcLJIIJ, 0);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0131000_25(c2017707vL, z, z2, z3, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(boolean r17, boolean r18, boolean r19, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.SwitchInboxModeVM r20, X.InterfaceC1680500tpg r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688950u3J.LIZIZ(boolean, boolean, boolean, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.SwitchInboxModeVM, X.0tpg, int, int):void");
    }
}
