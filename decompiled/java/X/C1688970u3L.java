package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LanguageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS2S0221000_25;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0u3L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688970u3L {
    public static final long LIZ = C1685850tyJ.LIZIZ(639686124);

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(boolean r17, boolean r18, X.InterfaceC1680500tpg r19, int r20) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688970u3L.LIZIZ(boolean, boolean, X.0tpg, int):void");
    }

    public static final void LIZ(C2016007v4 c2016007v4, boolean z, boolean z2, LanguageVM languageVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        long jJ2;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1704400693);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c2016007v4)) {
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
            if (c13zcLJIIJ.LJII(languageVM)) {
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
                objLJJ = C1677470tkn.LIZ(1.0f);
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
            Boolean boolValueOf = Boolean.valueOf(c2016007v4.LL);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJII = c13zcLJIIJ.LJII(c2016007v4) | c13zcLJIIJ.LJII(c1677480tko) | c13zcLJIIJ.LJII(languageVM);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C08WJ(c2016007v4, c1677480tko, languageVM, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ3, c13zcLJIIJ);
            Boolean boolValueOf2 = Boolean.valueOf(c2016007v4.LL);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII2 = c13zcLJIIJ.LJII(c1677480tko) | c13zcLJIIJ.LJII(interfaceC497601wk);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS369S0200000_3(c1677480tko, (C1677480tko<Float, C1677280tkU>) interfaceC497601wk, (InterfaceC497601wk) 6);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LIZIZ(boolValueOf2, (Function1) objLJJ4, c13zcLJIIJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1546500034);
            if (c2016007v4.LL) {
                jJ2 = C1685910tyP.LIZJ(((Number) c1677480tko.LIZLLL()).floatValue(), LIZ);
            } else {
                jJ2 = C1670400tZO.LIZIZ(c13zcLJIIJ).J2();
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c1685760tyA, jJ2, C1669050tXD.LIZIZ(8));
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
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
                String strLIZIZ = C0MBB.LIZIZ(2131836405, c13zcLJIIJ);
                C1685380txY c1685380txYLJFF = C1688900u3E.LJFF(C1669660tYC.LIZIZ, c13zcLJIIJ);
                Function1<C07W7, Unit> function1 = c2016007v4.LLILLJJLI;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(function1);
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ || objLJJ5 == c1680520tpi) {
                    objLJJ5 = new C2016107v5(interfaceC497601wk, c2016007v4, context, languageVM, c1677480tko);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1673210tdv.LIZ(null, strLIZIZ, 0, null, false, false, null, false, c1685380txYLJFF, false, null, z, z2, null, null, null, null, null, C1675010tgp.LIZ(1, 0L, c13zcLJIIJ, (Function0) objLJJ5), null, null, null, null, false, C1244730iUp.LIZ, c13zcLJIIJ, 0, (i2 & 112) | (i2 & 896), 24576, 16508669);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0221000_25(c2016007v4, z, z2, languageVM, i, 0);
        }
    }
}
