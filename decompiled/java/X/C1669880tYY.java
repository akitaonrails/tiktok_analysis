package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tYY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669880tYY {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(C1690050u55 c1690050u55, int i, InterfaceC1665500tRU<SocMediaResource> interfaceC1665500tRU, float f, float f2, SocialMediaPickerViewModel socialMediaPickerViewModel, float f3, Function2<? super C1378605aS, ? super SocMediaResource, Unit> function2, boolean z, InterfaceC20086513iZ interfaceC20086513iZ, InterfaceC1680500tpg interfaceC1680500tpg, int i2, int i3) {
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
        int i14;
        boolean z2;
        boolean z3;
        InterfaceC1364105Vn interfaceC1364105Vn;
        boolean z4;
        C05P0 c05p0;
        T t;
        InterfaceC20086513iZ interfaceC20086513iZ2 = interfaceC20086513iZ;
        boolean z5 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1500429514);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1690050u55)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665500tRU)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i2) == 0) {
            if (c13zcLJIIJ.LJIJ(f3)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i2) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        int i15 = i3 & 256;
        if (i15 != 0) {
            i4 |= 100663296;
        } else if ((100663296 & i2) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z5)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        int i16 = i3 & 512;
        if (i16 != 0) {
            i4 |= 805306368;
        } else if ((805306368 & i2) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC20086513iZ2)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        if ((i4 & 306783379) == 306783378 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i15 != 0) {
                z5 = false;
            }
            if (i16 != 0) {
                interfaceC20086513iZ2 = null;
            }
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            float f4 = 1;
            float f5 = 0;
            float f6 = (f - (2 * f4)) / 3;
            float fWidthToHeightRatio = f6 / socialMediaPickerViewModel.LL.getMediaAreaUIConfig().getItemDisplayWHRatio().widthToHeightRatio();
            socialMediaPickerViewModel.onEvent$social_creation_mediapicker_release(new C0M8V(interfaceC1690500u5o.LJJJJLL(f6), interfaceC1690500u5o.LJJJJLL(fWidthToHeightRatio)));
            Object[] objArr = new Object[0];
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS214S0000000_25.get$arr$(187);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C05P0 c05p02 = (C05P0) C20041813bM.LIZ(objArr, null, (Function0) objLJJ, c13zcLJIIJ, 6);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJJIIJ = z2 | c13zcLJIIJ.LJJIIJ(c05p02) | c13zcLJIIJ.LJII(socialMediaPickerViewModel);
            if ((i4 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = zLJJIIJ | z3;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (!z6 && objLJJ2 != c1680520tpi) {
                z4 = false;
                interfaceC1364105Vn = null;
                c05p0 = c05p02;
            } else {
                interfaceC1364105Vn = null;
                z4 = false;
                c05p0 = c05p02;
                objLJJ2 = new C1670170tZ1(c1690050u55, socialMediaPickerViewModel, c05p02, interfaceC1665500tRU, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(z4);
            C1680540tpk.LJFF(interfaceC1665500tRU, (Function2) objLJJ2, c13zcLJIIJ);
            SocMediaResource socMediaResource = (SocMediaResource) C13LP.LJJJLL(interfaceC1665500tRU);
            if (socMediaResource != null) {
                t = socMediaResource.id;
            } else {
                t = interfaceC1364105Vn;
            }
            C259800zU c259800zU = new C259800zU();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            T t2 = objLJJ3;
            if (objLJJ3 == c1680520tpi) {
                C1665510tRV c1665510tRV = new C1665510tRV();
                c1665510tRV.LIZ = t;
                c13zcLJIIJ.LJJIJIIJI(c1665510tRV);
                t2 = c1665510tRV;
            }
            c13zcLJIIJ.LJJJJL(z4);
            c259800zU.element = t2;
            C1680540tpk.LJFF(interfaceC1665500tRU, new C1670190tZ3(c05p0, c1690050u55, interfaceC1665500tRU, t, c259800zU, interfaceC1364105Vn), c13zcLJIIJ);
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(interfaceC1665500tRU, c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), f2);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ2 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS604S0100000_25(c05p0LJIIIIZZ, (C05P0<Boolean>) 243);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C19719212De c19719212DeLIZJ = C13Z4.LIZJ(574930961, new C1670010tYl(c1690050u55, z5, interfaceC20086513iZ2, f5, f4, socialMediaPickerViewModel, i, f6, fWidthToHeightRatio, interfaceC1665500tRU, function2, f3), c13zcLJIIJ);
            int i17 = i4 << 3;
            C1668980tX6.LIZ(3, c1690050u55, (Function1) objLJJ4, f6, fWidthToHeightRatio, f2, interfaceC1685750ty9LJI, f3, c19719212DeLIZJ, c13zcLJIIJ, (i17 & 112) | 100663302 | (458752 & i17) | (i17 & 29360128), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1669870tYX(c1690050u55, i, interfaceC1665500tRU, f, f2, socialMediaPickerViewModel, f3, function2, z5, interfaceC20086513iZ2, i2, i3);
        }
    }
}
