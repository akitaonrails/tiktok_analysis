package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.main.MainSAFLifecycleCheckSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19348410mo extends C09AY implements Function0<MainSAFLifecycleCheckSetting.MetaData> {
    public C19348410mo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final MainSAFLifecycleCheckSetting.MetaData invoke() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            MainSAFLifecycleCheckSetting.MetaData metaData = MainSAFLifecycleCheckSetting.LIZ;
            MainSAFLifecycleCheckSetting.MetaData metaData2 = (MainSAFLifecycleCheckSetting.MetaData) settingsManagerLIZLLL.LJIIIIZZ("enable_main_saf_lifecycle_check_crash", MainSAFLifecycleCheckSetting.MetaData.class, metaData);
            return metaData2 != null ? metaData2 : metaData;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return MainSAFLifecycleCheckSetting.LIZ;
        }
    }
}
