package X;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import i0.y1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.AwS477S0200000_8;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0MWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569920MWw {
    public static final void LIZ(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1685750ty9 interfaceC1685750ty9, float f, Function2<? super C1378605aS, ? super SocMediaResource, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        String simpleHintText;
        float f2 = f;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-577618375);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
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
            if (c13zcLJIIJ.LJII(function2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i9 != 0) {
                f2 = 0;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                SocialMediaPickerConfig.TitleAreaUIConfig titleAreaUIConfig = socialMediaPickerViewModel.LL.getTitleAreaUIConfig();
                if (titleAreaUIConfig == null || (simpleHintText = titleAreaUIConfig.getSimpleHintText()) == null) {
                    simpleHintText = "";
                }
                objLJJ2 = C20028913Yh.LJI(simpleHintText);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p02 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            Configuration configuration = (Configuration) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZ);
            float f3 = configuration.screenWidthDp;
            float f4 = configuration.screenHeightDp;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            C19719212De c19719212DeLIZJ = C13Z4.LIZJ(-1450921692, new AwS477S0200000_8(socialMediaPickerViewModel, (SocialMediaPickerViewModel) c05p0, (C05P0<Boolean>) 0), c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(lifecycleOwner);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS369S0200000_3(lifecycleOwner, (LifecycleOwner) c05p0, (C05P0<Boolean>) 7);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LIZIZ(lifecycleOwner, (Function1) objLJJ3, c13zcLJIIJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                if (socialMediaPickerViewModel.LL.getStickySelectorAreaUIConfig() == null && socialMediaPickerViewModel.LL.getTabAreaUIConfig() == null) {
                    z = false;
                } else {
                    z = true;
                }
                interfaceC1685750ty92 = interfaceC1685750ty92;
                C13ZT.LIZ(y1.LIZ.LIZJ(null), C13Z4.LIZJ(-1339299021, new C569950MWz(socialMediaPickerViewModel, interfaceC1685750ty92, z, f4, f3, f2, function2, c05p02, c05p0, c19719212DeLIZJ), c13zcLJIIJ), c13zcLJIIJ, 56);
                c13zcLJIIJ.LJJIIJZLJL(916008644);
                if (((Boolean) c05p0.getValue()).booleanValue() && socialMediaPickerViewModel.LL.getMediaLoadingStrategy().getPermissionBannerStyle() == C0LJD.FLOAT_BOTTOM) {
                    c19719212DeLIZJ.invoke(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJIIIIZZ), c13zcLJIIJ, 48);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(916016833);
                if (!z) {
                    z2 = true;
                    if (socialMediaPickerViewModel.LL.getSelectorStrategy().getMaxSelectable() > 1 && !((Boolean) ((C13FE) socialMediaPickerViewModel.LLJI).getValue()).booleanValue()) {
                        C1669180tXQ.LIZ(socialMediaPickerViewModel, C1682520tsw.LJIIL(c.LJI(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJII), 70), 12, 0.0f, 0.0f, 32, 6), c13zcLJIIJ, i3 & 14, 0);
                    }
                } else {
                    z2 = true;
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(z2);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0M9W(socialMediaPickerViewModel, interfaceC1685750ty92, f2, function2, i, i2);
        }
    }
}
