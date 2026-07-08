package X;

import com.ss.android.ugc.aweme.experiment.LocationSlardarEventMonitorSettings;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0epb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103850epb {
    public static final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ);

    public static void LIZ(String str, JSONObject jSONObject) {
        C1185040gwY.LIZ.getClass();
        C1185040gwY.LIZJ(str, jSONObject, null);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_location_slardar_event_monitor", false) == 1 && ((Map) LocationSlardarEventMonitorSettings.LIZIZ.getValue()).containsKey(str)) {
            C23250099c.LIZLLL(LIZ, null, null, new C1103840epa(str, null, jSONObject), 3);
        }
    }
}
