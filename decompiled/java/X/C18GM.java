package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18GM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GM extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ EnumC21251218Ek LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18GM(String str, EnumC21251218Ek enumC21251218Ek, boolean z, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = enumC21251218Ek;
        this.LLILLL = z;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        EnumC21251218Ek enumC21251218Ek = this.LLILLJJLI;
        boolean z = this.LLILLL;
        String str2 = this.LLILZ;
        jSONObject.put("page", str);
        jSONObject.put("pauseFuncOrigin", enumC21251218Ek);
        jSONObject.put("isForward", z);
        jSONObject.put("pausedInfo", str2);
        return jSONObject;
    }
}
