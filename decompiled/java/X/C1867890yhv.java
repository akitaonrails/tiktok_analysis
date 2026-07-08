package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.runnable.SlideRunnableBlockConfigs;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yhv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867890yhv extends C09AY implements Function0<SlideRunnableBlockConfigs> {
    public C1867890yhv() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final SlideRunnableBlockConfigs invoke() {
        SlideRunnableBlockConfigs slideRunnableBlockConfigs;
        SlideRunnableBlockConfigs slideRunnableBlockConfigs2;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            SlideRunnableBlockConfigs slideRunnableBlockConfigs3 = C1867920yhy.LIZIZ;
            SlideRunnableBlockConfigs slideRunnableBlockConfigs4 = (SlideRunnableBlockConfigs) c0c64LJIILLIIL.LJJIIJ(true, "slide_runnable_block", 31744, SlideRunnableBlockConfigs.class, slideRunnableBlockConfigs3, 2);
            if (slideRunnableBlockConfigs4 == null) {
                C1867920yhy.LIZ.getClass();
                slideRunnableBlockConfigs2 = slideRunnableBlockConfigs3;
            } else {
                slideRunnableBlockConfigs2 = slideRunnableBlockConfigs4;
            }
            C189200o6.m2constructorimpl(slideRunnableBlockConfigs2);
            slideRunnableBlockConfigs = slideRunnableBlockConfigs2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            slideRunnableBlockConfigs = c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(slideRunnableBlockConfigs) == null) {
            return slideRunnableBlockConfigs;
        }
        C1867920yhy.LIZ.getClass();
        return C1867920yhy.LIZIZ;
    }
}
