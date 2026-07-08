package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20331214gw extends C09AY implements Function0<Object> {
    public final /* synthetic */ JSONObject LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20331214gw(JSONObject jSONObject) {
        super(0);
        this.LL = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save pageInfo：");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
