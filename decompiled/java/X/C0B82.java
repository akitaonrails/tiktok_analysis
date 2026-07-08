package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0B82, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0B82 extends C09AY implements Function0<Boolean> {
    public C0B82() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("enable_fix_legacy_component_priority_maker_mob", true));
    }
}
