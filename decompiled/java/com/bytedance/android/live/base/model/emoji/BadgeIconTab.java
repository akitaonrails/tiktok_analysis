package com.bytedance.android.live.base.model.emoji;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class BadgeIconTab {

    @C09CT("icon_list")
    public final List<BadgeIcon> iconList;

    @C09CT("tab_id")
    public final long tabId;

    @C09CT("tab_preview")
    public final BadgeIcon tabPreview;

    public BadgeIconTab(long j, BadgeIcon badgeIcon, List<BadgeIcon> list) {
        this.tabId = j;
        this.tabPreview = badgeIcon;
        this.iconList = list;
    }
}
