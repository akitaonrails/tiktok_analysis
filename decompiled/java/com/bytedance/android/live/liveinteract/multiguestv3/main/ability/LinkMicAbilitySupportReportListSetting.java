package com.bytedance.android.live.liveinteract.multiguestv3.main.ability;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_ability_support_report_list")
public final class LinkMicAbilitySupportReportListSetting {
    public static final int $stable;
    public static final List<String> DEFAULT;
    public static final LinkMicAbilitySupportReportListSetting INSTANCE = new LinkMicAbilitySupportReportListSetting();
    public static final List<String> settingValue;

    static {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("notice_board", "count_down_for_all", "live_show", "guest_showdown", "aigc", "playbook", "header");
        DEFAULT = listLJIIJJI;
        List<String> list = (List) SettingsManager.INSTANCE.getValueSafely(LinkMicAbilitySupportReportListSetting.class);
        if (list != null) {
            listLJIIJJI = list;
        }
        settingValue = listLJIIJJI;
        $stable = 8;
    }

    public final List<String> getSupportAbilityList() {
        return settingValue;
    }
}
