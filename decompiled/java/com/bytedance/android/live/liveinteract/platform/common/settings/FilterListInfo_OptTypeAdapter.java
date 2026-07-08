package com.bytedance.android.live.liveinteract.platform.common.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class FilterListInfo_OptTypeAdapter extends TypeAdapter<FilterListInfo> {
    public final Gson LIZ;

    public FilterListInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FilterListInfo read(C09CU c09cu) {
        FilterListInfo filterListInfo = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            filterListInfo = new FilterListInfo(C2097608Jq.LJ(), C2097608Jq.LJ());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "room_mode_filter_list_map")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        filterListInfo.roomModeFilterListMap = (Map) this.LIZ.LJIIIZ(new TypeToken<Map<Integer, ? extends List<? extends String>>>() { // from class: X.00UW
                        }).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "page_type_filter_list_map")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        filterListInfo.pageTypeFilterListMap = (Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.00VS
                        }).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return filterListInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FilterListInfo filterListInfo) {
        FilterListInfo filterListInfo2 = filterListInfo;
        if (filterListInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("room_mode_filter_list_map");
        this.LIZ.LJIIIZ(new TypeToken<Map<Integer, ? extends List<? extends String>>>() { // from class: X.00UX
        }).write(c09dl, filterListInfo2.roomModeFilterListMap);
        c09dl.LJIILLIIL("page_type_filter_list_map");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.00VT
        }).write(c09dl, filterListInfo2.pageTypeFilterListMap);
        c09dl.LJII();
    }
}
