package X;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillPipoFillInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dtr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068050dtr extends C09AY implements Function2<AdAutofillPipoFillInfo, Integer, Unit> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ WebView LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068050dtr(JSONObject jSONObject, WebView webView, Integer num, boolean z, String str, List<String> list, String str2) {
        super(2);
        this.LL = jSONObject;
        this.LLILLJJLI = webView;
        this.LLILLL = num;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = list;
        this.LLIZ = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AdAutofillPipoFillInfo adAutofillPipoFillInfo, Integer num) throws JSONException {
        Object obj;
        AdAutofillPipoFillInfo adAutofillPipoFillInfo2 = adAutofillPipoFillInfo;
        int iIntValue = num.intValue();
        this.LL.remove("cardNumber");
        this.LL.remove("instrumentId");
        this.LL.remove("pipoUserId");
        JSONObject jSONObject = this.LL;
        if (adAutofillPipoFillInfo2 != null) {
            obj = adAutofillPipoFillInfo2.cardNumber;
        } else {
            obj = null;
        }
        jSONObject.put("cardNumber", obj);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "iab_support_cardholder_name", true, false)) {
            this.LL.put("fillInfo", new JSONObject(C08JS.LIZLLL(adAutofillPipoFillInfo2)));
        }
        this.LL.put("isSuccess", iIntValue);
        C1067990dtl c1067990dtl = C1067990dtl.LIZ;
        WebView webView = this.LLILLJJLI;
        Integer num2 = this.LLILLL;
        JSONObject jSONObject2 = this.LL;
        boolean z = this.LLILZ;
        String str = this.LLILZIL;
        List<String> list = this.LLILZLL;
        String str2 = this.LLIZ;
        c1067990dtl.getClass();
        C1067990dtl.LJJIIZI(webView, num2, jSONObject2, z ? 1 : 0, 0, str, list, str2);
        return Unit.LIZ;
    }
}
