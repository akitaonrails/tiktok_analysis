package com.bytedance.android.live.base.model.emoji;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class BadgeIcon {

    @C09CT("icon_str")
    public final String iconStr;

    @C09CT("icon_type")
    public final int iconType;

    @C09CT("icon_uri")
    public final String iconUri;

    @C09CT("icon_url")
    public final String iconUrl;

    public BadgeIcon(int i, String str, String str2, String str3) {
        this.iconType = i;
        this.iconUri = str;
        this.iconStr = str2;
        this.iconUrl = str3;
    }
}
