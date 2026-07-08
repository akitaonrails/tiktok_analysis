package X;

import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0Rdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700570Rdv implements C0RKW {
    public final List<String> LIZ = C1697810uHb.LJIIJJI("anchor_poi", "anchor_shop", "anchor_tts_gift_card", "bottom_container_download_progress_bar", "bottom_container_photomode_dot_page_control", "bottom_container_photomode_page_control", "left_container_author", "left_container_description", "left_container_see_translation", "left_container_left_bottom_container_anole_slot", "low_tag_live_photo", "right_container_avatar", "right_container_clear_mode", "right_container_comment", "right_container_digg", "right_container_favorite", "right_container_music_cover", "right_container_share", "title_container_author", "top_bottom_container_photomode_indicator", "genre_tag_live_photo", "genre_tag_photo", "left_container_social_repost");
    public FeedComponentPriorityData LIZIZ;
    public C0RKW LIZJ;
    public boolean LIZLLL;

    @Override // X.C0RKW
    public final FeedComponentPriorityData LIZ() {
        C0RKW c0rkw = this.LIZJ;
        FeedComponentPriorityData feedComponentPriorityDataLIZ = c0rkw != null ? c0rkw.LIZ() : null;
        if (this.LIZLLL) {
            if (this.LIZIZ == null && feedComponentPriorityDataLIZ != null) {
                List<String> list = C0SKM.LJIIIIZZ().allowComponents;
                if (list == null || list.isEmpty()) {
                    list = this.LIZ;
                }
                if (!list.isEmpty()) {
                    FeedComponentPriorityData feedComponentPriorityData = new FeedComponentPriorityData(null, null, 0, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    feedComponentPriorityData.setTreeStructure(feedComponentPriorityDataLIZ.treeStructure);
                    List<GlobalComponentData> list2 = feedComponentPriorityDataLIZ.globalComponentList;
                    feedComponentPriorityData.setGlobalComponentList(list2 != null ? C13LP.LLIIII(list2) : null);
                    feedComponentPriorityData.setAlreadyDisableComponents(feedComponentPriorityDataLIZ.alreadyDisableComponents);
                    feedComponentPriorityData.setFinalFilterComponents(feedComponentPriorityDataLIZ.finalFilterComponents);
                    feedComponentPriorityData.setRankComponentIds(feedComponentPriorityDataLIZ.rankComponentIds);
                    feedComponentPriorityData.setReRankComponentIds(feedComponentPriorityDataLIZ.reRankComponentIds);
                    feedComponentPriorityData.setPriorityList(feedComponentPriorityDataLIZ.priorityList);
                    feedComponentPriorityData.setContainerMap(feedComponentPriorityDataLIZ.containerMap);
                    feedComponentPriorityData.setServerTrackExtra(feedComponentPriorityDataLIZ.serverTrackExtra);
                    feedComponentPriorityData.setConfigType(feedComponentPriorityDataLIZ.configType);
                    Map<String, GlobalComponentData> map = feedComponentPriorityDataLIZ.globalComponentMap;
                    if (map != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        ArrayList arrayList = new ArrayList();
                        Set<Map.Entry<String, GlobalComponentData>> setEntrySet = map.entrySet();
                        if (setEntrySet != null) {
                            Iterator<T> it2 = setEntrySet.iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                if (key != null && list.contains(key) && value != null) {
                                    linkedHashMap.put(key, value);
                                    arrayList.add(value);
                                }
                            }
                        }
                        feedComponentPriorityData.setGlobalComponentMap(linkedHashMap);
                        feedComponentPriorityData.setGlobalComponentList(arrayList);
                    } else {
                        List<GlobalComponentData> list3 = feedComponentPriorityDataLIZ.globalComponentList;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        ArrayList arrayList2 = new ArrayList();
                        if (list3 != null) {
                            for (GlobalComponentData globalComponentData : list3) {
                                String componentKey = globalComponentData.getComponentKey();
                                if (componentKey != null && list.contains(componentKey)) {
                                    linkedHashMap2.put(componentKey, globalComponentData);
                                    arrayList2.add(globalComponentData);
                                }
                            }
                        }
                        feedComponentPriorityData.setGlobalComponentMap(linkedHashMap2);
                        feedComponentPriorityData.setGlobalComponentList(arrayList2);
                    }
                    feedComponentPriorityData.setComponentPreloadConfig(feedComponentPriorityDataLIZ.componentPreloadConfig);
                    this.LIZIZ = feedComponentPriorityData;
                }
            }
            FeedComponentPriorityData feedComponentPriorityData2 = this.LIZIZ;
            if (feedComponentPriorityData2 != null) {
                return feedComponentPriorityData2;
            }
        }
        return feedComponentPriorityDataLIZ;
    }
}
