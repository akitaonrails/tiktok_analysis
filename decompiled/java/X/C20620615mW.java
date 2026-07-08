package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15mW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20620615mW extends C2217421BqW implements Function2<String, JSONObject, Unit> {
    public C20620615mW(C0XHY c0xhy) {
        super(2, c0xhy, C0XHY.class, "reportEvent", "reportEvent(Ljava/lang/String;Lorg/json/JSONObject;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, JSONObject jSONObject) {
        this.receiver.getClass();
        C0XHY.LIZJ(str, jSONObject);
        return Unit.LIZ;
    }
}
