package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18GF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GF extends C09AY implements Function2<JSONObject, String, Unit> {
    public final /* synthetic */ C18E9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18GF(C18E9 c18e9) {
        super(2);
        this.LL = c18e9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(JSONObject jSONObject, String str) throws JSONException {
        jSONObject.put("page_tree", this.LL.toString());
        return Unit.LIZ;
    }
}
