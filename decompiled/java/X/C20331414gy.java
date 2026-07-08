package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20331414gy extends C09AY implements Function0<Object> {
    public final /* synthetic */ PageInfo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20331414gy(PageInfo pageInfo, String str, String str2) {
        super(0);
        this.LL = pageInfo;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        C18DA c18da = C18DA.LIZ;
        PageInfo pageInfo = this.LL;
        JSONObject jSONObject = new JSONObject();
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        jSONObject.put("preBtm", str);
        jSONObject.put("ppreBtm", str2);
        return C18DA.LIZJ(c18da, pageInfo, jSONObject);
    }
}
