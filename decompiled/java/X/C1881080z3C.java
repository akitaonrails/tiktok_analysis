package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881080z3C extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ C1881040z38 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881080z3C(C1881040z38 c1881040z38) {
        super(1);
        this.LL = c1881040z38;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this.LL.LLJJI.invoke(jSONObject2);
        this.LL.LJIL(jSONObject2);
        return Unit.LIZ;
    }
}
