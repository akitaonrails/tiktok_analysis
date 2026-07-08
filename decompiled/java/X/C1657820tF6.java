package X;

import com.ss.android.ugc.aweme.experiment.ToolbarOptimizeConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0tF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657820tF6 {
    public static final C1657820tF6 LIZ = new C1657820tF6();
    public static final ToolbarOptimizeConfig LIZIZ = new ToolbarOptimizeConfig(-1, -1, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(103));

    public static int LIZ() {
        return ((ToolbarOptimizeConfig) LIZJ.getValue()).editFixCnt;
    }

    public static boolean LIZIZ() {
        return ((ToolbarOptimizeConfig) LIZJ.getValue()).ifNewIcon && ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() && !C0CHQ.LIZ().getAccountService().LIZ();
    }

    public static int LIZJ() {
        return ((ToolbarOptimizeConfig) LIZJ.getValue()).recordFixCnt;
    }
}
