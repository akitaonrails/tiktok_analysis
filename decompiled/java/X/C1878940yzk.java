package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878940yzk extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1878940yzk(String str, String str2, int i, String str3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        int i = this.LLILLL;
        String str3 = this.LLILZ;
        jSONObject.put("page", str);
        jSONObject.put("sourceBtm", str2);
        jSONObject.put("step", i);
        jSONObject.put("sourcePageId", str3);
        return jSONObject;
    }
}
