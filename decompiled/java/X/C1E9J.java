package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sticker.api.settings.DmSaStickersSortingModel;

/* JADX INFO: renamed from: X.1E9J, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9J {
    public static final DmSaStickersSortingModel LIZ = new DmSaStickersSortingModel(C1697810uHb.LJIIJJI("blowingkiss", "fingerheart", "thumbsup", "handwave", "wave", "giggling", "beingcute", "amused", "lol", "ily", "inlove", "celebration", "goodmorning", "sleepy", "jk", "bashful", "angry", "shocked", "shock", "goodnight", "aww", "terrified", "sad", "bored", "hi", "idk", "wink", "neutral", "confused", "excited", "amazed", "brb", "sup", "newyear", "christmasgift", "merrychristmas"), C1697810uHb.LJIIJJI("amused", "lol", "thumbsup", "fingerheart", "blowingkiss", "sad", "shocked", "shock", "angry", "goodmorning", "bored", "celebration", "beingcute", "ily", "confused", "giggling", "excited", "inlove", "amazed", "terrified", "sleepy", "aww", "bashful", "idk", "wink", "goodnight", "jk", "handwave", "wave", "neutral", "sup", "brb", "hi", "newyear", "christmasgift", "merrychristmas"));

    public static final DmSaStickersSortingModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            DmSaStickersSortingModel dmSaStickersSortingModel = LIZ;
            DmSaStickersSortingModel dmSaStickersSortingModel2 = (DmSaStickersSortingModel) settingsManagerLIZLLL.LJIIIIZZ("dm_sa_stickers_order_config", DmSaStickersSortingModel.class, dmSaStickersSortingModel);
            return dmSaStickersSortingModel2 != null ? dmSaStickersSortingModel2 : dmSaStickersSortingModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }
}
