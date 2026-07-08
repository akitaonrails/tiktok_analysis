package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21251018Ei extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<C18E9> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21251018Ei(String str, boolean z, boolean z2, C259800zU<C18E9> c259800zU) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        C259800zU<C18E9> c259800zU = this.LLILZ;
        jSONObject.put("fragment", str);
        jSONObject.put("isPage", z);
        jSONObject.put("isContainer", z2);
        return jSONObject.put("tree", c259800zU.element.toString());
    }
}
