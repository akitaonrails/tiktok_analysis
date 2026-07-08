package X;

import com.ss.android.common.applog.AppLog;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796060wq4 implements InterfaceC1796370wqZ {
    public InterfaceC1796300wqS LIZ = new InterfaceC1796300wqS() { // from class: X.0wqa
        @Override // X.InterfaceC1796300wqS
        public final void onEventV3(String str, JSONObject jSONObject) {
            AppLog.onEvent(null, "event_v3", str, null, 0L, 0L, jSONObject);
        }
    };

    @Override // X.InterfaceC1796300wqS
    public final void onEventV3(String str, JSONObject jSONObject) {
        this.LIZ.onEventV3(str, jSONObject);
    }
}
