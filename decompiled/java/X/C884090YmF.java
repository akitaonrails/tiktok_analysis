package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.experiment.DMSessionLoadConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884090YmF extends C09AY implements Function0<DMSessionLoadConfig> {
    public C884090YmF() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final DMSessionLoadConfig invoke() {
        DMSessionLoadConfig dMSessionLoadConfig;
        try {
            DMSessionLoadConfig dMSessionLoadConfig2 = (DMSessionLoadConfig) SettingsManager.LIZLLL().LJIIIIZZ("tt_im_session_load_config", DMSessionLoadConfig.class, C884080YmE.LIZ);
            C189200o6.m2constructorimpl(dMSessionLoadConfig2);
            dMSessionLoadConfig = dMSessionLoadConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            dMSessionLoadConfig = c098200Yq;
        }
        return (C189200o6.m7isFailureimpl(dMSessionLoadConfig) || dMSessionLoadConfig == 0) ? C884080YmE.LIZ : dMSessionLoadConfig;
    }
}
