package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18R2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18R2 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18R2(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("jsb_name", "registerBtmPage");
        jSONObject2.put("btm", this.LL);
        return Unit.LIZ;
    }
}
