package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS2S0300002_25;

/* JADX INFO: renamed from: X.0tXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669280tXa {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(float r24, float r25, com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r26, kotlin.jvm.functions.Function1<? super X.C563580M8m, kotlin.Unit> r27, X.InterfaceC1685750ty9 r28, X.InterfaceC1680500tpg r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1669280tXa.LIZ(float, float, com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel, kotlin.jvm.functions.Function1, X.0ty9, X.0tpg, int, int):void");
    }

    public static final void LIZIZ(final C1680470tpd c1680470tpd, float f, float f2, SocialMediaPickerViewModel socialMediaPickerViewModel, Function1<? super C563580M8m, Unit> function1, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1211755789);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1680470tpd)) {
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
            if (c13zcLJIIJ.LJIJ(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i11 = i2 & 64;
        if (i11 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599187 & i3) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i11 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            C1680580tpo.LIZ(new InterfaceC1686820tzs() { // from class: X.0tXe
                @Override // X.InterfaceC1686820tzs
                public final long LIZ(C1680470tpd c1680470tpd2, long j, EnumC1671200tag enumC1671200tag, long j2) {
                    int i12;
                    C1680470tpd c1680470tpd3 = c1680470tpd;
                    if (c1680470tpd3 == null) {
                        long j3 = 0;
                        return (j3 & 4294967295L) | (j3 << 32);
                    }
                    int i13 = C1669330tXf.LIZ[enumC1671200tag.ordinal()];
                    if (i13 != 1) {
                        if (i13 == 2) {
                            i12 = c1680470tpd3.LIZJ - ((int) (j2 >> 32));
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        i12 = c1680470tpd3.LIZ;
                    }
                    return (((long) c1680470tpd3.LIZLLL) & 4294967295L) | (((long) i12) << 32);
                }
            }, function0, new C1686720tzi(true, true, true, 40, 0), C13Z4.LIZJ(2042095249, new AwS2S0300002_25(f, f2, socialMediaPickerViewModel, function1, interfaceC1685750ty92, 1), c13zcLJIIJ), c13zcLJIIJ, ((i3 >> 12) & 112) | 3456, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1669290tXb(c1680470tpd, f, f2, socialMediaPickerViewModel, function1, function0, interfaceC1685750ty92, i, i2);
        }
    }

    public static final void LIZJ(float f, float f2, SocialMediaPickerViewModel socialMediaPickerViewModel, Function1<? super C563580M8m, Unit> function1, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, long j, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j2 = j;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-866114972);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
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
            if (c13zcLJIIJ.LJIJ(f2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIJJ(j2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599187 & i3) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i11 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i12 != 0) {
                long j3 = 0;
                j2 = (j3 & 4294967295L) | (j3 << 32);
            }
            InterfaceC1668050tVb.LIZ.getClass();
            C1680580tpo.LIZIZ(C1668040tVa.LIZIZ, j2, function0, new C1686720tzi(true, true, true, 40, 0), C13Z4.LIZJ(1459232417, new AwS2S0300002_25(f, f2, socialMediaPickerViewModel, function1, interfaceC1685750ty92, 0), c13zcLJIIJ), c13zcLJIIJ, ((i3 >> 15) & 112) | 27654 | ((i3 >> 6) & 896), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1669270tXZ(f, f2, socialMediaPickerViewModel, function1, function0, interfaceC1685750ty92, j2, i, i2);
        }
    }
}
