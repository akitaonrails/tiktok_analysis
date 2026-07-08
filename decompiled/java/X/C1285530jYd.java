package X;

import com.bytedance.amg.minigameruntime.nativebridge.api.MiniGameRuntimeBridge;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1285530jYd extends C2217421BqW implements Function2<JSONObject, Integer, JSONObject> {
    public C1285530jYd(Object obj) {
        super(2, obj, MiniGameRuntimeBridge.class, "emitEventToEffect", "emitEventToEffect(Lorg/json/JSONObject;Ljava/lang/Integer;)Lorg/json/JSONObject;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final JSONObject invoke(JSONObject jSONObject, Integer num) {
        return ((MiniGameRuntimeBridge) this.receiver).emitEventToEffect(jSONObject, num);
    }
}
