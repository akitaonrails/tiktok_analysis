package X;

import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591960rWs {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C19EG c19eg, boolean z, String str, EnumC1571190qzN enumC1571190qzN) {
        boolean z2;
        EnumC1571190qzN enumC1571190qzNLJIILIIL;
        boolean z3;
        HomeTabAbility homeTabAbilityLIZ;
        InterfaceC1583870rJp interfaceC1583870rJpVR1;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeStatusBarTheme: ");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(enumC1571190qzN);
        C1720106oR.LJI("TopTabBarThemeHelper", C2188811AlT.LIZIZ(sbLIZ));
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
        boolean zLJFF = Intrinsics.LJFF(str, "Shop");
        int i2 = R.attr.e1;
        if (zLJFF) {
            EnumC1571190qzN enumC1571190qzN2 = EnumC1571190qzN.DARK;
            if (enumC1571190qzN == enumC1571190qzN2) {
                z2 = true;
            } else {
                z2 = false;
            }
            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
            if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null && (interfaceC1583870rJpVR1 = homeTabAbilityLIZ.vR1(str)) != null) {
                enumC1571190qzNLJIILIIL = interfaceC1583870rJpVR1.LJIILIIL();
            } else {
                enumC1571190qzNLJIILIIL = null;
            }
            if (enumC1571190qzNLJIILIIL == enumC1571190qzN2) {
                z3 = true;
            } else {
                z3 = false;
            }
            immersionBarLJIILJJIL.LJIIL();
            immersionBarLJIILJJIL.LJIIJ(!z2);
            immersionBarLJIILJJIL.LJII(!z3);
            tuxImmersionBar.LIZ(false);
            if (enumC1571190qzNLJIILIIL == EnumC1571190qzN.LIGHT) {
                i2 = R.attr.bx;
            }
            tuxImmersionBar.LJ(i2);
            tuxImmersionBar.LIZLLL();
            return;
        }
        if (enumC1571190qzN == EnumC1571190qzN.LIGHT) {
            tuxImmersionBar.LJIIIIZZ(R.attr.bx);
            tuxImmersionBar.LJ(R.attr.bx);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
            return;
        }
        if (z) {
            tuxImmersionBar.LJIIL();
        } else {
            tuxImmersionBar.LJIIIIZZ(R.attr.e1);
        }
        tuxImmersionBar.LJ(R.attr.e1);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
    }
}
