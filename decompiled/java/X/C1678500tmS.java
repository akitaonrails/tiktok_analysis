package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.AwS0S0102102_25;
import o0.k;

/* JADX INFO: renamed from: X.0tmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678500tmS {
    public static final void LIZ(float f, float f2, int i, int i2, long j, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty9LJIIL;
        float density;
        int i7;
        float f3 = f2;
        long jLIZJ = j;
        float f4 = f;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1249392198);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && c13zcLJIIJ.LJIJJ(jLIZJ)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (c13zcLJIIJ.LJIJ(f4)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (c13zcLJIIJ.LJIJ(f3)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
            } else {
                if (i8 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i2 & 2) != 0) {
                    jLIZJ = C1685910tyP.LIZJ(0.12f, C1680090tp1.LIZ(c13zcLJIIJ).LJ());
                }
                if (i9 != 0) {
                    f4 = 1;
                }
                if (i10 != 0) {
                    f3 = 0;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            if (f3 == 0.0f) {
                interfaceC1685750ty9LJIIL = InterfaceC1685750ty9.LIZ;
            } else {
                interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, f3, 0.0f, 0.0f, 0.0f, 14);
            }
            c13zcLJIIJ.LJJIJIIJIL(1228914189);
            if (C1668650tWZ.LIZJ(f4, 0.0f)) {
                density = 1.0f / ((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII)).getDensity();
            } else {
                density = f4;
            }
            c13zcLJIIJ.LJJJJL(false);
            k.LIZ(C1675980tiO.LIZIZ(c.LJI(c.LJ(interfaceC1685750ty92.LIZ(interfaceC1685750ty9LJIIL), 1.0f), density), jLIZJ, C1669430tXp.LIZ), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0102102_25(f4, f3, i, i2, jLIZJ, interfaceC1685750ty92, 0);
        }
    }
}
