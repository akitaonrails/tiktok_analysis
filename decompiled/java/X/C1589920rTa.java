package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589920rTa extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MainTabStrip LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589920rTa(MainTabStrip mainTabStrip) {
        super(0);
        this.LL = mainTabStrip;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[PHI: r2
      0x005e: PHI (r2v1 com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) = 
      (r2v0 com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility)
      (r2v6 com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility)
     binds: [B:7:0x000f, B:20:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.experiment.TabPreloadTimingConfig r0 = X.C1584540rKu.LIZ()
            if (r0 == 0) goto L42
            com.ss.android.ugc.aweme.experiment.TopTabPreloadConfig r4 = r0.topTabPreloadConfig
            if (r4 == 0) goto L42
            com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip r5 = r7.LL
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r2 = r5.LLJJJJLIIL
            r0 = 0
            if (r2 != 0) goto L5e
            boolean r1 = X.C296200BjG.LIZ()
            if (r1 == 0) goto L47
            X.19EG r1 = r5.LLJI
            X.19EG r1 = X.C1388190mED.LIZIZ(r1)
            if (r1 == 0) goto L5c
            X.0Q7z r6 = X.C1558360qeg.LJI(r1, r0)
            r1 = 1
            java.lang.Class[] r3 = new java.lang.Class[r1]
            r2 = 0
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r3[r2] = r1
            X.0QSJ r2 = X.C687700QyG.LIZJ(r6, r3)
            if (r2 == 0) goto L45
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r1 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            java.lang.Object r2 = r2.getAbility(r1)
        L37:
            boolean r1 = r2 instanceof com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
            if (r1 != 0) goto L3c
            r2 = r0
        L3c:
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r2 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r2
        L3e:
            r5.LLJJJJLIIL = r2
            if (r2 != 0) goto L5e
        L42:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L45:
            r2 = r0
            goto L37
        L47:
            X.19EG r1 = r5.LLJI
            X.19EG r1 = X.C1388190mED.LIZIZ(r1)
            if (r1 == 0) goto L5c
            X.0Q7z r2 = X.C1558360qeg.LJI(r1, r0)
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r1 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            X.01wD r2 = X.C1558520qew.LIZ(r2, r1, r0)
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r2 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r2
            goto L3e
        L5c:
            r2 = r0
            goto L3e
        L5e:
            X.0rW5 r5 = new X.0rW5
            com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip r3 = r7.LL
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r1 = r3.LLJLIL
            if (r1 != 0) goto L80
            monitor-enter(r3)
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r1 = r3.LLJLIL     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto L7d
            X.0QSJ r1 = r3.LIZIZ()     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L79
            java.lang.Class<com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility> r0 = com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L8d
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = (com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility) r0     // Catch: java.lang.Throwable -> L8d
        L79:
            r3.LLJLIL = r0     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8d
            goto L7f
        L7d:
            monitor-exit(r3)
            goto L80
        L7f:
            r1 = r0
        L80:
            r5.<init>(r4, r3, r2, r1)
            com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip r0 = r7.LL
            r0.LLJJJJJIL = r5
            X.0rXf r0 = r0.LLILLJJLI
            r0.setTopTabPreloadTriggerDispatcher$homepage_common_release(r5)
            goto L42
        L8d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1589920rTa.invoke():java.lang.Object");
    }
}
