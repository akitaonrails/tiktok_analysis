package X;

import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304240k2o implements InterfaceC1177504j7 {
    public final IMiniGameRuntimeAPI LIZ;

    public C1304240k2o(IMiniGameRuntimeAPI iMiniGameRuntimeAPI) {
        this.LIZ = iMiniGameRuntimeAPI;
    }

    @Override // X.InterfaceC1177504j7
    public final void LIZ(String str, Number number, JSONObject jSONObject) {
        this.LIZ.postJSAPIResponse(number, jSONObject);
    }

    @Override // X.InterfaceC1177504j7
    public final void registerJSAPI(String str, Function2<? super JSONObject, ? super Integer, ? extends JSONObject> function2, Object obj) {
        this.LIZ.registerJSAPI(str, function2, obj);
    }
}
