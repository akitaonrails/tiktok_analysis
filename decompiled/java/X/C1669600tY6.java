package X;

import android.util.Size;
import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS4S1211000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tY6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669600tY6 {
    public static final void LIZJ(InterfaceC1685750ty9 interfaceC1685750ty9, String str, boolean z, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1594908151);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
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
            long jE2 = C1670400tZO.LIZIZ(c13zcLJIIJ).E2();
            long jX2 = C1670400tZO.LIZIZ(c13zcLJIIJ).x2();
            long jV2 = C1670400tZO.LIZIZ(c13zcLJIIJ).V2();
            long jB2 = C1670400tZO.LIZIZ(c13zcLJIIJ).B2();
            float f = 24;
            C1691540u7U c1691540u7ULIZ = C1672580tcu.LIZ(0, 0, 1, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C612270Nzt();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            boolean z2 = true;
            boolean z3 = true;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C634490Oud.LIZ(interfaceC1685750ty9, z, (InterfaceC595010NVj) objLJJ, null, true, new C20279814Wu(1), function0);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = c.LJIIJ(c.LJIJJ(interfaceC1685750ty9LIZ, C1668040tVa.LJFF, 2), f);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((i2 & 896) != 256) {
                z2 = false;
            }
            boolean zLJIJJ = c13zcLJIIJ.LJIJJ(jV2) | z2 | c13zcLJIIJ.LJIJJ(jX2) | c13zcLJIIJ.LJIJJ(jE2);
            if ((i2 & 112) != 32) {
                z3 = false;
            }
            boolean zLJJIIJ = zLJIJJ | z3 | c13zcLJIIJ.LJJIIJ(c1691540u7ULIZ) | c13zcLJIIJ.LJIJJ(jB2);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1669620tY8(z, jV2, jX2, jE2, str, c1691540u7ULIZ, jB2);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1668170tVn.LIZ(interfaceC1685750ty9LJIIJ, (Function1) objLJJ2, c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS4S1211000_25(interfaceC1685750ty9, (InterfaceC1685750ty9) str, (String) z, (boolean) function0, (Function0<Unit>) i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.InterfaceC1685750ty9 r17, final com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r18, boolean r19, final kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource, kotlin.Unit> r20, kotlin.jvm.functions.Function2<? super X.C1378605aS, ? super com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource, kotlin.Unit> r21, X.InterfaceC1631620sYq<? super X.InterfaceC1665870tS5, ? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r22, X.InterfaceC1680500tpg r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1669600tY6.LIZIZ(X.0ty9, com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, X.0sYq, X.0tpg, int, int):void");
    }

    public static final void LIZ(SocMediaResource socMediaResource, C1669630tY9 c1669630tY9, SocialMediaPickerViewModel socialMediaPickerViewModel, Function2<? super SocMediaResource, ? super C1683130ttv, Unit> function2, Function2<? super C1378605aS, ? super SocMediaResource, Unit> function22, Function1<? super SocMediaResource, Unit> function1, Function2<? super SocMediaResource, ? super C1683130ttv, Unit> function23, float f, float f2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(980750921);
        SocMediaResource socMediaResource2 = socMediaResource;
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1669630tY9)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((i & 196608) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function23)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1924789668);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C1669640tYA();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C1669640tYA c1669640tYA = (C1669640tYA) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJIILLIIL(InterfaceC1685750ty9.LIZ, f), f2);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII = c13zcLJIIJ.LJII(c1669640tYA);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS604S0100000_25(c1669640tYA, (C1669640tYA<InterfaceC1692950u9l>) 241);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(interfaceC1685750ty9LJI, (Function1) objLJJ2);
            boolean z2 = c1669630tY9.LIZJ;
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            if ((i2 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJII2 = z | c13zcLJIIJ.LJII(c1669640tYA);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS391S0200000_25(function2, (Function2<? super SocMediaResource, ? super C1683130ttv, Unit>) c1669640tYA, (C1669640tYA<InterfaceC1692950u9l>) 82);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            socMediaResource2 = socMediaResource2;
            LIZIZ(interfaceC1685750ty9LIZ, socMediaResource2, z2, (Function1) objLJJ3, function22, C13Z4.LIZJ(-1476502001, new C1669610tY7(c1669630tY9, function1, socMediaResource2, socialMediaPickerViewModel, function23, c1669640tYA, f, f2), c13zcLJIIJ), c13zcLJIIJ, ((i2 << 3) & 112) | 196608 | (i2 & 57344), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0M9X(socMediaResource2, c1669630tY9, socialMediaPickerViewModel, function2, function22, function1, function23, f, f2, i);
        }
    }

    public static final void LIZLLL(InterfaceC1665870tS5 interfaceC1665870tS5, SocMediaResource socMediaResource, MediaEngine mediaEngine, boolean z, boolean z2, boolean z3, int i, Size size, boolean z4, InterfaceC1680500tpg interfaceC1680500tpg, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        boolean z6 = z4;
        Size size2 = size;
        int i14 = i;
        boolean z7 = z3;
        boolean z8 = z2;
        boolean z9 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-818065554);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665870tS5)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(mediaEngine)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z9)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i16 = i3 & 8;
        if (i16 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z8)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        int i17 = i3 & 16;
        if (i17 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z7)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        int i18 = i3 & 32;
        if (i18 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i2) == 0) {
            if (c13zcLJIIJ.LJIJI(i14)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        int i19 = i3 & 64;
        if (i19 != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i2) == 0) {
            if (c13zcLJIIJ.LJII(size2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        int i20 = i3 & 128;
        if (i20 != 0) {
            i4 |= 100663296;
        } else if ((100663296 & i2) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z6)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        if ((i4 & 38347923) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i15 != 0) {
                z9 = false;
            }
            if (i16 != 0) {
                z8 = false;
            }
            if (i17 != 0) {
                z7 = false;
            }
            if (i18 != 0) {
                i14 = 0;
            }
            if (i19 != 0) {
                size2 = null;
            }
            if (i20 != 0) {
                z6 = true;
            }
            int i21 = i4 >> 9;
            mediaEngine.Bk(socMediaResource, z8, i14, z7, size2, c13zcLJIIJ, ((i4 >> 3) & 14) | (i21 & 112) | ((i4 >> 12) & 896) | ((i4 >> 6) & 7168) | (i21 & 57344) | ((i4 << 9) & 458752));
            c13zcLJIIJ.LJJIIJZLJL(-181963971);
            if (!z9 && socMediaResource.LIZLLL()) {
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = interfaceC1665870tS5.LIZIZ(c1685760tyA, C1668040tVa.LJIIIZ);
                float f = 7;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(interfaceC1685750ty9LIZIZ, f, 0.0f, f, 5, 2);
                C1693430uAX c1693430uAXLIZ = C1693430uAX.LIZ(0, 0, 16769023, 0L, 0L, 0L, 0L, new C1693340uAO(C1670400tZO.LIZIZ(c13zcLJIIJ).x2(), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(3.0f)) & 4294967295L), 4), C1670400tZO.LJ(c13zcLJIIJ).LJIJJ, null, null);
                long j = socMediaResource.durationMs / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                long j2 = 60;
                z5 = false;
                C1685190txF.LIZ(C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j2), Long.valueOf(j % j2)}, 2)), interfaceC1685750ty9LJIIL, C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), c1693430uAXLIZ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2032);
            } else {
                z5 = false;
            }
            c13zcLJIIJ.LJJJJL(z5);
            if (!z9 && z6 && socMediaResource.tiktokMediaModel.LJIIJJI()) {
                C1685760tyA c1685760tyA2 = InterfaceC1685750ty9.LIZ;
                InterfaceC1668050tVb.LIZ.getClass();
                float f2 = 6;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(interfaceC1665870tS5.LIZIZ(c1685760tyA2, C1668040tVa.LJIIIZ), 0.0f, 0.0f, f2, f2, 3);
                float f3 = 20;
                C1668930tX1.LIZIZ(C1669660tYC.LLLJL, null, interfaceC1685750ty9LJIIL2, C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), f3, f3, false, c13zcLJIIJ, 221232, 64);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1669560tY2(interfaceC1665870tS5, socMediaResource, mediaEngine, z9, z8, z7, i14, size2, z6, i2, i3);
        }
    }
}
