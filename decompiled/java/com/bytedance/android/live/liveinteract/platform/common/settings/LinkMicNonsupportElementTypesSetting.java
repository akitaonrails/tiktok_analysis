package com.bytedance.android.live.liveinteract.platform.common.settings;

import X.C13BV;
import X.C1697810uHb;
import X.C2097908Jt;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_nonsupport_element_types")
public final class LinkMicNonsupportElementTypesSetting {
    public static final LinkMicNonsupportElementTypesSetting INSTANCE = new LinkMicNonsupportElementTypesSetting();
    public static final FilterListInfo DEFAULT = new FilterListInfo(C2097908Jt.LIZJ(new Pair(7, Collections.singletonList("score"))), C2097908Jt.LIZJ(new Pair("search", C1697810uHb.LJIIJJI("score", "avatarTag"))));
    public static final int $stable = 8;

    public final FilterListInfo getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FilterListInfo filterListInfo = DEFAULT;
        FilterListInfo filterListInfo2 = (FilterListInfo) settingsManager.getValueSafely("link_mic_nonsupport_element_types", filterListInfo);
        return filterListInfo2 != null ? filterListInfo2 : filterListInfo;
    }

    public final List<String> getPageTypeFilterList(String str) {
        List<String> list = getValue().pageTypeFilterListMap.get(str);
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public final List<String> getRoomModeFilterList(int i) {
        List<String> list = getValue().roomModeFilterListMap.get(Integer.valueOf(i));
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }
}
