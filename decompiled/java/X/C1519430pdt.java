package X;

import android.app.Application;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0pdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519430pdt {
    public static final /* synthetic */ int LIZ = 0;

    public static SharedPreferences LIZ() {
        C1520380pfQ.LIZ.getClass();
        Application application = C1520380pfQ.LJIIJ;
        if (application != null) {
            return C810670Vr7.LIZJ(application, 4, "bd_hybrid_monitor_global_shared_preference");
        }
        return null;
    }

    public static final String LIZIZ() {
        String string;
        SharedPreferences sharedPreferencesLIZ = LIZ();
        return (sharedPreferencesLIZ == null || (string = sharedPreferencesLIZ.getString("monitor_setting_response", "")) == null) ? "" : string;
    }
}
