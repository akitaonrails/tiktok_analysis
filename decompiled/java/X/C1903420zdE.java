package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.cache.Configuration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903420zdE extends C09AY implements Function0<Configuration> {
    public C1903420zdE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Configuration invoke() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            Configuration configuration = C1903410zdD.LIZ;
            Configuration configuration2 = (Configuration) settingsManagerLIZLLL.LJIIIIZZ("inbox_preload_setting", Configuration.class, configuration);
            return configuration2 != null ? configuration2 : configuration;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C1903410zdD.LIZ;
        }
    }
}
