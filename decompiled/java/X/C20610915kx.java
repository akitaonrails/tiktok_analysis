package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20610915kx extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ C20611915l7 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20610915kx(C20611915l7 c20611915l7, String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LL = c20611915l7;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("search_keyword", this.LL.LJIIL.LIZLLL);
        jSONObject2.put("log_pb", C584850Mwl.LIZ.LJFF(this.LL.LIZ));
        jSONObject2.put("to_user_id", this.LL.LIZ);
        jSONObject2.put("relation_tag", this.LL.LIZIZ);
        jSONObject2.put("enter_from", this.LLILLJJLI);
        jSONObject2.put("position", this.LLILLL);
        String str = this.LLILZ;
        if (str != null) {
            jSONObject2.put("shoot_way", str);
        }
        String str2 = this.LLILZIL;
        if (str2 != null) {
            jSONObject2.put("content_source", str2);
        }
        String str3 = this.LLILZLL;
        if (str3 != null) {
            jSONObject2.put("content_type", str3);
        }
        return Unit.LIZ;
    }
}
