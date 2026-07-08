package X;

import android.app.Activity;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC792000V5a implements C0V58, InterfaceC792030V5d, InterfaceC792700V7s, InterfaceC788120Uvq {
    public volatile JSONObject LL;

    @Override // X.InterfaceC788120Uvq
    public final void LIZIZ(long j) {
    }

    @Override // X.InterfaceC792700V7s
    public final void LIZLLL(Activity activity) {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIJ(Activity activity) {
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityStarted(Activity activity) {
    }

    @Override // X.InterfaceC792030V5d
    public final void LJFF(JSONObject jSONObject, boolean z) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("custom_event_settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optJSONObject("allow_log_type");
            jSONObjectOptJSONObject.optJSONObject("allow_metric_type");
            this.LL = jSONObjectOptJSONObject.optJSONObject("allow_service_name");
        }
    }
}
