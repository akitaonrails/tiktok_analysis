package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.offlinemode.experiment.OfflineModeExpandEntranceSettingsValue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ofv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625370Ofv extends C09AY implements Function0<OfflineModeExpandEntranceSettingsValue> {
    public C625370Ofv() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.offlinemode.experiment.OfflineModeExpandEntranceSettingsValue, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final OfflineModeExpandEntranceSettingsValue invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        OfflineModeExpandEntranceSettingsValue offlineModeExpandEntranceSettingsValue = C625360Ofu.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("offline_mode_expand_entrance_settings", OfflineModeExpandEntranceSettingsValue.class, offlineModeExpandEntranceSettingsValue);
        return LJIIIIZZ != 0 ? LJIIIIZZ : offlineModeExpandEntranceSettingsValue;
    }
}
