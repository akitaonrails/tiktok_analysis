package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ttb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682930ttb {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
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
        boolean z;
        boolean z2;
        float f10 = f;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        float f11 = f9;
        float f12 = f8;
        float f13 = f7;
        float f14 = f5;
        float f15 = f4;
        float f16 = f3;
        float f18 = f6;
        float f19 = f2;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1593431953);
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIJ(f10)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i16 = i2 & 4;
        if (i16 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f19)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i17 = i2 & 8;
        if (i17 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIJ(f16)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i18 = i2 & 16;
        if (i18 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIJ(f15)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i19 = i2 & 32;
        if (i19 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f14)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i20 = i2 & 64;
        if (i20 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f18)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i21 = i2 & 128;
        if (i21 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f13)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        int i22 = i2 & 256;
        if (i22 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f12)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        int i23 = i2 & 512;
        if (i23 != 0) {
            i3 |= 805306368;
        } else if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f11)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i3 |= i13;
        }
        if ((i3 & 306783379) == 306783378 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i14 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i15 != 0) {
                f10 = 32;
            }
            if (i16 != 0) {
                f19 = 2;
            }
            if (i17 != 0) {
                f16 = 0.0f;
            }
            if (i18 != 0) {
                f15 = 0.8f;
            }
            if (i19 != 0) {
                f14 = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            }
            if (i20 != 0) {
                f18 = 600;
            }
            if (i21 != 0) {
                f13 = OppoPermissionPopupMaskDelayExp.DEFAULT;
            }
            if (i22 != 0) {
                f12 = 350;
            }
            if (i23 != 0) {
                f11 = 0.35f;
            }
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            float fLJJJJLL = interfaceC1690500u5o.LJJJJLL(f10);
            float fLJJJJLL2 = interfaceC1690500u5o.LJJJJLL(f19);
            float fLJJJJLL3 = interfaceC1690500u5o.LJJJJLL(f14);
            float fLJJJJLL4 = interfaceC1690500u5o.LJJJJLL(f18);
            float fLJJJJLL5 = interfaceC1690500u5o.LJJJJLL(f13);
            float fLJJJJLL6 = interfaceC1690500u5o.LJJJJLL(f12);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1691250u71.LIZ(0.0f);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05ZL c05zl = (C05ZL) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJIJ = c13zcLJIIJ.LJIJ(fLJJJJLL6) | c13zcLJIIJ.LJIJ(fLJJJJLL5);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1682940ttc(fLJJJJLL6, fLJJJJLL5, c05zl, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ2, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJIJ2 = c13zcLJIIJ.LJIJ(fLJJJJLL) | c13zcLJIIJ.LJIJ(fLJJJJLL3) | c13zcLJIIJ.LJIJ(fLJJJJLL4) | c13zcLJIIJ.LJIJ(fLJJJJLL5);
            boolean z3 = true;
            if ((1879048192 & i3) == 536870912) {
                z = true;
            } else {
                z = false;
            }
            boolean z4 = zLJIJ2 | z;
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z5 = z4 | z2;
            if ((57344 & i3) != 16384) {
                z3 = false;
            }
            boolean zLJIJ3 = z5 | z3 | c13zcLJIIJ.LJIJ(fLJJJJLL2);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJIJ3 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1682950ttd(fLJJJJLL, fLJJJJLL3, fLJJJJLL4, fLJJJJLL5, f11, f16, f15, fLJJJJLL2, c05zl);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1668170tVn.LIZ(interfaceC1685750ty92, (Function1) objLJJ3, c13zcLJIIJ, i3 & 14);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0M2Q(interfaceC1685750ty92, f10, f19, f16, f15, f14, f18, f13, f12, f11, i, i2);
        }
    }
}
