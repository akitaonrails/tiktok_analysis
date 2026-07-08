package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS120S0201000_8;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671520tbC {
    public static final void LIZ(SocialMediaPickerViewModel socialMediaPickerViewModel, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        OnBackPressedDispatcher onBackPressedDispatcher;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZJ;
        float f;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1566714418);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
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
            View view = (View) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LJFF);
            InterfaceC1671500tbA interfaceC1671500tbALIZ = C1688550u2f.LIZ(c13zcLJIIJ);
            if (interfaceC1671500tbALIZ != null) {
                onBackPressedDispatcher = interfaceC1671500tbALIZ.getOnBackPressedDispatcher();
            } else {
                onBackPressedDispatcher = null;
            }
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(new C0ZDN(context));
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p02 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            C13DN<LifecycleOwner> c13dn = C13GF.LIZ;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) c13zcLJIIJ.LJJIL(c13dn);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p03 = (C05P0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            boolean z2 = !socialMediaPickerViewModel.xQ2().LIZ.isEmpty();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C20028913Yh.LJI(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            C05P0 c05p04 = (C05P0) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = C20028913Yh.LJ(new AwS546S0100000_2(socialMediaPickerViewModel, 807));
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            C05P1 c05p1 = (C05P1) objLJJ5;
            c13zcLJIIJ.LJJJJL(false);
            float f2 = ((Configuration) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZ)).screenHeightDp;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (objLJJ6 == c1680520tpi) {
                objLJJ6 = C20028913Yh.LJ(new AwS246S0300000_2(interfaceC1690500u5o, (InterfaceC1690500u5o) c05p1, (C05P1<Boolean>) c05p04, (C05P0<Integer>) 11));
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            C05P1 c05p12 = (C05P1) objLJJ6;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            if (objLJJ7 == c1680520tpi) {
                objLJJ7 = C20028913Yh.LJI(C1683130ttv.LJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
            }
            C05P0 c05p05 = (C05P0) objLJJ7;
            c13zcLJIIJ.LJJJJL(false);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII = c13zcLJIIJ.LJII(socialMediaPickerViewModel);
            Object objLJJ8 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ8 == c1680520tpi) {
                objLJJ8 = new AwS587S0100000_8(socialMediaPickerViewModel, 279);
                c13zcLJIIJ.LJJIJIIJI(objLJJ8);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LIZIZ(unit, (Function1) objLJJ8, c13zcLJIIJ);
            Boolean boolValueOf = Boolean.valueOf(z2);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJIIZILJ = c13zcLJIIJ.LJIIZILJ(z2) | c13zcLJIIJ.LJII(socialMediaPickerViewModel);
            Object objLJJ9 = c13zcLJIIJ.LJJ();
            if (zLJIIZILJ || objLJJ9 == c1680520tpi) {
                objLJJ9 = new C05VS(z2, socialMediaPickerViewModel, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ9);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ9, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJII2 = c13zcLJIIJ.LJII(socialMediaPickerViewModel) | c13zcLJIIJ.LJII(onBackPressedDispatcher);
            Object objLJJ10 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ10 == c1680520tpi) {
                objLJJ10 = new C563630M8r(c05p0, socialMediaPickerViewModel, onBackPressedDispatcher, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ10);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ10, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJII3 = c13zcLJIIJ.LJII(socialMediaPickerViewModel) | c13zcLJIIJ.LJII(lifecycleOwner) | c13zcLJIIJ.LJII(context);
            Object objLJJ11 = c13zcLJIIJ.LJJ();
            if (zLJII3 || objLJJ11 == c1680520tpi) {
                objLJJ11 = new C05II(context, lifecycleOwner, socialMediaPickerViewModel, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ11);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(socialMediaPickerViewModel, (Function2) objLJJ11, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ12 = c13zcLJIIJ.LJJ();
            if (objLJJ12 == c1680520tpi) {
                objLJJ12 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ12);
            }
            C05P0 c05p06 = (C05P0) objLJJ12;
            c13zcLJIIJ.LJJJJL(false);
            Lifecycle lifecycle = ((LifecycleOwner) c13zcLJIIJ.LJJIL(c13dn)).getLifecycle();
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJII4 = c13zcLJIIJ.LJII(lifecycle) | c13zcLJIIJ.LJII(socialMediaPickerViewModel);
            Object objLJJ13 = c13zcLJIIJ.LJJ();
            if (zLJII4 || objLJJ13 == c1680520tpi) {
                objLJJ13 = new C05IH(lifecycle, socialMediaPickerViewModel, c05p06, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ13);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJ(socialMediaPickerViewModel, lifecycle, (Function2) objLJJ13, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1921070681);
            if (((Boolean) c05p06.getValue()).booleanValue()) {
                String strLIZJ = C0MBB.LIZJ(2131830079, new Object[]{Integer.valueOf(socialMediaPickerViewModel.LL.getSelectorStrategy().getMaxSelectable())}, c13zcLJIIJ);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ14 = c13zcLJIIJ.LJJ();
                if (objLJJ14 == c1680520tpi) {
                    objLJJ14 = new AwS546S0100000_2(c05p06, (C05P0<InterfaceC1692950u9l>) 805);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ14);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1667380tUW.LIZ(strLIZJ, null, 0L, false, false, null, (Function0) objLJJ14, c13zcLJIIJ, 1572864, 62);
            }
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII5 = c13zcLJIIJ.LJII(view) | c13zcLJIIJ.LJII(socialMediaPickerViewModel);
            Object objLJJ15 = c13zcLJIIJ.LJJ();
            if (zLJII5 || objLJJ15 == c1680520tpi) {
                objLJJ15 = new AwS374S0200000_8(view, socialMediaPickerViewModel, 71);
                c13zcLJIIJ.LJJIJIIJI(objLJJ15);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LIZIZ(unit, (Function1) objLJJ15, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII6 = c13zcLJIIJ.LJII(socialMediaPickerViewModel) | c13zcLJIIJ.LJII(lifecycleOwner);
            Object objLJJ16 = c13zcLJIIJ.LJJ();
            if (zLJII6 || objLJJ16 == c1680520tpi) {
                objLJJ16 = new AwS374S0200000_8(lifecycleOwner, socialMediaPickerViewModel, 72);
                c13zcLJIIJ.LJJIJIIJI(objLJJ16);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LIZIZ(lifecycleOwner, (Function1) objLJJ16, c13zcLJIIJ);
            boolean zCQ2 = socialMediaPickerViewModel.CQ2();
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII7 = c13zcLJIIJ.LJII(socialMediaPickerViewModel);
            Object objLJJ17 = c13zcLJIIJ.LJJ();
            if (zLJII7 || objLJJ17 == c1680520tpi) {
                objLJJ17 = new AwS546S0100000_2(socialMediaPickerViewModel, 806);
                c13zcLJIIJ.LJJIJIIJI(objLJJ17);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1671780tbc.LIZ(0, 0, c13zcLJIIJ, (Function0) objLJJ17, zCQ2);
            if (socialMediaPickerViewModel.zQ2().LIZIZ != null) {
                z = true;
            } else {
                z = false;
            }
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII8 = c13zcLJIIJ.LJII(socialMediaPickerViewModel);
            Object objLJJ18 = c13zcLJIIJ.LJJ();
            if (zLJII8 || objLJJ18 == c1680520tpi) {
                objLJJ18 = new AwS552S0100000_8(socialMediaPickerViewModel, 365);
                c13zcLJIIJ.LJJIJIIJI(objLJJ18);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1671780tbc.LIZ(0, 0, c13zcLJIIJ, (Function0) objLJJ18, z);
            c13zcLJIIJ.LJJIIJZLJL(1921129026);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = InterfaceC1685750ty9.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(1921129694);
            if (c05p03.getValue() != null) {
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJII9 = c13zcLJIIJ.LJII(socialMediaPickerViewModel);
                Object objLJJ19 = c13zcLJIIJ.LJJ();
                if (zLJII9 || objLJJ19 == c1680520tpi) {
                    objLJJ19 = new AwS409S0200000_8(socialMediaPickerViewModel, (SocialMediaPickerViewModel) c05p03, (C05P0<Boolean>) 65);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ19);
                }
                c13zcLJIIJ.LJJJJL(false);
                interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9LIZ, false, null, (Function0) objLJJ19, 7);
            } else {
                interfaceC1685750ty9LIZJ = interfaceC1685750ty9LIZ;
            }
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(interfaceC1685750ty9LIZJ, C1666510tT7.LIZ(c13zcLJIIJ), C1669430tXp.LIZ);
            c13zcLJIIJ.LJJIIJZLJL(1921141131);
            if (!socialMediaPickerViewModel.LL.getPageUIConfig().getDisableSystemBarInsets()) {
                interfaceC1685750ty9LIZ = C1682870ttV.LIZ(interfaceC1685750ty9LIZ, C1683840tv4.LIZIZ(c13zcLJIIJ));
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = interfaceC1685750ty9LIZIZ.LIZ(interfaceC1685750ty9LIZ);
            if (c05p03.getValue() != null) {
                f = 30;
            } else {
                f = 0;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1671680tbS.LIZIZ(interfaceC1685750ty9LIZ2, f);
            c13zcLJIIJ.LJJIJIIJIL(-270267587);
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ20 = c13zcLJIIJ.LJJ();
            if (objLJJ20 == c1680520tpi) {
                objLJJ20 = new C2267001DoI();
                c13zcLJIIJ.LJJIJIIJI(objLJJ20);
            }
            c13zcLJIIJ.LJJJJL(false);
            C2267001DoI c2267001DoI = (C2267001DoI) objLJJ20;
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ21 = c13zcLJIIJ.LJJ();
            if (objLJJ21 == c1680520tpi) {
                objLJJ21 = new C1672050tc3();
                c13zcLJIIJ.LJJIJIIJI(objLJJ21);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1672050tc3 c1672050tc3 = (C1672050tc3) objLJJ21;
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ22 = c13zcLJIIJ.LJJ();
            if (objLJJ22 == c1680520tpi) {
                objLJJ22 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ22);
            }
            c13zcLJIIJ.LJJJJL(false);
            Pair pairLIZIZ = C1686650tzb.LIZIZ(c1672050tc3, (C05P0) objLJJ22, c2267001DoI, c13zcLJIIJ);
            C1672420tce.LIZ(C1689740u4a.LIZIZ(interfaceC1685750ty9LIZIZ2, false, new AwS604S0100000_25(c2267001DoI, 242)), C13Z4.LIZIZ(c13zcLJIIJ, -819894182, new C1671510tbB(c1672050tc3, 0, (Function0) pairLIZIZ.getSecond(), socialMediaPickerViewModel, function0, f2, z2, c05p12, c05p02, c05p03, c05p1, c05p04, c05p05)), (InterfaceC20053113dB) pairLIZIZ.getFirst(), c13zcLJIIJ, 48, 0);
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS120S0201000_8(socialMediaPickerViewModel, (SocialMediaPickerViewModel) function0, (Function0<Unit>) i, 3);
        }
    }
}
