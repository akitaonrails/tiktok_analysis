package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.experiment.PrerenderVideoColdStartWithSceneConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867760yhi extends C09AY implements Function0<PrerenderVideoColdStartWithSceneConfig> {
    public C1867760yhi() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final PrerenderVideoColdStartWithSceneConfig invoke() {
        PrerenderVideoColdStartWithSceneConfig prerenderVideoColdStartWithSceneConfig;
        PrerenderVideoColdStartWithSceneConfig prerenderVideoColdStartWithSceneConfig2;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PrerenderVideoColdStartWithSceneConfig prerenderVideoColdStartWithSceneConfig3 = C1867770yhj.LIZIZ;
            PrerenderVideoColdStartWithSceneConfig prerenderVideoColdStartWithSceneConfig4 = (PrerenderVideoColdStartWithSceneConfig) c0c64LJIILLIIL.LJJII(PrerenderVideoColdStartWithSceneConfig.class, prerenderVideoColdStartWithSceneConfig3, "try_prerender_video_cold_start_setting", true);
            if (prerenderVideoColdStartWithSceneConfig4 == null) {
                C1867770yhj.LIZ.getClass();
                prerenderVideoColdStartWithSceneConfig2 = prerenderVideoColdStartWithSceneConfig3;
            } else {
                prerenderVideoColdStartWithSceneConfig2 = prerenderVideoColdStartWithSceneConfig4;
            }
            C189200o6.m2constructorimpl(prerenderVideoColdStartWithSceneConfig2);
            prerenderVideoColdStartWithSceneConfig = prerenderVideoColdStartWithSceneConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            prerenderVideoColdStartWithSceneConfig = c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(prerenderVideoColdStartWithSceneConfig) == null) {
            return prerenderVideoColdStartWithSceneConfig;
        }
        C1867770yhj.LIZ.getClass();
        return C1867770yhj.LIZIZ;
    }
}
