package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.olduser.feed.SlideTaskBlockConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yhc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867700yhc extends C09AY implements Function0<SlideTaskBlockConfig> {
    public C1867700yhc() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final SlideTaskBlockConfig invoke() {
        SlideTaskBlockConfig slideTaskBlockConfig;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            SlideTaskBlockConfig slideTaskBlockConfig2 = C1867710yhd.LIZ;
            SlideTaskBlockConfig slideTaskBlockConfig3 = (SlideTaskBlockConfig) c0c64LJIILLIIL.LJJIIJ(true, "slide_task_block", 31744, SlideTaskBlockConfig.class, slideTaskBlockConfig2, 2);
            SlideTaskBlockConfig slideTaskBlockConfig4 = slideTaskBlockConfig2;
            if (slideTaskBlockConfig3 != null) {
                slideTaskBlockConfig4 = slideTaskBlockConfig3;
            }
            C189200o6.m2constructorimpl(slideTaskBlockConfig4);
            slideTaskBlockConfig = slideTaskBlockConfig4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            slideTaskBlockConfig = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(slideTaskBlockConfig) != null ? C1867710yhd.LIZ : slideTaskBlockConfig;
    }
}
