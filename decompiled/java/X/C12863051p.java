package X;

import com.ss.android.ugc.aweme.settingsrequest.ConfigCenterCenterBridgeImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.051p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12863051p implements IConfigCenterBridgeApi {
    public static final C12863051p LIZIZ = new C12863051p();
    public final /* synthetic */ IConfigCenterBridgeApi LIZ;

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final void LIZ(JSONObject jSONObject, Function1<? super String, Unit> function1, Function1<? super Exception, Unit> function12) {
        this.LIZ.LIZ(jSONObject, function1, function12);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final Map<String, Object> getSettings(List<String> list) {
        return this.LIZ.getSettings(list);
    }

    public C12863051p() {
        IConfigCenterBridgeApi iConfigCenterBridgeApi;
        Object objLIZ = C04TD.LIZ(IConfigCenterBridgeApi.class, false);
        if (objLIZ != null) {
            iConfigCenterBridgeApi = (IConfigCenterBridgeApi) objLIZ;
        } else {
            if (C04TD.W4 == null) {
                synchronized (IConfigCenterBridgeApi.class) {
                    if (C04TD.W4 == null) {
                        C04TD.W4 = new ConfigCenterCenterBridgeImpl();
                    }
                }
            }
            iConfigCenterBridgeApi = C04TD.W4;
        }
        this.LIZ = iConfigCenterBridgeApi;
    }
}
