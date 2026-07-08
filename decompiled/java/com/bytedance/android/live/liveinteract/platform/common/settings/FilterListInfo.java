package com.bytedance.android.live.liveinteract.platform.common.settings;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class FilterListInfo {
    public static final TypeAdapter ADAPTER = new FilterListInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("page_type_filter_list_map")
    public Map<String, ? extends List<String>> pageTypeFilterListMap;

    @C09CT("room_mode_filter_list_map")
    public Map<Integer, ? extends List<String>> roomModeFilterListMap;

    public FilterListInfo() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public FilterListInfo(Map<Integer, ? extends List<String>> map, Map<String, ? extends List<String>> map2) {
        this.roomModeFilterListMap = map;
        this.pageTypeFilterListMap = map2;
    }
}
