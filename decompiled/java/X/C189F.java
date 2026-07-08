package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.189F, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189F extends C09AY implements Function1<JSONObject, Unit> {
    public C189F() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        jSONObject.putOpt("page_info_map_size", Integer.valueOf(C21248618Dk.LIZ.LJIIJ().size()));
        return Unit.LIZ;
    }
}
