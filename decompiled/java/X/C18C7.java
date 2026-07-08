package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18C7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18C7 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C18EK LLILZ;
    public final /* synthetic */ Object LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18C7(String str, String str2, String str3, C18EK c18ek, Object obj) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = c18ek;
        this.LLILZIL = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("resumed_btm_page", this.LL);
        jSONObject2.put("resumed_page", this.LLILLJJLI);
        Regex regex = C18C3.LIZ;
        jSONObject2.put("last_btm", C18C3.LJII(this.LLILLL));
        jSONObject2.put("finder", C18BA.LIZIZ(this.LLILZ.LJ));
        jSONObject2.put("enter_page", this.LLILZ.LIZ());
        jSONObject2.put("page_sate", this.LLILZIL);
        jSONObject2.put("btm", C18C3.LJII(this.LLILZ.LIZ));
        return Unit.LIZ;
    }
}
