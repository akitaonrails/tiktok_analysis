package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465370IMt extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C465370IMt(String str, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("activity_class_name", this.LL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("size=");
        sbLIZ.append(this.LLILLJJLI);
        jSONObject2.put("type", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
