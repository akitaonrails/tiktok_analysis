package X;

import android.content.Context;
import com.bytedance.geckox.settings.model.SettingsLocal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551490qTb {
    public static SettingsLocal LIZ(Context context) {
        C1551420qTU c1551420qTU = C1551440qTW.LIZ;
        c1551420qTU.LIZIZ(context);
        String string = c1551420qTU.LIZ.getString("gecko_settings_local", null);
        if (string == null) {
            return null;
        }
        try {
            return (SettingsLocal) C1551400qTS.LIZIZ.LIZ.LJII(string, SettingsLocal.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static void LIZIZ(Context context, SettingsLocal settingsLocal) {
        C1553130qWF.LIZ("gecko-debug-tag", "settings local cache stored", settingsLocal);
        C1551440qTW.LIZ.LIZJ(context, "gecko_settings_local", GsonProtectorUtils.toJson(C1551400qTS.LIZIZ.LIZ, settingsLocal));
    }
}
