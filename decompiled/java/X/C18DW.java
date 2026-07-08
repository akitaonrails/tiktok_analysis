package X;

import com.bytedance.android.btm.impl.ShowIdUpdateReason;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18DW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DW extends C09AY implements Function0<Object> {
    public final /* synthetic */ PageInfo LL;
    public final /* synthetic */ ShowIdUpdateReason LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18DW(PageInfo pageInfo, ShowIdUpdateReason showIdUpdateReason) {
        super(0);
        this.LL = pageInfo;
        this.LLILLJJLI = showIdUpdateReason;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        PageInfo pageInfo = this.LL;
        ShowIdUpdateReason showIdUpdateReason = this.LLILLJJLI;
        jSONObject.put("pageInfo", pageInfo);
        jSONObject.put("updateReason", showIdUpdateReason);
        return jSONObject;
    }
}
