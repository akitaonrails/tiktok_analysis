package X;

import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18BF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BF extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PageInfoStack LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18BF(String str, PageInfoStack pageInfoStack) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = pageInfoStack;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        PageInfoStack pageInfoStack = this.LLILLJJLI;
        jSONObject.put("page", str);
        jSONObject.put("infoStack", pageInfoStack);
        return jSONObject;
    }
}
