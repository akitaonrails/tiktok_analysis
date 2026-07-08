package X;

import Y.ACListenerS163S0100000_29;
import Y.AObserverS231S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.IDonationVendorService;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokGroupSceneFragment;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultModel;
import com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11Aw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19458411Aw extends AbstractC19458011As implements C11BA, C11BC {
    public static final /* synthetic */ int LLJZ = 0;
    public OrganizationListViewModel LLJJIJI;
    public C11B2 LLJJIJIL;
    public C11BE LLJJJ;
    public C1749280vcc LLJJJIL;
    public LinearLayout LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public TuxTextView LLJJL;
    public C417370GYd LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public C11BD LLJLIL;
    public RecyclerView LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 656));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 655));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 659));

    @Override // X.C11BC
    public final void LJIILJJIL() {
    }

    @Override // X.C11BC
    public final void LLILII() {
    }

    @Override // X.C11BC
    public final void LJJLIIIJLJLI() {
        C11B0 c11b0 = C11B0.LIZ;
        String enterFrom = getEnterFrom();
        String strLLLLIL = LLLLIL();
        c11b0.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", enterFrom);
        c0lab.LJ("search_type", "ngo_list");
        c0lab.LJ("user_id", C11B0.LIZ());
        c0lab.LJ("enter_method", strLLLLIL);
        C20684815ws.LJIILLIIL("clear_search_bar", c0lab.LIZ);
    }

    @Override // X.C11BC
    public final void LLILZLL() {
        C11B0 c11b0 = C11B0.LIZ;
        String enterFrom = getEnterFrom();
        String strLLLLIL = LLLLIL();
        c11b0.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", enterFrom);
        c0lab.LJ("search_type", "ngo_list");
        c0lab.LJ("user_id", C11B0.LIZ());
        c0lab.LJ("enter_method", strLLLLIL);
        C20684815ws.LJIILLIIL("cancel_search_bar", c0lab.LIZ);
        refresh();
    }

    public final void LLLLIIIILLL() {
        C19A3 c19a3;
        C11B2 c11b2 = this.LLJJIJIL;
        if (c11b2 != null) {
            c11b2.onDismiss();
        }
        Scene scene = this.mParentScene;
        if (!(scene instanceof C19A3) || (c19a3 = (C19A3) scene) == null) {
            return;
        }
        c19a3.remove(this, R.anim.fy);
        reset();
    }

    public final C11B4 LLLLIILL() {
        return (C11B4) this.LLJJIII.getValue();
    }

    public final C11B1 LLLLILI() {
        return (C11B1) this.LLJJI.getValue();
    }

    public final void refresh() {
        LinearLayout linearLayout = this.LLJJJJ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(8, linearLayout);
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        if (contextLIZIZ != null) {
            if (C790050Uyx.LIZ(contextLIZIZ)) {
                OrganizationListViewModel organizationListViewModel = this.LLJJIJI;
                OrganizationListViewModel organizationListViewModel2 = organizationListViewModel != null ? organizationListViewModel : null;
                organizationListViewModel2.LLIZLLLIL();
                organizationListViewModel2.vQ2(false);
                return;
            }
            C1749280vcc c1749280vcc = this.LLJJJIL;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv6, new AwS573S0100000_29(this, 658));
            c1749280vcc.setStatus(c1722300uv6);
            C1749280vcc c1749280vcc2 = this.LLJJJIL;
            C786410Ut5.LLLZLZ(c1749280vcc2 != null ? c1749280vcc2 : null, 0);
        }
    }

    public final void reset() {
        OrganizationListViewModel organizationListViewModel = this.LLJJIJI;
        if (organizationListViewModel == null) {
            organizationListViewModel = null;
        }
        organizationListViewModel.LL.setValue(new C19413310xH(null, false, null, null, null, null, false, true, false, false, 56));
        organizationListViewModel.LLIZLLLIL();
        C11B4 c11b4LLLLIILL = LLLLIILL();
        List<T> list = c11b4LLLLIILL.LLIZLLLIL;
        if (list != 0) {
            list.clear();
            c11b4LLLLIILL.notifyDataSetChanged();
        }
        C11BD c11bd = this.LLJLIL;
        if (c11bd == null) {
            c11bd = null;
        }
        c11bd.LL = null;
        C0I7D c0i7d = c11bd.LLJ;
        if (c0i7d != null) {
            c0i7d.setText("");
        }
        C0I7D c0i7d2 = c11bd.LLJ;
        if (c0i7d2 != null) {
            c0i7d2.clearFocus();
        }
        c11bd.LIZ();
        LinearLayout linearLayout = this.LLJJJJ;
        C786410Ut5.LJZL(8, linearLayout != null ? linearLayout : null);
    }

    public final String LLLLIL() {
        return LLLLILI() == null ? "click_profile_nonprofit" : "click_sticker";
    }

    public final String getEnterFrom() {
        return LLLLILI() == null ? "personal_homepage" : "video_edit_page";
    }

    @Override // X.AbstractC19458011As, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setStatusBarColor(this.LLJLLIL);
            window.setNavigationBarColor(this.LLJLLL);
        }
        new C828330WeV(new ThirdPartyBizCert(402677760)).LIZJ();
    }

    @Override // X.C11BA
    public final void LJJLJ(C11BE c11be) {
        this.LLJJJ = c11be;
        final Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("url", c11be.getDetailUrl(), bundle);
        C786410Ut5.LJJJI("title", getString(2131832346), bundle);
        C786410Ut5.LJJJI("enter_from", "org_detail_page", bundle);
        Activity activityRequireActivity = requireActivity();
        String detailUrl = c11be.getDetailUrl();
        if (detailUrl != null) {
            C828330WeV c828330WeV = new C828330WeV(new ThirdPartyBizCert(402677760));
            c828330WeV.LIZ(activityRequireActivity, detailUrl);
            C0W58 c0w58 = new C0W58() { // from class: X.11Ay
                @Override // X.C0W58
                public final void LIZLLL(int i, Bundle bundle2) {
                    C19458411Aw c19458411Aw;
                    C11BE c11be2;
                    String str;
                    String str2;
                    String str3;
                    if (6 == i && (c11be2 = (c19458411Aw = this.LIZ).LLJJJ) != null) {
                        C11B1 c11b1LLLLILI = c19458411Aw.LLLLILI();
                        String str4 = null;
                        if (c11b1LLLLILI != null) {
                            str = c11b1LLLLILI.shootWay;
                        } else {
                            str = null;
                        }
                        C11B1 c11b1LLLLILI2 = c19458411Aw.LLLLILI();
                        if (c11b1LLLLILI2 != null) {
                            str2 = c11b1LLLLILI2.creationId;
                        } else {
                            str2 = null;
                        }
                        String name = c11be2.getName();
                        C11B1 c11b1LLLLILI3 = c19458411Aw.LLLLILI();
                        if (c11b1LLLLILI3 != null) {
                            str3 = c11b1LLLLILI3.contentSource;
                        } else {
                            str3 = null;
                        }
                        C11B1 c11b1LLLLILI4 = c19458411Aw.LLLLILI();
                        if (c11b1LLLLILI4 != null) {
                            str4 = c11b1LLLLILI4.contentType;
                        }
                        JSONObject jSONObject = new JSONObject();
                        C11B9.LIZ(jSONObject, new C19458711Az(str, str2, name, str3, str4));
                        C2341909Fp.LIZIZ("add_donation_sticker", jSONObject);
                    }
                }
            };
            C0W04 c0w04 = c828330WeV.LIZIZ;
            if (c0w04 != null) {
                C817470W4z c817470W4z = c0w04.LLILLJJLI;
                if (c817470W4z == null) {
                    c0w04.LL = null;
                } else if (c0w04.LL == null) {
                    c0w04.LL = c817470W4z.LIZJ(c0w58);
                }
            }
            c828330WeV.LIZIZ(activityRequireActivity, detailUrl, new InterfaceC828360WeY() { // from class: X.11At
                @Override // X.InterfaceC828360WeY
                public final void LIZ(Context context, String str) throws Throwable {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ.requireActivity(), "aweme://donation/web/page");
                    smartRouteBuildRoute.withParam(bundle);
                    Intent intentBuildIntent = smartRouteBuildRoute.buildIntent();
                    if (intentBuildIntent != null) {
                        C19458411Aw c19458411Aw = this.LIZ;
                        TikTokGroupSceneFragment tikTokGroupSceneFragment = c19458411Aw.LLJJ;
                        if (tikTokGroupSceneFragment == null) {
                            tikTokGroupSceneFragment = new TikTokGroupSceneFragment();
                            tikTokGroupSceneFragment.LL = new WeakReference<>(c19458411Aw);
                            C19EH c19ehLJIIJ = C20622515mp.LJIILLIIL(c19458411Aw).LJIIJ();
                            c19ehLJIIJ.LIZLLL(tikTokGroupSceneFragment, c19458411Aw.LLJILLL);
                            c19ehLJIIJ.LJIIL();
                            c19458411Aw.LLJJ = tikTokGroupSceneFragment;
                        }
                        C1701330uNH.LIZ(intentBuildIntent, tikTokGroupSceneFragment);
                        C2204961BRm.LLJL(tikTokGroupSceneFragment, intentBuildIntent, 12580, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0D4MVc3nBqUhjGZ6OXWH0EJ87v3w2g1bTB97GK5rcUJO7IvjazdVjDbpn3w9tsDiM7/0sZA==", null));
                    }
                }
            }, null);
        }
    }

    @Override // X.C11BC
    public final void LLIILII(String str) {
        LinearLayout linearLayout = this.LLJJJJ;
        C11BD c11bd = null;
        OrganizationListViewModel organizationListViewModel = null;
        C1749280vcc c1749280vcc = null;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(8, linearLayout);
        if (str != null && str.length() != 0) {
            Context contextLIZIZ = C545820Lau.LIZIZ(this);
            if (contextLIZIZ != null) {
                if (C790050Uyx.LIZ(contextLIZIZ)) {
                    OrganizationListViewModel organizationListViewModel2 = this.LLJJIJI;
                    if (organizationListViewModel2 != null) {
                        organizationListViewModel = organizationListViewModel2;
                    }
                    if (str.equals(organizationListViewModel.LLILZLL)) {
                        if (organizationListViewModel.LLILZ == 1) {
                            organizationListViewModel.wQ2(true);
                            return;
                        }
                        return;
                    } else {
                        organizationListViewModel.LLIZLLLIL();
                        organizationListViewModel.LLILZLL = str;
                        organizationListViewModel.wQ2(false);
                        return;
                    }
                }
                C1749280vcc c1749280vcc2 = this.LLJJJIL;
                if (c1749280vcc2 == null) {
                    c1749280vcc2 = null;
                }
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LIZ(c1722300uv6, new AwS573S0100000_29(this, 657));
                c1749280vcc2.setStatus(c1722300uv6);
                C1749280vcc c1749280vcc3 = this.LLJJJIL;
                if (c1749280vcc3 != null) {
                    c1749280vcc = c1749280vcc3;
                }
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                return;
            }
            return;
        }
        C11BD c11bd2 = this.LLJLIL;
        if (c11bd2 != null) {
            c11bd = c11bd2;
        }
        C0I7D c0i7d = c11bd.LLJ;
        if (c0i7d == null || !c0i7d.hasFocus()) {
            return;
        }
        refresh();
    }

    @Override // X.C11BA
    public final void LLJJIII(C11BE c11be) {
        if (c11be instanceof OrganizationSearchResultModel) {
            C11B0 c11b0 = C11B0.LIZ;
            String enterFrom = getEnterFrom();
            String strLLLLIL = LLLLIL();
            String donateLink = c11be.getDonateLink();
            if (donateLink != null) {
                c11b0.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", enterFrom);
                c0lab.LJ("search_type", "ngo_list");
                c0lab.LJ("user_id", C11B0.LIZ());
                c0lab.LJ("enter_method", strLLLLIL);
                c0lab.LJ("link", donateLink);
                c0lab.LJ("link_type", "nonprofit");
                C20684815ws.LJIILLIIL("click_search_bar_result", c0lab.LIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C11B2 c11b2 = this.LLJJIJIL;
        if (c11b2 != null) {
            c11b2.LIZ(c11be);
        }
        C11BD c11bd = this.LLJLIL;
        if (c11bd == null) {
            c11bd = null;
        }
        c11bd.LIZ();
        LLLLIIIILLL();
    }

    @Override // X.AbstractC19458011As, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        String string;
        ViewGroup.LayoutParams layoutParams;
        boolean zLJI = MethodIDManager.LJI(202532);
        super.onActivityCreated(bundle);
        Activity activityRequireActivity = requireActivity();
        this.LLJLLL = activityRequireActivity.getWindow().getNavigationBarColor();
        this.LLJLLIL = activityRequireActivity.getWindow().getStatusBarColor();
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ((C19EG) requireActivity());
        tuxImmersionBarLJ.LJ(R.attr.bx);
        tuxImmersionBarLJ.LJIIIIZZ(R.attr.e1);
        tuxImmersionBarLJ.LIZLLL();
        TuxIconView tuxIconView = null;
        this.LLJJIJI = (OrganizationListViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(OrganizationListViewModel.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && !bundle2.getBoolean("from_fragment")) {
            View viewFindViewById = findViewById(R.id.evm);
            if (viewFindViewById != null) {
                layoutParams = viewFindViewById.getLayoutParams();
            } else {
                layoutParams = null;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C497820Jfg.LIZJ(activityRequireActivity);
        }
        this.LLJJJIL = (C1749280vcc) requireViewById(R.id.gal);
        this.LLJJJJ = (LinearLayout) requireViewById(R.id.nft);
        this.LLJJJJJIL = (TuxTextView) requireViewById(R.id.tv_powered_by);
        this.LLJJJJLIIL = (LinearLayout) requireViewById(R.id.nf9);
        this.LLJJL = (TuxTextView) requireViewById(R.id.zx1);
        this.LLJJLIIIJLLLLLLLZ = (C417370GYd) requireViewById(R.id.lxs);
        this.LLJL = (TuxTextView) requireViewById(R.id.tv_title);
        this.LLJLIL = (C11BD) requireViewById(R.id.ug4);
        this.LLJLILLLLZIIL = (RecyclerView) requireViewById(R.id.t0q);
        this.LLJLL = (TuxIconView) requireViewById(R.id.lc0);
        OrganizationListViewModel organizationListViewModel = this.LLJJIJI;
        if (organizationListViewModel == null) {
            organizationListViewModel = null;
        }
        organizationListViewModel.LLILLJJLI.observe(this, new AObserverS231S0100000_29(this, 105));
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTuxFont(33);
        RecyclerView recyclerView = this.LLJLILLLLZIIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(activityRequireActivity));
        C11B4 c11b4LLLLIILL = LLLLIILL();
        if (true != c11b4LLLLIILL.LL) {
            c11b4LLLLIILL.LL = true;
            c11b4LLLLIILL.onShowFooterChanged(true);
        }
        RecyclerView recyclerView2 = this.LLJLILLLLZIIL;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(LLLLIILL());
        C11BD c11bd = this.LLJLIL;
        if (c11bd == null) {
            c11bd = null;
        }
        int visibility = c11bd.getVisibility();
        c11bd.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c11bd);
        C11BD c11bd2 = this.LLJLIL;
        if (c11bd2 == null) {
            c11bd2 = null;
        }
        c11bd2.setSearchBarEventHandler(this);
        IDonationVendorService iDonationVendorService = (IDonationVendorService) PluggableExtentionKt.pluggableSpi$default(IDonationVendorService.class, false, false, false, 14, null);
        if (iDonationVendorService != null && iDonationVendorService.enableDonationPercentService()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            string = getString(2131832347);
        } else {
            string = getString(2131832358);
        }
        if (TextUtils.equals(string, getString(2131832347))) {
            TuxTextView tuxTextView2 = this.LLJJJJJIL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, 4);
        } else {
            String string2 = getString(2131832357, string);
            SpannableString spannableString = new SpannableString(string2);
            if (a0.LJJJ(string2, string, 0, false, 6) != -1) {
                C786410Ut5.p2(spannableString, this.LLJJIJIIJIL.getValue(), a0.LJJJ(string2, string, 0, false, 6), string2.length(), 18);
            }
            TuxTextView tuxTextView3 = this.LLJJJJJIL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
            TuxTextView tuxTextView4 = this.LLJJJJJIL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setText(spannableString);
            TuxTextView tuxTextView5 = this.LLJJJJJIL;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            tuxTextView5.setHighlightColor(0);
            TuxTextView tuxTextView6 = this.LLJJJJJIL;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView6, 8);
        }
        TuxIconView tuxIconView2 = this.LLJLL;
        if (tuxIconView2 != null) {
            tuxIconView = tuxIconView2;
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 144));
        LLLLIILL().LLIZ = new C194324110w(this);
        refresh();
        C1447800nmM.LIZIZ(this).LLLIILIL(this, new C19775212Ys(this, 5));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C11BC
    public final void LJIILL(String str, boolean z) {
        if (z && str.length() == 0) {
            C11B0 c11b0 = C11B0.LIZ;
            String enterFrom = getEnterFrom();
            String strLLLLIL = LLLLIL();
            c11b0.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", enterFrom);
            c0lab.LJ("search_type", "ngo_list");
            c0lab.LJ("user_id", C11B0.LIZ());
            c0lab.LJ("enter_method", strLLLLIL);
            C20684815ws.LJIILLIIL("enter_search_bar", c0lab.LIZ);
            C11B4 c11b4LLLLIILL = LLLLIILL();
            List<T> list = c11b4LLLLIILL.LLIZLLLIL;
            if (list != 0) {
                list.clear();
                c11b4LLLLIILL.notifyDataSetChanged();
            }
        }
    }

    @Override // X.AbstractC19458011As
    public final void onActivityResult(int i, int i2, Intent intent) {
        C11BE c11be;
        String str;
        String str2;
        String str3;
        if (i2 == -1 && i == 12580 && (c11be = this.LLJJJ) != null) {
            LLLLIIIILLL();
            C11B2 c11b2 = this.LLJJIJIL;
            if (c11b2 != null) {
                c11b2.LIZ(c11be);
            }
            C11B1 c11b1LLLLILI = LLLLILI();
            String str4 = null;
            if (c11b1LLLLILI != null) {
                str = c11b1LLLLILI.shootWay;
            } else {
                str = null;
            }
            C11B1 c11b1LLLLILI2 = LLLLILI();
            if (c11b1LLLLILI2 != null) {
                str2 = c11b1LLLLILI2.creationId;
            } else {
                str2 = null;
            }
            String name = c11be.getName();
            C11B1 c11b1LLLLILI3 = LLLLILI();
            if (c11b1LLLLILI3 != null) {
                str3 = c11b1LLLLILI3.contentSource;
            } else {
                str3 = null;
            }
            C11B1 c11b1LLLLILI4 = LLLLILI();
            if (c11b1LLLLILI4 != null) {
                str4 = c11b1LLLLILI4.contentType;
            }
            JSONObject jSONObject = new JSONObject();
            C11B9.LIZ(jSONObject, new C19458711Az(str, str2, name, str3, str4));
            C2341909Fp.LIZIZ("add_donation_sticker", jSONObject);
        }
    }

    @Override // X.AbstractC19458011As, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.byj, viewGroup, false);
    }
}
