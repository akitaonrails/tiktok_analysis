package com.bytedance.android.live.broadcast.api.blockword.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class BlockWord {

    @C09CT("block_similar_versions")
    public int blockSimilarVersions;

    @C09CT("content")
    public String content;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int id;

    @C09CT("uniq_id")
    public String uniqId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockWord)) {
            return false;
        }
        BlockWord blockWord = (BlockWord) obj;
        return this.id == blockWord.id && Intrinsics.LJFF(this.content, blockWord.content) && this.blockSimilarVersions == blockWord.blockSimilarVersions && Intrinsics.LJFF(this.uniqId, blockWord.uniqId);
    }

    public BlockWord(int i, String str, int i2, String str2) {
        this.id = i;
        this.content = str;
        this.blockSimilarVersions = i2;
        this.uniqId = str2;
    }
}
