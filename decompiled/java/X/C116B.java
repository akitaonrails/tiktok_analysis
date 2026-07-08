package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;

/* JADX INFO: renamed from: X.116B, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C116B {
    public static final C116B LIZ = new C116B();
    public static final int LIZIZ = ((Number) C0AQA.LIZ.getValue()).intValue();
    public static final C603820NmG<String, C116A> LIZJ = new C603820NmG<>(4);
    public static final C603820NmG<String, C116C> LIZLLL = new C603820NmG<>(4);

    public static final void LIZ(boolean z) {
        String str;
        if (!C289350BVt.LIZ()) {
            return;
        }
        IAVPerformance iAVPerformanceProvideAVPerformance = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance();
        if (z) {
            str = "tool_performance_prop_detail_shoot_same";
        } else {
            str = "tool_performance_prop_list_shoot_same";
        }
        iAVPerformanceProvideAVPerformance.end(str, "Handle prop data");
    }

    public static final StickerPropAwemeList LIZIZ(String str) {
        StickerPropAwemeList stickerPropAwemeList = null;
        try {
            C116C c116cLIZJ = LIZLLL.LIZJ(str);
            if (c116cLIZJ != null && c116cLIZJ.LIZIZ >= System.currentTimeMillis()) {
                LIZJ(false);
                stickerPropAwemeList = c116cLIZJ.LIZ;
                return stickerPropAwemeList;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return stickerPropAwemeList;
    }

    public static final void LIZJ(boolean z) {
        String str;
        IAVPerformance iAVPerformanceProvideAVPerformance = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance();
        if (z) {
            str = "tool_performance_prop_detail_shoot_same";
        } else {
            str = "tool_performance_prop_list_shoot_same";
        }
        iAVPerformanceProvideAVPerformance.step(str, "Hit Cache");
    }

    public static final void LIZLLL(boolean z) {
        String str;
        if (!C289350BVt.LIZ()) {
            return;
        }
        IAVPerformance iAVPerformanceProvideAVPerformance = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideAVPerformance();
        if (z) {
            str = "tool_performance_prop_detail_shoot_same";
        } else {
            str = "tool_performance_prop_list_shoot_same";
        }
        iAVPerformanceProvideAVPerformance.start(str, "Begin fetch prop");
    }
}
