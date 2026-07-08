package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vUF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744090vUF extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744090vUF(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C957403oi c957403oi) throws JSONException {
        C957403oi c957403oi2 = c957403oi;
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("log_id", str);
        String str3 = this.LLILLJJLI;
        if (str3 == null) {
            str3 = "";
        }
        c957403oi2.LIZLLL("origin_code", str3);
        String str4 = this.LLILLL;
        if (str4 == null) {
            str4 = "";
        }
        c957403oi2.LIZLLL("origin_msg", str4);
        c957403oi2.LIZLLL("ts", this.LLILZ);
        c957403oi2.LIZLLL("path", "");
        c957403oi2.LIZLLL("method", "");
        c957403oi2.LIZLLL("line", "");
        JSONObject jSONObject = new JSONObject();
        String str5 = this.LLILZIL;
        Boolean bool = this.LLILZLL;
        jSONObject.put("client_type", "android");
        jSONObject.put("biz", "ecommerce");
        jSONObject.put("domain", "payin");
        jSONObject.put("page", "order_submit");
        if (str5 != null) {
            str2 = str5;
        }
        jSONObject.put("starling_key", str2);
        if (bool != null) {
            jSONObject.put("is_fallback", C893803eS.LIZ(bool.booleanValue()));
        }
        c957403oi2.LIZLLL("extra", C786410Ut5.J3(jSONObject));
        return Unit.LIZ;
    }
}
