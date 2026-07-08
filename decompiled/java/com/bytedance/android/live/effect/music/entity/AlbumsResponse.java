package com.bytedance.android.live.effect.music.entity;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AlbumsResponse {

    @C09CT("packs")
    public final List<AlbumPack> albumPacks;

    public AlbumsResponse(List<AlbumPack> list) {
        this.albumPacks = list;
    }
}
