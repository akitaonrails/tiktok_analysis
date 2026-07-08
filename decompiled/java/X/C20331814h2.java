package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14h2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20331814h2 extends C09AY implements Function0<Object> {
    public final /* synthetic */ PageInfo LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20331814h2(PageInfo pageInfo, boolean z) {
        super(0);
        this.LL = pageInfo;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        C18DA c18da = C18DA.LIZ;
        PageInfo pageInfo = this.LL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isBack", this.LLILLJJLI);
        return C18DA.LIZJ(c18da, pageInfo, jSONObject);
    }
}
