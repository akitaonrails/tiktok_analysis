package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1909507dt extends C09AY implements Function1<JSONObject, Unit> {
    public C1909507dt() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        jSONObject.put("type", "onPagePaused_resumedPage");
        return Unit.LIZ;
    }
}
