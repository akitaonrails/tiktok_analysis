package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.verify.PipoVerifyHybridJsbEventConfigModel;

/* JADX INFO: renamed from: X.04xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1269004xs {
    public static final PipoVerifyHybridJsbEventConfigModel LIZ = new PipoVerifyHybridJsbEventConfigModel(false, false, null, 7, null);

    public static final PipoVerifyHybridJsbEventConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoVerifyHybridJsbEventConfigModel pipoVerifyHybridJsbEventConfigModel = LIZ;
        PipoVerifyHybridJsbEventConfigModel pipoVerifyHybridJsbEventConfigModel2 = (PipoVerifyHybridJsbEventConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_verify_hybrid_jsb_event_config", PipoVerifyHybridJsbEventConfigModel.class, pipoVerifyHybridJsbEventConfigModel);
        return pipoVerifyHybridJsbEventConfigModel2 != null ? pipoVerifyHybridJsbEventConfigModel2 : pipoVerifyHybridJsbEventConfigModel;
    }
}
