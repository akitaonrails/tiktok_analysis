package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21253718Fj extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ JSONArray LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21253718Fj(int i, JSONArray jSONArray, long j) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = jSONArray;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        String string;
        int i;
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("from_unknown", this.LL);
        JSONArray jSONArray = this.LLILLJJLI;
        if (jSONArray != null) {
            string = jSONArray.toString();
        } else {
            string = null;
        }
        jSONObject2.put("unknown_pages", string);
        if (this.LLILLL < 500) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject2.put("pre_duration_short", i);
        return Unit.LIZ;
    }
}
