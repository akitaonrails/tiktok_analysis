package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21254018Fm extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C18E9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21254018Fm(String str, boolean z, boolean z2, C18E9 c18e9) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c18e9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        C18E9 c18e9 = this.LLILZ;
        jSONObject.put("activity", str);
        jSONObject.put("isPage", z);
        jSONObject.put("isContainer", z2);
        return jSONObject.put("tree", c18e9.toString());
    }
}
