package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.AnimationConfig;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSevenSplitScreenRootFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS104S0400000_6;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: renamed from: X.0QpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682190QpN {
    public static final C682190QpN LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C682190QpN.class, "multiContentVM", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
        LIZ = new C682190QpN();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Fragment fragment, C19EG c19eg) {
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIL()) {
            if (fragment != 0) {
                Context context = fragment.getContext();
                ComponentCallbacks2 componentCallbacks2LJFF = null;
                if (context != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                }
                if (C294780Bgy.LIZ()) {
                    if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        return;
                    }
                } else if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) {
                    return;
                }
                while (!(fragment instanceof InterfaceC214902198i)) {
                    fragment = fragment.getParentFragment();
                    if (fragment == 0) {
                        return;
                    }
                }
                Object obj = (InterfaceC214902198i) fragment;
                if (obj == null) {
                    return;
                }
                TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL((Fragment) obj);
                tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
                tuxImmersionBarLIZLLL.LIZLLL();
                return;
            }
            return;
        }
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, ImmersionBar.LJIILJJIL(c19eg));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(Fragment fragment, C19EG c19eg, Fragment fragment2, AnimationConfig animationConfig) {
        Fragment fragmentLJJJJZI;
        SAFHelper.LIZ.getClass();
        FragmentManager fragmentManagerLJIILJJIL = SAFHelper.LJIILJJIL(fragment, c19eg);
        if (fragmentManagerLJIILJJIL != null && (fragmentLJJJJZI = fragmentManagerLJIILJJIL.LJJJJZI("container")) != null) {
            if (fragment2 instanceof InterfaceC682240QpS) {
                ((InterfaceC682240QpS) fragment2).qq(c19eg, fragmentManagerLJIILJJIL, animationConfig);
                return;
            }
            C19EH c19ehLJIIJ = fragmentManagerLJIILJJIL.LJIIJ();
            if (C426750GoL.LIZLLL(c19eg)) {
                c19ehLJIIJ.LJIJJ(R.anim.fm, R.anim.fp);
            } else {
                c19ehLJIIJ.LJIJJ(R.anim.fn, R.anim.fo);
            }
            c19ehLJIIJ.LJIL(fragmentLJJJJZI, Lifecycle.State.STARTED);
            c19ehLJIIJ.LIZJ(R.id.iiv, fragment2, "search_landing_fragment_tag");
            c19ehLJIIJ.LJIILL(fragmentLJJJJZI);
            c19ehLJIIJ.LJIIJ();
        }
    }

    public static void LIZLLL(Fragment fragment, C19EG c19eg, Fragment fragment2, AnimationConfig animationConfig) {
        IVisualSearchHalfScreenAbility iVisualSearchHalfScreenAbilityLIZIZ;
        IVisualSearchHalfScreenAbility iVisualSearchHalfScreenAbilityLIZIZ2 = C654510Plp.LIZIZ(c19eg);
        if (iVisualSearchHalfScreenAbilityLIZIZ2 != null && iVisualSearchHalfScreenAbilityLIZIZ2.isShowing() && (iVisualSearchHalfScreenAbilityLIZIZ = C654510Plp.LIZIZ(c19eg)) != null) {
            if (!iVisualSearchHalfScreenAbilityLIZIZ.isFullScreen()) {
                iVisualSearchHalfScreenAbilityLIZIZ.Uo0(fragment, new AwS104S0400000_6(fragment, c19eg, fragment2, animationConfig, 13));
                iVisualSearchHalfScreenAbilityLIZIZ.A00(EnumC667250QFf.STATE_FULL_SCREEN, EnumC670450QRn.OTHER);
                return;
            } else {
                LIZ.getClass();
                LIZJ(fragment, c19eg, fragment2, animationConfig);
                LIZ(fragment, c19eg);
                return;
            }
        }
        ISearchSevenSplitScreenRootFragmentAbility iSearchSevenSplitScreenRootFragmentAbility = (ISearchSevenSplitScreenRootFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), ISearchSevenSplitScreenRootFragmentAbility.class, null);
        if (iSearchSevenSplitScreenRootFragmentAbility != null) {
            iSearchSevenSplitScreenRootFragmentAbility.Hm2(EnumC667250QFf.STATE_FULL_SCREEN, EnumC670460QRo.OTHER);
        }
        LIZJ(fragment, c19eg, fragment2, animationConfig);
        if (C0QDN.LIZJ(c19eg)) {
            ISearchSevenSplitScreenRootFragmentAbility iSearchSevenSplitScreenRootFragmentAbility2 = (ISearchSevenSplitScreenRootFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), ISearchSevenSplitScreenRootFragmentAbility.class, null);
            if (iSearchSevenSplitScreenRootFragmentAbility2 != null) {
                iSearchSevenSplitScreenRootFragmentAbility2.MN(new AwS372S0200000_6(fragment, c19eg, 107));
                return;
            }
            return;
        }
        LIZ(fragment, c19eg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(androidx.fragment.app.Fragment r25, X.C19EG r26, java.lang.String r27, java.lang.String r28, X.InterfaceC1631630sYr r29, kotlin.jvm.functions.Function2 r30, kotlin.jvm.functions.Function1 r31) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C682190QpN.LIZIZ(androidx.fragment.app.Fragment, X.19EG, java.lang.String, java.lang.String, X.0sYr, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):void");
    }
}
