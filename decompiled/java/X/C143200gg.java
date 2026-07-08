package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C143200gg extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C143200gg(int i, String str) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.putOpt("error_code", String.valueOf(this.LL));
        jSONObject2.putOpt("error_msg", this.LLILLJJLI);
        return Unit.LIZ;
    }
}
