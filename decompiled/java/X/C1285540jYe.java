package X;

import com.bytedance.amg.minigameruntime.nativebridge.api.MiniGameRuntimeBridge;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1285540jYe extends C2217421BqW implements Function2<JSONObject, Integer, JSONObject> {
    public C1285540jYe(Object obj) {
        super(2, obj, MiniGameRuntimeBridge.class, "pullCachedDataFromEffect", "pullCachedDataFromEffect(Lorg/json/JSONObject;Ljava/lang/Integer;)Lorg/json/JSONObject;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final JSONObject invoke(JSONObject jSONObject, Integer num) {
        return ((MiniGameRuntimeBridge) this.receiver).pullCachedDataFromEffect(jSONObject, num);
    }
}
