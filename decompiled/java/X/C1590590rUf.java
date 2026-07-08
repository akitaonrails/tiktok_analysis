package X;

import Y.ARunnableS124S0100000_24;
import Y.ARunnableS28S1200000_24;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;

/* JADX INFO: renamed from: X.0rUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590590rUf implements InterfaceC1209250hZb {
    public Context LIZ;
    public C1591410rVz LIZIZ;
    public C1590400rUM LIZJ;
    public final ScrollSwitchStateManager LIZLLL;
    public final HomePageDataViewModel LJ;

    @Override // X.InterfaceC1209250hZb
    public final void LIZIZ() {
        LJ(false, null);
    }

    @Override // X.InterfaceC1209250hZb
    public final void As(String str) {
        if (this.LIZIZ != null) {
            C2277881EDy.LIZIZ.updateProfilePageFragmentParams(this.LIZLLL.xQ2("page_profile"), str);
        }
    }

    @Override // X.InterfaceC1209250hZb
    public final void LIZ(C738950Syj c738950Syj) {
        C1591410rVz c1591410rVz = this.LIZIZ;
        if (c1591410rVz != null) {
            c1591410rVz.LIZLLL(c738950Syj);
        }
    }

    public final void LIZLLL(Aweme aweme, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toProfilePage() called with: mViewPager = [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("], aweme = [");
        sbLIZ.append(aweme);
        sbLIZ.append("], enterMethod = [");
        sbLIZ.append(str);
        sbLIZ.append("]viewPageSize");
        sbLIZ.append(this.LIZIZ.getItemCount());
        sbLIZ.append(" pageType ");
        sbLIZ.append("page_profile");
        C2344809Gs.LIZLLL(4, "FeedAvatarView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LJ(boolean z, Boolean bool) {
        boolean z2;
        if (this.LIZIZ != null) {
            if (this.LIZLLL.FQ2("page_feed")) {
                boolean zFQ2 = this.LIZLLL.FQ2("page_feed");
                boolean z3 = this.LIZLLL.xQ2("page_feed") instanceof MainPageFragment;
                if (this.LIZJ != null && z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!zFQ2 || !z2) {
                    return this.LIZLLL.xQ2("page_feed") instanceof MainPageFragment;
                }
            } else {
                if (z && C1388190mED.LIZIZ(this.LIZ) != null) {
                    C1590810rV1.LJ("profile_2_feed", C1590810rV1.LIZIZ(C1388190mED.LIZIZ(this.LIZ)));
                    IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi(IHomeSidebarService.class);
                    if (iHomeSidebarService != null) {
                        iHomeSidebarService.LIZLLL(EnumC1570650qyV.BACK_PRESS);
                    }
                }
                if (bool != null) {
                    this.LIZLLL.kE0("page_feed", bool.booleanValue());
                    return true;
                }
                ScrollSwitchStateManager scrollSwitchStateManager = this.LIZLLL;
                scrollSwitchStateManager.LL.setValue(scrollSwitchStateManager.EQ2("page_feed"));
                return true;
            }
        }
        return false;
    }

    public C1590590rUf(Fragment fragment, C1591410rVz c1591410rVz, C1590400rUM c1590400rUM) {
        Context context = fragment.getContext();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            this.LIZLLL = C486860J7k.LIZ(fragment);
            this.LJ = C680080Qly.LIZ(fragment);
        }
        LIZJ(context, c1591410rVz, c1590400rUM, c19egLIZIZ);
    }

    @Override // X.InterfaceC1209250hZb
    public final void ph(Bundle bundle, Aweme aweme, String str) {
        String requestId;
        Bundle bundle2 = bundle;
        if (this.LIZIZ != null) {
            if (C1585030rLh.LJJI()) {
                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS28S1200000_24(aweme, str, this, 1));
            } else {
                LIZLLL(aweme, str);
            }
            this.LJ.LLJILLL = true;
            CommonPageFragment commonPageFragmentXQ2 = this.LIZLLL.xQ2("page_profile");
            if (C296550Bjp.LIZ() && aweme != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                if (aweme.getAuthor() != null) {
                    requestId = aweme.getAuthor().getRequestId();
                } else {
                    requestId = null;
                }
                if (requestId == null) {
                    requestId = aweme.getRequestId();
                }
                C786410Ut5.LJJIZ(bundle2, "follow_recommend_nav_param", new C07WV(requestId, true));
            }
            C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
            HomePageDataViewModel homePageDataViewModel = this.LJ;
            c2277881EDy.updateProfilePageFragmentParams(commonPageFragmentXQ2, str, homePageDataViewModel.LLJILLL, homePageDataViewModel.LLJJ, bundle2);
            if (C1585030rLh.LJJI()) {
                C2487409ou.LIZJ(new ARunnableS124S0100000_24(this, 53));
                return;
            } else {
                this.LIZLLL.kE0("page_profile", true);
                return;
            }
        }
        C2344809Gs.LIZLLL(4, "FeedAvatarView", "mViewPager is null");
    }

    public C1590590rUf(Context context, C1591410rVz c1591410rVz, C1590400rUM c1590400rUM) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            this.LIZLLL = C486860J7k.LIZIZ(c19egLIZIZ);
            this.LJ = C680080Qly.LIZIZ(c19egLIZIZ);
        }
        LIZJ(context, c1591410rVz, c1590400rUM, c19egLIZIZ);
    }

    public final void LIZJ(Context context, C1591410rVz c1591410rVz, C1590400rUM c1590400rUM, C19EG c19eg) {
        this.LIZ = context;
        this.LIZIZ = c1591410rVz;
        this.LIZJ = c1590400rUM;
        if (c1591410rVz != null) {
            boolean zLIZ = true;
            try {
                SettingsManager.LIZLLL().getClass();
                zLIZ = SettingsManager.LIZ("enable_ad_scroll_judge", true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            c1591410rVz.LLLLZLLIL = zLIZ;
            c1591410rVz.LLLLZLLLI = ((Boolean) C0B8D.LIZIZ.getValue()).booleanValue();
            c1591410rVz.LLLZ = ((Boolean) C0B8I.LIZIZ.getValue()).booleanValue();
            c1591410rVz.LLZ = C0AD1.LIZ();
            if (c19eg != null) {
                boolean zBooleanValue = ((Boolean) C1591350rVt.LIZIZ.getValue()).booleanValue();
                c1591410rVz.LLLLLIL.LJFF(c19eg.getWindow(), zBooleanValue);
            }
        }
    }
}
