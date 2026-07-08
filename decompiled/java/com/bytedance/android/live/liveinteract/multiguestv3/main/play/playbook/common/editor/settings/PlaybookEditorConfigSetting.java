package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import X.AbstractC19994813Le;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_playbook_editor_config")
public final class PlaybookEditorConfigSetting {
    public static final PlaybookEditorConfigSetting INSTANCE = new PlaybookEditorConfigSetting();
    public static final PlaybookEditorConfig DEFAULT = new PlaybookEditorConfig(null, null, 0, 7, null);
    public static final int $stable = 8;

    public final PlaybookEditorConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PlaybookEditorConfig playbookEditorConfig = DEFAULT;
        PlaybookEditorConfig playbookEditorConfig2 = (PlaybookEditorConfig) settingsManager.getValueSafely("linkmic_playbook_editor_config", playbookEditorConfig);
        return playbookEditorConfig2 != null ? playbookEditorConfig2 : playbookEditorConfig;
    }

    public final Pair<String, String> generateCoverPair() {
        int iNextInt = AbstractC19994813Le.Default.nextInt(0, Math.min(getSettingValue().defaultCoverUrl.size(), getSettingValue().defaultCoverUri.size()));
        return new Pair<>(ListProtector.get(getSettingValue().defaultCoverUri, iNextInt), ListProtector.get(getSettingValue().defaultCoverUrl, iNextInt));
    }
}
