package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0A6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0A6Z extends C09AY implements Function0<Boolean> {
    public C0A6Z() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("enable_preload_minis_ads", true));
    }
}
