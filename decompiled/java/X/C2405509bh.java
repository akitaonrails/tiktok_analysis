package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2405509bh extends C09AY implements Function0<JSONObject> {
    public C2405509bh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C844470XAv.LIZ.getClass();
        jSONObject.put("host_aid", String.valueOf(C844470XAv.LJIIJ));
        jSONObject.put("channel", C844470XAv.LJIILL);
        jSONObject.put("app_version", C844470XAv.LJFF());
        jSONObject.put("version_code", String.valueOf(C844470XAv.LJ()));
        jSONObject.put("update_version_code", String.valueOf(C844470XAv.LIZLLL()));
        jSONObject.put("package_name", C844470XAv.LIZ().getPackageName());
        return jSONObject;
    }
}
