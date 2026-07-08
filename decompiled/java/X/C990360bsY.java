package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.choosemusic.settings.CMLTipsConfig;

/* JADX INFO: renamed from: X.0bsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990360bsY {
    public static final CMLTipsConfig LIZ = new CMLTipsConfig("", "");

    public static CMLTipsConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CMLTipsConfig cMLTipsConfig = LIZ;
        CMLTipsConfig cMLTipsConfig2 = (CMLTipsConfig) settingsManagerLIZLLL.LJIIIIZZ("cml_tips_config", CMLTipsConfig.class, cMLTipsConfig);
        return cMLTipsConfig2 != null ? cMLTipsConfig2 : cMLTipsConfig;
    }
}
