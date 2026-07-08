package X;

import com.ss.android.ugc.aweme.im.strategy.DynamicConfigData;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import com.ss.android.ugc.aweme.im.strategy.StrategyConfigData;
import com.ss.android.ugc.aweme.im.strategy.scene.SceneConfigData;
import com.ss.android.ugc.aweme.im.strategy.scene.StrategyPlatformData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Zlx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909390Zlx {
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.im.strategy.scene.StrategyPlatformData LIZIZ(com.ss.android.ugc.aweme.im.strategy.StrategyConfigData r9) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C909390Zlx.LIZIZ(com.ss.android.ugc.aweme.im.strategy.StrategyConfigData):com.ss.android.ugc.aweme.im.strategy.scene.StrategyPlatformData");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(StrategyConfigData strategyConfigData, StrategyPlatformData strategyPlatformData) {
        Map<String, IBusinessConfig> map;
        Map<String, IBusinessConfig> map2;
        Map<String, IBusinessConfig> map3;
        Map<String, IBusinessConfig> map4;
        Map<String, IBusinessConfig> map5;
        SceneConfigData sceneConfigData;
        Map<String, IBusinessConfig> map6;
        Map<String, IBusinessConfig> map7;
        Map<String, IBusinessConfig> map8;
        Map<String, IBusinessConfig> map9;
        LinkedHashMap linkedHashMap;
        Map<String, IBusinessConfig> map10;
        Map<String, IBusinessConfig> map11;
        Map<String, IBusinessConfig> map12;
        SceneConfigData sceneConfigData2;
        SceneConfigData sceneConfigData3;
        SceneConfigData sceneConfigData4;
        SceneConfigData sceneConfigData5;
        SceneConfigData sceneConfigData6;
        SceneConfigData sceneConfigData7;
        SceneConfigData sceneConfigData8;
        SceneConfigData sceneConfigData9;
        Map<String, IBusinessConfig> map13;
        Map<String, IBusinessConfig> map14;
        SceneConfigData sceneConfigData10;
        SceneConfigData sceneConfigData11;
        SceneConfigData sceneConfigData12;
        SceneConfigData sceneConfigData13;
        SceneConfigData sceneConfigData14;
        SceneConfigData sceneConfigData15;
        strategyConfigData.setDecisionTree(strategyPlatformData.decisionTree);
        strategyConfigData.setResourceScenes(strategyPlatformData.resourceScenes);
        strategyConfigData.setErrScenes(strategyPlatformData.errScenes);
        Map<EnumC909380Zlw, SceneConfigData> map15 = strategyPlatformData.sceneMap;
        Map<String, IBusinessConfig> map16 = null;
        if (map15 != null && (sceneConfigData15 = map15.get(EnumC909380Zlw.LIGHT_INTERACTION_ENTRY)) != null) {
            map = sceneConfigData15.data;
        } else {
            map = null;
        }
        if (!(map instanceof Map)) {
            map = null;
        }
        strategyConfigData.setLightInteractionEntry(map);
        Map<EnumC909380Zlw, SceneConfigData> map17 = strategyPlatformData.sceneMap;
        if (map17 != null && (sceneConfigData14 = map17.get(EnumC909380Zlw.STREAK_MILESTONE)) != null) {
            map2 = sceneConfigData14.data;
        } else {
            map2 = null;
        }
        if (!(map2 instanceof Map)) {
            map2 = null;
        }
        strategyConfigData.setStreakMilestone(map2);
        Map<EnumC909380Zlw, SceneConfigData> map18 = strategyPlatformData.sceneMap;
        if (map18 != null && (sceneConfigData13 = map18.get(EnumC909380Zlw.LIGHT_INTERACTION_ENTRY_TEST)) != null) {
            map3 = sceneConfigData13.data;
        } else {
            map3 = null;
        }
        if (!(map3 instanceof Map)) {
            map3 = null;
        }
        strategyConfigData.setLightInteractionEntryTest(map3);
        Map<EnumC909380Zlw, SceneConfigData> map19 = strategyPlatformData.sceneMap;
        if (map19 != null && (sceneConfigData12 = map19.get(EnumC909380Zlw.COMMON_LIGHT_INTERACTION)) != null) {
            map4 = sceneConfigData12.data;
        } else {
            map4 = null;
        }
        if (!(map4 instanceof Map)) {
            map4 = null;
        }
        strategyConfigData.setLightInteractionCommonResource(map4);
        if (C296650Bjz.LIZ()) {
            Map<EnumC909380Zlw, SceneConfigData> map20 = strategyPlatformData.sceneMap;
            if (map20 != null && (sceneConfigData11 = map20.get(EnumC909380Zlw.ACTION_BAR_BASE_STATE)) != null) {
                map13 = sceneConfigData11.data;
            } else {
                map13 = null;
            }
            if (!(map13 instanceof Map)) {
                map13 = null;
            }
            strategyConfigData.setActionBarBaseState(map13);
            Map<EnumC909380Zlw, SceneConfigData> map21 = strategyPlatformData.sceneMap;
            if (map21 != null && (sceneConfigData10 = map21.get(EnumC909380Zlw.ACTION_BAR_STATE_TRANSFER)) != null) {
                map14 = sceneConfigData10.data;
            } else {
                map14 = null;
            }
            if (!(map14 instanceof Map)) {
                map14 = null;
            }
            strategyConfigData.setActionBarStateTransfer(map14);
        } else {
            Map<EnumC909380Zlw, SceneConfigData> map22 = strategyPlatformData.sceneMap;
            if (map22 != null && (sceneConfigData = map22.get(EnumC909380Zlw.ACTION_BAR)) != null) {
                map5 = sceneConfigData.data;
            } else {
                map5 = null;
            }
            if (!(map5 instanceof Map)) {
                map5 = null;
            }
            strategyConfigData.setActionBarEntry(map5);
        }
        Map<EnumC909380Zlw, SceneConfigData> map23 = strategyPlatformData.sceneMap;
        if (map23 != null && (sceneConfigData9 = map23.get(EnumC909380Zlw.PRESHOWN_STICKER)) != null) {
            map6 = sceneConfigData9.data;
        } else {
            map6 = null;
        }
        if (!(map6 instanceof Map)) {
            map6 = null;
        }
        strategyConfigData.setPreshownStickerConfigResolvingResult(map6);
        Map<EnumC909380Zlw, SceneConfigData> map24 = strategyPlatformData.sceneMap;
        if (map24 != null && (sceneConfigData8 = map24.get(EnumC909380Zlw.PRESHOWN_STICKER_SCORE)) != null) {
            map7 = sceneConfigData8.data;
        } else {
            map7 = null;
        }
        if (!(map7 instanceof Map)) {
            map7 = null;
        }
        strategyConfigData.setPreshownStickerScoreUpdatingResult(map7);
        Map<EnumC909380Zlw, SceneConfigData> map25 = strategyPlatformData.sceneMap;
        if (map25 != null && (sceneConfigData7 = map25.get(EnumC909380Zlw.CUSTOM_MESSAGE_BUBBLE_NEW_LABEL)) != null) {
            map8 = sceneConfigData7.data;
        } else {
            map8 = null;
        }
        if (!(map8 instanceof Map)) {
            map8 = null;
        }
        strategyConfigData.setCustomMessageBubbleNewLabelResult(map8);
        Map<EnumC909380Zlw, SceneConfigData> map26 = strategyPlatformData.sceneMap;
        if (map26 != null && (sceneConfigData6 = map26.get(EnumC909380Zlw.CHAT_FEATURE_LIST)) != null) {
            map9 = sceneConfigData6.data;
        } else {
            map9 = null;
        }
        if (!(map9 instanceof Map)) {
            map9 = null;
        }
        strategyConfigData.setChatFeaturesConfig(map9);
        Map<String, DynamicConfigData> config = strategyConfigData.getConfig();
        if (config != null) {
            linkedHashMap = new LinkedHashMap(config);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        Map<EnumC909380Zlw, SceneConfigData> map27 = strategyPlatformData.sceneMap;
        if (map27 != null && (sceneConfigData5 = map27.get(EnumC909380Zlw.CHAT_ROOM_TITLE_BAR_RIGHT_ICON)) != null) {
            map10 = sceneConfigData5.data;
        } else {
            map10 = null;
        }
        if (!(map10 instanceof Map)) {
            map10 = null;
        }
        if (map10 != null) {
            ArrayList arrayList = new ArrayList(map10.size());
            for (Map.Entry<String, IBusinessConfig> entry : map10.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), C051M.LJ(entry.getValue(), false)));
            }
            Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
            if (mapLJIILLIIL != null) {
                linkedHashMap.put(EnumC909380Zlw.CHAT_ROOM_TITLE_BAR_RIGHT_ICON.getKey(), new DynamicConfigData(mapLJIILLIIL));
            }
        }
        Map<EnumC909380Zlw, SceneConfigData> map28 = strategyPlatformData.sceneMap;
        if (map28 != null && (sceneConfigData4 = map28.get(EnumC909380Zlw.GREETING_CARD_COMMON_RESOURCE)) != null) {
            map11 = sceneConfigData4.data;
        } else {
            map11 = null;
        }
        if ((map11 instanceof Map) && map11 != null) {
            ArrayList arrayList2 = new ArrayList(map11.size());
            for (Map.Entry<String, IBusinessConfig> entry2 : map11.entrySet()) {
                arrayList2.add(new Pair(entry2.getKey(), C051M.LJ(entry2.getValue(), false)));
            }
            Map mapLJIILLIIL2 = C2097608Jq.LJIILLIIL(arrayList2);
            if (mapLJIILLIIL2 != null) {
                linkedHashMap.put(EnumC909380Zlw.GREETING_CARD_COMMON_RESOURCE.getKey(), new DynamicConfigData(mapLJIILLIIL2));
            }
        }
        Map<EnumC909380Zlw, SceneConfigData> map29 = strategyPlatformData.sceneMap;
        if (map29 != null && (sceneConfigData3 = map29.get(EnumC909380Zlw.CUSTOM_MESSAGE_BUBBLE_CATEGORY_SUBTITLE)) != null) {
            map12 = sceneConfigData3.data;
        } else {
            map12 = null;
        }
        if ((map12 instanceof Map) && map12 != null) {
            ArrayList arrayList3 = new ArrayList(map12.size());
            for (Map.Entry<String, IBusinessConfig> entry3 : map12.entrySet()) {
                arrayList3.add(new Pair(entry3.getKey(), C051M.LJ(entry3.getValue(), false)));
            }
            Map mapLJIILLIIL3 = C2097608Jq.LJIILLIIL(arrayList3);
            if (mapLJIILLIIL3 != null) {
                linkedHashMap.put(EnumC909380Zlw.CUSTOM_MESSAGE_BUBBLE_CATEGORY_SUBTITLE.getKey(), new DynamicConfigData(mapLJIILLIIL3));
            }
        }
        Map<EnumC909380Zlw, SceneConfigData> map30 = strategyPlatformData.sceneMap;
        if (map30 != null && (sceneConfigData2 = map30.get(EnumC909380Zlw.CUSTOM_MESSAGE_BUBBLE_NEW_LABEL)) != null) {
            map16 = sceneConfigData2.data;
        }
        if ((map16 instanceof Map) && map16 != null) {
            ArrayList arrayList4 = new ArrayList(map16.size());
            for (Map.Entry<String, IBusinessConfig> entry4 : map16.entrySet()) {
                arrayList4.add(new Pair(entry4.getKey(), C051M.LJ(entry4.getValue(), false)));
            }
            Map mapLJIILLIIL4 = C2097608Jq.LJIILLIIL(arrayList4);
            if (mapLJIILLIIL4 != null) {
                linkedHashMap.put(EnumC909380Zlw.CUSTOM_MESSAGE_BUBBLE_NEW_LABEL.getKey(), new DynamicConfigData(mapLJIILLIIL4));
            }
        }
        strategyConfigData.setConfig(linkedHashMap);
    }
}
