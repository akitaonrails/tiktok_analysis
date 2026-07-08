package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GetWallpaperPicListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("wallpaper_pic_info")
        public List<WallpaperPicInfo> wallpaperPicInfo = new ArrayList();
    }
}
