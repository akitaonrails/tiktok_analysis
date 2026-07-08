package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18GV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GV extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C18EW LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18GV(String str, C18EW c18ew) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c18ew;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("page_name", this.LL);
        jSONObject2.put("btm", this.LLILLJJLI.LIZIZ);
        return Unit.LIZ;
    }
}
