package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.IABRecordingSettingsModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042270dEH extends C09AY implements Function0<IABRecordingSettingsModel> {
    public C1042270dEH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.settings.IABRecordingSettingsModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IABRecordingSettingsModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        IABRecordingSettingsModel iABRecordingSettingsModel = C1042260dEG.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("iab_recording_settings", IABRecordingSettingsModel.class, iABRecordingSettingsModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : iABRecordingSettingsModel;
    }
}
