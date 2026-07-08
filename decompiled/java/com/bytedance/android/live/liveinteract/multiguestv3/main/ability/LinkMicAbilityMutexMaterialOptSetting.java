package com.bytedance.android.live.liveinteract.multiguestv3.main.ability;

import X.C13BV;
import X.C1697810uHb;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_ability_mutex_material_opt")
public final class LinkMicAbilityMutexMaterialOptSetting {
    public static final int $stable;
    public static final Map<String, LinkMicAbilityMutexInfo> DEFAULT;
    public static final LinkMicAbilityMutexMaterialOptSetting INSTANCE = new LinkMicAbilityMutexMaterialOptSetting();
    public static final Map<String, LinkMicAbilityMutexInfo> settingValue;

    static {
        List listLJIIJJI = C1697810uHb.LJIIJJI("co_host", "voice_chat");
        C13BV c13bv = C13BV.INSTANCE;
        Map<String, LinkMicAbilityMutexInfo> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("karaoke", new LinkMicAbilityMutexInfo(Collections.singletonList("voice_chat"), C1697810uHb.LJIIJJI("aigc", "draw_guess", "lets_dance"))), new Pair("count_down_single", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), C1697810uHb.LJIIJJI("count_down_for_all", "live_show", "aigc", "guest_showdown", "lets_dance"))), new Pair("count_down_for_all", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), C1697810uHb.LJIIJJI("count_down_single", "live_show", "aigc", "draw_guess", "guest_showdown", "lets_dance"))), new Pair("live_show", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), C1697810uHb.LJIIJJI("count_down_single", "count_down_for_all", "aigc", "draw_guess", "guest_showdown", "lets_dance"))), new Pair("aigc", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), C1697810uHb.LJIIJJI("karaoke", "count_down_single", "count_down_for_all", "live_show", "draw_guess", "guest_showdown", "lets_dance"))), new Pair("draw_guess", new LinkMicAbilityMutexInfo(Collections.singletonList("voice_chat"), C1697810uHb.LJIIJJI("karaoke", "count_down_for_all", "live_show", "aigc", "guest_showdown", "lets_dance"))), new Pair("guest_showdown", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), C1697810uHb.LJIIJJI("live_show", "count_down_single", "count_down_for_all", "aigc", "draw_guess", "lets_dance"))), new Pair("manage_guest", new LinkMicAbilityMutexInfo(listLJIIJJI, c13bv)), new Pair("layout", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), c13bv)), new Pair("gift_threshold_link", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), c13bv)), new Pair("notice_board", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), c13bv)), new Pair("enlarge_grid", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), c13bv)), new Pair("cohost", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("multi_guest", "voice_chat"), c13bv)), new Pair("match", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("multi_guest", "voice_chat"), c13bv)), new Pair("match_with_scene", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("multi_guest", "voice_chat"), c13bv)), new Pair("shared_background", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), c13bv)), new Pair("stickers", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), c13bv)), new Pair("header", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), c13bv)), new Pair("lets_dance", new LinkMicAbilityMutexInfo(C1697810uHb.LJIIJJI("co_host", "voice_chat"), C1697810uHb.LJIIJJI("count_down_single", "count_down_for_all", "aigc", "karaoke", "draw_guess", "guest_showdown", "live_show"))));
        DEFAULT = mapLJIIIIZZ;
        Map<String, LinkMicAbilityMutexInfo> map = (Map) SettingsManager.INSTANCE.getValueSafely(LinkMicAbilityMutexMaterialOptSetting.class);
        if (map != null) {
            mapLJIIIIZZ = map;
        }
        settingValue = mapLJIIIIZZ;
        $stable = 8;
    }

    public final Map<String, LinkMicAbilityMutexInfo> getSettingValue() {
        return settingValue;
    }

    public final List<String> getMutexAbilities(String str) {
        LinkMicAbilityMutexInfo linkMicAbilityMutexInfo = settingValue.get(str);
        if (linkMicAbilityMutexInfo != null) {
            return linkMicAbilityMutexInfo.mutexAbility;
        }
        return null;
    }

    public final List<String> getMutexScene(String str) {
        LinkMicAbilityMutexInfo linkMicAbilityMutexInfo = settingValue.get(str);
        if (linkMicAbilityMutexInfo != null) {
            return linkMicAbilityMutexInfo.mutexScene;
        }
        return null;
    }
}
