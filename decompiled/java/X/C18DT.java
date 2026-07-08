package X;

import com.bytedance.android.btm.api.PageProp;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18DT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DT extends C09AY implements Function0<Object> {
    public final /* synthetic */ PageProp LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18DT(PageProp pageProp, String str) {
        super(0);
        this.LL = pageProp;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        PageProp pageProp = this.LL;
        String str = this.LLILLJJLI;
        jSONObject.put("pageProp", pageProp);
        jSONObject.put("page", str);
        return jSONObject;
    }
}
