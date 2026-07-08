package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18R4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18R4 extends C09AY implements Function1<JSONObject, Unit> {
    public C18R4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        jSONObject.put("jsb_name", "setBcmPageParamsV2");
        return Unit.LIZ;
    }
}
