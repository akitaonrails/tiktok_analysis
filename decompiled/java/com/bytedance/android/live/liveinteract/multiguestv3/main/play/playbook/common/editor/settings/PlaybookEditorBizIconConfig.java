package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "playbook_editor_icon_setting")
public final class PlaybookEditorBizIconConfig {
    public static final int $stable;
    public static final IconConfig DEFAULT;
    public static final PlaybookEditorBizIconConfig INSTANCE = new PlaybookEditorBizIconConfig();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("default", "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/playbook_match_cover_icon_1.png~tplv-0gv1ynv35u-image.image");
        DEFAULT = new IconConfig(linkedHashMap);
        $stable = 8;
    }

    public final IconConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        IconConfig iconConfig = DEFAULT;
        IconConfig iconConfig2 = (IconConfig) settingsManager.getValueSafely("playbook_editor_icon_setting", iconConfig);
        return iconConfig2 != null ? iconConfig2 : iconConfig;
    }

    public final String toUrl(String str) {
        Map<String, String> map = getValue().iconNameToUrlMap;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
