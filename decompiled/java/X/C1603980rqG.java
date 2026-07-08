package X;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IUgAllService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.controller.I18nPlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.service.googleonetap.IGoogleOneTapService;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603980rqG extends AbstractC1616100s9o {
    public final BaseListFragmentPanel LL;
    public long LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLILLJJLI = -1;
    public int LLILLL = -1;
    public int LLILZ = -1;
    public int LLILZIL = -1;
    public int LLJ = -1;

    @Override // X.AbstractC1616100s9o
    public final void LIZIZ() {
    }

    public C1603980rqG(BaseListFragmentPanel baseListFragmentPanel) {
        this.LL = baseListFragmentPanel;
    }

    @Override // X.AbstractC1616100s9o
    public final void LIZ(C1604000rqI c1604000rqI) {
        Aweme aweme;
        int i = this.LLILZIL;
        int i2 = c1604000rqI.LIZ;
        if (i == i2 && (aweme = c1604000rqI.LIZIZ) != null) {
            C0SR4 c0sr4 = this.LL.LLJL;
            if (c0sr4 != null) {
                c0sr4.LJJLIIIJJIZ(i2);
            }
            this.LL.xR1();
            C0T5M.LJIIIZ(i2, aweme, this.LL.getEventType());
            C1604060rqO.LIZ.getClass();
            InterfaceC1604050rqN interfaceC1604050rqN = C1604060rqO.LIZIZ;
            if (interfaceC1604050rqN != null) {
                BaseListFragmentPanel baseListFragmentPanel = this.LL;
                interfaceC1604050rqN.LIZIZ(aweme, baseListFragmentPanel.activity, baseListFragmentPanel.LLLLIIIILLL.getPageType(), this.LL.C7(true));
            }
            C849850XVn.LIZIZ.LIZJ().LJJIIZ(this.LL.LLLLIIIILLL.getPageType());
            if (!((Boolean) C307040C1u.LIZIZ.getValue()).booleanValue()) {
                C1440005kM.LIZ(new C1D01(this.LL.LLLLIIIILLL.getPageType(), aweme, this.LL, this.LL.LLLLIIIILLL.getEventType()));
            }
        }
    }

    @Override // X.AbstractC1616100s9o
    public final void LIZJ(C1604000rqI c1604000rqI) throws JSONException {
        Aweme item;
        WeakReference<Activity> weakReference;
        WeakReference<Fragment> weakReference2;
        JSONObject jSONObject;
        Aweme awemeLJI;
        View view;
        Aweme awemeRh;
        C0TJB c0tjb;
        ISpecActService iSpecActService;
        IUgAllService iUgAllService;
        if (this.LLILZIL == c1604000rqI.LIZ && !this.LL.LLILLL()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LL;
            if (baseListFragmentPanel.LLJL != null) {
                int i = c1604000rqI.LIZ;
                if (i > 0) {
                    C736400Suc c736400Suc = C736400Suc.LIZ;
                    C19EG activity = baseListFragmentPanel.getFragment().getActivity();
                    c736400Suc.getClass();
                    C736400Suc.LIZ(activity);
                }
                if (this.LL.getPageType() == 0 && i > this.LLILLL && (iUgAllService = (IUgAllService) PluggableExtentionKt.pluggableSpi(IUgAllService.class)) != null) {
                    iUgAllService.LJ(this.LL.getContext());
                }
                BaseListFragmentPanel baseListFragmentPanel2 = this.LL;
                baseListFragmentPanel2.getClass();
                if (!C0R69.LIZ(baseListFragmentPanel2.getEventType()).LIZJ.isEmpty() && (iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi(ISpecActService.class)) != null && iSpecActService.LJIILIIL()) {
                    BaseListFragmentPanel baseListFragmentPanel3 = this.LL;
                    if (baseListFragmentPanel3.LLJILJILJ() || TextUtils.equals(baseListFragmentPanel3.getEventType(), "homepage_friends")) {
                        C0R69.LIZ(baseListFragmentPanel3.getEventType()).LIZIZ();
                    }
                }
                if (!this.LLIZLLLIL && (c0tjb = this.LL.LLZZJLIL) != null && c0tjb.LIZJ()) {
                    if (C0T1H.LIZJ) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("disappear_method", "swipe_up");
                        c2344009Gk.LJIIIIZZ("ui_type", "middle");
                        C20684815ws.LJIILLIIL("swipe_up_guide_disappear", c2344009Gk.LIZ);
                    }
                    this.LL.LLZZJLIL.LIZ();
                    this.LL.LLZLL.LIZIZ();
                }
                BaseListFragmentPanel baseListFragmentPanel4 = this.LL;
                baseListFragmentPanel4.LLLZ(baseListFragmentPanel4.activity, c1604000rqI.LIZIZ, 0L, 0L);
                C0T1G c0t1g = this.LL.LLZZZIL;
                if (c0t1g != null) {
                    c0t1g.LJ();
                }
                if (((Boolean) C1474810oTv.M2.getValue()).booleanValue()) {
                    boolean z = this.LL.LLJZ;
                    C583420MuS c583420MuS = C583420MuS.LIZ;
                    try {
                        C1475000oUE.LIZIZ().setBusinessLogOtherInfo("slider_info", "", z ? 1 : 0);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                int i2 = c1604000rqI.LIZ;
                C0SZ8 c0sz8 = c1604000rqI.LIZJ;
                if (c0sz8 instanceof VideoViewCell) {
                    ((VideoViewCell) c0sz8).D = false;
                }
                if (this.LLIZ) {
                    this.LL.LLLLIIIILLL.setEnterMethodValue("slide");
                    if (c0sz8 != null) {
                        c0sz8.LLIIL(this.LL.LLLLIIIILLL.getEnterMethodValue());
                        if (c0sz8.getAwemeType() != 101) {
                            c0sz8.onPageSelected(i2);
                        }
                    }
                } else if (this.LL.LLLLILI && c0sz8 != null && c0sz8.getAwemeType() != 101) {
                    c0sz8.onPageSelected(i2);
                }
                int i3 = c1604000rqI.LIZ;
                if (this.LLILLL == i3 - 1 || this.LLIZLLLIL) {
                    this.LL.LLLLZ(i3);
                    C20287314Zr c20287314Zr = C20287314Zr.LIZ;
                    Aweme aweme = c1604000rqI.LIZIZ;
                    String eventType = this.LL.getEventType();
                    BaseListFragmentPanel baseListFragmentPanel5 = this.LL;
                    c20287314Zr.getClass();
                    C20287314Zr.LIZIZ(i3, aweme, baseListFragmentPanel5, eventType);
                    this.LL.LLLF.LIZ.Oe();
                }
                if (this.LLIZLLLIL && C1866840ygE.LIZ()) {
                    C690560R6w.LIZ.getClass();
                    C690560R6w.LIZIZ();
                }
                if (this.LL.getUserVisibleHint()) {
                    C740740T3w.LJII((C19EG) this.LL.activity, c1604000rqI.LIZIZ);
                }
                int i4 = c1604000rqI.LIZ;
                if (!this.LL.LLILLL()) {
                    BaseListFragmentPanel baseListFragmentPanel6 = this.LL;
                    if (baseListFragmentPanel6.LLJL != null) {
                        baseListFragmentPanel6.LLIILZL(c1604000rqI.LIZIZ);
                        this.LL.LLJJJJLIIL();
                        int i5 = i4 + 1;
                        if (i5 < this.LL.LLJL.getCount()) {
                            this.LL.LJJJZ(i5);
                        }
                        this.LL.LJJJZ(i4);
                        if (i4 > 0) {
                            this.LL.LJJJZ(i4 - 1);
                        }
                    }
                }
                int i6 = c1604000rqI.LIZ;
                Aweme aweme2 = c1604000rqI.LIZIZ;
                BaseListFragmentPanel baseListFragmentPanel7 = this.LL;
                if (baseListFragmentPanel7.LLJZ) {
                    item = baseListFragmentPanel7.LLJL.getItem(i6 - 1);
                } else {
                    item = baseListFragmentPanel7.LLJL.getItem(i6 + 1);
                }
                if (item == null) {
                    item = this.LL.LLJL.getItem(i6);
                }
                if (!this.LL.LLLLLJIL && C2277711EDh.LIZIZ.LJJJLIIL(this.LLIZLLLIL)) {
                    BaseListFragmentPanel baseListFragmentPanel8 = this.LL;
                    baseListFragmentPanel8.LLJJIJIIJIL(baseListFragmentPanel8.LLJZ, item, c1604000rqI.LIZIZ);
                }
                IFeedAdService iFeedAdService = (IFeedAdService) PluggableExtentionKt.pluggableSpi(IFeedAdService.class);
                if (iFeedAdService != null) {
                    iFeedAdService.LJIJJLI().LJIIJ(i6, this.LL.LLJL.Fg());
                }
                if (C1017070cZd.LLIZLLLIL(aweme2)) {
                    this.LL.adaptation();
                    this.LL.R();
                }
                if (!TextUtils.isEmpty(this.LL.LLLLLL)) {
                    C0TJ8.LIZJ(this.LL.LLLLLL).LIZ(C729980SkG.LIZJ(aweme2));
                }
                IGoogleOneTapService iGoogleOneTapService = (IGoogleOneTapService) PluggableExtentionKt.pluggableSpi(IGoogleOneTapService.class);
                if (iGoogleOneTapService != null) {
                    iGoogleOneTapService.LIZ(this.LL.C7(true), new WeakReference(this.LL.activity));
                }
                ISpecActService iSpecActService2 = (ISpecActService) PluggableExtentionKt.pluggableSpi(ISpecActService.class);
                if (this.LL.LLJILJILJ() && iSpecActService2 != null) {
                    iSpecActService2.LJJJLL();
                }
                this.LL.LLLLZIL(i6);
                if (iSpecActService2 != null) {
                    iSpecActService2.LJIJI(aweme2);
                }
                this.LL.LLLLLLJ(aweme2);
                int i7 = c1604000rqI.LIZ;
                Aweme aweme3 = c1604000rqI.LIZIZ;
                JSONObject jSONObject2 = null;
                if (C295570BiF.LIZ()) {
                    weakReference = new WeakReference<>(this.LL.activity);
                    weakReference2 = new WeakReference<>(this.LL.getFragment());
                } else {
                    weakReference = null;
                    weakReference2 = null;
                }
                boolean zLJIIL = C1389300mG0.LJIIL(this.LL.getFragment());
                C01GW<C740370T2l> c01gw = C740370T2l.LJIIL;
                C582330Msh.LIZ().LIZIZ();
                C740370T2l c740370T2lLIZ = C582330Msh.LIZ();
                I18nPlayerController i18nPlayerController = this.LL.LLLLIILL;
                c740370T2lLIZ.LIZLLL = aweme3;
                c740370T2lLIZ.LJI = i18nPlayerController;
                this.LL.LLLLZI(i7, aweme3);
                I18nPlayerController i18nPlayerController2 = this.LL.LLLLIILL;
                if (i18nPlayerController2 != null) {
                    Aweme aweme4 = C2214851BmN.LIZ;
                    C2214851BmN.LIZJ = i18nPlayerController2.getCurrentPosition();
                }
                C2214851BmN.LIZJ();
                C2214851BmN.LIZ = aweme3;
                C2214851BmN.LIZIZ = this.LL.C7(true);
                C2214851BmN.LJII.LIZIZ = zLJIIL;
                if (C295570BiF.LIZ()) {
                    if (weakReference != null) {
                        C2214851BmN.LJIILIIL = weakReference;
                    }
                    if (weakReference2 != null) {
                        C2214851BmN.LJIILJJIL = weakReference2;
                    }
                    C2214851BmN.LJIILL = Integer.valueOf(this.LL.getPageType());
                }
                C582330Msh.LIZ().LJ = this.LL.getEventType();
                C582330Msh.LIZ().LJFF = zLJIIL;
                C1604100rqS c1604100rqS = C583890MvD.LIZ;
                c1604100rqS.LIZIZ(EnumC1604090rqR.PAGE_SELECT_AFTER);
                if (c1604100rqS.LIZJ()) {
                    c1604100rqS.LIZJ = C584470Mw9.LIZIZ(this.LL.LLJL.getItem(i6 - 1));
                    c1604100rqS.LIZIZ = C584470Mw9.LIZIZ(aweme2);
                    c1604100rqS.LJ = true;
                }
                BaseListFragmentPanel.d = true;
                Aweme aweme5 = c1604000rqI.LIZIZ;
                if (aweme5 != null && (awemeRh = this.LL.Rh(aweme5)) != null) {
                    BaseListFragmentPanel baseListFragmentPanel9 = this.LL;
                    boolean z2 = !AwemeSaaSExtKt.isLive(awemeRh);
                    VerticalViewPager verticalViewPager = baseListFragmentPanel9.LLJJIJI;
                    if (verticalViewPager != null) {
                        verticalViewPager.LLLLZIL.LJFF = z2;
                    }
                }
                String eventType2 = this.LL.LLLLIIIILLL.getEventType();
                String previousPageWithPlaylistScene = this.LL.LLLLIIIILLL.getPreviousPageWithPlaylistScene();
                if (aweme2 != null) {
                    C651970Phj.LLILLL.getClass();
                    if (C651980Phk.LIZLLL(eventType2) || C651980Phk.LIZLLL(previousPageWithPlaylistScene)) {
                        if (this.LL.getFragment() != null) {
                            view = this.LL.getFragment().getView();
                        } else {
                            view = null;
                        }
                        C1ER1.LIZIZ.LJLL(view, this.LL.LLLLIIIILLL.getEventType(), this.LL.LLLLIIIILLL.getPreviousPageWithPlaylistScene(), i6, aweme2, this.LL.LLLLIIIILLL.isUpdateSearchResultId());
                        C0QO8.LIZ.LJIIIIZZ();
                    }
                }
                IMLCommonService iMLCommonServiceInstance = MLCommonService.instance();
                String eventType3 = this.LL.getEventType();
                VerticalViewPager verticalViewPager2 = this.LL.LLJJIJI;
                if (verticalViewPager2 != null) {
                    jSONObject = verticalViewPager2.LLZZJLIL;
                } else {
                    jSONObject = null;
                }
                iMLCommonServiceInstance.onViewPagerSelected(aweme2, eventType3, i6, jSONObject);
                Aweme aweme6 = c1604000rqI.LIZIZ;
                if (this.LLJ == i6 + 1) {
                    awemeLJI = this.LL.Rh(aweme6);
                } else {
                    awemeLJI = this.LL.LJI(aweme6);
                }
                C1590480rUU c1590480rUU = C1590480rUU.LIZ;
                BaseListFragmentPanel baseListFragmentPanel10 = this.LL;
                VerticalViewPager verticalViewPager3 = baseListFragmentPanel10.LLJJIJI;
                if (verticalViewPager3 != null) {
                    jSONObject2 = verticalViewPager3.LLZZJLIL;
                }
                String eventType4 = baseListFragmentPanel10.LLLLIIIILLL.getEventType();
                c1590480rUU.getClass();
                C1590480rUU.LIZJ(awemeLJI, eventType4, jSONObject2);
                this.LLJ = i6;
                C0X35.LJIIJJI("tryplay_onpageselected_internal", true);
                EnumC1604090rqR enumC1604090rqR = EnumC1604090rqR.PAGE_SELECT_INTERNAL_TOTAL;
                c1604100rqS.LIZIZ(enumC1604090rqR);
                C20182313y1 c20182313y1LIZJ = C20182613y4.LIZLLL().LIZJ();
                String type = enumC1604090rqR.getType();
                long jUptimeMillis = SystemClock.uptimeMillis() - this.LLILZLL;
                synchronized (c20182313y1LIZJ) {
                    c20182313y1LIZJ.LJ(jUptimeMillis, System.currentTimeMillis() - jUptimeMillis, System.currentTimeMillis(), type);
                }
                C0X35.LJIIJJI("feed_commit_duration", true);
                C0X35.LIZ("feed_commit_to_render_ready", true);
                C0X35.LIZJ("feed_ui_to_video", "ui_to_video_after_commit");
                if (C20636086o.LIZ() && this.LL.LLLLIIIILLL.getEventType() != null && "homepage_hot".equals(this.LL.LLLLIIIILLL.getEventType())) {
                    C1603930rqB.LIZ().LIZIZ();
                }
                if (C1865770yeV.LIZ() || C2079708Ct.LIZJ) {
                    C202103146b.LIZ(1, this.LL.getEventType()).LIZ("select_end");
                }
                C1603930rqB c1603930rqBLIZ = C1603930rqB.LIZ();
                c1603930rqBLIZ.getClass();
                c1603930rqBLIZ.LIZLLL = System.currentTimeMillis() - c1603930rqBLIZ.LIZJ;
            }
        }
    }

    @Override // X.AbstractC1616100s9o, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        if (i2 != 0.0f) {
            this.LLIZ = true;
        }
    }
}
