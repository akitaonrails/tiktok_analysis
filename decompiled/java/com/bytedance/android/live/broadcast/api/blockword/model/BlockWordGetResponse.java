package com.bytedance.android.live.broadcast.api.blockword.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class BlockWordGetResponse {

    @C09CT("word")
    public final List<BlockWord> words;

    public BlockWordGetResponse(List<BlockWord> list) {
        this.words = list;
    }
}
