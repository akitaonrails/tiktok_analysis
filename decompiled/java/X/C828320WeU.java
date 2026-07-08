package X;

import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828320WeU {
    public static final int LIZ;

    static {
        Object c098200Yq;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("resource_prefetch_config");
            c098200Yq = config != null ? Integer.valueOf(config.optInt("resource_prefetch_thread_priority")) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer num = (Integer) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        LIZ = num != null ? num.intValue() : 5;
    }
}
