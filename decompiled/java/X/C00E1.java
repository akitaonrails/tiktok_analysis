package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00E1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00E1 extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00E1(int i, int i2, JSONObject jSONObject) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorView: (width: ");
        sbLIZ.append(this.LL);
        sbLIZ.append("), (height: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("), (params: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
