package X;

import com.bytedance.android.btm.api.PageProp;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21252018Es extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ PageProp LL;
    public final /* synthetic */ Pair<String, String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21252018Es(PageProp pageProp, Pair<String, String> pair, String str) {
        super(1);
        this.LL = pageProp;
        this.LLILLJJLI = pair;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        Regex regex = C18C3.LIZ;
        jSONObject2.put("btm_pre_from_token", C18C3.LJII(this.LL.getSourceBtmToken()));
        jSONObject2.put("class_name_1", this.LLILLJJLI.getFirst());
        jSONObject2.put("page_btm_1", this.LLILLJJLI.getSecond());
        jSONObject2.put("class_name_2", this.LLILLL);
        jSONObject2.put("page_btm_2", this.LL.getBtm());
        return Unit.LIZ;
    }
}
