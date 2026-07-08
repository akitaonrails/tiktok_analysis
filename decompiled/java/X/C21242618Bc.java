package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21242618Bc extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21242618Bc(String str, Object obj, String str2, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = obj;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("type", this.LL);
        jSONObject2.put("page_state", this.LLILLJJLI);
        jSONObject2.put("resumed_btm_page", this.LLILLL);
        jSONObject2.put("resumed_page", this.LLILZ);
        return Unit.LIZ;
    }
}
