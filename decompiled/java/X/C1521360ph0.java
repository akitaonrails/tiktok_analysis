package X;

import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ph0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521360ph0 extends C1521090pgZ {
    public long LJIIL;
    public String LJIILIIL;
    public final JSONObject LJIILJJIL;
    public final JSONObject LJIILL;

    public C1521360ph0() {
        super(0);
        this.LJIILIIL = "web";
        this.LJIILJJIL = new JSONObject();
        this.LJIILL = new JSONObject();
    }

    @Override // X.C1521090pgZ, X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        super.LIZ(jSONObject);
        C1520640pfq.LJIILIIL("js_dependency_version", "2.2.1", jSONObject);
        C1520640pfq.LJIILIIL("webview_type", this.LJIILIIL, jSONObject);
        C1520640pfq.LIZ(jSONObject, this.LJIILJJIL);
        C1520640pfq.LIZ(jSONObject, this.LJIILL);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("debug_context");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            C1520640pfq.LJIILJJIL(jSONObject, "debug_context", jSONObjectOptJSONObject);
        }
        C1520640pfq.LJIILIIL("is_ttweb_enable", String.valueOf(((WebViewMonitorHelper) WebViewMonitorHelper.getInstance()).isTTWebEnable()), jSONObjectOptJSONObject);
    }
}
