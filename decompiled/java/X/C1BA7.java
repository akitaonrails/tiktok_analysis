package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.common.experiment.TTDmNudgeConfigNudgeSticker;
import com.ss.android.ugc.aweme.im.common.experiment.TtDmNudgeConfigModel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BA7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BA7 {
    public static final Emoji LIZ;

    static {
        Emoji emoji = new Emoji();
        TtDmNudgeConfigModel ttDmNudgeConfigModel = C1BA8.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TtDmNudgeConfigModel ttDmNudgeConfigModel2 = C1BA8.LIZ;
        TtDmNudgeConfigModel ttDmNudgeConfigModel3 = (TtDmNudgeConfigModel) settingsManagerLIZLLL.LJIIIIZZ("tt_dm_nudge_config", TtDmNudgeConfigModel.class, ttDmNudgeConfigModel2);
        if (ttDmNudgeConfigModel3 != null) {
            ttDmNudgeConfigModel2 = ttDmNudgeConfigModel3;
        }
        TTDmNudgeConfigNudgeSticker tTDmNudgeConfigNudgeSticker = ttDmNudgeConfigModel2.nudge_sticker;
        emoji.setAnimateType(tTDmNudgeConfigNudgeSticker.animate_type);
        emoji.setStaticType(tTDmNudgeConfigNudgeSticker.static_type);
        emoji.setDisplayName(tTDmNudgeConfigNudgeSticker.display_name);
        emoji.setId(tTDmNudgeConfigNudgeSticker.id);
        emoji.setWidth(tTDmNudgeConfigNudgeSticker.width);
        emoji.setHeight(tTDmNudgeConfigNudgeSticker.height);
        emoji.setStaticUrl(C626590Oht.LIZ(emoji.getWidth(), emoji.getHeight(), tTDmNudgeConfigNudgeSticker.static_url));
        emoji.setAnimateUrl(C626590Oht.LIZ(emoji.getWidth(), emoji.getHeight(), tTDmNudgeConfigNudgeSticker.animate_url));
        Map<String, String> map = tTDmNudgeConfigNudgeSticker.display_name_lang;
        HashMap<String, String> map2 = new HashMap<>();
        map2.putAll(map);
        emoji.setDisplayNameLangs(map2);
        LIZ = emoji;
    }
}
