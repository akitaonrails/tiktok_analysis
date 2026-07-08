package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0tD1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656530tD1 {
    public static Boolean LIZJ;
    public static final C1656530tD1 LIZ = new C1656530tD1();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(474));

    public static boolean LIZ() {
        Object c098200Yq;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(null)) {
            return false;
        }
        Boolean bool = LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            c098200Yq = Class.forName("com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
            return false;
        }
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("EffectCreatorAABUtil", "aneOptEnable true, cache value");
        LIZJ = Boolean.TRUE;
        return true;
    }
}
