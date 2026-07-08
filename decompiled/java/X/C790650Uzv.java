package X;

import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uzv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790650Uzv extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Bundle LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C790650Uzv(String str, Bundle bundle) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        Bundle bundle = this.LLILLJJLI;
        jSONObject.put("page", str);
        jSONObject.put("outState", bundle);
        jSONObject.put("sdk_int", Build.VERSION.SDK_INT);
        return jSONObject;
    }
}
