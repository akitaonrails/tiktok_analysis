package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0AQ2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0AQ2 extends C09AY implements Function0<Boolean> {
    public C0AQ2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("poi_card_view_enable_config", true));
    }
}
