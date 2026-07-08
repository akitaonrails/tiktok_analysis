package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370890lmJ implements IAVMobService {
    public static final C1370890lmJ LIZ = new C1370890lmJ();

    public static IAVMobService LIZ() {
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null) {
            return iExternalService.getAVMobService();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVMobService
    public final <T> T appendCreationParams(T t, Aweme aweme) {
        IAVMobService iAVMobServiceLIZ = LIZ();
        if (iAVMobServiceLIZ == null) {
            return t;
        }
        return (T) iAVMobServiceLIZ.appendCreationParams(t, aweme);
    }

    @Override // com.ss.android.ugc.aweme.services.IAVMobService
    public final <T> T appendValues(T t, Map<String, String> map) {
        IAVMobService iAVMobServiceLIZ = LIZ();
        if (iAVMobServiceLIZ == null) {
            return t;
        }
        return (T) iAVMobServiceLIZ.appendValues(t, map);
    }

    @Override // com.ss.android.ugc.aweme.services.IAVMobService
    public final void onEventV3(String str, Map<String, String> map) {
        IAVMobService iAVMobServiceLIZ = LIZ();
        if (iAVMobServiceLIZ != null) {
            iAVMobServiceLIZ.onEventV3(str, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAVMobService
    public final void onEventV3(String str, JSONObject jSONObject) {
        IAVMobService iAVMobServiceLIZ = LIZ();
        if (iAVMobServiceLIZ != null) {
            iAVMobServiceLIZ.onEventV3(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAVMobService
    public final <T> T appendDetailParams(T t, String str, Map<String, String> map) {
        IAVMobService iAVMobServiceLIZ = LIZ();
        if (iAVMobServiceLIZ == null) {
            return t;
        }
        return (T) iAVMobServiceLIZ.appendDetailParams(t, str, map);
    }
}
