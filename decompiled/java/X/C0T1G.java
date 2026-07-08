package X;

import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.appdiff.IPushPopupYieldService;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.aweme.journey.IStrategyCenterService;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0T1G, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T1G {
    public final IBaseListFragmentPanel LIZ;
    public final C1620050sGB LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final RunnableC739110Syz LIZLLL = new Runnable() { // from class: X.0Syz
        public final void LIZ() {
            if (this.LL.LIZJ("")) {
                IPushPopupYieldService.LIZ.getClass();
                C0T1I.LIZIZ.getValue().LIZ();
                this.LL.LIZLLL();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("SwipeUpGuideManager@27e2.guideRunnableByVideoPlay$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("SwipeUpGuideManager@27e2.guideRunnableByVideoPlay$1");
        }
    };

    public static boolean LIZ() {
        Activity activityLIZ;
        if (!((Boolean) C264990Aa1.LIZ.getValue()).booleanValue() && (activityLIZ = C2421209eE.LIZ()) != null && (activityLIZ instanceof C19EG) && C1514430pVp.LIZLLL().booleanValue()) {
            C446900Hfk c446900Hfk = Hox.LLJILJIL;
            C19EG c19eg = (C19EG) activityLIZ;
            if (c446900Hfk.LIZ(c19eg).KQ2("Shop") || c446900Hfk.LIZ(c19eg).KQ2("SHOP_MALL")) {
                return false;
            }
        }
        return true;
    }

    public final boolean LIZIZ() {
        IBaseListFragmentPanel iBaseListFragmentPanel = this.LIZ;
        return (iBaseListFragmentPanel instanceof BaseListFragmentPanel ? ((BaseListFragmentPanel) iBaseListFragmentPanel).LLILZ() : false) || this.LIZ.getItemCount() - 1 != this.LIZ.LLLIIIIL().getCurrentItem();
    }

    public final void LIZLLL() {
        if (this.LIZ.getContext() != null) {
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SwipeUpGuideManager.guideRunnableByVideoPlay - needShowCombinedPopup: ");
            sbLIZ.append(((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJFF(this.LIZ.getContext()));
            sbLIZ.append(", HitNoPushPopGroup: ");
            sbLIZ.append(((INewUserJourneyService) ServiceManager.get().getService(INewUserJourneyService.class)).LJIILL());
            sbLIZ.append(", needShowOptIn: ");
            boolean z = false;
            sbLIZ.append(C10E9.LJIIIIZZ(this.LIZ.getContext(), false, false));
            c2276471E8n.d("PushPermissionPopup", C2188811AlT.LIZIZ(sbLIZ));
            if ((!((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJFF(this.LIZ.getContext()) || ((INewUserJourneyService) ServiceManager.get().getService(INewUserJourneyService.class)).LJIILL() || ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJI() > 0) && !C10E9.LJIIIIZZ(this.LIZ.getContext(), false, false)) {
                z = true;
            }
            IBaseListFragmentPanel iBaseListFragmentPanel = this.LIZ;
            if ((!(iBaseListFragmentPanel instanceof InterfaceC1218930hpD) || iBaseListFragmentPanel.LLLIIIIL().getCurrentItem() == 0) && z) {
                this.LIZ.Ie();
                C740390T2n.LIZ.getClass();
                C740390T2n.LIZIZ().edit().putBoolean("hasShowedSwipeUpGuideAfterVideoPlay", true).apply();
            }
        }
    }

    public final void LJ() {
        this.LIZJ.removeCallbacks(this.LIZLLL);
    }

    public final void LJFF() {
        if (!LIZJ("") || C740390T2n.LIZ()) {
            return;
        }
        this.LIZ.Ie();
        C740390T2n.LIZ.getClass();
        C740390T2n.LIZIZ().edit().putBoolean("hasShowedSwipeUpGuideAfterVideoPlay", true).apply();
    }

    public final boolean LIZJ(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zLJJIJIIJIL;
        boolean z5;
        boolean z6;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        C19EG c19eg;
        Aweme awemeLJFF;
        C19EG c19eg2;
        C19EG c19eg3;
        Aweme awemeLJFF2;
        boolean z7 = !this.LIZIZ.LJI();
        boolean z8 = !this.LIZIZ.LIZ("search_swipe_up_guide");
        if (!this.LIZIZ.LJFF() && !this.LIZIZ.LIZIZ() && !this.LIZIZ.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        boolean z9 = !this.LIZIZ.LJ();
        Activity activityLJFF = C2214201BlK.LJFF();
        if ((activityLJFF instanceof C19EG) && (c19eg3 = (C19EG) activityLJFF) != null && (awemeLJFF2 = C740740T3w.LJFF(c19eg3)) != null && !awemeLJFF2.isAd()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z10 = !z2;
        boolean z11 = !C740400T2o.LIZ;
        C740390T2n.LIZ.getClass();
        if (C740390T2n.LIZIZ().getBoolean("shouldShowSwipeUpGuide1", true) && ((IStrategyCenterService) ServiceManager.get().getService(IStrategyCenterService.class)).LIZJ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean zLIZIZ = LIZIZ();
        ShareDependService.LIZ.getClass();
        boolean zLJJIJIIJI = ShareDependServiceImpl.LJJJJI().LJJIJIIJI();
        if ((((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser() || ((Boolean) C072A.LIZ.getValue()).booleanValue()) && !((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser()) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z12 = !C104100aN.LIZ().LJJIJ(AFwS189S0000000_3.get$arr$(1781));
        boolean z13 = false;
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        if (iDeepLinkService != null) {
            Activity activityLJFF2 = C2214201BlK.LJFF();
            if ((activityLJFF2 instanceof C19EG) && (c19eg2 = (C19EG) activityLJFF2) != null) {
                awemeLJFF = C740740T3w.LJFF(c19eg2);
            } else {
                awemeLJFF = null;
            }
            zLJJIJIIJIL = iDeepLinkService.LJJIJIIJIL(awemeLJFF, str);
        } else {
            zLJJIJIIJIL = false;
        }
        boolean z14 = !zLJJIJIIJIL;
        boolean zLIZ = LIZ();
        Activity activityLIZ = C2421209eE.LIZ();
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && Hox.LLJILJIL.LIZ(c19eg).KQ2("SERIES_DISCOVER")) {
            z5 = false;
        } else {
            z5 = true;
        }
        boolean z15 = !C19254610Um.LIZIZ.LJJIIZ();
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null && interfaceC1577280r9CLIZ.LJIILIIL()) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z16 = !z6;
        if (z7 && z8 && z && z9 && z10 && z11 && z3 && zLIZIZ && zLJJIJIIJI && z4 && z12 && z14 && zLIZ && z5 && z15 && z16) {
            z13 = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("normalCheck failed items: ");
        String[] strArr = new String[18];
        if (!z7) {
            str2 = "isSwipeUpGuideShowing";
        } else {
            str2 = null;
        }
        strArr[0] = str2;
        if (!z8) {
            str3 = "isSearchSwipeUpGuideShowing";
        } else {
            str3 = null;
        }
        strArr[1] = str3;
        if (!z) {
            str4 = "checkFeedPanelState";
        } else {
            str4 = null;
        }
        strArr[2] = str4;
        if (!z9) {
            str5 = "checkFeedDialogState";
        } else {
            str5 = null;
        }
        strArr[3] = str5;
        if (!z10) {
            str6 = "isCurAwemeAd";
        } else {
            str6 = null;
        }
        strArr[4] = str6;
        if (!z11) {
            str7 = "hasSwipedUp";
        } else {
            str7 = null;
        }
        strArr[5] = str7;
        strArr[6] = null;
        if (!z3) {
            str8 = "shouldShowSwipeUpGuide";
        } else {
            str8 = null;
        }
        strArr[7] = str8;
        strArr[8] = null;
        if (!zLIZIZ) {
            str9 = "hasMoreAweme";
        } else {
            str9 = null;
        }
        strArr[9] = str9;
        if (!zLJJIJIIJI) {
            str10 = "isInFeedPage";
        } else {
            str10 = null;
        }
        strArr[10] = str10;
        if (!z4) {
            str11 = "isUserStateValid";
        } else {
            str11 = null;
        }
        strArr[11] = str11;
        if (!z12) {
            str12 = "inDowngrade";
        } else {
            str12 = null;
        }
        strArr[12] = str12;
        if (!z14) {
            str13 = "disableSwipeUpMaskBeforeInsertFeed";
        } else {
            str13 = null;
        }
        strArr[13] = str13;
        if (!zLIZ) {
            str14 = "isInShopTab";
        } else {
            str14 = null;
        }
        strArr[14] = str14;
        if (!z5) {
            str15 = "isInSeriesDiscoverTab";
        } else {
            str15 = null;
        }
        strArr[15] = str15;
        if (!z15) {
            str16 = "isRemoveFeedSwipeup";
        } else {
            str16 = null;
        }
        strArr[16] = str16;
        if (!z16) {
            str17 = "shouldInterruptedGuideView";
        } else {
            str17 = null;
        }
        strArr[17] = str17;
        sbLIZ.append(C13LP.LJJLIIIJ(C13LQ.LJIJI(strArr), ", ", null, null, 0, null, null, 62));
        sbLIZ.append(", triggerTime=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return z13;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Syz] */
    public C0T1G(IBaseListFragmentPanel iBaseListFragmentPanel, C1620050sGB c1620050sGB) {
        this.LIZ = iBaseListFragmentPanel;
        this.LIZIZ = c1620050sGB;
    }

    public final boolean LJI(int i, String str) {
        C19EG c19eg;
        Aweme awemeLJFF;
        String str2;
        if (!this.LIZIZ.LJI() && !this.LIZIZ.LIZ("search_swipe_up_guide") && !this.LIZIZ.LJFF() && !this.LIZIZ.LIZIZ() && !this.LIZIZ.LIZJ() && (!this.LIZIZ.LJ())) {
            Activity activityLJFF = C2214201BlK.LJFF();
            if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null && (awemeLJFF = C740740T3w.LJFF(c19eg)) != null && !awemeLJFF.isAd() && LIZIZ()) {
                ShareDependService.LIZ.getClass();
                if (ShareDependServiceImpl.LJJJJI().LJJIJIIJI() && LIZ()) {
                    C0T1H.LIZJ = true;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("item_id", str);
                    if (i == 1) {
                        str2 = "middle";
                    } else {
                        str2 = "bottom";
                    }
                    c2344009Gk.LJIIIIZZ("ui_type", str2);
                    C20684815ws.LJIILLIIL("swipe_up_guide_show", c2344009Gk.LIZ);
                    if (i != 1) {
                        if (i == 2) {
                            this.LIZ.Ue();
                        }
                        return true;
                    }
                    C0T1H c0t1h = C0T1H.LIZ;
                    IBaseListFragmentPanel iBaseListFragmentPanel = this.LIZ;
                    c0t1h.getClass();
                    iBaseListFragmentPanel.Ie();
                    final WeakReference weakReference = new WeakReference(iBaseListFragmentPanel);
                    Runnable runnable = new Runnable(weakReference) { // from class: X.0MuU
                        public final WeakReference<IBaseListFragmentPanel> LL;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LowActiveSwipeUpExperiment$DismissRunnableV1@bfe0.run");
                            try {
                                C0T1H.LJ = null;
                                IBaseListFragmentPanel iBaseListFragmentPanel2 = this.LL.get();
                                if (iBaseListFragmentPanel2 != null) {
                                    iBaseListFragmentPanel2.Ne();
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LowActiveSwipeUpExperiment$DismissRunnableV1@bfe0.run");
                        }

                        {
                            this.LL = weakReference;
                        }
                    };
                    C0T1H.LJ = runnable;
                    C786410Ut5.LJLIIL(3000L, C0T1H.LJI, runnable);
                    return true;
                }
            }
        }
        return false;
    }
}
