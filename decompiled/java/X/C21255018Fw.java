package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Fw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21255018Fw extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ EnumC21250718Ef LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21255018Fw(String str, EnumC21250718Ef enumC21250718Ef) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = enumC21250718Ef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        EnumC21250718Ef enumC21250718Ef = this.LLILLJJLI;
        jSONObject.put("fragment", str);
        jSONObject.put("resumeFuncOrigin", enumC21250718Ef);
        return jSONObject;
    }
}
