package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uzx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790670Uzx extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C790670Uzx(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page", this.LL);
        return jSONObject;
    }
}
