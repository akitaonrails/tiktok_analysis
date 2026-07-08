package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00wX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C241500wX extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C241500wX(int i, String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = i;
        this.LLILZLL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("enter_from", this.LL);
        jSONObject2.put("group_id", this.LLILLJJLI);
        jSONObject2.put("author_id", this.LLILLL);
        jSONObject2.put("to_user_id", this.LLILZ);
        jSONObject2.put("collab_status", this.LLILZIL);
        jSONObject2.put("user_type", this.LLILZLL);
        return Unit.LIZ;
    }
}
