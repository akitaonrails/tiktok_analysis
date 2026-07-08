package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.WallpaperContent;

/* JADX INFO: loaded from: classes16.dex */
public final class WallpaperEndResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("success")
        public boolean success;

        @C09CT("wallpaper_content")
        public WallpaperContent wallpaperContent;
    }
}
