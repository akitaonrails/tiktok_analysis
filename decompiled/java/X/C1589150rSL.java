package X;

import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;

/* JADX INFO: renamed from: X.0rSL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589150rSL implements InterfaceC469360Ias {
    public int LL = -1;
    public final /* synthetic */ FeedRecommendFragment LLILLJJLI;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    public C1589150rSL(FeedRecommendFragment feedRecommendFragment) {
        this.LLILLJJLI = feedRecommendFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r5) {
        /*
            r4 = this;
            r0 = 202365(0x3167d, float:2.83574E-40)
            boolean r3 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r4.LL = r5
            boolean r0 = X.C1492500owS.LIZ()
            if (r0 == 0) goto L3d
            r1 = 1
            if (r5 == 0) goto L21
            if (r5 <= 0) goto L37
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = r4.LLILLJJLI     // Catch: java.lang.Exception -> L39
            com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel r0 = r0.LLIZLLLIL     // Catch: java.lang.Exception -> L39
            X.0SR4 r0 = r0.LLJL     // Catch: java.lang.Exception -> L39
            int r0 = r0.getCount()     // Catch: java.lang.Exception -> L39
            int r0 = r0 - r1
            if (r5 != r0) goto L37
        L21:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L39
            java.util.concurrent.atomic.AtomicBoolean r0 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LIZ     // Catch: java.lang.Exception -> L39
            boolean r0 = X.C1492500owS.LIZ()     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L3d
            java.util.concurrent.atomic.AtomicBoolean r1 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LIZIZ     // Catch: java.lang.Exception -> L39
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Exception -> L39
            r1.set(r0)     // Catch: java.lang.Exception -> L39
            goto L3d
        L37:
            r1 = 0
            goto L21
        L39:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3d:
            X.01GW r0 = X.C2279571EKl.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            Y.ARunnableS124S0100000_24 r1 = new Y.ARunnableS124S0100000_24
            r0 = 168(0xa8, float:2.35E-43)
            r1.<init>(r4, r0)
            java.lang.String r0 = "logVideoSkip"
            X.C0S78.LIZIZ(r1, r0, r2)
            if (r3 == 0) goto L5a
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1589150rSL.onPageSelected(int):void");
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        int i3;
        int i4;
        AdHomePageDataVM adHomePageDataVM;
        if (this.LLILLJJLI.LLIZLLLIL.LJIIIIZZ() != null && C1017070cZd.LLIZLLLIL(this.LLILLJJLI.LLIZLLLIL.LJIIIIZZ()) && C1017070cZd.LJJJ(this.LLILLJJLI.LLIZLLLIL.LJIIIIZZ()).getSwipeUpType() == 5 && (adHomePageDataVM = this.LLILLJJLI.LLJILJIL) != null && adHomePageDataVM.wQ2()) {
            this.LLILLJJLI.LLJILJIL.LLILLL.setValue(Float.valueOf(i2));
        }
        if (i == this.LL && f < 1.0E-10f) {
            this.LL = -1;
        }
        FeedRecommendFragment feedRecommendFragment = this.LLILLJJLI;
        C1566410qrf c1566410qrf = feedRecommendFragment.LLJ;
        if (c1566410qrf != null && f > 0.0f && (i4 = i + 1) > c1566410qrf.LIZIZ) {
            c1566410qrf.LIZIZ = i4;
        }
        C1212490hep c1212490hep = feedRecommendFragment.LLJI;
        if (c1212490hep != null && f > 0.0f && (i3 = i + 1) > c1212490hep.LJFF) {
            c1212490hep.LJFF = i3;
        }
    }
}
