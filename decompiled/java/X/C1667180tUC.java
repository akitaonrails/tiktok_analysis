package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS12S1301000_25;
import kotlin.jvm.internal.AwS3S1202000_25;

/* JADX INFO: renamed from: X.0tUC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667180tUC {
    public static final void LIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str, Function0 function0) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1784448062);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("slowMotionFloat");
            sbLIZ.append("InfiniteTransition");
            float fFloatValue = ((Number) C1675690thv.LIZ(C1675690thv.LIZJ(0, c13zcLJIIJ, C2188811AlT.LIZIZ(sbLIZ)), 1.0f, 1.1f, C1671550tbF.LIZ(C1671550tbF.LIZLLL(1200, 0, null, 6), C0N66.Reverse, 0L, 4), "slowMotionFloat", c13zcLJIIJ, 29112, 0).getValue()).floatValue();
            C1673400teE.LIZJ(function0, str, C1665910tS9.LIZ(interfaceC1685750ty92, fFloatValue, fFloatValue), false, 0L, false, null, C1669660tYC.LLIIZ, null, C1666920tTm.LIZIZ(0.0f, Float.POSITIVE_INFINITY, null, C1671140taa.LIZ, c13zcLJIIJ, 3120, 5), C1666340tSq.LIZ(C1670400tZO.LIZIZ(c13zcLJIIJ).LJJIJ(), C1670400tZO.LIZIZ(c13zcLJIIJ).LJJJJLI(), 0.0f, C1670400tZO.LIZIZ(c13zcLJIIJ).LJJIJ(), c13zcLJIIJ, 0, 12), null, false, c13zcLJIIJ, ((i3 >> 6) & 14) | ((i3 << 3) & 112), 0, 6520);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS3S1202000_25(i, i2, interfaceC1685750ty92, str, function0, 6);
        }
    }

    public static final void LIZIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, C1668880tWw c1668880tWw, String str, Function0 function0) {
        int i2;
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1170725043);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1668880tWw);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1668880tWw);
            }
            if (zLJII) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            int i7 = i2 << 3;
            C1673400teE.LIZJ(function0, str, interfaceC1685750ty9, false, 0L, false, null, c1668880tWw, null, C1666920tTm.LIZIZ(0.0f, Float.POSITIVE_INFINITY, null, C1671140taa.LIZ, c13zcLJIIJ, 3120, 5), C1666340tSq.LIZ(C1670400tZO.LIZIZ(c13zcLJIIJ).LJJJJLI(), C1685850tyJ.LIZIZ(1459617792), 0.0f, C1670400tZO.LIZIZ(c13zcLJIIJ).LJJJJLI(), c13zcLJIIJ, 48, 12), null, false, c13zcLJIIJ, ((i2 >> 9) & 14) | (i7 & 112) | (i7 & 896) | ((i2 << 15) & 29360128), 0, 6520);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS12S1301000_25(i, interfaceC1685750ty9, c1668880tWw, str, function0, 1);
        }
    }
}
