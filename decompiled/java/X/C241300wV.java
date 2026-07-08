package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00wV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C241300wV extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C241300wV(String str, String str2, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("enter_from", this.LL);
        jSONObject2.put("action_type", this.LLILLJJLI);
        if (Intrinsics.LJFF(this.LLILLJJLI, "click")) {
            jSONObject2.put("click_type", this.LLILLL);
        }
        return Unit.LIZ;
    }
}
