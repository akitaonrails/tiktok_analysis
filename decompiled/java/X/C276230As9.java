package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0As9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C276230As9 extends C09AY implements Function0<Boolean> {
    public C276230As9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("enable_popup_integration_long_term_solution", false));
    }
}
