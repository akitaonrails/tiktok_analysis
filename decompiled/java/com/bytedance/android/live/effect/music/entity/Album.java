package com.bytedance.android.live.effect.music.entity;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes13.dex */
public final class Album {

    @C09CT("cover_url")
    public final String cover;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("name")
    public final String name;

    public Album(long j, String str, String str2) {
        this.id = j;
        this.name = str;
        this.cover = str2;
    }
}
