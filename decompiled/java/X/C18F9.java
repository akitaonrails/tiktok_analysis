package X;

import com.bytedance.android.btm.api.PageProp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18F9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18F9 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ PageProp LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18F9(PageProp pageProp, String str, String str2, String str3) {
        super(1);
        this.LL = pageProp;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        Regex regex = C18C3.LIZ;
        jSONObject2.put("btm_pre_from_token", C18C3.LJII(this.LL.getSourceBtmToken()));
        jSONObject2.put("class_name_1", this.LLILLJJLI);
        jSONObject2.put("page_btm_1", this.LLILLL);
        jSONObject2.put("class_name_2", this.LLILZ);
        jSONObject2.put("page_btm_2", this.LL.getBtm());
        return Unit.LIZ;
    }
}
