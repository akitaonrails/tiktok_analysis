package X;

import android.util.Log;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0uZC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708720uZC {
    public final ThreadLocal<String> LIZ = new ThreadLocal<>();

    public final void LIZ(int i, Object obj) {
        String strLIZIZ;
        String strValueOf;
        String str = this.LIZ.get();
        if (str != null) {
            this.LIZ.remove();
        } else {
            str = "";
        }
        if (str.length() == 0) {
            strLIZIZ = "PIPO";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PIPO_");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (obj instanceof Throwable) {
            strValueOf = Log.getStackTraceString((Throwable) obj);
        } else if (obj instanceof String) {
            strValueOf = (String) obj;
        } else {
            strValueOf = String.valueOf(obj);
        }
        C1717770unn.LIZJ().isDebug();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("pipo_common_log", 2) > 0) {
            C1717770unn.LIZJ().isDebug();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("pipo_common_log", 2) >= 2 && i >= 4) {
                C1717770unn.LJIIIZ().LJIIJ(i, strLIZIZ, strValueOf);
            }
        }
    }
}
