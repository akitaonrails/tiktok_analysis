package com.bytedance.android.live.effect.navi.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileNaviListResponse {

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("navis")
    public final List<ProfileNaviCustom> naviList;

    @C09CT("total")
    public final Long total;

    public ProfileNaviListResponse(Long l, int i, List<ProfileNaviCustom> list) {
        this.total = l;
        this.hasMore = i;
        this.naviList = list;
    }
}
