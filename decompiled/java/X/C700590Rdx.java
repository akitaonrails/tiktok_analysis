package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.feed.model.IFcpNodeData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedMultiGenreComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedMultiSceneComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedMultiSceneComponentsData;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Rdx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700590Rdx {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C700650Re3());

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZIZ(IFcpNodeData iFcpNodeData) {
        String parentKey = iFcpNodeData.getParentKey();
        if (parentKey != null) {
            switch (parentKey.hashCode()) {
                case -1684919427:
                    if (parentKey.equals("high_tag")) {
                        return "left_container";
                    }
                    break;
                case -1613157440:
                    if (parentKey.equals("bottom_banner")) {
                        return "bottom_container";
                    }
                    break;
                case -1594502202:
                    if (parentKey.equals("bottom_button")) {
                        return "left_container";
                    }
                    break;
                case -1413299531:
                    if (parentKey.equals("anchor")) {
                        return "left_container";
                    }
                    break;
                case -833252600:
                    if (parentKey.equals("bottom_tag_container")) {
                        return "left_container";
                    }
                    break;
                case -513457295:
                    if (parentKey.equals("annotation_container")) {
                        return "left_container";
                    }
                    break;
                case -89040038:
                    if (parentKey.equals("title_container")) {
                        return "left_container";
                    }
                    break;
                case 178260226:
                    if (parentKey.equals("info_bar")) {
                        return "left_container";
                    }
                    break;
                case 356829231:
                    if (parentKey.equals("low_tag")) {
                        return "left_container";
                    }
                    break;
            }
        }
        return iFcpNodeData.getParentKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.AbstractC700660Re4 r7) {
        /*
            java.util.Map r5 = r7.LIZ()
            if (r5 != 0) goto L7
            return
        L7:
            java.util.Map r6 = r7.LIZIZ()
            if (r6 != 0) goto Le
            return
        Le:
            java.util.Map r0 = r7.LJI()
            java.util.Map r4 = r7.LJFF()
            if (r4 != 0) goto L1b
            if (r0 != 0) goto L1d
            return
        L1b:
            if (r0 == 0) goto L43
        L1d:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L25:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L25
            r6.put(r2, r1)
            goto L25
        L43:
            if (r4 == 0) goto L6b
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L4d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L4d
            r5.put(r2, r1)
            goto L4d
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700590Rdx.LJ(X.0Re4):void");
    }

    public static Map LJFF(FeedMultiSceneComponentsData feedMultiSceneComponentsData) {
        Map<String, ComponentContainerData> map;
        FeedComponentPriorityData feedComponentPriorityData;
        EnumC700630Re1 enumC700630Re1;
        Map<String, FeedMultiGenreComponentPriorityData> map2;
        String strLIZIZ;
        if (feedMultiSceneComponentsData != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, GlobalComponentData> map3 = feedMultiSceneComponentsData.globalComponentMap;
            if (map3 != null && (map = feedMultiSceneComponentsData.globalContainerMap) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                if (!linkedHashMap2.containsKey("standardized_bottom_button")) {
                    linkedHashMap2.put("standardized_bottom_button", new ComponentContainerData("standardized_bottom_button", 1, 0, null, "", "n_1", true, Boolean.TRUE));
                }
                if (!linkedHashMap2.containsKey("meta_tag_standardized_container")) {
                    linkedHashMap2.put("meta_tag_standardized_container", new ComponentContainerData("meta_tag_standardized_container", 1, 0, null, "", "n_1", true, Boolean.TRUE));
                }
                if (!linkedHashMap2.containsKey("high_tag_standardized_container")) {
                    linkedHashMap2.put("high_tag_standardized_container", new ComponentContainerData("high_tag_standardized_container", 1, 0, null, "", "n_1", true, Boolean.TRUE));
                }
                if (!linkedHashMap2.containsKey("standardized_bottom_tag")) {
                    linkedHashMap2.put("standardized_bottom_tag", new ComponentContainerData("standardized_bottom_tag", 0, 0, null, "", "m_n_area", true, Boolean.TRUE));
                }
                ComponentContainerData componentContainerData = (ComponentContainerData) linkedHashMap2.get("info_bar");
                if (componentContainerData != null) {
                    componentContainerData.setStandardizedNode(true);
                }
                Map<String, FeedMultiSceneComponentPriorityData> map4 = feedMultiSceneComponentsData.multiSceneComponentPriorityData;
                if (map4 != null) {
                    for (Map.Entry<String, FeedMultiSceneComponentPriorityData> entry : map4.entrySet()) {
                        String key = entry.getKey();
                        FeedMultiSceneComponentPriorityData value = entry.getValue();
                        value.containerMap = new LinkedHashMap(linkedHashMap2);
                        value.componentMap = new LinkedHashMap(map3);
                        LJ(value);
                        Map<String, String> map5 = C700080Rd8.LIZ;
                        if (key == null) {
                            key = "invalid_panel";
                        }
                        linkedHashMap.put(key, LJI(LJII(value, key), key));
                        if (C1111204Wg.LIZ() && (map2 = value.genres) != null) {
                            for (Map.Entry<String, FeedMultiGenreComponentPriorityData> entry2 : map2.entrySet()) {
                                String key2 = entry2.getKey();
                                FeedMultiGenreComponentPriorityData value2 = entry2.getValue();
                                List<String> list = value2.globalComponentList;
                                if (list == null) {
                                    list = value.globalComponentList;
                                }
                                value2.globalComponentList = list;
                                value2.containerMap = new LinkedHashMap(linkedHashMap2);
                                value2.componentMap = new LinkedHashMap(map3);
                                LJ(value2);
                                if (!TextUtils.isEmpty(key)) {
                                    if (TextUtils.isEmpty(key2)) {
                                        strLIZIZ = key;
                                    } else {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(key);
                                        sbLIZ.append(':');
                                        sbLIZ.append(key2);
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        if (strLIZIZ == null) {
                                        }
                                    }
                                    linkedHashMap.put(strLIZIZ, LJI(LJII(value2, strLIZIZ), strLIZIZ));
                                }
                            }
                        }
                    }
                }
                FeedMultiSceneComponentPriorityData feedMultiSceneComponentPriorityData = feedMultiSceneComponentsData.otherSceneComponentPriorityData;
                if (feedMultiSceneComponentPriorityData != null) {
                    feedMultiSceneComponentPriorityData.containerMap = new LinkedHashMap(linkedHashMap2);
                    feedMultiSceneComponentPriorityData.componentMap = new LinkedHashMap(map3);
                    LJ(feedMultiSceneComponentPriorityData);
                    linkedHashMap.put("other_panel", LJI(LJII(feedMultiSceneComponentPriorityData, "other_panel"), "other_panel"));
                }
                for (FeedComponentsData feedComponentsData : linkedHashMap.values()) {
                    if (feedComponentsData != null && (feedComponentPriorityData = feedComponentsData.componentPriorityData) != null) {
                        if (feedMultiSceneComponentsData.LIZ) {
                            enumC700630Re1 = EnumC700630Re1.DEFAULT;
                        } else {
                            enumC700630Re1 = EnumC700630Re1.COLD;
                        }
                        feedComponentPriorityData.setConfigType(enumC700630Re1);
                    }
                }
                return linkedHashMap;
            }
        }
        return null;
    }

    public static final FeedComponentPriorityData LIZ(String str, String str2) {
        if (C700120RdC.LIZ(str)) {
            return LIZJ(str, str2);
        }
        return LIZJ("other_panel", null);
    }

    public static FeedComponentPriorityData LIZJ(String str, String str2) {
        FeedComponentsData feedComponentsData;
        FeedComponentsData feedComponentsData2;
        FeedComponentsData feedComponentsData3;
        FeedComponentPriorityData feedComponentPriorityData;
        if (C700120RdC.LIZ(str)) {
            String strLIZ = C0RZ5.LIZ(str, str2);
            if (strLIZ != null) {
                String str3 = C700080Rd8.LIZIZ.get(str);
                C01GW c01gw = C0RZ5.LIZ;
                Map map = (Map) c01gw.getValue();
                if (map == null || (feedComponentsData3 = (FeedComponentsData) map.get(strLIZ)) == null || (feedComponentPriorityData = feedComponentsData3.componentPriorityData) == null) {
                    Map map2 = (Map) c01gw.getValue();
                    if (map2 != null && (feedComponentsData2 = (FeedComponentsData) map2.get(str3)) != null) {
                        return feedComponentsData2.componentPriorityData;
                    }
                    return null;
                }
                return feedComponentPriorityData;
            }
            return null;
        }
        Map map3 = (Map) LIZ.getValue();
        if (map3 != null && (feedComponentsData = (FeedComponentsData) map3.get("other_panel")) != null) {
            return feedComponentsData.componentPriorityData;
        }
        return null;
    }

    public static void LIZLLL(int i, String str) {
        C317900CdA.LIZ("app_start", "app_start", str, i, "data", null, 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0159 A[LOOP:6: B:74:0x0153->B:76:0x0159, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData LJI(com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700590Rdx.LJI(com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData, java.lang.String):com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentsData");
    }

    public static FeedComponentsData LJII(AbstractC700660Re4 abstractC700660Re4, String str) {
        Map<String, GlobalComponentData> mapLIZ;
        GlobalComponentData globalComponentData;
        int iLIZLLL = abstractC700660Re4.LIZLLL();
        FeedComponentsData feedComponentsData = new FeedComponentsData(null);
        FeedComponentPriorityData feedComponentPriorityData = new FeedComponentPriorityData(null, null, 0, null, null, null, null, null, null, null, null, null, null, 8191, null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<String> listLIZJ = abstractC700660Re4.LIZJ();
        if (listLIZJ != null) {
            for (String str2 : listLIZJ) {
                Map<String, GlobalComponentData> mapLIZ2 = abstractC700660Re4.LIZ();
                if (mapLIZ2 != null && (globalComponentData = mapLIZ2.get(str2)) != null) {
                    linkedHashSet.add(new GlobalComponentData(globalComponentData.getComponentKey(), globalComponentData.getShowStrategy(), globalComponentData.getMatchedContainerKey(), globalComponentData.getParentContainerKey(), globalComponentData.getCustomShowLimit(), null));
                }
            }
        }
        if (Intrinsics.LJFF(str, "other_panel") && (mapLIZ = abstractC700660Re4.LIZ()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, GlobalComponentData> entry : mapLIZ.entrySet()) {
                String key = entry.getKey();
                Set<String> set = C700100RdA.LIZLLL;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (u.LJJIIJZLJL(key, (String) it2.next(), false)) {
                            break;
                        }
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (it3.hasNext()) {
                GlobalComponentData globalComponentData2 = (GlobalComponentData) ((Map.Entry) it3.next()).getValue();
                linkedHashSet.add(new GlobalComponentData(globalComponentData2.getComponentKey(), globalComponentData2.getShowStrategy(), globalComponentData2.getMatchedContainerKey(), globalComponentData2.getParentContainerKey(), globalComponentData2.getCustomShowLimit(), null));
            }
        }
        feedComponentPriorityData.setTreeStructure(abstractC700660Re4.LJ());
        feedComponentPriorityData.setGlobalComponentList(C13LP.LLIIII(linkedHashSet));
        feedComponentPriorityData.setGlobalShowLimit(iLIZLLL);
        feedComponentPriorityData.setContainerMap(abstractC700660Re4.LIZIZ());
        feedComponentPriorityData.flatten();
        feedComponentsData.componentPriorityData = feedComponentPriorityData;
        return feedComponentsData;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(java.util.Map r4, java.util.Map r5, com.ss.android.ugc.aweme.feed.model.GlobalComponentData r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r1 = r4.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L68
            int r0 = r1.length()
            if (r0 == 0) goto L68
            if (r5 == 0) goto L96
            java.lang.Object r0 = r5.get(r1)
            com.ss.android.ugc.aweme.feed.model.ComponentContainerData r0 = (com.ss.android.ugc.aweme.feed.model.ComponentContainerData) r0
            if (r0 == 0) goto L1f
            r0.adoptChild(r6, r8)
        L1f:
            java.lang.String r0 = LIZIZ(r6)
            if (r0 != 0) goto L27
            java.lang.String r0 = ""
        L27:
            r6.setParentContainerKey(r0)
            java.lang.String r2 = r6.getMatchedContainerKey()
            java.lang.String r0 = "low_tag"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r1 = -1
            if (r0 != 0) goto L3f
            java.lang.String r0 = "high_tag"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L52
        L3f:
            java.lang.String r0 = "main_tag"
            java.lang.Object r0 = r5.get(r0)
            com.ss.android.ugc.aweme.feed.model.ComponentContainerData r0 = (com.ss.android.ugc.aweme.feed.model.ComponentContainerData) r0
            if (r0 == 0) goto L52
            int r0 = r0.getShowLimit()
            if (r0 != r1) goto L52
            r6.setCustomShowLimit(r1)
        L52:
            java.lang.String r0 = r6.getParentContainerKey()
            java.lang.Object r0 = r5.get(r0)
            com.ss.android.ugc.aweme.feed.model.ComponentContainerData r0 = (com.ss.android.ugc.aweme.feed.model.ComponentContainerData) r0
            if (r0 == 0) goto L67
            int r0 = r0.getShowLimit()
            if (r0 != r1) goto L67
            r6.setCustomShowLimit(r1)
        L67:
            return
        L68:
            if (r5 == 0) goto L96
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L72:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r1.getValue()
            com.ss.android.ugc.aweme.feed.model.ComponentContainerData r1 = (com.ss.android.ugc.aweme.feed.model.ComponentContainerData) r1
            if (r7 == 0) goto L72
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r7, r0, r3)
            if (r0 != r4) goto L72
            r1.adoptChild(r6, r8)
            goto L72
        L96:
            java.util.Map r5 = X.C2097608Jq.LJ()
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700590Rdx.LJIIIIZZ(java.util.Map, java.util.Map, com.ss.android.ugc.aweme.feed.model.GlobalComponentData, java.lang.String, java.lang.String):void");
    }
}
