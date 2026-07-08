package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QL7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QL7 implements InterfaceC680760Qn4 {
    public static final C0QL7 LIZ = new C0QL7();

    @Override // X.InterfaceC680760Qn4
    public final void LIZ(float f, float f2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "middle");
        AppLogNewUtils.onEventV3("search_saf_placeholder_click", jSONObject);
        C680370QmR.LIZIZ = new C0QL6(Float.valueOf(f).floatValue(), Float.valueOf(f2).floatValue());
    }
}
