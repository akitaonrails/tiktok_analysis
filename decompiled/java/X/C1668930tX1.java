package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668930tX1 {
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C1668880tWw r16, final java.lang.String r17, X.InterfaceC1685750ty9 r18, long r19, float r21, float r22, boolean r23, X.InterfaceC1680500tpg r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668930tX1.LIZ(X.0tWw, java.lang.String, X.0ty9, long, float, float, boolean, X.0tpg, int, int):void");
    }

    public static final void LIZIZ(C1668880tWw c1668880tWw, final String str, InterfaceC1685750ty9 interfaceC1685750ty9, long j, float f, float f2, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2 = z;
        float f3 = f;
        float f4 = f2;
        long j2 = j;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(358140129);
        C1668880tWw c1668880tWw2 = c1668880tWw;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1668880tWw2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIJJ(j2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIJ(f3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i14 = i2 & 32;
        if (i14 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f4)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i15 = i2 & 64;
        if (i15 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((i3 & 599187) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i11 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i12 != 0) {
                j2 = C1685910tyP.LJIIJ;
            }
            if (i13 != 0) {
                f3 = Float.NaN;
            }
            if (i14 != 0) {
                f4 = Float.NaN;
            }
            if (i15 != 0) {
                z2 = false;
            }
            int i16 = i3 >> 6;
            c1668880tWw2 = c1668880tWw2;
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            C1671210tah.LIZ(C1668870tWv.LIZ(c1668880tWw2, j2, f3, f4, z2, c13zcLJIIJ, (i3 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0), str, interfaceC1685750ty93, C1685910tyP.LJIIJ, c13zcLJIIJ, (i3 & 112) | 3072 | (i3 & 896), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final float f5 = f4;
            final boolean z3 = z2;
            final long j3 = j2;
            final float f6 = f3;
            final InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty92;
            final C1668880tWw c1668880tWw3 = c1668880tWw2;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0Hbs
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C1668880tWw c1668880tWw4 = c1668880tWw3;
                    String str2 = str;
                    InterfaceC1685750ty9 interfaceC1685750ty95 = interfaceC1685750ty94;
                    long j4 = j3;
                    float f7 = f6;
                    float f8 = f5;
                    boolean z4 = z3;
                    int i17 = i;
                    int i18 = i2;
                    ((Integer) obj2).intValue();
                    C1668930tX1.LIZIZ(c1668880tWw4, str2, interfaceC1685750ty95, j4, f7, f8, z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i17 | 1), i18);
                    return Unit.LIZ;
                }
            };
        }
    }
}
