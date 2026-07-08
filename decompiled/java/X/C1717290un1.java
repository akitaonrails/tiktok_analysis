package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.ttpay.ab.TtpayConfigModel;

/* JADX INFO: renamed from: X.0un1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717290un1 {
    public static final TtpayConfigModel LIZ = new TtpayConfigModel(null, null, null, null, null, null, null, 127, null);

    public static final TtpayConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TtpayConfigModel ttpayConfigModel = LIZ;
        TtpayConfigModel ttpayConfigModel2 = (TtpayConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ttpay_config", TtpayConfigModel.class, ttpayConfigModel);
        return ttpayConfigModel2 != null ? ttpayConfigModel2 : ttpayConfigModel;
    }
}
