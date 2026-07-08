package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18CA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18CA extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ C18EK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18CA(C18EK c18ek) {
        super(1);
        this.LL = c18ek;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("enter_page", String.valueOf(this.LL.LIZIZ));
        Regex regex = C18C3.LIZ;
        jSONObject2.put("btm", C18C3.LJII(this.LL.LIZ));
        jSONObject2.put("finder", C18BA.LIZIZ(this.LL.LJ));
        return Unit.LIZ;
    }
}
