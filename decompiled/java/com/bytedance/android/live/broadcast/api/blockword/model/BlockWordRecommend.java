package com.bytedance.android.live.broadcast.api.blockword.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class BlockWordRecommend {

    @C09CT("content")
    public String content;

    @C09CT("isSelect")
    public boolean selected;

    public BlockWordRecommend(boolean z, String str) {
        this.selected = z;
        this.content = str;
    }
}
