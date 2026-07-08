package com.bytedance.android.live.effect.music.entity;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class Accompaniment {

    @C09CT("author")
    public final String author;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("title")
    public final String title;

    @C09CT("preview_url")
    public final String url;

    @C09CT("vid")
    public final String vid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Accompaniment)) {
            return false;
        }
        Accompaniment accompaniment = (Accompaniment) obj;
        return this.id == accompaniment.id && Intrinsics.LJFF(this.title, accompaniment.title) && Intrinsics.LJFF(this.author, accompaniment.author) && Intrinsics.LJFF(this.vid, accompaniment.vid) && Intrinsics.LJFF(this.url, accompaniment.url);
    }

    public Accompaniment(long j, String str, String str2, String str3, String str4) {
        this.id = j;
        this.title = str;
        this.author = str2;
        this.vid = str3;
        this.url = str4;
    }
}
