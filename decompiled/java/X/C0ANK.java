package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ANK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0ANK extends C09AY implements Function0<Boolean> {
    public C0ANK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("remove_useless_monitor_logic", true));
    }
}
