package X;

import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WeQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828280WeQ extends C09AY implements Function0<Boolean> {
    public C828280WeQ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Object c098200Yq;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("put_nav_height_into_stable_props");
            c098200Yq = config != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
    }
}
