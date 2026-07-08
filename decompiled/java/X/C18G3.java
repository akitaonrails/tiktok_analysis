package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18G3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18G3 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18G3(String str, String str2, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("activity_class_name", this.LL);
        jSONObject2.put("btm_page", this.LLILLJJLI);
        jSONObject2.put("btm_pre", this.LLILLL);
        jSONObject2.put("type", this.LLILZ);
        return Unit.LIZ;
    }
}
