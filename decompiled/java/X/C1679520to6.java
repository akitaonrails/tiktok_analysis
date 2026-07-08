package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS131S1000000_25;
import kotlin.jvm.internal.AwS319S0300000_25;
import kotlin.jvm.internal.AwS3S1302000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0to6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679520to6 {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C0W0S r24, X.InterfaceC1680500tpg r25, int r26) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679520to6.LIZIZ(X.0W0S, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C05P1<java.lang.String> r14, X.C1679540to8 r15, X.InterfaceC1680500tpg r16, int r17) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679520to6.LIZ(X.05P1, X.0to8, X.0tpg, int):void");
    }

    public static final void LIZJ(C05P1<String> c05p1, C05P1<Boolean> c05p12, InterfaceC1685750ty9 interfaceC1685750ty9, String str, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C05P1<Boolean> c05p13 = c05p12;
        String strLJII = str;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-793759104);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p13)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0 && c13zcLJIIJ.LJJIIJ(strLJII)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else {
                if (i8 != 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ == C1680510tph.LIZIZ) {
                        objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    c05p13 = (C05P1) objLJJ;
                    c13zcLJIIJ.LJJJJL(false);
                }
                if (i9 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i2 & 8) != 0) {
                    strLJII = C1857750yRZ.LJII(2131822568);
                    i3 &= -7169;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJ(new AwS569S0100000_25(c05p1, (C05P1<C1687320u0g>) 774));
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1676910tjt c1676910tjtLJ = C1676860tjo.LJ(Boolean.valueOf(((Boolean) ((C05P1) objLJJ2).getValue()).booleanValue()), null, c13zcLJIIJ, 0, 2);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1679540to8(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C1679540to8 c1679540to8 = (C1679540to8) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = AFwS266S0000000_25.get$arr$(366);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1676540tjI c1676540tjILJ = C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5));
            C1676550tjJ c1676550tjJLJI = C1676510tjF.LJI(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5));
            C19719212De c19719212DeLIZJ = C13Z4.LIZJ(691995401, new AwS319S0300000_25((C05P1) c05p13, (C05P1<Boolean>) c05p1, (C05P1<String>) c1679540to8, (C1679540to8) 3), c13zcLJIIJ);
            int i10 = (i3 & 896) | 224304;
            C1676630tjR.LIZJ(c1676910tjtLJ, (Function1) objLJJ4, interfaceC1685750ty92, c1676540tjILJ, c1676550tjJLJI, c19719212DeLIZJ, c13zcLJIIJ, i10, 0);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = AFwS266S0000000_25.get$arr$(367);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            Function1 function1 = (Function1) objLJJ5;
            c13zcLJIIJ.LJJJJL(false);
            C1676540tjI c1676540tjILJ2 = C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5));
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (objLJJ6 == c1680520tpi) {
                objLJJ6 = AFwS266S0000000_25.get$arr$(368);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            C1676630tjR.LIZJ(c1676910tjtLJ, function1, interfaceC1685750ty93, c1676540tjILJ2.LIZIZ(C1676510tjF.LJIILL(C1671550tbF.LIZJ(0.0f, 400.0f, new C1676820tjk(C1675670tht.LIZ()), 1), (Function1) objLJJ6)), C1676510tjF.LJI(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)).LIZIZ(C1676510tjF.LJIJ(C1671550tbF.LIZJ(0.0f, 400.0f, new C1676820tjk(C1675670tht.LIZ()), 1), AFwS229S0000000_2.get$arr$(608))), C13Z4.LIZJ(-829569102, new AwS131S1000000_25(strLJII, 1), c13zcLJIIJ), c13zcLJIIJ, i10, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS3S1302000_25((C05P1) c05p1, (C05P1<String>) c05p13, (C05P1<Boolean>) interfaceC1685750ty92, (InterfaceC1685750ty9) strLJII, (String) i, i2, 3);
        }
    }
}
