package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10rJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19376310rJ extends C09AY implements Function1<JSONObject, Unit> {
    public C19376310rJ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        jSONObject.put("type", "createBtmIdBeforeEnterPage");
        return Unit.LIZ;
    }
}
