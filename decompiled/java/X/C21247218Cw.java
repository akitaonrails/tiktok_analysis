package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21247218Cw extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ PageInfo LL;
    public final /* synthetic */ BufferBtm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21247218Cw(BufferBtm bufferBtm, PageInfo pageInfo) {
        super(1);
        this.LL = pageInfo;
        this.LLILLJJLI = bufferBtm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        Regex regex = C18C3.LIZ;
        jSONObject2.put("btm_pre_from_token", C18C3.LJII(this.LL.getBtmPre()));
        jSONObject2.put("btm_pre_from_life_circle", C18C3.LJII(this.LLILLJJLI.getBtm()));
        return Unit.LIZ;
    }
}
