package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18C8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18C8 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ C18EK LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18C8(C18EK c18ek, String str) {
        super(1);
        this.LL = c18ek;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        Regex regex = C18C3.LIZ;
        jSONObject2.put("btm", C18C3.LJII(this.LL.LIZ));
        jSONObject2.put("page_name", this.LLILLJJLI);
        jSONObject2.put("finder", C18BA.LIZIZ(this.LL.LJ));
        return Unit.LIZ;
    }
}
