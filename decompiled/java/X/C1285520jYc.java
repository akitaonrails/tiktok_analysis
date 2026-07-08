package X;

import com.bytedance.amg.minigameruntime.nativebridge.api.MiniGameRuntimeBridge;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1285520jYc extends C2217421BqW implements Function2<JSONObject, Integer, byte[]> {
    public C1285520jYc(Object obj) {
        super(2, obj, MiniGameRuntimeBridge.class, "readBinarySharedRaw", "readBinarySharedRaw(Lorg/json/JSONObject;Ljava/lang/Integer;)[B", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final byte[] invoke(JSONObject jSONObject, Integer num) {
        return ((MiniGameRuntimeBridge) this.receiver).readBinarySharedRaw(jSONObject, num);
    }
}
