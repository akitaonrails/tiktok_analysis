package X;

import Y.AObjectS102S0101000_24;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS18S0201000_12;
import Y.ARunnableS1S0111000_12;
import Y.ARunnableS23S0101000_12;
import Y.ARunnableS30S0201000_24;
import Y.ARunnableS35S0101000_24;
import Y.ARunnableS45S0300000_12;
import Y.ARunnableS81S0200000_12;
import Y.ARunnableS93S0200000_24;
import Y.ARunnableS9S0301000_12;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IUgAllService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.controller.I18nPlayerController;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.googleonetap.IGoogleOneTapService;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0rqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603970rqF extends C0T21 {
    public int LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public final C1603980rqG LLILZLL;
    public final /* synthetic */ View.OnTouchListener LLIZ;
    public final /* synthetic */ View LLIZLLLIL;
    public final /* synthetic */ BaseListFragmentPanel LLJ;

    @Override // X.C0T21, X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
    }

    @Override // X.C0T21, X.InterfaceC1616160s9u
    public final void onScrollToItemStart(int i) {
    }

    public final void LIZ(final int i) {
        C0SR4 c0sr4;
        int size;
        int i2;
        int iMin;
        Aweme c098200Yq;
        if (this.LLJ.LLJILJILJ() && (c0sr4 = this.LLJ.LLJL) != null) {
            List<Aweme> listFg = c0sr4.Fg();
            if (((Boolean) C1218704pl.LIZIZ.getValue()).booleanValue()) {
                if (listFg != null && (i2 = i + 2) < (size = listFg.size())) {
                    if (C1218704pl.LIZ() == -1) {
                        iMin = size - 1;
                    } else {
                        iMin = Math.min(C1218704pl.LIZ() + i, size - 1);
                    }
                    if (i2 > iMin) {
                        return;
                    }
                    while (true) {
                        try {
                            c098200Yq = listFg.get(i2);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        Aweme aweme = (Aweme) c098200Yq;
                        if (aweme != null) {
                            if (AwemeExtKt.isAdTraffic(aweme)) {
                                break;
                            } else if (i2 != iMin) {
                                i2++;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            System.currentTimeMillis();
            C1001410cAN c1001410cAN = C1001410cAN.LIZIZ;
            EnumC1001380cAK enumC1001380cAK = EnumC1001380cAK.CARD_OPERATION;
            if (c1001410cAN.LIZ(enumC1001380cAK)) {
                c1001410cAN.LJII(this.LLJ.getContext(), EnumC599900Nfw.FEED, i, listFg, enumC1001380cAK);
            } else {
                C999710c7d c999710c7dLJFF = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJFF();
                c999710c7dLJFF.getClass();
                C1000300c8a.LJI(i, c999710c7dLJFF, listFg);
                C999710c7d c999710c7dLJFF2 = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJFF();
                c999710c7dLJFF2.getClass();
                C999090c6d.LIZ(c999710c7dLJFF2, listFg, i);
            }
            EnumC1001380cAK enumC1001380cAK2 = EnumC1001380cAK.STICKER_OPERATION;
            if (c1001410cAN.LIZ(enumC1001380cAK2)) {
                c1001410cAN.LJII(this.LLJ.getContext(), EnumC599900Nfw.FEED, i, listFg, enumC1001380cAK2);
            } else if (C1000100c8G.LIZ()) {
                C999880c7u c999880c7uLJIJJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIJJ();
                c999880c7uLJIJJ.getClass();
                C1000300c8a.LJI(i, c999880c7uLJIJJ, listFg);
                this.LLJ.LLJLLIL.postDelayed(new ARunnableS30S0201000_24(i, listFg, this, 4), 100L);
            }
            EnumC1001380cAK enumC1001380cAK3 = EnumC1001380cAK.SUPER_LIKE_OPERATION;
            if (c1001410cAN.LIZ(enumC1001380cAK3)) {
                c1001410cAN.LJII(this.LLJ.getContext(), EnumC599900Nfw.FEED, i, listFg, enumC1001380cAK3);
            } else {
                final BaseListFragmentPanel baseListFragmentPanel = this.LLJ;
                final IViewPagerComponentAbility iViewPagerComponentAbility = baseListFragmentPanel.LLJJIJIIJIL;
                C811103Ev.LIZ("BaseListFragmentPanel");
                final C997450c3z c997450c3zLJIILLIIL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIILLIIL();
                c997450c3zLJIILLIIL.LJ(i, baseListFragmentPanel.getContext(), baseListFragmentPanel.LLJL.Fg());
                baseListFragmentPanel.LLJLLIL.postDelayed(new Runnable() { // from class: X.0T2D
                    public final void LIZ() {
                        if (iViewPagerComponentAbility.m12() != 0) {
                            baseListFragmentPanel.LLJLLIL.postDelayed(this, 100L);
                            return;
                        }
                        c997450c3zLJIILLIIL.LJI(i, baseListFragmentPanel.getContext(), baseListFragmentPanel.LLJL.Fg());
                        C811103Ev.LIZ("BaseListFragmentPanel");
                        baseListFragmentPanel.LLJLLIL.removeCallbacks(this);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("BaseListFragmentPanel@112.preRenderSuperLike$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("BaseListFragmentPanel@112.preRenderSuperLike$1");
                    }
                }, 100L);
            }
            if (C290420BZw.LIZ()) {
                C999720c7e c999720c7eLJJIJIIJIL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIJIIJIL();
                c999720c7eLJJIJIIJIL.getClass();
                C1000300c8a.LJI(i, c999720c7eLJJIJIIJIL, listFg);
                this.LLJ.LLJLLIL.postDelayed(new ARunnableS30S0201000_24(i, listFg, this, 0), 100L);
            }
            final BaseListFragmentPanel baseListFragmentPanel2 = this.LLJ;
            final IViewPagerComponentAbility iViewPagerComponentAbility2 = baseListFragmentPanel2.LLJJIJIIJIL;
            final C997820c4a c997820c4aLJJJJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJJJ();
            c997820c4aLJJJJ.LJ(i, baseListFragmentPanel2.getContext(), baseListFragmentPanel2.LLJL.Fg());
            baseListFragmentPanel2.LLJLLIL.postDelayed(new Runnable() { // from class: X.0T2E
                public final void LIZ() {
                    if (iViewPagerComponentAbility2.m12() != 0) {
                        baseListFragmentPanel2.LLJLLIL.postDelayed(this, 100L);
                        return;
                    }
                    c997820c4aLJJJJ.LJI(i, baseListFragmentPanel2.getContext(), baseListFragmentPanel2.LLJL.Fg());
                    C811103Ev.LIZ("BaseListFragmentPanel");
                    baseListFragmentPanel2.LLJLLIL.removeCallbacks(this);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BaseListFragmentPanel@112.preRenderDescriptive$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BaseListFragmentPanel@112.preRenderDescriptive$2");
                }
            }, 100L);
            C997780c4W c997780c4WLJJJJIZL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJJJIZL();
            c997780c4WLJJJJIZL.LJ(i, baseListFragmentPanel2.getContext(), baseListFragmentPanel2.LLJL.Fg());
            baseListFragmentPanel2.LLJLLIL.postDelayed(new ARunnableS9S0301000_12(iViewPagerComponentAbility2, c997780c4WLJJJJIZL, i, baseListFragmentPanel2, 3), 100L);
            BaseListFragmentPanel baseListFragmentPanel3 = this.LLJ;
            if (baseListFragmentPanel3.LLZLI == null) {
                baseListFragmentPanel3.LLZLI = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIJI(new C0T2F(baseListFragmentPanel3));
            }
            baseListFragmentPanel3.LLZLI.preRender();
            C999700c7c c999700c7cLJJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJ();
            c999700c7cLJJ.getClass();
            C1000300c8a.LJI(i, c999700c7cLJJ, listFg);
            this.LLJ.LLJLLIL.postDelayed(new ARunnableS30S0201000_24(i, listFg, this, 1), 100L);
            C999950c81 c999950c81LJJIZ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIZ();
            c999950c81LJJIZ.getClass();
            C1000300c8a.LJI(i, c999950c81LJJIZ, listFg);
            this.LLJ.LLJLLIL.postDelayed(new ARunnableS30S0201000_24(i, listFg, this, 2), 100L);
            this.LLJ.LLJLLIL.postDelayed(new ARunnableS30S0201000_24(i, listFg, this, 3), 100L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r13) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1603970rqF.LIZIZ(int):void");
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [X.0T0x, java.lang.Runnable] */
    public final void LIZLLL(final int i) throws JSONException {
        boolean z;
        Aweme item;
        boolean z2;
        WeakReference weakReference;
        WeakReference weakReference2;
        Aweme awemeRh;
        String aid;
        String aid2;
        VideoViewCell videoViewCell;
        C0TJB c0tjb;
        boolean z3;
        C1603980rqG c1603980rqG;
        boolean z4;
        boolean z5;
        if (this.LLJ.LLILLL()) {
            return;
        }
        if (C0BAY.LIZ() && (c1603980rqG = this.LLILZLL) != null) {
            c1603980rqG.LLILZ = -1;
            c1603980rqG.LLILZIL = -1;
            c1603980rqG.LLILZLL = SystemClock.uptimeMillis();
            if (!c1603980rqG.LL.LLILLL() && c1603980rqG.LL.LLJL != null) {
                if (C1865770yeV.LIZ() || C2079708Ct.LIZJ) {
                    C202103146b.LIZ(1, c1603980rqG.LL.getEventType()).LIZ("onpage_select");
                }
                if (C20636086o.LIZ() && c1603980rqG.LL.LLLLIIIILLL.getEventType() != null && "homepage_hot".equals(c1603980rqG.LL.LLLLIIIILLL.getEventType())) {
                    C1603930rqB c1603930rqBLIZ = C1603930rqB.LIZ();
                    c1603930rqBLIZ.getClass();
                    if (C20636086o.LIZ()) {
                        c1603930rqBLIZ.LIZLLL(false);
                        if (!((Boolean) C0BPA.LIZIZ.getValue()).booleanValue()) {
                            C20639086r.LJ(new ARunnableS103S0100000_3(c1603930rqBLIZ, 151));
                        }
                    }
                }
                Aweme item2 = c1603980rqG.LL.LLJL.getItem(i);
                C0RRP c0rrp = C0RRP.P_S_INTERNAL;
                C583420MuS.LIZIZ(item2, c0rrp, null);
                C1604100rqS c1604100rqS = C583890MvD.LIZ;
                c1604100rqS.LIZ(EnumC1604090rqR.PAGE_SELECT_INTERNAL_TOTAL);
                EnumC1604090rqR enumC1604090rqR = EnumC1604090rqR.PAGE_SELECT_BEFORE;
                c1604100rqS.LIZ(enumC1604090rqR);
                C0X35.LIZ("tryplay_onpageselected_internal", true);
                C0X35.LIZJ("feed_ui_to_video", "ui_to_video_commit_page_select");
                if (c1603980rqG.LL.getFragment().getActivity() != null) {
                    if (c1603980rqG.LL.LLLLIIIILLL.getEventType() != null) {
                        c1604100rqS.LIZ = c1603980rqG.LL.LLLLIIIILLL.getEventType();
                    }
                    C1618230sDF.LIZIZ.LIZ.getClass();
                    C0SZ8 c0sz8LJLIL = c1603980rqG.LL.LJLIL();
                    int pageType = c1603980rqG.LL.getPageType();
                    if (c0sz8LJLIL != null && (pageType == 0 || pageType == 1)) {
                        if (i >= c1603980rqG.LLILLJJLI) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c0sz8LJLIL.LLJJJJ(z5);
                    }
                    BaseListFragmentPanel baseListFragmentPanel = c1603980rqG.LL;
                    int i2 = baseListFragmentPanel.LLJLILLLLZIIL;
                    if (i >= i2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    baseListFragmentPanel.LLJZ = z4;
                    if (baseListFragmentPanel.LLJLLL && i != i2) {
                        C2276411E8h.LIZIZ.LIZJ("common_feed", 6, "BaseListFragmentPanel", "onPageSelected-> mSetItem && position != mCurIndex return!");
                        C583420MuS.LIZLLL(c1603980rqG.LL.xy2(), c0rrp.toString(), "onPageSelected-> mSetItem && position != mCurIndex return!");
                        return;
                    }
                    if (i == i2) {
                        baseListFragmentPanel.LLJLLL = false;
                    }
                    c1604100rqS.LIZIZ(enumC1604090rqR);
                    c1604100rqS.LIZ(EnumC1604090rqR.PAGE_SELECT_INVOKE_SELECT);
                    EnumC1604090rqR enumC1604090rqR2 = EnumC1604090rqR.PAGE_SELECT_UN_SELECT;
                    c1604100rqS.LIZ(enumC1604090rqR2);
                    if (c1603980rqG.LL.LLJJIJIIJIL.Pn2() != c1603980rqG.LL.LJLIL()) {
                        BaseListFragmentPanel baseListFragmentPanel2 = c1603980rqG.LL;
                        baseListFragmentPanel2.LJJZZI(c1603980rqG.LLILLJJLI, baseListFragmentPanel2.LLJJIJIIJIL.Pn2(), c1603980rqG.LL.LLJZ);
                    }
                    c1604100rqS.LIZIZ(enumC1604090rqR2);
                    c1603980rqG.LLILZ = i;
                    c1603980rqG.LL.LJIIIIZZ();
                    c1603980rqG.LL.LJLIL();
                    c1603980rqG.LLILZIL = -1;
                    if (c1603980rqG.LL.LLILLL() || c1603980rqG.LL.LLJL == null || c1603980rqG.LLILZ != i) {
                        return;
                    }
                    if (BaseListFragmentPanel.d && C1608030rwn.LIZIZ()) {
                        C0S78.LIZIZ(new ARunnableS23S0101000_12(c1603980rqG, i, 23), "invokeSelectCallback", true);
                    } else if (BaseListFragmentPanel.d && ((Boolean) C1608030rwn.LIZIZ.getValue()).booleanValue()) {
                        C786410Ut5.LJL(C799570VYd.LIZJ(), new ARunnableS23S0101000_12(c1603980rqG, i, 24));
                    } else {
                        c1603980rqG.LL.LLILLIZIL(i);
                    }
                    c1603980rqG.LLILLL = c1603980rqG.LLILLJJLI;
                    BaseListFragmentPanel baseListFragmentPanel3 = c1603980rqG.LL;
                    c1603980rqG.LLIZLLLIL = baseListFragmentPanel3.LLLLILI;
                    VerticalViewPager verticalViewPager = baseListFragmentPanel3.LLJJIJI;
                    if (verticalViewPager != null && verticalViewPager.getChildCount() > 0) {
                        c1603980rqG.LL.LLLLILI = false;
                    }
                    c1603980rqG.LLILLJJLI = i;
                    BaseListFragmentPanel baseListFragmentPanel4 = c1603980rqG.LL;
                    baseListFragmentPanel4.LLJLILLLLZIIL = i;
                    baseListFragmentPanel4.getContext();
                    Aweme item3 = c1603980rqG.LL.LLJL.getItem(i);
                    C0S4J c0s4j = c1603980rqG.LL.LLJJIII;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPageSelected position=");
                    sbLIZ.append(i);
                    sbLIZ.append(",page=");
                    sbLIZ.append(c1603980rqG.LL.getEventType());
                    c0s4j.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), item3);
                    C1376270luz.LIZ.getClass();
                    C1376270luz.LJFF = item3;
                    BaseListFragmentPanel baseListFragmentPanel5 = c1603980rqG.LL;
                    baseListFragmentPanel5.LLLIIII(baseListFragmentPanel5.LLLLLJLJLL(), true);
                    BaseListFragmentPanel baseListFragmentPanel6 = c1603980rqG.LL;
                    baseListFragmentPanel6.getClass();
                    if (!C0BSY.LIZ && baseListFragmentPanel6.LLLIL) {
                        C2276411E8h.LIZIZ.LIZJ("common_feed", 6, "BaseListFragmentPanel", "onPageSelected-> mWillPageChangeByPreLoad return!");
                        return;
                    }
                    c1604100rqS.LIZIZ(EnumC1604090rqR.PAGE_SELECT_INVOKE_SELECT);
                    EnumC1604090rqR enumC1604090rqR3 = EnumC1604090rqR.PAGE_SELECT_PLAYER;
                    c1604100rqS.LIZ(enumC1604090rqR3);
                    PlayerComponentTemp playerComponentTemp = c1603980rqG.LL.LLLLIILLL;
                    if (playerComponentTemp != null && playerComponentTemp.LLJIJIL) {
                        return;
                    }
                    c1604100rqS.LIZIZ(enumC1604090rqR3);
                    c1604100rqS.LIZ(EnumC1604090rqR.PAGE_SELECT_AFTER);
                    c1603980rqG.LLILZIL = i;
                    return;
                }
                return;
            }
            return;
        }
        if (C1865770yeV.LIZ() || C2079708Ct.LIZJ) {
            C202103146b.LIZ(1, this.LLJ.getEventType()).LIZ("onpage_select");
        }
        if (C20636086o.LIZ() && this.LLJ.LLLLIIIILLL.getEventType() != null && "homepage_hot".equals(this.LLJ.LLLLIIIILLL.getEventType())) {
            C1603930rqB c1603930rqBLIZ2 = C1603930rqB.LIZ();
            c1603930rqBLIZ2.getClass();
            if (C20636086o.LIZ()) {
                c1603930rqBLIZ2.LIZLLL(false);
                if (!((Boolean) C0BPA.LIZIZ.getValue()).booleanValue()) {
                    C20639086r.LJ(new ARunnableS103S0100000_3(c1603930rqBLIZ2, 151));
                }
            }
        }
        Aweme item4 = this.LLJ.LLJL.getItem(i);
        C0RRP c0rrp2 = C0RRP.P_S_INTERNAL;
        C583420MuS.LIZIZ(item4, c0rrp2, null);
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1604100rqS c1604100rqS2 = C583890MvD.LIZ;
        EnumC1604090rqR enumC1604090rqR4 = EnumC1604090rqR.PAGE_SELECT_INTERNAL_TOTAL;
        c1604100rqS2.LIZ(enumC1604090rqR4);
        EnumC1604090rqR enumC1604090rqR5 = EnumC1604090rqR.PAGE_SELECT_BEFORE;
        c1604100rqS2.LIZ(enumC1604090rqR5);
        C0X35.LIZ("tryplay_onpageselected_internal", true);
        C0X35.LIZJ("feed_ui_to_video", "ui_to_video_commit_page_select");
        if (this.LLJ.getFragment().getActivity() == null) {
            C0S4J c0s4j2 = this.LLJ.LLJJIII;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[onPageSelectedInternal] return because activity null, position=");
            sbLIZ2.append(i);
            c0s4j2.LJIILL(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (i > 0) {
            C736400Suc c736400Suc = C736400Suc.LIZ;
            C19EG activity = this.LLJ.getFragment().getActivity();
            c736400Suc.getClass();
            C736400Suc.LIZ(activity);
        }
        if (this.LLJ.LLLLIIIILLL.getEventType() != null) {
            c1604100rqS2.LIZ = this.LLJ.LLLLIIIILLL.getEventType();
        }
        C1618230sDF.LIZIZ.LIZ.getClass();
        if (this.LLJ.getPageType() == 0 && i > this.LLILLJJLI) {
            ((IUgAllService) ServiceManager.get().getService(IUgAllService.class)).LJ(this.LLJ.getContext());
        }
        BaseListFragmentPanel baseListFragmentPanel7 = this.LLJ;
        baseListFragmentPanel7.getClass();
        if (!C0R69.LIZ(baseListFragmentPanel7.getEventType()).LIZJ.isEmpty() && ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIILIIL()) {
            BaseListFragmentPanel baseListFragmentPanel8 = this.LLJ;
            if (baseListFragmentPanel8.LLJILJILJ() || TextUtils.equals(baseListFragmentPanel8.getEventType(), "homepage_friends")) {
                C0R69.LIZ(baseListFragmentPanel8.getEventType()).LIZIZ();
            }
        }
        C0SZ8 c0sz8LJLIL2 = this.LLJ.LJLIL();
        int pageType2 = this.LLJ.getPageType();
        if (c0sz8LJLIL2 != null && (pageType2 == 0 || pageType2 == 1)) {
            if (i >= this.LLILLJJLI) {
                z3 = true;
            } else {
                z3 = false;
            }
            c0sz8LJLIL2.LLJJJJ(z3);
        }
        BaseListFragmentPanel baseListFragmentPanel9 = this.LLJ;
        if (!baseListFragmentPanel9.LLLLILI && (c0tjb = baseListFragmentPanel9.LLZZJLIL) != null && c0tjb.LIZJ()) {
            if (C0T1H.LIZJ) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("disappear_method", "swipe_up");
                c2344009Gk.LJIIIIZZ("ui_type", "middle");
                C20684815ws.LJIILLIIL("swipe_up_guide_disappear", c2344009Gk.LIZ);
            }
            this.LLJ.LLZZJLIL.LIZ();
            this.LLJ.LLZLL.LIZIZ();
        }
        BaseListFragmentPanel baseListFragmentPanel10 = this.LLJ;
        baseListFragmentPanel10.LLLZ(baseListFragmentPanel10.activity, baseListFragmentPanel10.LJIIIIZZ(), 0L, 0L);
        C0SR4 c0sr4 = this.LLJ.LLJL;
        if (c0sr4 != null) {
            c0sr4.LJJLIIIJJIZ(i);
        }
        C0T1G c0t1g = this.LLJ.LLZZZIL;
        if (c0t1g != null) {
            c0t1g.LJ();
        }
        BaseListFragmentPanel baseListFragmentPanel11 = this.LLJ;
        if (i >= baseListFragmentPanel11.LLJLILLLLZIIL) {
            z = true;
        } else {
            z = false;
        }
        baseListFragmentPanel11.LLJZ = z;
        if (z) {
            item = baseListFragmentPanel11.LLJL.getItem(i - 1);
        } else {
            item = baseListFragmentPanel11.LLJL.getItem(i + 1);
        }
        if (item == null) {
            item = this.LLJ.LLJL.getItem(i);
        }
        BaseListFragmentPanel baseListFragmentPanel12 = this.LLJ;
        if (!baseListFragmentPanel12.LLLLLJIL && C2277711EDh.LIZIZ.LJJJLIIL(baseListFragmentPanel12.LLLLILI)) {
            BaseListFragmentPanel baseListFragmentPanel13 = this.LLJ;
            baseListFragmentPanel13.LLJJIJIIJIL(baseListFragmentPanel13.LLJZ, item, baseListFragmentPanel13.LLJL.getItem(i));
        }
        if (((Boolean) C1474810oTv.M2.getValue()).booleanValue()) {
            try {
                C1475000oUE.LIZIZ().setBusinessLogOtherInfo("slider_info", "", this.LLJ.LLJZ ? 1 : 0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        BaseListFragmentPanel baseListFragmentPanel14 = this.LLJ;
        if (baseListFragmentPanel14.LLJLLL && i != baseListFragmentPanel14.LLJLILLLLZIIL) {
            C2276411E8h.LIZIZ.LIZJ("common_feed", 6, "BaseListFragmentPanel", "onPageSelected-> mSetItem && position != mCurIndex return!");
            C583420MuS.LIZLLL(this.LLJ.xy2(), c0rrp2.toString(), "onPageSelected-> mSetItem && position != mCurIndex return!");
            C0S4J c0s4j3 = this.LLJ.LLJJIII;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[onPageSelectedInternal] return because mSetItem mismatch, position=");
            sbLIZ3.append(i);
            sbLIZ3.append(",curIndex=");
            sbLIZ3.append(this.LLJ.LLJLILLLLZIIL);
            sbLIZ3.append(",currentAid=");
            sbLIZ3.append(this.LLJ.xy2());
            c0s4j3.LJIILL(C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (i == baseListFragmentPanel14.LLJLILLLLZIIL) {
            baseListFragmentPanel14.LLJLLL = false;
        }
        c1604100rqS2.LIZIZ(enumC1604090rqR5);
        EnumC1604090rqR enumC1604090rqR6 = EnumC1604090rqR.PAGE_SELECT_INVOKE_SELECT;
        c1604100rqS2.LIZ(enumC1604090rqR6);
        EnumC1604090rqR enumC1604090rqR7 = EnumC1604090rqR.PAGE_SELECT_UN_SELECT;
        c1604100rqS2.LIZ(enumC1604090rqR7);
        if (this.LLJ.LLJJIJIIJIL.Pn2() != this.LLJ.LJLIL()) {
            BaseListFragmentPanel baseListFragmentPanel15 = this.LLJ;
            baseListFragmentPanel15.LJJZZI(this.LLILLJJLI, baseListFragmentPanel15.LLJJIJIIJIL.Pn2(), this.LLJ.LLJZ);
        }
        c1604100rqS2.LIZIZ(enumC1604090rqR7);
        if (BaseListFragmentPanel.d && C1608030rwn.LIZIZ()) {
            C0S78.LIZIZ(new ARunnableS23S0101000_12(this, i, 21), "invokeSelectCallback", true);
        } else if (BaseListFragmentPanel.d && ((Boolean) C1608030rwn.LIZIZ.getValue()).booleanValue()) {
            C786410Ut5.LJL(C799570VYd.LIZJ(), new ARunnableS23S0101000_12(this, i, 9));
        } else {
            this.LLJ.LLILLIZIL(i);
        }
        BaseListFragmentPanel baseListFragmentPanel16 = this.LLJ;
        if ((baseListFragmentPanel16.LJLIL() instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) baseListFragmentPanel16.LJLIL()) != null) {
            videoViewCell.D = false;
        }
        C0SZ8 c0sz8LJLIL3 = this.LLJ.LJLIL();
        if (this.LLILLL) {
            this.LLJ.LLLLIIIILLL.setEnterMethodValue("slide");
            if (c0sz8LJLIL3 != null) {
                c0sz8LJLIL3.LLIIL(this.LLJ.LLLLIIIILLL.getEnterMethodValue());
                if (c0sz8LJLIL3.getAwemeType() != 101) {
                    if (BaseListFragmentPanel.d && C1608030rwn.LIZIZ()) {
                        C0S78.LIZIZ(new ARunnableS23S0101000_12(i, c0sz8LJLIL3, 22), "viewHolder_onPageSelected", true);
                    } else if (BaseListFragmentPanel.d && ((Boolean) C1608030rwn.LIZJ.getValue()).booleanValue()) {
                        C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS18S0201000_12(i, c0sz8LJLIL3, this, 3));
                    } else {
                        c0sz8LJLIL3.onPageSelected(i);
                    }
                }
            }
        } else if (this.LLJ.LLLLILI && c0sz8LJLIL3 != null && c0sz8LJLIL3.getAwemeType() != 101) {
            c0sz8LJLIL3.onPageSelected(i);
        }
        int i3 = i - 1;
        if (this.LLILLJJLI == i3 || this.LLJ.LLLLILI) {
            C0S78.LIZIZ(new ARunnableS35S0101000_24(this, i, 5), "tryInsertForceVideoSurveyAweme", ((Boolean) C2279571EKl.LIZIZ.getValue()).booleanValue());
            C0S78.LIZIZ(new ARunnableS112S0100000_12(this, 345), "resetClickedShareStatus", ((Boolean) C2279571EKl.LIZJ.getValue()).booleanValue());
        }
        if (this.LLJ.LLLLILI && C1866840ygE.LIZ()) {
            C690560R6w.LIZ.getClass();
            C690560R6w.LIZIZ();
        }
        VerticalViewPager verticalViewPager2 = this.LLJ.LLJJIJI;
        if (verticalViewPager2 != null && verticalViewPager2.getChildCount() > 0) {
            this.LLJ.LLLLILI = false;
        }
        this.LLILLJJLI = i;
        this.LLJ.getContext();
        final Aweme item5 = this.LLJ.LLJL.getItem(i);
        C0S4J c0s4j4 = this.LLJ.LLJJIII;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onPageSelected position=");
        sbLIZ4.append(i);
        sbLIZ4.append(",page=");
        sbLIZ4.append(this.LLJ.getEventType());
        c0s4j4.LJIIJ(C2188811AlT.LIZIZ(sbLIZ4), item5);
        C0T5M.LJIIIZ(i, item5, this.LLJ.getEventType());
        C0S78.LIZIZ(new ARunnableS93S0200000_24(this, item5, 49), "NewUserJourneyServiceGetter_watchVideo", ((Boolean) C2279571EKl.LIZLLL.getValue()).booleanValue());
        C849850XVn.LIZIZ.LIZJ().LJJIIZ(this.LLJ.LLLLIIIILLL.getPageType());
        C0S78.LIZIZ(new ARunnableS81S0200000_12(this, item5, 107), "BaseListFragmentPanelVideoChangeEvent", ((Boolean) C2279571EKl.LJ.getValue()).booleanValue());
        Aweme awemeLLLLLJLJLL = this.LLJ.LLLLLJLJLL();
        C1376270luz.LIZ.getClass();
        C1376270luz.LJFF = awemeLLLLLJLJLL;
        BaseListFragmentPanel baseListFragmentPanel17 = this.LLJ;
        baseListFragmentPanel17.LLLIIII(baseListFragmentPanel17.LLLLLJLJLL(), true);
        BaseListFragmentPanel baseListFragmentPanel18 = this.LLJ;
        baseListFragmentPanel18.getClass();
        if (C0BSY.LIZ) {
            z2 = false;
        } else {
            z2 = baseListFragmentPanel18.LLLIL;
        }
        if (z2) {
            C0S4J c0s4j5 = this.LLJ.LLJJIII;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("[onPageSelectedInternal] return because page changed by preload, position=");
            sbLIZ5.append(i);
            sbLIZ5.append(",aid=");
            if (item5 == null) {
                aid2 = null;
            } else {
                aid2 = item5.getAid();
            }
            sbLIZ5.append(aid2);
            c0s4j5.LJIILL(C2188811AlT.LIZIZ(sbLIZ5));
            return;
        }
        c1604100rqS2.LIZIZ(enumC1604090rqR6);
        EnumC1604090rqR enumC1604090rqR8 = EnumC1604090rqR.PAGE_SELECT_PLAYER;
        c1604100rqS2.LIZ(enumC1604090rqR8);
        BaseListFragmentPanel baseListFragmentPanel19 = this.LLJ;
        PlayerComponentTemp playerComponentTemp2 = baseListFragmentPanel19.LLLLIILLL;
        if (playerComponentTemp2 != null && playerComponentTemp2.LLJIJIL) {
            C0S4J c0s4j6 = baseListFragmentPanel19.LLJJIII;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("[onPageSelectedInternal] return because try play timing opt already returned, position=");
            sbLIZ6.append(i);
            sbLIZ6.append(",aid=");
            if (item5 == null) {
                aid = null;
            } else {
                aid = item5.getAid();
            }
            sbLIZ6.append(aid);
            c0s4j6.LJIILL(C2188811AlT.LIZIZ(sbLIZ6));
            return;
        }
        c1604100rqS2.LIZIZ(enumC1604090rqR8);
        EnumC1604090rqR enumC1604090rqR9 = EnumC1604090rqR.PAGE_SELECT_AFTER;
        c1604100rqS2.LIZ(enumC1604090rqR9);
        if (this.LLJ.getUserVisibleHint()) {
            Aweme item6 = this.LLJ.LLJL.getItem(i);
            if (item6 != null) {
                C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("feed call onFeedAwemeChange, aid: ");
                sbLIZ7.append(item6.getAid());
                sbLIZ7.append(", secUid: ");
                sbLIZ7.append(AwemeExtKt.getSecAuthorUid(item6));
                sbLIZ7.append(", fragment:");
                sbLIZ7.append(this.LLJ.getFragment());
                sbLIZ7.append(", mPageResumed:");
                sbLIZ7.append(this.LLJ.LLZLLIL);
                sbLIZ7.append(" panel = ");
                sbLIZ7.append(this);
                c2276411E8h.LIZJ("common_feed", 4, "feed2profile", C2188811AlT.LIZIZ(sbLIZ7));
            } else {
                this.LLJ.LLJJIII.LJIIIZ("Feed2ProfileMonitor: true");
            }
            if (((Boolean) C0AO1.LIZ.getValue()).booleanValue()) {
                C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS45S0300000_12((C19EG) this.LLJ.activity, item6, this, 14));
            } else {
                C740740T3w.LJII((C19EG) this.LLJ.activity, item6);
            }
        } else {
            C0S4J c0s4j7 = this.LLJ.LLJJIII;
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("Feed2ProfileMonitor userVisibleHint=false, fragment:");
            sbLIZ8.append(this.LLJ.getFragment());
            sbLIZ8.append(", mPageResumed:");
            sbLIZ8.append(this.LLJ.LLZLLIL);
            sbLIZ8.append(" panel = ");
            sbLIZ8.append(this);
            c0s4j7.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ8));
        }
        ARunnableS23S0101000_12 aRunnableS23S0101000_12 = new ARunnableS23S0101000_12(this, i, 20);
        if (BaseListFragmentPanel.d && C1608030rwn.LIZIZ()) {
            C0S78.LIZIZ(aRunnableS23S0101000_12, "afterPlayRunnable", true);
        } else if (BaseListFragmentPanel.d && ((Boolean) C1608030rwn.LIZLLL.getValue()).booleanValue()) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), aRunnableS23S0101000_12);
        } else {
            aRunnableS23S0101000_12.run();
        }
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIJJLI().LJIIJ(i, this.LLJ.LLJL.Fg());
        if (C1017070cZd.LLIZLLLIL(item5)) {
            this.LLJ.adaptation();
            this.LLJ.R();
        }
        if (!TextUtils.isEmpty(this.LLJ.LLLLLL)) {
            C0TJ8.LIZJ(this.LLJ.LLLLLL).LIZ(C729980SkG.LIZJ(this.LLJ.LLJL.getItem(i)));
        }
        this.LLJ.LLJLILLLLZIIL = i;
        ((IGoogleOneTapService) ServiceManager.get().getService(IGoogleOneTapService.class)).LIZ(this.LLJ.C7(true), new WeakReference(this.LLJ.activity));
        if (this.LLJ.LLJILJILJ()) {
            ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJJLL();
        }
        this.LLJ.LLLLZIL(i);
        if (C1790906zr.LIZ()) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS81S0200000_12(this, item5, 56));
        } else {
            ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJI(item5);
            this.LLJ.LLLLLLJ(item5);
        }
        final boolean zLJIIL = C1389300mG0.LJIIL(this.LLJ.getFragment());
        if (C295570BiF.LIZ()) {
            weakReference = new WeakReference(this.LLJ.activity);
            weakReference2 = new WeakReference(this.LLJ.getFragment());
        } else {
            weakReference = null;
            weakReference2 = null;
        }
        final WeakReference weakReference3 = weakReference;
        final WeakReference weakReference4 = weakReference2;
        ?? r5 = new Runnable() { // from class: X.0T0x
            public final void LIZ() throws JSONException {
                if (this.LLILZLL.LLJ.LLILLL()) {
                    return;
                }
                C01GW<C740370T2l> c01gw = C740370T2l.LJIIL;
                C582330Msh.LIZ().LIZIZ();
                C740370T2l c740370T2lLIZ = C582330Msh.LIZ();
                Aweme aweme = item5;
                I18nPlayerController i18nPlayerController = this.LLILZLL.LLJ.LLLLIILL;
                c740370T2lLIZ.LIZLLL = aweme;
                c740370T2lLIZ.LJI = i18nPlayerController;
                this.LLILZLL.LLJ.LLLLZI(i, item5);
                I18nPlayerController i18nPlayerController2 = this.LLILZLL.LLJ.LLLLIILL;
                if (i18nPlayerController2 != null) {
                    Aweme aweme2 = C2214851BmN.LIZ;
                    C2214851BmN.LIZJ = i18nPlayerController2.getCurrentPosition();
                }
                C2214851BmN.LIZJ();
                C2214851BmN.LIZ = item5;
                C2214851BmN.LIZIZ = this.LLILZLL.LLJ.C7(true);
                C2214851BmN.LJII.LIZIZ = zLJIIL;
                if (C295570BiF.LIZ()) {
                    WeakReference<Activity> weakReference5 = weakReference3;
                    if (weakReference5 != null) {
                        C2214851BmN.LJIILIIL = weakReference5;
                    }
                    WeakReference<Fragment> weakReference6 = weakReference4;
                    if (weakReference6 != null) {
                        C2214851BmN.LJIILJJIL = weakReference6;
                    }
                    C2214851BmN.LJIILL = Integer.valueOf(this.LLILZLL.LLJ.getPageType());
                }
                C582330Msh.LIZ().LJ = this.LLILZLL.LLJ.getEventType();
                C582330Msh.LIZ().LJFF = zLJIIL;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$3$onPageSelectedInternal$5");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$3$onPageSelectedInternal$5");
            }
        };
        if (((Number) C0BAO.LIZ.getValue()).intValue() == 1) {
            this.LLJ.LLLZIIL = r5;
        }
        if (BaseListFragmentPanel.d && C1608030rwn.LIZIZ()) {
            C0S78.LIZIZ(r5, "clientAiRunnable", true);
        } else if (BaseListFragmentPanel.d && ((Boolean) C1608030rwn.LJ.getValue()).booleanValue()) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), r5);
        } else {
            r5.run();
        }
        c1604100rqS2.LIZIZ(enumC1604090rqR9);
        if (c1604100rqS2.LIZJ()) {
            c1604100rqS2.LIZJ = C584470Mw9.LIZIZ(this.LLJ.LLJL.getItem(i3));
            c1604100rqS2.LIZIZ = C584470Mw9.LIZIZ(item5);
            c1604100rqS2.LJ = true;
        }
        BaseListFragmentPanel.d = true;
        Aweme awemeLJIIIIZZ = this.LLJ.LJIIIIZZ();
        if (awemeLJIIIIZZ != null && (awemeRh = this.LLJ.Rh(awemeLJIIIIZZ)) != null) {
            BaseListFragmentPanel baseListFragmentPanel20 = this.LLJ;
            boolean z6 = !AwemeSaaSExtKt.isLive(awemeRh);
            VerticalViewPager verticalViewPager3 = baseListFragmentPanel20.LLJJIJI;
            if (verticalViewPager3 != null) {
                verticalViewPager3.LLLLZIL.LJFF = z6;
            }
        }
        String eventType = this.LLJ.LLLLIIIILLL.getEventType();
        String previousPageWithPlaylistScene = this.LLJ.LLLLIIIILLL.getPreviousPageWithPlaylistScene();
        if (item5 != null) {
            C651970Phj.LLILLL.getClass();
            if (C651980Phk.LIZLLL(eventType) || C651980Phk.LIZLLL(previousPageWithPlaylistScene)) {
                C1ER1.LIZIZ.LJLL(this.LLIZLLLIL, this.LLJ.LLLLIIIILLL.getEventType(), this.LLJ.LLLLIIIILLL.getPreviousPageWithPlaylistScene(), i, item5, this.LLJ.LLLLIIIILLL.isUpdateSearchResultId());
                C0QO8.LIZ.LJIIIIZZ();
            }
        }
        C0X35.LJIIJJI("tryplay_onpageselected_internal", true);
        c1604100rqS2.LIZIZ(enumC1604090rqR4);
        C20182313y1 c20182313y1LIZJ = C20182613y4.LIZLLL().LIZJ();
        String type = enumC1604090rqR4.getType();
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        synchronized (c20182313y1LIZJ) {
            c20182313y1LIZJ.LJ(jUptimeMillis2, System.currentTimeMillis() - jUptimeMillis2, System.currentTimeMillis(), type);
        }
        C0X35.LJIIJJI("feed_commit_duration", true);
        C0X35.LIZ("feed_commit_to_render_ready", true);
        C0X35.LIZJ("feed_ui_to_video", "ui_to_video_after_commit");
        if (C20636086o.LIZ() && this.LLJ.LLLLIIIILLL.getEventType() != null && "homepage_hot".equals(this.LLJ.LLLLIIIILLL.getEventType())) {
            C1603930rqB.LIZ().LIZIZ();
        }
        if (C1865770yeV.LIZ() || C2079708Ct.LIZJ) {
            C202103146b.LIZ(1, this.LLJ.getEventType()).LIZ("select_end");
        }
        C1603930rqB c1603930rqBLIZ3 = C1603930rqB.LIZ();
        c1603930rqBLIZ3.getClass();
        c1603930rqBLIZ3.LIZLLL = System.currentTimeMillis() - c1603930rqBLIZ3.LIZJ;
    }

    public final void LJFF(int i) {
        IEcUgCommonService iEcUgCommonService;
        if ((this.LLJ.LLJILJILJ() || TextUtils.equals(this.LLJ.getEventType(), "homepage_follow") || TextUtils.equals(this.LLJ.getEventType(), "homepage_friends")) && this.LLJ.LLJL != null && (iEcUgCommonService = (IEcUgCommonService) PluggableExtentionKt.pluggableSpi(IEcUgCommonService.class)) != null) {
            Context context = this.LLJ.getContext();
            this.LLJ.getFragment();
            iEcUgCommonService.LIZ(context, this.LLJ.getEventType(), this.LLJ.LLJL.Fg(), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0189  */
    @Override // X.C0T21, X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrollStateChanged(int r8) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1603970rqF.onPageScrollStateChanged(int):void");
    }

    public final void LIZJ(int i, boolean z) {
        boolean z2;
        if (this.LLJ.LLILLL()) {
            return;
        }
        LJ(i, z);
        if (((Boolean) C269240Ags.LIZ.getValue()).booleanValue()) {
            C786410Ut5.LJL(C799570VYd.LIZJ(), new ARunnableS23S0101000_12(this, i, z, 8));
        } else {
            LIZLLL(i);
        }
        if (Boolean.TRUE != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C722660SWi.LIZ = z2;
        this.LLJ.LLLLILI = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1603970rqF.LJ(int, boolean):void");
    }

    @Override // X.C0T21, X.InterfaceC1616070s9l
    public final void onPageSelected(final int i, final boolean z) throws JSONException {
        VerticalViewPager verticalViewPager;
        C583420MuS.LIZIZ(this.LLJ.LLJL.getItem(i), C0RRP.P_SELECTED, null);
        if (!C1150504el.LIZ().LJIIIIZZ("feed_ui_duration_onpageselected")) {
            C1150504el.LIZ().LIZLLL("feed_ui_duration_onpageselected", false);
        }
        if (this.LLJ.LLLLILI) {
            C0S78.LIZLLL(((Boolean) C2277641EDa.LIZIZ.getValue()).booleanValue(), new AObjectS102S0101000_24(this, i, 0));
            Activity activity = this.LLJ.activity;
            boolean zBooleanValue = ((Boolean) C1EKN.LJIILIIL.getValue()).booleanValue();
            AObjectS102S0101000_24 aObjectS102S0101000_24 = new AObjectS102S0101000_24(this, i, 1);
            if (activity != null && zBooleanValue) {
                C0S78.LIZLLL(zBooleanValue, aObjectS102S0101000_24);
            } else {
                aObjectS102S0101000_24.invoke();
            }
        }
        View.OnTouchListener onTouchListener = this.LLIZ;
        if (onTouchListener instanceof C0RR3) {
            ((C0RR3) onTouchListener).LJIILIIL(this.LLJ.LLJL.getItem(i));
        }
        if (!C722660SWi.LIZIZ() && !C285090BFj.LJII()) {
            LIZLLL(i);
        } else if (!C1604040rqM.LIZ && C285090BFj.LJII() && C0X35.LJIIL("optimize_first_feed_downgrade_commit_3740") && C089T.LIZJ && C089T.LIZ()) {
            if (C590900NFo.LIZ) {
                C089T.LIZIZ = true;
            }
            PlayerController.LLJI(new InterfaceC582410Msp() { // from class: X.0rqL
                @Override // X.InterfaceC582410Msp
                public final void LJII() {
                    this.LIZJ.LIZJ(i, z);
                }
            });
            PlayerController.LLLLZ();
        } else if (C1514060pVE.LIZIZ()) {
            C722660SWi.LIZJ(new ARunnableS1S0111000_12(i, z, this, 0));
        } else {
            C722660SWi.LIZJ(new ARunnableS1S0111000_12(i, z, this, 1));
        }
        if (C1514060pVE.LIZIZ() && !C0CN5.LJII() && C1514060pVE.LIZIZ()) {
            C20508081q.LIZ(C786410Ut5.v2(), RunnableC310490CFb.LL);
        }
        if (!C1150504el.LIZ().LJIIIZ("feed_ui_duration_onpageselected")) {
            C1150504el.LIZ().LJI("feed_ui_duration_onpageselected", false);
        }
        if (!C1150504el.LIZ().LJIIIIZZ("feed_ui_duration_onpageselected_finish_to_end")) {
            C1150504el.LIZ().LIZLLL("feed_ui_duration_onpageselected_finish_to_end", false);
        }
        BaseListFragmentPanel baseListFragmentPanel = this.LLJ;
        if (baseListFragmentPanel.LLLLILI && (verticalViewPager = baseListFragmentPanel.LLJJIJI) != null && verticalViewPager.getChildCount() > 0 && !C722660SWi.LIZIZ()) {
            this.LLJ.LLLLILI = false;
        }
        BaseListFragmentPanel baseListFragmentPanel2 = this.LLJ;
        IVideoPlayBehaviorMobAbility iVideoPlayBehaviorMobAbility = baseListFragmentPanel2.LLJJIJIL;
        if (iVideoPlayBehaviorMobAbility != null) {
            iVideoPlayBehaviorMobAbility.QF1(baseListFragmentPanel2.LLJLILLLLZIIL);
        }
        BaseListFragmentPanel baseListFragmentPanel3 = this.LLJ;
        if (baseListFragmentPanel3.LLLLZLLLI) {
            baseListFragmentPanel3.LLLLZLLLI = false;
            baseListFragmentPanel3.LLJI.z32(0.0f);
            this.LLJ.LLLIZZ(Float.valueOf(0.0f));
        }
        BaseListFragmentPanel baseListFragmentPanel4 = this.LLJ;
        if (baseListFragmentPanel4.LLJL != null) {
            baseListFragmentPanel4.getFragment();
            List<Aweme> listFg = this.LLJ.LLJL.Fg();
            ArrayList arrayList = (ArrayList) C1589560rT0.LIZ;
            if (!arrayList.isEmpty()) {
                C1589600rT4 c1589600rT4 = new C1589600rT4();
                Integer numValueOf = Integer.valueOf(i);
                c1589600rT4.LIZ = listFg;
                if (numValueOf != null) {
                    C1589590rT3 c1589590rT3 = new C1589590rT3(numValueOf.intValue(), c1589600rT4.LIZ);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1589510rSv) it2.next()).LIZIZ(c1589590rT3);
                    }
                    return;
                }
                "position is null".toString();
                throw new IllegalArgumentException("position is null");
            }
        }
    }

    @Override // X.C0T21, X.InterfaceC1616160s9u
    public final void onScrollToItemStart(int i, boolean z) {
        C583420MuS.LJ(EnumC584510MwD.S_SCROLL_TO_ITEM.toString());
        if (!C722660SWi.LIZIZ() && !C285090BFj.LJII()) {
            LJ(i, z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603970rqF(BaseListFragmentPanel baseListFragmentPanel, C714460S0u c714460S0u, View view) {
        super("feed_panel");
        this.LLJ = baseListFragmentPanel;
        this.LLIZ = c714460S0u;
        this.LLIZLLLIL = view;
        this.LLILLJJLI = -1;
        this.LLILZ = -1;
        this.LLILZIL = true;
        if (C0BAY.LIZ()) {
            C1603980rqG c1603980rqG = new C1603980rqG(baseListFragmentPanel);
            this.LLILZLL = c1603980rqG;
            baseListFragmentPanel.LLJJIJIIJIL.CS0(c1603980rqG);
        }
    }

    @Override // X.C0T21, X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        boolean z;
        if (this.LLJ.getFragment().getActivity() == null) {
            return;
        }
        BaseListFragmentPanel baseListFragmentPanel = this.LLJ;
        if (!baseListFragmentPanel.LLLLLZ) {
            baseListFragmentPanel.LLLLLZ = true;
            baseListFragmentPanel.LJJJJJ(false);
        }
        PlayerComponentTemp playerComponentTemp = this.LLJ.LLLLIILLL;
        if (playerComponentTemp != null) {
            int i3 = this.LLILZ;
            if ((C1474810oTv.LJLJJLL() || playerComponentTemp.LJFF()) && i3 != -1) {
                BaseListFragmentPanel baseListFragmentPanel2 = playerComponentTemp.LL;
                if (baseListFragmentPanel2 != null) {
                    if (playerComponentTemp.LLJJJJJIL == 0) {
                        if (i + f > baseListFragmentPanel2.LJLLJ()) {
                            playerComponentTemp.LJII(baseListFragmentPanel2.F(), "up");
                        } else {
                            playerComponentTemp.LJII(baseListFragmentPanel2.D(), "down");
                        }
                        playerComponentTemp.LJII(baseListFragmentPanel2.LJLIL(), "current");
                        playerComponentTemp.LLJJL = baseListFragmentPanel2.D();
                        playerComponentTemp.LLJJLIIIJLLLLLLLZ = baseListFragmentPanel2.LJLIL();
                        playerComponentTemp.LLJL = baseListFragmentPanel2.F();
                    } else if (playerComponentTemp.LLJJJJLIIL != i) {
                        playerComponentTemp.LLJJL = baseListFragmentPanel2.D();
                        playerComponentTemp.LLJJLIIIJLLLLLLLZ = baseListFragmentPanel2.LJLIL();
                        playerComponentTemp.LLJL = baseListFragmentPanel2.F();
                        if (i + f > baseListFragmentPanel2.LJLLJ()) {
                            playerComponentTemp.LJII(playerComponentTemp.LLJL, "up");
                        } else {
                            playerComponentTemp.LJII(playerComponentTemp.LLJJL, "down");
                        }
                    }
                }
                playerComponentTemp.LLJJJJJIL = i2;
                playerComponentTemp.LLJJJJLIIL = i;
                playerComponentTemp.LJIIJ(playerComponentTemp.LLJJL, i, f, i2, i3);
                playerComponentTemp.LJIIJ(playerComponentTemp.LLJJLIIIJLLLLLLLZ, i, f, i2, i3);
                playerComponentTemp.LJIIJ(playerComponentTemp.LLJL, i, f, i2, i3);
            }
            playerComponentTemp.LLJJJJ = f;
            BaseListFragmentPanel baseListFragmentPanel3 = playerComponentTemp.LL;
            if (baseListFragmentPanel3 != null) {
                int i4 = baseListFragmentPanel3.LLJLILLLLZIIL;
                if (i != i4) {
                    z = true;
                } else {
                    z = false;
                }
                playerComponentTemp.LLJJIJIIJIL = z;
                if (i3 == 1) {
                    if (i == i4 && f > 0.0f) {
                        InterfaceC739770T0d interfaceC739770T0d = playerComponentTemp.LLIZLLLIL;
                        if (interfaceC739770T0d != null) {
                            interfaceC739770T0d.LJLI(i, true);
                        }
                    } else if (i < i4) {
                        C01GW c01gw = C1779306xz.LIZ;
                        if (!C1781506yL.LIZ ? C0C64.LJIILLIIL().LJIJ(31744, 1, "player_prerender_prev_enable", true) == 1 : ((Boolean) C1779306xz.LJI.getValue()).booleanValue()) {
                            InterfaceC739770T0d interfaceC739770T0d2 = playerComponentTemp.LLIZLLLIL;
                            if (interfaceC739770T0d2 != null) {
                                interfaceC739770T0d2.LJLI(i, false);
                            }
                        }
                    }
                }
            }
        }
        BaseListFragmentPanel baseListFragmentPanel4 = this.LLJ;
        this.LLILZIL = baseListFragmentPanel4.LLLLILI;
        if (i2 != 0.0f) {
            this.LLILLL = true;
        }
        if (!C0BSY.LIZ && baseListFragmentPanel4.LLLIL) {
            baseListFragmentPanel4.LLLIL = false;
            return;
        }
        PlayerComponentTemp playerComponentTemp2 = baseListFragmentPanel4.LLLLIILLL;
        if (playerComponentTemp2 != null) {
            int i5 = this.LLILZ;
            BaseListFragmentPanel baseListFragmentPanel5 = playerComponentTemp2.LL;
            if (baseListFragmentPanel5 != null) {
                Aweme item = baseListFragmentPanel5.LLJL.getItem(baseListFragmentPanel5.LLJLILLLLZIIL);
                if (C582230MsX.LIZ(baseListFragmentPanel5.LLLLIIIILLL.getEventType()) && item != null && !AwemeSaaSExtKt.isLive(item) && !playerComponentTemp2.LLJJJ && !playerComponentTemp2.LLJJJIL && i5 == 1) {
                    if (f > 0.5f) {
                        Aweme item2 = baseListFragmentPanel5.LLJL.getItem(i);
                        if (item2 != null && AwemeSaaSExtKt.isLive(item2)) {
                            C0SZ8 c0sz8D = baseListFragmentPanel5.D();
                            if ((!(c0sz8D instanceof InterfaceC755920Tl0) || (!((InterfaceC755920Tl0) c0sz8D).LLIFFJFJJ(EnumC755930Tl1.LIVE_PREVIEW_PRE_PULL_STREAM_ON_DRAGGING) && !C1905290zgF.LIZ(128))) && c0sz8D != null && c0sz8D.LLZLI()) {
                                playerComponentTemp2.LJIIZILJ(item2, false, c0sz8D, false);
                                playerComponentTemp2.LLJJJ = true;
                            }
                            playerComponentTemp2.LLJJJIL = true;
                        }
                    } else {
                        Aweme item3 = baseListFragmentPanel5.LLJL.getItem(i + 1);
                        if (item3 != null && AwemeSaaSExtKt.isLive(item3)) {
                            C0SZ8 c0sz8F = baseListFragmentPanel5.F();
                            if ((!(c0sz8F instanceof InterfaceC755920Tl0) || (!((InterfaceC755920Tl0) c0sz8F).LLIFFJFJJ(EnumC755930Tl1.LIVE_PREVIEW_PRE_PULL_STREAM_ON_DRAGGING) && !C1905290zgF.LIZ(128))) && c0sz8F != null && c0sz8F.LLZLI()) {
                                playerComponentTemp2.LJIIZILJ(item3, false, c0sz8F, false);
                                playerComponentTemp2.LLJJJ = true;
                            }
                            playerComponentTemp2.LLJJJIL = true;
                        }
                    }
                }
                playerComponentTemp2.LLJILLL = true;
            }
        }
        if (i != this.LLJ.LLJJIJIIJIL.LJIL() && f == 0.0f) {
            this.LLJ.LLLLZLLLI = true;
        } else {
            this.LLJ.LLLLZLLLI = false;
        }
    }

    @Override // X.C0T21, X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(final int i, final float f, final int i2) {
        if (C285660BHo.LIZ) {
            C0SPC.LIZ(this.LLJ.LJLIL(), null);
            if (C0X35.LJIIL("optimize_first_feed_downgrade_pageseleted_part3_4240") && C089T.LIZJ && C089T.LIZ()) {
                if (C590900NFo.LIZ) {
                    C089T.LIZIZ = true;
                }
                PlayerController.LLJI(new InterfaceC582410Msp(i, f, i2) { // from class: X.0rqK
                    public final /* synthetic */ int LIZ;

                    @Override // X.InterfaceC582410Msp
                    public final void LJII() {
                        this.LIZIZ.LIZIZ(this.LIZ);
                    }
                });
                PlayerController.LLLLZ();
                return;
            }
        }
        LIZIZ(i);
    }
}
