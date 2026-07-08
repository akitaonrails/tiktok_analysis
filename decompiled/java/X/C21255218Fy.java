package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21255218Fy extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ JSONArray LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21255218Fy(JSONArray jSONArray) {
        super(1);
        this.LL = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        jSONObject.put("unknown_pages", this.LL.toString());
        return Unit.LIZ;
    }
}
