package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.minis.ads.MinisIaaConfigModel;

/* JADX INFO: renamed from: X.1AxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196121AxG {
    public static final MinisIaaConfigModel LIZ = new MinisIaaConfigModel(30, 1, 10);

    public static final MinisIaaConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MinisIaaConfigModel minisIaaConfigModel = LIZ;
        MinisIaaConfigModel minisIaaConfigModel2 = (MinisIaaConfigModel) settingsManagerLIZLLL.LJIIIIZZ("minis_iaa_config", MinisIaaConfigModel.class, minisIaaConfigModel);
        return minisIaaConfigModel2 != null ? minisIaaConfigModel2 : minisIaaConfigModel;
    }
}
