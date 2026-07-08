package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creatortools.tiktokseries.SeriesSetting;

/* JADX INFO: renamed from: X.0C1P, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C1P {
    public static SeriesSetting LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return (SeriesSetting) SettingsManager.LJII("creator_tools_series_settings", SeriesSetting.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
