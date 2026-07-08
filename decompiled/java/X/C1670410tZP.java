package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import gh6.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tZP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670410tZP {
    public static final void LIZIZ() throws IllegalAccessException, NoSuchFieldException {
        C1696210uF1.LIZJ(C1ETL.LIZ);
        C1696210uF1.LIZJ(C1ETL.LIZIZ);
        C1696210uF1.LIZJ(C1ETL.LIZJ);
        C1696210uF1.LIZJ(C1ETL.LIZLLL);
        C1696210uF1.LIZJ(C1670390tZN.LIZ);
        C1696210uF1.LIZJ(C1670370tZL.LIZ);
        C1696210uF1.LIZJ(C1670420tZQ.LIZ);
        C1696210uF1.LIZJ(C1670430tZR.LIZ);
    }

    public static final void LIZ(C1ETK c1etk, C1668420tWC c1668420tWC, InterfaceC1690500u5o interfaceC1690500u5o, C1668900tWy c1668900tWy, C1671630tbN c1671630tbN, C1670440tZS c1670440tZS, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final C1670440tZS c1670440tZSLIZLLL = c1670440tZS;
        final C1671630tbN c1671630tbNLIZ = c1671630tbN;
        final C1668900tWy c1668900tWyLIZJ = c1668900tWy;
        final InterfaceC1690500u5o c1516420pZ2 = interfaceC1690500u5o;
        final C1668420tWC c1668420tWCLJ = c1668420tWC;
        final C1ETK c1etkLIZIZ = c1etk;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(819699991);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0 && c13zcLJIIJ.LJJIIJ(c1etkLIZIZ)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && c13zcLJIIJ.LJJIIJ(c1668420tWCLJ)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0 && c13zcLJIIJ.LJJIIJ(c1516420pZ2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0 && c13zcLJIIJ.LJJIIJ(c1668900tWyLIZJ)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJJIIJ(c1671630tbNLIZ)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0 && c13zcLJIIJ.LJJIIJ(c1670440tZSLIZLLL)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                c13zcLJIIJ.LJJJJLI();
                C13ZT.LIZIZ(new C13DO[]{C1ETL.LIZ.LIZJ(c1etkLIZIZ), C1670390tZN.LIZ.LIZJ(c1668420tWCLJ), C20055113dV.LJII.LIZJ(c1516420pZ2), C1670370tZL.LIZ.LIZJ(c1668900tWyLIZJ), C1670430tZR.LIZ.LIZJ(c1670440tZSLIZLLL), C1670420tZQ.LIZ.LIZJ(c1671630tbNLIZ), C1680300tpM.LIZ.LIZJ(u0.LIZ)}, function2, c13zcLJIIJ, ((i3 >> 15) & 112) | 8);
            } else {
                if ((i2 & 1) != 0) {
                    c1etkLIZIZ = C1670400tZO.LIZIZ(c13zcLJIIJ);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    c1668420tWCLJ = C1670400tZO.LJ(c13zcLJIIJ);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    c1516420pZ2 = new C1516420pZ2(((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII)).getDensity(), 1.0f);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    c1668900tWyLIZJ = C1670400tZO.LIZJ(c13zcLJIIJ);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    c1671630tbNLIZ = C1670400tZO.LIZ(c13zcLJIIJ);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    c1670440tZSLIZLLL = C1670400tZO.LIZLLL(c13zcLJIIJ);
                    i3 &= -458753;
                }
                c13zcLJIIJ.LJJJJLI();
                C13ZT.LIZIZ(new C13DO[]{C1ETL.LIZ.LIZJ(c1etkLIZIZ), C1670390tZN.LIZ.LIZJ(c1668420tWCLJ), C20055113dV.LJII.LIZJ(c1516420pZ2), C1670370tZL.LIZ.LIZJ(c1668900tWyLIZJ), C1670430tZR.LIZ.LIZJ(c1670440tZSLIZLLL), C1670420tZQ.LIZ.LIZJ(c1671630tbNLIZ), C1680300tpM.LIZ.LIZJ(u0.LIZ)}, function2, c13zcLJIIJ, ((i3 >> 15) & 112) | 8);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0ary
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C1ETK c1etk2 = c1etkLIZIZ;
                    C1668420tWC c1668420tWC2 = c1668420tWCLJ;
                    InterfaceC1690500u5o interfaceC1690500u5o2 = c1516420pZ2;
                    C1668900tWy c1668900tWy2 = c1668900tWyLIZJ;
                    C1671630tbN c1671630tbN2 = c1671630tbNLIZ;
                    C1670440tZS c1670440tZS2 = c1670440tZSLIZLLL;
                    Function2 function22 = function2;
                    int i11 = i;
                    int i12 = i2;
                    ((Integer) obj2).intValue();
                    C1670410tZP.LIZ(c1etk2, c1668420tWC2, interfaceC1690500u5o2, c1668900tWy2, c1671630tbN2, c1670440tZS2, function22, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i11 | 1), i12);
                    return Unit.LIZ;
                }
            };
        }
    }
}
