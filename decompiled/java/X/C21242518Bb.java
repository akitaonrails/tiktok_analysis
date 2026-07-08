package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21242518Bb extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C21244318Bt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21242518Bb(String str, String str2, C21244318Bt c21244318Bt) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c21244318Bt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("ab1", this.LL);
        jSONObject2.put("ab2", this.LLILLJJLI);
        jSONObject2.put("btm", this.LLILLL.LIZ);
        return Unit.LIZ;
    }
}
