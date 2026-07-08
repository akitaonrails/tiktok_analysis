package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import X.C13BV;
import X.C15438062q;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2441009hQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_playbook_editor_rule_group")
public final class PlaybookEditorRuleGroupSetting {
    public static final int $stable;
    public static final GroupSettingMap DEFAULT;
    public static final PlaybookEditorRuleGroupSetting INSTANCE = new PlaybookEditorRuleGroupSetting();
    public static final Map<String, List<Integer>> abilityToColorsCache;
    public static final Map<String, Pair<String, GroupSetting>> abilityToGroupCache;
    public static final GroupSettingMap settingValue;

    static {
        GroupSettingMap groupSettingMap = new GroupSettingMap(C1697810uHb.LJIIJJI("MultiGuest", "Cohost", "Enhance", "Interact", "ServicePlus"), C2097608Jq.LJIIIIZZ(new Pair("MultiGuest", new GroupSetting(C1697810uHb.LJIIJJI("manage_guest", "layout", "enlarge_grid", "count_down_single", "count_down_for_all", "guest_showdown", "live_show", "notice_board", "header", "shared_background", "gift_threshold_link", "room_title", "cover", "share"), "205,1,0.5", "192,1,0.5")), new Pair("Cohost", new GroupSetting(C1697810uHb.LJIIJJI("cohost", "match", "designated_gift", "community_designated_gift", "match_with_scene"), "348,0.99,0.58", "340,0.99,0.58")), new Pair("Enhance", new GroupSetting(C1697810uHb.LJIIJJI("enhance", "effects", "stickers", "music", "voice_effects", "sound_effects", "background", "victory_lap_funny_effect"), "256,1,0.64", "270,1,0.64")), new Pair("Interact", new GroupSetting(C1697810uHb.LJIIJJI("live_goal", "goody_bag", "treasure_box", "poll", "lightning_qa", "draw_guess", "aigc", "topic"), "25,1,0.61", "39,0.99,0.61")), new Pair("ServicePlus", new GroupSetting(C1697810uHb.LJIIJJI("boards", "leads", "subscription_queue"), "230,1,0.63", "206,1,0.63"))));
        DEFAULT = groupSettingMap;
        abilityToColorsCache = new LinkedHashMap();
        abilityToGroupCache = new LinkedHashMap();
        GroupSettingMap groupSettingMap2 = (GroupSettingMap) SettingsManager.INSTANCE.getValueSafely(PlaybookEditorRuleGroupSetting.class);
        if (groupSettingMap2 != null) {
            groupSettingMap = groupSettingMap2;
        }
        settingValue = groupSettingMap;
        $stable = 8;
    }

    public final GroupSettingMap getSettingValue() {
        return settingValue;
    }

    private final Pair<String, GroupSetting> getGroup(String str) {
        Pair<String, GroupSetting> pair = abilityToGroupCache.get(str);
        if (pair != null) {
            return pair;
        }
        String str2 = null;
        GroupSetting groupSetting = null;
        for (Map.Entry<String, GroupSetting> entry : settingValue.map.entrySet()) {
            String key = entry.getKey();
            GroupSetting value = entry.getValue();
            if (groupSetting == null && value.list.contains(str)) {
                groupSetting = value;
                str2 = key;
            }
        }
        if (str2 == null || groupSetting == null) {
            return null;
        }
        Pair<String, GroupSetting> pair2 = new Pair<>(str2, groupSetting);
        abilityToGroupCache.put(str, pair2);
        return pair2;
    }

    public final String getGroupName(String str) {
        Pair<String, GroupSetting> group = getGroup(str);
        if (group != null) {
            return group.getFirst();
        }
        return null;
    }

    public final List<Integer> getStepColors(String str, int i) {
        Pair<String, GroupSetting> group = getGroup(str);
        if (group != null) {
            String first = group.getFirst();
            GroupSetting second = group.getSecond();
            List<Integer> list = abilityToColorsCache.get(first);
            if (list != null) {
                if (list.size() != i) {
                    list = null;
                }
                if (list != null) {
                    return list;
                }
            }
            String str2 = second.startColor;
            String str3 = second.endColor;
            ArrayList arrayList = new ArrayList();
            try {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Float.valueOf(CastFloatProtector.parseFloat((String) it2.next())));
                }
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL2, 10));
                Iterator it3 = listLJJLIIIJILLIZJL2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Float.valueOf(CastFloatProtector.parseFloat((String) it3.next())));
                }
                if (i <= 0 || i == 1) {
                    arrayList.add(Integer.valueOf(C2441009hQ.LIZ(new float[]{((Number) arrayList2.get(0)).floatValue(), ((Number) arrayList2.get(1)).floatValue(), ((Number) arrayList2.get(2)).floatValue()})));
                } else if (i == 2) {
                    arrayList.add(Integer.valueOf(C2441009hQ.LIZ(new float[]{((Number) arrayList2.get(0)).floatValue(), ((Number) arrayList2.get(1)).floatValue(), ((Number) arrayList2.get(2)).floatValue()})));
                    arrayList.add(Integer.valueOf(C2441009hQ.LIZ(new float[]{((Number) arrayList3.get(0)).floatValue(), ((Number) arrayList3.get(1)).floatValue(), ((Number) arrayList3.get(2)).floatValue()})));
                } else {
                    float fFloatValue = (((Number) arrayList3.get(0)).floatValue() - ((Number) arrayList2.get(0)).floatValue()) / (i - 1);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(Integer.valueOf(C2441009hQ.LIZ(new float[]{((Number) arrayList2.get(0)).floatValue() + (i2 * fFloatValue), ((Number) arrayList2.get(1)).floatValue(), ((Number) arrayList2.get(2)).floatValue()})));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("generateGradientColors error:");
                sbLIZ.append(th.getMessage());
                C20441214yg.LIZIZ("PlaybookEditorUtils", C2188811AlT.LIZIZ(sbLIZ));
            }
            abilityToColorsCache.put(first, arrayList);
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
