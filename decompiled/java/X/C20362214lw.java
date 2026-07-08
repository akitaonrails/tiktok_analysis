package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20362214lw extends C09AY implements Function0<Object> {
    public final /* synthetic */ BufferBtm LL;
    public final /* synthetic */ C259800zU<PageInfo> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20362214lw(BufferBtm bufferBtm, C259800zU<PageInfo> c259800zU) {
        super(0);
        this.LL = bufferBtm;
        this.LLILLJJLI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        BufferBtm bufferBtm = this.LL;
        C259800zU<PageInfo> c259800zU = this.LLILLJJLI;
        jSONObject.put("bufferBtm", bufferBtm);
        jSONObject.put("resumedPageInfo", c259800zU.element);
        return jSONObject;
    }
}
