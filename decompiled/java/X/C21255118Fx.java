package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Fx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21255118Fx extends C09AY implements Function2<JSONObject, String, Unit> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21255118Fx(long j) {
        super(2);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(JSONObject jSONObject, String str) throws JSONException {
        jSONObject.put("pre_duration", this.LL);
        return Unit.LIZ;
    }
}
