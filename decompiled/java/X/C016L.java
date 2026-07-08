package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.016L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016L extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL = "invite_collab_page";
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C016L(String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("enter_from", this.LL);
        jSONObject2.put("previous_page", this.LLILLJJLI);
        jSONObject2.put("click_type", this.LLILLL);
        jSONObject2.put("user_type", this.LLILZ);
        jSONObject2.put("to_user_id", this.LLILZIL);
        String str = this.LLILZLL;
        if (str != null) {
            jSONObject2.put("search_keyword", str);
        }
        return Unit.LIZ;
    }
}
