package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.exp.FrequencyDisableSettingsData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054A extends C09AY implements Function0<FrequencyDisableSettingsData> {
    public C054A() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final FrequencyDisableSettingsData invoke() {
        FrequencyDisableSettingsData frequencyDisableSettingsData;
        try {
            FrequencyDisableSettingsData frequencyDisableSettingsData2 = (FrequencyDisableSettingsData) SettingsManager.LIZLLL().LJIIIIZZ("frequency_control_disable_settings", FrequencyDisableSettingsData.class, AnonymousClass0549.LIZ);
            C189200o6.m2constructorimpl(frequencyDisableSettingsData2);
            frequencyDisableSettingsData = frequencyDisableSettingsData2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            frequencyDisableSettingsData = c098200Yq;
        }
        return (C189200o6.m7isFailureimpl(frequencyDisableSettingsData) || frequencyDisableSettingsData == 0) ? AnonymousClass0549.LIZ : frequencyDisableSettingsData;
    }
}
