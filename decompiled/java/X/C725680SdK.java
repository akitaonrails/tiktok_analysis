package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725680SdK extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725680SdK(String str, long j) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("account_type", this.LL);
        if (this.LLILLJJLI >= 3000) {
            jSONObject2.put("action_type", "auto_dismiss");
        } else {
            jSONObject2.put("action_type", "manual_dismiss");
        }
        return Unit.LIZ;
    }
}
