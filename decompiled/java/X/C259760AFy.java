package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0AFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C259760AFy extends C09AY implements Function0<Boolean> {
    public C259760AFy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("i18n_language_report", true));
    }
}
