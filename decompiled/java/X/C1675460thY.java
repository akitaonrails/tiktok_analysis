package X;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS117S0400000_21;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS8S0501000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0thY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675460thY {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1322480kWE<PurchaseOption> c1322480kWE, C19871212ow<String, String> c19871212ow, PurchaseOption purchaseOption, Function1<? super PurchaseOption, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-748576415);
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(c1322480kWE)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(c19871212ow)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(purchaseOption);
            } else {
                zLJII = c13zcLJIIJ.LJII(purchaseOption);
            }
            if (zLJII) {
                i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9361) == 9360 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), 16, 0.0f, 2);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS264S0000000_24.get$arr$(731);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Function1 function12 = (Function1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean z2 = true;
            if ((57344 & i2) == 16384) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJII2 = z | c13zcLJIIJ.LJII(c1322480kWE);
            if ((i2 & 7168) != 2048 && ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 || !c13zcLJIIJ.LJII(purchaseOption))) {
                z2 = false;
            }
            boolean zLJII3 = zLJII2 | z2 | c13zcLJIIJ.LJII(c19871212ow);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII3 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS117S0400000_21((C1322480kWE) c1322480kWE, (C1322480kWE<PurchaseOption>) function1, (Function1<? super PurchaseOption, Unit>) purchaseOption, (PurchaseOption) c19871212ow, (C19871212ow<String, String>) 15);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZ(54, 0, c13zcLJIIJ, interfaceC1685750ty9LJIIJ, function12, (Function1) objLJJ2);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS8S0501000_25(interfaceC1685750ty9, (InterfaceC1685750ty9) c1322480kWE, (C1322480kWE<PurchaseOption>) c19871212ow, (C19871212ow<String, String>) purchaseOption, (PurchaseOption) function1, (Function1<? super PurchaseOption, Unit>) i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.InterfaceC1685750ty9 r42, X.C1322480kWE<com.ss.android.ugc.aweme.model.PurchaseOption> r43, X.C19871212ow<java.lang.String, java.lang.String> r44, com.ss.android.ugc.aweme.model.PurchaseOption r45, java.lang.Integer r46, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.model.PurchaseOption, kotlin.Unit> r47, X.InterfaceC1680500tpg r48, int r49) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675460thY.LIZIZ(X.0ty9, X.0kWE, X.12ow, com.ss.android.ugc.aweme.model.PurchaseOption, java.lang.Integer, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(android.content.Context r33, X.C1614390s73 r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, boolean r36, X.InterfaceC1685750ty9 r37, X.InterfaceC1680500tpg r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675460thY.LIZLLL(android.content.Context, X.0s73, kotlin.jvm.functions.Function0, boolean, X.0ty9, X.0tpg, int, int):void");
    }

    public static final void LIZJ(C1322480kWE<PurchaseOption> c1322480kWE, C19871212ow<String, String> c19871212ow, boolean z, PurchaseOption purchaseOption, C1614390s73 c1614390s73, Function1<? super PurchaseOption, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        float f;
        float f2;
        String string;
        boolean z4;
        Object objLJJJLL;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean zLJII;
        int i8;
        boolean zLJII2;
        int i9;
        int i10;
        int i11;
        int i12;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-232843600);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c1322480kWE)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(c19871212ow)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
                zLJII2 = c13zcLJIIJ.LJJIIJ(purchaseOption);
            } else {
                zLJII2 = c13zcLJIIJ.LJII(purchaseOption);
            }
            if (zLJII2) {
                i9 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1614390s73);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1614390s73);
            }
            if (zLJII) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(num)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((i2 & 38347923) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (num != null && num.intValue() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                if (purchaseOption == null) {
                    objLJJJLL = C13LP.LJJJLL(c1322480kWE);
                } else {
                    objLJJJLL = purchaseOption;
                }
                objLJJ = C20028913Yh.LJI(objLJJJLL);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            String string2 = context.getResources().getString(2131847501);
            String string3 = context.getResources().getString(2131847502, string2);
            int iLJJJ = a0.LJJJ(string3, string2, 0, false, 6);
            List listSingletonList = Collections.singletonList(new C1692270u8f(new C1693450uAZ(C1670400tZO.LIZIZ(c13zcLJIIJ).L3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILLIIL.LIZ.LIZIZ, C1670400tZO.LJ(c13zcLJIIJ).LJIILLIIL.LIZ.LIZJ, null, null, C1670400tZO.LJ(c13zcLJIIJ).LJIILLIIL.LIZ.LJFF, null, 0L, null, null, null, 0L, null, null, 65496), iLJJJ, string2.length() + iLJJJ, "terms"));
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = new C612270Nzt();
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            C1692220u8a c1692220u8a = new C1692220u8a(string3, listSingletonList, 4);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
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
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                c13zcLJIIJ.LJJIIJZLJL(1232266460);
                if (c1614390s73 == null) {
                    i3 = 4;
                } else {
                    i3 = 4;
                    LIZLLL(context, c1614390s73, function02, z2, null, c13zcLJIIJ, (C1614390s73.$stable << 3) | ((i2 >> 15) & 896), 16);
                }
                c13zcLJIIJ.LJJJJL(false);
                float f3 = i3;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, 0.0f, f3, 0.0f, 0.0f, 13);
                PurchaseOption purchaseOption2 = (PurchaseOption) c05p0.getValue();
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (objLJJ3 == c1680520tpi) {
                    objLJJ3 = new AwS603S0100000_24(c05p0, (C05P0<PurchaseOption>) 653);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                c13zcLJIIJ.LJJJJL(false);
                int i13 = i2 << 3;
                LIZIZ(interfaceC1685750ty9LJIIL, c1322480kWE, c19871212ow, purchaseOption2, num, (Function1) objLJJ3, c13zcLJIIJ, (i13 & 896) | (i13 & 112) | 196614 | (PurchaseOption.$stable << 9) | ((i2 >> 12) & 57344));
                c13zcLJIIJ.LJJIIJZLJL(1232286982);
                if (!z2) {
                    k.LIZ(C1675980tiO.LIZIZ(c.LJI(c.LJ(C1682520tsw.LJIIL(c1685760tyA, 0.0f, 24, 0.0f, 0.0f, 13), 1.0f), 1), C1670400tZO.LIZIZ(c13zcLJIIJ).T2(), C1669430tXp.LIZ), c13zcLJIIJ, 0);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                if ((3670016 & i2) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (z3 || objLJJ4 == c1680520tpi) {
                    objLJJ4 = new AwS568S0100000_24(function0, (Function0<Unit>) 1844);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C634380OuS.LIZ(c1685760tyA, interfaceC595010NVj, null, true, null, null, (Function0) objLJJ4);
                if (z2) {
                    f = 24;
                } else {
                    f = 12;
                }
                float f4 = 16;
                C1685190txF.LIZIZ(c1692220u8a, c.LJ(C1682520tsw.LJIIL(interfaceC1685750ty9LIZ, f4, f, f4, 0.0f, 8), 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2000);
                InterfaceC1685750ty9 interfaceC1685750ty9LJ2 = c.LJ(c1685760tyA, 1.0f);
                if (z2) {
                    f2 = f4;
                } else {
                    f2 = 12;
                }
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(interfaceC1685750ty9LJ2, f4, f2, f4, 0.0f, 8);
                if (num != null && num.intValue() != 0) {
                    string = context.getString(2131837276);
                } else {
                    string = context.getString(2131847437);
                }
                C1666330tSp c1666330tSpLIZ = C1666340tSq.LIZ(0L, 0L, 0.0f, 0L, c13zcLJIIJ, 0, 31);
                C1666930tTn c1666930tTnLIZ = C1666920tTm.LIZ(0.0f, null, 0.0f, c13zcLJIIJ, 0, 15);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                if ((458752 & i2) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (z4 || objLJJ5 == c1680520tpi) {
                    objLJJ5 = new AwS425S0200000_24(c05p0, (C05P0<PurchaseOption>) function1, (Function1<? super PurchaseOption, Unit>) 95);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1673400teE.LIZJ((Function0) objLJJ5, string, interfaceC1685750ty9LJIIL2, false, 0L, false, null, null, null, c1666930tTnLIZ, c1666330tSpLIZ, null, z, c13zcLJIIJ, 0, i2 & 896, 2552);
                C1665790tRx.LIZ(c.LJI(c1685760tyA, f3), c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1675470thZ(c1322480kWE, c19871212ow, z, purchaseOption, c1614390s73, function1, function0, function02, num, i);
        }
    }
}
