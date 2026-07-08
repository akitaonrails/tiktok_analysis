package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.setting.DMStickerStoreConfig;

/* JADX INFO: renamed from: X.0Hlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450770Hlz {
    public static final DMStickerStoreConfig LIZ = new DMStickerStoreConfig(true, 0, true);

    public static DMStickerStoreConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        DMStickerStoreConfig dMStickerStoreConfig = LIZ;
        DMStickerStoreConfig dMStickerStoreConfig2 = (DMStickerStoreConfig) settingsManagerLIZLLL.LJIIIIZZ("dm_sticker_store_config", DMStickerStoreConfig.class, dMStickerStoreConfig);
        return dMStickerStoreConfig2 != null ? dMStickerStoreConfig2 : dMStickerStoreConfig;
    }
}
