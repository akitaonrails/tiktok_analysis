package X;

import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18G8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18G8 extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PageProp LLILLJJLI;
    public final /* synthetic */ PageInfoStack LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18G8(String str, PageProp pageProp, PageInfoStack pageInfoStack) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = pageProp;
        this.LLILLL = pageInfoStack;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        PageProp pageProp = this.LLILLJJLI;
        PageInfoStack pageInfoStack = this.LLILLL;
        jSONObject.put("page", str);
        jSONObject.put("prop", pageProp.toString());
        jSONObject.put("savedInfoStack", String.valueOf(pageInfoStack));
        return jSONObject;
    }
}
