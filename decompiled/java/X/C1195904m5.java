package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.04m5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1195904m5 {
    public static final C1195904m5 LIZ = new C1195904m5();
    public static final Map<String, IDynamicResourceConfig<?>> LIZIZ = new LinkedHashMap();

    static {
        try {
            for (IDynamicResourceConfig<?> iDynamicResourceConfig : ServiceManager.get().getServices(IDynamicResourceConfig.class)) {
                LIZIZ.put(iDynamicResourceConfig.key(), iDynamicResourceConfig);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
