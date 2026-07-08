package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18C9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18C9 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ C18EK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18C9(C18EK c18ek) {
        super(1);
        this.LL = c18ek;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        Regex regex = C18C3.LIZ;
        jSONObject2.put("btm", C18C3.LJII(this.LL.LIZ));
        jSONObject2.put("finder", C18BA.LIZIZ(this.LL.LJ));
        return Unit.LIZ;
    }
}
