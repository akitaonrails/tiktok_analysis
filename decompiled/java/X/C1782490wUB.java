package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782490wUB extends C09AY implements Function0<Object> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1782490wUB(JSONObject jSONObject, JSONObject jSONObject2) {
        super(0);
        this.LL = jSONObject;
        this.LLILLJJLI = jSONObject2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("category: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(",\n extra: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
