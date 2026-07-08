package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18DX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DX extends C09AY implements Function1<JSONObject, Unit> {
    public C18DX() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        C21250518Ed.LJ.getClass();
        jSONObject.put("is_process_recovery", C21250518Ed.LJIIJJI());
        return Unit.LIZ;
    }
}
