package X;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817690W5v extends AbstractC818190W7t {
    public final Locale LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC818190W7t
    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", this.LIZIZ);
        jSONObject.put("event", "resource_event");
        jSONObject.put("message", this.LIZJ);
        jSONObject.put("locale", this.LIZ);
        return jSONObject;
    }

    @Override // X.AbstractC818190W7t
    public final EnumC818210W7v LIZIZ() {
        return EnumC818210W7v.ResourceIdMonitor;
    }

    public C817690W5v(Locale locale, int i, String str) {
        this.LIZ = locale;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
