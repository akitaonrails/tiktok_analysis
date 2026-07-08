package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.lightinteract.impl.exp.LightInteractionBirthdayDebugSettingsData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZMO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZMO extends C09AY implements Function0<LightInteractionBirthdayDebugSettingsData> {
    public C0ZMO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.lightinteract.impl.exp.LightInteractionBirthdayDebugSettingsData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LightInteractionBirthdayDebugSettingsData invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        LightInteractionBirthdayDebugSettingsData lightInteractionBirthdayDebugSettingsData = C0ZMN.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("light_interaction_birthday_debug_settings", LightInteractionBirthdayDebugSettingsData.class, lightInteractionBirthdayDebugSettingsData);
        return LJIIIIZZ != 0 ? LJIIIIZZ : lightInteractionBirthdayDebugSettingsData;
    }
}
