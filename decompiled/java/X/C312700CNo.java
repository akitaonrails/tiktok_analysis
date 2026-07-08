package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0CNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312700CNo {
    public static final Map<String, C312710CNp> LIZ;

    static {
        if (!C312690CNn.LJ) {
            C312690CNn.LIZIZ = C312690CNn.LIZ();
            C312690CNn.LJ = true;
        }
        LIZ = new LinkedHashMap();
        try {
            List<ApiConfigEntity> configList = C0CLW.LIZIZ.LIZ.getSpringApiLimitConfig().getConfigList();
            if (configList != null) {
                for (ApiConfigEntity apiConfigEntity : configList) {
                    Map<String, C312710CNp> map = LIZ;
                    String apiName = apiConfigEntity.getApiName();
                    boolean zBooleanValue = apiConfigEntity.getIsBanned().booleanValue();
                    long jLongValue = apiConfigEntity.getDelayTime().longValue();
                    apiConfigEntity.getApiName();
                    map.put(apiName, new C312710CNp(zBooleanValue, jLongValue));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
