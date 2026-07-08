package X;

import android.os.Bundle;
import com.tiktok.ttf.applog.init.IAppLogLegacyParamHook;
import java.util.Map;
import kotlin.jvm.internal.AFwS221S0000000_31;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15Od, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20512115Od implements IAppLogLegacyParamHook {
    public static final C20512115Od LIZ = new C20512115Od();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(500));

    @Override // com.tiktok.ttf.applog.init.IAppLogLegacyParamHook
    public final void LIZ(Bundle bundle) {
        IAppLogLegacyParamHook iAppLogLegacyParamHook = (IAppLogLegacyParamHook) LIZIZ.getValue();
        if (iAppLogLegacyParamHook != null) {
            iAppLogLegacyParamHook.LIZ(bundle);
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogLegacyParamHook
    public final void LIZJ(Map<String, Object> map) {
        IAppLogLegacyParamHook iAppLogLegacyParamHook = (IAppLogLegacyParamHook) LIZIZ.getValue();
        if (iAppLogLegacyParamHook != null) {
            iAppLogLegacyParamHook.LIZJ(map);
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogLegacyParamHook
    public final JSONObject LIZIZ(String str, JSONObject jSONObject) {
        IAppLogLegacyParamHook iAppLogLegacyParamHook = (IAppLogLegacyParamHook) LIZIZ.getValue();
        if (iAppLogLegacyParamHook != null) {
            return iAppLogLegacyParamHook.LIZIZ(str, jSONObject);
        }
        return null;
    }
}
