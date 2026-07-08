package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611080s1i extends AbstractC1586250rNf implements InterfaceC427710Gpt, InterfaceC1141530foN {
    public View LLILZIL;
    public C0I7D LLILZLL;
    public TuxTextView LLIZ;
    public TuxIconView LLIZLLLIL;
    public final String LLJ = "";
    public String LLJI = "";
    public String LLJIJIL = "";
    public Pair<? extends Aweme, String> LLJILJIL;
    public volatile boolean LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    @Override // X.InterfaceC1570900qyu
    public final void Z1() {
        this.LLJJI = false;
        LJ();
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1548820qPI.LJIIIIZZ("event_show_search_entrance_guide", this);
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJIILLIIL(this);
    }

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void a2() {
        this.LLJJ = true;
        if (this.LLJJI) {
            LJIILJJIL();
        }
    }

    public final void LJIIJJI() {
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILZLL().LIZJ();
        C0I7D c0i7d = this.LLILZLL;
        if (c0i7d != null) {
            c0i7d.clearFocus();
        }
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView != null) {
            tuxTextView.setText(this.LLJI);
        }
        if (this.LLJILJILJ) {
            C0I7D c0i7d2 = this.LLILZLL;
            if (c0i7d2 != null) {
                c0i7d2.setText(this.LLJI);
                return;
            }
            return;
        }
        C0I7D c0i7d3 = this.LLILZLL;
        if (c0i7d3 != null) {
            c0i7d3.setText("");
        }
    }

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void e2() {
        C1ER1.LIZIZ.LLJZ();
        this.LLJJ = false;
    }

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void onResume() {
        if (this.LLJJI) {
            LJIIL();
        }
    }

    public final String LJI() {
        Aweme first;
        String aid;
        Aweme aweme;
        C19EG activity = LIZJ().getActivity();
        String aid2 = (activity == null || (aweme = C680080Qly.LIZIZ(activity).LLJILJILJ) == null) ? null : aweme.getAid();
        Pair<? extends Aweme, String> pair = this.LLJILJIL;
        return (pair == null || (first = pair.getFirst()) == null || (aid = first.getAid()) == null) ? aid2 : aid;
    }

    public final void LJII() {
        Object service;
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJIIIIZZ(null);
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        }
        ((InterfaceC1611110s1l) service).P();
        if (C311290CId.LIZ()) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            c1er1.LJIJJ(new AwS568S0100000_24(this, 1664));
            c1er1.LLFFF(new AwS603S0100000_24(this, 463));
        }
    }

    public final void LJIIIZ() {
        CharSequence text;
        C19EG activity = LIZJ().getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJIJI().LLILZLL().LJFF();
        C0I7D c0i7d = this.LLILZLL;
        if (c0i7d == null || (text = c0i7d.getText()) == null) {
            text = "";
        }
        if (text.length() > 0) {
            c19252910Tv.LIZLLL().LJIJI().LLILZLL().LJ(null);
        }
        LJIIJ(activity);
    }

    public final void LJIIL() {
        View view;
        Context context;
        Activity activityLIZ;
        C19EG activity = LIZJ().getActivity();
        if (activity == null || (view = this.LLILZIL) == null || view.getContext() == null) {
            return;
        }
        View view2 = this.LLILZIL;
        if (view2 == null || (context = view2.getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !activityLIZ.isFinishing()) {
            C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILZLL().LJ(null);
            TuxIconView tuxIconView = this.LLIZLLLIL;
            if (tuxIconView != null) {
                PopupManager.LJIJI(C1ER1.LIZIZ.LLJJJIL(tuxIconView, activity), true);
            }
            this.LLJJI = false;
        }
    }

    public final void LJIILIIL() {
        View view;
        Object service;
        String aid;
        Context context;
        Activity activityLIZ;
        C19EG activity = LIZJ().getActivity();
        if (activity == null || (view = this.LLILZIL) == null || view.getContext() == null) {
            return;
        }
        View view2 = this.LLILZIL;
        if ((view2 == null || (context = view2.getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !activityLIZ.isFinishing()) && !((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            if (C1157804fw.LIZ()) {
                service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                if (service == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
                }
            } else {
                service = ServiceManager.get().getService(ISearchService.class);
                if (service == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
                }
            }
            if (((InterfaceC1611110s1l) service).LJIL()) {
                PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
                if (pnSDigitalWellbeingSDKService == null || !pnSDigitalWellbeingSDKService.LJIIL()) {
                    if (PopupManager.LJI()) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("caption_intercept_reason", "popup_showing");
                        C20684815ws.LJIILLIIL("caption_intercept", c2344009Gk.LIZ);
                        return;
                    }
                    C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILZLL().LJ(null);
                    TuxIconView tuxIconView = this.LLIZLLLIL;
                    Aweme aweme = C680080Qly.LIZIZ(activity).LLJILJILJ;
                    if (aweme == null || (aid = aweme.getAid()) == null) {
                        aid = this.LLJIJIL;
                    }
                    if (tuxIconView != null) {
                        PopupManager.LJIJI(C1ER1.LIZIZ.LJJJJIZL(activity, tuxIconView, aid, new C1620990sHh(this, 2)), true);
                    }
                }
            }
        }
    }

    public final void LJIILJJIL() {
        View view;
        Context context;
        Activity activityLIZ;
        C19EG activity = LIZJ().getActivity();
        if (activity == null || (view = this.LLILZIL) == null || view.getContext() == null) {
            return;
        }
        View view2 = this.LLILZIL;
        if ((view2 == null || (context = view2.getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !activityLIZ.isFinishing()) && !PopupManager.LJI() && Intrinsics.LJFF(LIZJ().f3(), "homepage_hot")) {
            C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILZLL().LJ(null);
            TuxIconView tuxIconView = this.LLIZLLLIL;
            if (tuxIconView != null) {
                PopupManager.LJIJI(C1ER1.LIZIZ.LLJJJIL(tuxIconView, activity), true);
            }
        }
    }

    public static String LJIIIIZZ(C19EG c19eg) {
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        FeedFragment feedFragmentUx;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C0SZ8 c0sz8LJLIL;
        VideoItemParams videoItemParamsLJ;
        Integer numValueOf;
        String string;
        if (!C1EE2.LIZIZ.LIZLLL()) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        C128Y c128yBQ2 = C343710Ddh.LIZ(c19eg).BQ2();
        if (!(c128yBQ2 instanceof InterfaceC1593630rZZ) || (interfaceC1593630rZZ = (InterfaceC1593630rZZ) c128yBQ2) == null || (feedFragmentUx = interfaceC1593630rZZ.ux()) == null || (interfaceC665370Q7zLJ = C1578630rBN.LJ(feedFragmentUx)) == null || (iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null)) == null || (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) == null || (videoItemParamsLJ = C0RLJ.LJ(c0sz8LJLIL)) == null || (numValueOf = Integer.valueOf(videoItemParamsLJ.isEnterGraphicDetail)) == null || (string = numValueOf.toString()) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return string;
    }

    public final void LJIIJ(C19EG c19eg) {
        Aweme aweme;
        String aid;
        String str;
        C19EG activity = LIZJ().getActivity();
        if (activity != null) {
            aweme = C680080Qly.LIZIZ(activity).LLJILJILJ;
        } else {
            aweme = null;
        }
        String strF3 = LIZJ().f3();
        String strLJIIIIZZ = LJIIIIZZ(c19eg);
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILZLL().LJFF();
        C1ER1 c1er1 = C1ER1.LIZIZ;
        String strLLJLILLLLZIIL = c1er1.LLJLILLLLZIIL();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//search");
        String strLJI = LJI();
        if (strLJI == null) {
            strLJI = "";
        }
        smartRouteBuildRoute.withParam("group_id", strLJI);
        smartRouteBuildRoute.withParam("in_single_stack", true);
        smartRouteBuildRoute.withParam("search_from", strF3);
        smartRouteBuildRoute.withParam("enter_from", strF3);
        smartRouteBuildRoute.withParam("set_hint_by_sug_word", false);
        smartRouteBuildRoute.withParam("blankpage_enter_from", strF3);
        smartRouteBuildRoute.withParam("blankpage_enter_method", "search_bar_enter");
        if (C1EE2.LIZIZ.LIZLLL()) {
            smartRouteBuildRoute.withParam("is_enter_graphic_detail", strLJIIIIZZ);
        }
        smartRouteBuildRoute.withParam("feed_search_bar_flag", 1);
        if (strLLJLILLLLZIIL != null) {
            smartRouteBuildRoute.withParam("enter_blank_page_id", strLLJLILLLLZIIL);
        }
        smartRouteBuildRoute.open(10089, new C1620840sHS(this, 0));
        String strF32 = LIZJ().f3();
        boolean z = this.LLJILJILJ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = this.LLJIJIL;
        }
        String strLJJJJLI = c1er1.LJJJJLI();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", strF32);
        c2344009Gk.LJIIIIZZ("enter_method", "search_bar_enter");
        if (c1er1.LIZLLL()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_coin_task", str);
        c2344009Gk.LJIIIIZZ("last_group_id", aid);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_prefill");
        if (strLJJJJLI.length() > 0) {
            c2344009Gk.LJFF("caption_type", "bubble");
        }
        if (c1er1.LLLLJI()) {
            c2344009Gk.LJFF("has_activation_task", "1");
            c2344009Gk.LJFF("activation_task_id", c1er1.f0());
        }
        if (strLLJLILLLLZIIL != null) {
            c2344009Gk.LJFF("blankpage_id", strLLJLILLLLZIIL);
        }
        C0Q2O.LIZ.getClass();
        C0Q2O.LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("enter_search_blankpage", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", strF32);
        c2344009Gk2.LJIIIIZZ("enter_method", "enter");
        C20684815ws.LJIILLIIL("enter_search", c2344009Gk2.LIZ);
    }

    @Override // X.InterfaceC1570900qyu
    public final void U1(View view) {
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLILZLL().LJFF();
    }

    @Override // X.InterfaceC1570900qyu
    public final void X1(int i) {
        Aweme aweme;
        View view = this.LLILZIL;
        if (view != null) {
            C19EG activity = LIZJ().getActivity();
            if (activity != null) {
                aweme = C680080Qly.LIZIZ(activity).LLJILJILJ;
            } else {
                aweme = null;
            }
            C1030680cva.LJIILJJIL(aweme, i, view);
            if (i == 4) {
                C786410Ut5.T4(view, 1.0f);
            }
        }
    }

    @Override // X.C0T2Y
    public final void Y3(Aweme aweme) {
        String aid;
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        this.LLJIJIL = aid;
        LJIILIIL();
        C19EG activity = LIZJ().getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        C0I7D c0i7d = this.LLILZLL;
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView == null) {
            return;
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJIJI().LLILZLL().LJFF();
        if (c0i7d == null) {
            return;
        }
        C0I7D c0i7d2 = this.LLILZLL;
        if (c0i7d2 != null) {
            c0i7d2.clearFocus();
            c0i7d2.setText("");
        }
        String string = activity.getString(2131847157);
        if (aweme == null) {
            c0i7d.setText(this.LLJ);
            c0i7d.setHint(string);
            tuxTextView.setText(string);
            this.LLJILJIL = null;
            this.LLJILJILJ = false;
            c19252910Tv.LIZLLL().LJIJI().LLILZLL().LIZLLL(false);
            return;
        }
        this.LLJILLL = C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C1013680cUA(this, aweme, c0i7d, string, tuxTextView, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    @Override // X.InterfaceC1570900qyu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View f2(android.content.Context r5) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1611080s1i.f2(android.content.Context):android.view.View");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "event_show_search_entrance_guide")) {
            this.LLJJI = true;
        }
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        Object service;
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        }
        if (((InterfaceC1611110s1l) service).LLIIIZ()) {
            C1ER1.LIZIZ.b0();
        }
    }
}
