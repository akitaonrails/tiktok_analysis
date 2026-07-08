package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21253418Fg extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C18E9 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21253418Fg(String str, C18E9 c18e9) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c18e9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        C18E9 c18e9 = this.LLILLJJLI;
        jSONObject.put("obj", str);
        jSONObject.put("pageTree", c18e9.toString());
        return jSONObject;
    }
}
