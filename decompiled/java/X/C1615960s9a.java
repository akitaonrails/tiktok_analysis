package X;

import Y.ARunnableS124S0100000_24;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.crash.Npth;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.experiment.ColdBootStartJankOptimize;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.viewpager.PageDispatcher;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615960s9a implements InterfaceC1613610s5n, InterfaceC1616160s9u {
    public final /* synthetic */ ViewPagerPanelComponent LL;

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
        throw null;
    }

    @Override // X.InterfaceC1616160s9u
    public final void onBeforePageChange() {
        Iterator<InterfaceC1616070s9l> it2 = this.LL.LLJLIL.iterator();
        while (it2.hasNext()) {
            it2.next().onBeforePageChange();
        }
    }

    public C1615960s9a(ViewPagerPanelComponent viewPagerPanelComponent) {
        this.LL = viewPagerPanelComponent;
    }

    public final void LIZ(int i) {
        Aweme aweme;
        String aid;
        boolean z;
        Aweme aweme2;
        FrameLayout frameLayout;
        VideoViewCell videoViewCell;
        C583890MvD.LIZ.LIZ(EnumC1604090rqR.PAGE_SELECT_COMPONENT_TOTAL);
        ViewPagerPanelComponent viewPagerPanelComponent = this.LL;
        viewPagerPanelComponent.getClass();
        boolean zLJI = MethodIDManager.LJI(71680);
        viewPagerPanelComponent.LLJJIJIL = false;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        ViewPagerPanelComponent viewPagerPanelComponent2 = this.LL;
        viewPagerPanelComponent2.LLJL = i;
        boolean zMo1 = viewPagerPanelComponent2.Mo1(i);
        Iterator<InterfaceC1616070s9l> it2 = this.LL.LLJLIL.iterator();
        while (true) {
            String str = null;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1616070s9l next = it2.next();
            if (next instanceof C0T21) {
                str = ((C0T21) next).LL;
            }
            if (((Boolean) C0BPE.LIZIZ.getValue()).booleanValue() && !Intrinsics.LJFF(str, "feed_panel")) {
                C312240CLu.LIZ(new C0CM3(C0CMJ.NORMAL_PRIORITY.getType(), C0CME.SCROLL_ON_PAGE_SELECTED, next.toString(), new C1616110s9p(next, i, zMo1), true));
            } else {
                next.onPageSelected(i);
                next.onPageSelected(i, zMo1);
            }
        }
        C1604100rqS c1604100rqS = C583890MvD.LIZ;
        c1604100rqS.LJIJJ = this.LL.LLJLIL.size();
        c1604100rqS.LIZIZ(EnumC1604090rqR.PAGE_SELECT_COMPONENT_TOTAL);
        if (TextUtils.equals("homepage_hot", C1389300mG0.LIZ(this.LL.getPanelContext())) && (C04VQ.LIZ() || ((Number) C04S3.LIZ.getValue()).intValue() == 1)) {
            C0SZ8 c0sz8LJLIL = this.LL.LJLIL();
            if ((c0sz8LJLIL instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c0sz8LJLIL) != null) {
                frameLayout = videoViewCell.LLLLII;
            } else {
                frameLayout = null;
            }
            C732280Sny c732280Sny = C732280Sny.LIZ;
            c732280Sny.getClass();
            if (frameLayout != null && !(!C732280Sny.LIZ(frameLayout))) {
                if (C04VQ.LIZ()) {
                    int[] iArr = {0, 0};
                    frameLayout.getLocationOnScreen(iArr);
                    String str2 = "view status is not normal, x: " + frameLayout.getX() + ", y: " + frameLayout.getY() + ", alpha: " + frameLayout.getAlpha() + ", translationX: " + frameLayout.getTranslationX() + ", translationY: " + frameLayout.getTranslationY() + ", scaleX: " + frameLayout.getScaleX() + ", scaleY: " + frameLayout.getScaleY() + ", visibility: " + frameLayout.getVisibility() + "，windowXY: " + iArr[0] + "  " + iArr[1] + "viewPadding : " + frameLayout.getPaddingLeft() + ' ' + frameLayout.getPaddingTop() + ' ' + frameLayout.getPaddingRight() + ' ' + frameLayout.getPaddingBottom();
                    ((AbstractC1604130rqV) C732280Sny.LIZIZ.getValue()).LJIIIZ(str2);
                    Npth.reportBizException("RootViewStatusRefresh", new Throwable(str2), str2, (Map<String, String>) new HashMap(), true);
                }
                c732280Sny.getClass();
                if (((Number) C04S3.LIZ.getValue()).intValue() == 1) {
                    if (frameLayout != null) {
                        C786410Ut5.T4(frameLayout, 1.0f);
                        C786410Ut5.Ob(frameLayout, 1.0f);
                        C786410Ut5.pc(frameLayout, 1.0f);
                        C786410Ut5.LJLLLLLL(0, frameLayout);
                        if (frameLayout != null) {
                            C786410Ut5.Jc(frameLayout, 0.0f);
                            C786410Ut5.ed(frameLayout, 0.0f);
                            C426750GoL.LJIIL(frameLayout, 0, 0, 0, 0, 16);
                        }
                    }
                    ((AbstractC1604130rqV) C732280Sny.LIZIZ.getValue()).LJIIIZ("trigger resetViewPosition()");
                }
            }
        }
        PageDispatcher pageDispatcherLo = this.LL.Lo();
        if (pageDispatcherLo != null) {
            C0SZ8 c0sz8LJLIL2 = this.LL.LJLIL();
            if (c0sz8LJLIL2 != null) {
                aweme = c0sz8LJLIL2.getAweme();
            } else {
                aweme = null;
            }
            C1604000rqI c1604000rqI = new C1604000rqI(i, c0sz8LJLIL2, aweme, zMo1);
            C1616000s9e c1616000s9e = pageDispatcherLo.LLILLL;
            CopyOnWriteArrayList<AbstractC1616100s9o> copyOnWriteArrayList = pageDispatcherLo.LLILZ;
            InterfaceC497601wk interfaceC497601wk = pageDispatcherLo.LLILLJJLI;
            c1616000s9e.LIZJ = copyOnWriteArrayList;
            c1616000s9e.LIZLLL = interfaceC497601wk;
            Iterator<AbstractC1616100s9o> it3 = copyOnWriteArrayList.iterator();
            while (it3.hasNext()) {
                try {
                    it3.next().LIZIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            EnumC1616060s9k enumC1616060s9k = EnumC1616060s9k.LL;
            Aweme aweme3 = c1604000rqI.LIZIZ;
            if (aweme3 != null) {
                aid = aweme3.getAid();
            } else {
                aid = null;
            }
            Aweme aweme4 = c1604000rqI.LIZIZ;
            if (aweme4 != null && aweme4.getAid() != null) {
                z = false;
            } else {
                z = true;
            }
            C1616020s9g c1616020s9g = new C1616020s9g(enumC1616060s9k, c1604000rqI, aid, z);
            c1616000s9e.LJ.addLast(c1616020s9g);
            if (aid != null && (aweme2 = c1604000rqI.LIZIZ) != null && aweme2.getAwemeType() == 0 && !c1616020s9g.LIZLLL) {
                C1DFH c1dfh = C0PEM.LIZ;
                c1616020s9g.LJ = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C1615980s9c(c1616000s9e, c1616020s9g, null), 2);
            }
            c1616000s9e.LIZ(copyOnWriteArrayList, interfaceC497601wk);
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        boolean z;
        boolean zLJI = MethodIDManager.LJI(71668);
        ViewPagerPanelComponent viewPagerPanelComponent = this.LL;
        viewPagerPanelComponent.getClass();
        boolean zLJI2 = MethodIDManager.LJI(71668);
        viewPagerPanelComponent.LLJJI = null;
        viewPagerPanelComponent.LLJJIJIIJIL = i;
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        viewPagerPanelComponent.LLJJIJIL = z;
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        Iterator<InterfaceC1616070s9l> it2 = this.LL.LLJLIL.iterator();
        while (it2.hasNext()) {
            it2.next().onPageScrollStateChanged(i);
        }
        PageDispatcher pageDispatcherLo = this.LL.Lo();
        if (pageDispatcherLo != null) {
            Iterator<AbstractC1616100s9o> it3 = pageDispatcherLo.LLILZ.iterator();
            while (it3.hasNext()) {
                it3.next().getClass();
            }
            C1616000s9e c1616000s9e = pageDispatcherLo.LLILLL;
            c1616000s9e.getClass();
            if (i == 0) {
                z2 = true;
            }
            c1616000s9e.LIZIZ = z2;
            C1616050s9j c1616050s9j = c1616000s9e.LIZ;
            boolean z3 = !z2;
            c1616050s9j.LIZJ = z3;
            if (!z3) {
                c1616050s9j.LIZ();
            }
            c1616000s9e.LIZ(c1616000s9e.LIZJ, c1616000s9e.LIZLLL);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(final int r4) {
        /*
            r3 = this;
            r0 = 71680(0x11800, float:1.00445E-40)
            boolean r2 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = X.C1604040rqM.LIZ
            if (r0 == 0) goto L3f
            com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent r0 = r3.LL
            X.0SZ8 r1 = r0.LJLIL()
            r0 = 0
            X.C0SPC.LIZ(r1, r0)
            java.lang.String r0 = "optimize_first_feed_downgrade_pageseleted_part1_4240"
            boolean r0 = X.C0X35.LJIIL(r0)
            if (r0 == 0) goto L3f
            boolean r0 = X.C089T.LIZJ
            if (r0 == 0) goto L3f
            boolean r0 = X.C089T.LIZ()
            if (r0 == 0) goto L3f
            boolean r0 = X.C590900NFo.LIZ
            if (r0 == 0) goto L2e
            r0 = 1
            X.C089T.LIZIZ = r0
        L2e:
            X.0s9t r0 = new X.0s9t
            r0.<init>()
            com.ss.android.ugc.aweme.feed.controller.PlayerController.LLJI(r0)
            com.ss.android.ugc.aweme.feed.controller.PlayerController.LLLLZ()
        L39:
            if (r2 == 0) goto L3e
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L3e:
            return
        L3f:
            r3.LIZ(r4)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1615960s9a.onPageSelected(int):void");
    }

    @Override // X.InterfaceC1616160s9u
    public final void onScrollToItemStart(int i) {
        ViewPagerPanelComponent viewPagerPanelComponent = this.LL;
        viewPagerPanelComponent.LLJJI = null;
        Iterator<InterfaceC1616070s9l> it2 = viewPagerPanelComponent.LLJLIL.iterator();
        while (it2.hasNext()) {
            it2.next().onScrollToItemStart(i, viewPagerPanelComponent.Mo1(i));
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        final ViewPagerPanelComponent viewPagerPanelComponent = this.LL;
        viewPagerPanelComponent.LLJJI = null;
        if (viewPagerPanelComponent.No() != null) {
            VerticalViewPager verticalViewPager = viewPagerPanelComponent.LLJILJIL;
            if (verticalViewPager != null && verticalViewPager.getScrollState() == 1 && viewPagerPanelComponent.LLJILJILJ) {
                C1238904t1.LIZIZ(new Runnable() { // from class: X.0s9n
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ViewPagerPanelComponent@376b.onPageScrolled$1");
                        try {
                            ColdBootStartJankOptimize.LIZLLL(new ARunnableS124S0100000_24(viewPagerPanelComponent, 118), "manual");
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ViewPagerPanelComponent@376b.onPageScrolled$1");
                    }
                }, C1389300mG0.LJIL(viewPagerPanelComponent.getPanelContext()));
            }
            viewPagerPanelComponent.LLJJIII = -1;
        }
        ViewPagerPanelComponent viewPagerPanelComponent2 = this.LL;
        for (InterfaceC1616070s9l interfaceC1616070s9l : viewPagerPanelComponent2.LLJLIL) {
            if (i == viewPagerPanelComponent2.LLJL && f < 1.0E-10f) {
                interfaceC1616070s9l.onPageScrolledEnd(i, f, i2);
            }
            interfaceC1616070s9l.onPageScrolled(i, f, i2);
        }
        ViewPagerPanelComponent viewPagerPanelComponent3 = this.LL;
        if (i == viewPagerPanelComponent3.LLJL && f < 1.0E-10f) {
            viewPagerPanelComponent3.LLJL = -1;
        }
        PageDispatcher pageDispatcherLo = viewPagerPanelComponent3.Lo();
        if (pageDispatcherLo != null) {
            Iterator<AbstractC1616100s9o> it2 = pageDispatcherLo.LLILZ.iterator();
            while (it2.hasNext()) {
                it2.next().onPageScrolled(i, f, i2);
            }
        }
    }
}
