package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.exp.FrequencyDestroySettingsData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.057S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C057S extends C09AY implements Function0<FrequencyDestroySettingsData> {
    public C057S() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final FrequencyDestroySettingsData invoke() {
        FrequencyDestroySettingsData frequencyDestroySettingsData;
        try {
            FrequencyDestroySettingsData frequencyDestroySettingsData2 = (FrequencyDestroySettingsData) SettingsManager.LIZLLL().LJIIIIZZ("frequency_control_destroy_settings", FrequencyDestroySettingsData.class, C057R.LIZ);
            C189200o6.m2constructorimpl(frequencyDestroySettingsData2);
            frequencyDestroySettingsData = frequencyDestroySettingsData2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            frequencyDestroySettingsData = c098200Yq;
        }
        return (C189200o6.m7isFailureimpl(frequencyDestroySettingsData) || frequencyDestroySettingsData == 0) ? C057R.LIZ : frequencyDestroySettingsData;
    }
}
