package X;

import android.os.Bundle;
import com.bytedance.android.btm.api.PageProp;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FQ extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ PageProp LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FQ(String str, Bundle bundle, PageProp pageProp) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = bundle;
        this.LLILLL = pageProp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        Bundle bundle = this.LLILLJJLI;
        PageProp pageProp = this.LLILLL;
        jSONObject.put("fragment", str);
        jSONObject.put("savedInstanceState", String.valueOf(bundle));
        jSONObject.put("pageProp", pageProp);
        return jSONObject;
    }
}
