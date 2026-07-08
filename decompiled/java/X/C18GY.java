package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18GY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GY extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ EnumC21251218Ek LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18GY(String str, EnumC21251218Ek enumC21251218Ek) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = enumC21251218Ek;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        EnumC21251218Ek enumC21251218Ek = this.LLILLJJLI;
        jSONObject.put("obj", str);
        jSONObject.put("pauseFuncOrigin", enumC21251218Ek);
        return jSONObject;
    }
}
