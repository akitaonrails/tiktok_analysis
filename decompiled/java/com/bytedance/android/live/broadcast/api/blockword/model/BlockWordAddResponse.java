package com.bytedance.android.live.broadcast.api.blockword.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class BlockWordAddResponse {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Integer id;

    @C09CT("words")
    public final List<BlockWord> words;

    public BlockWordAddResponse(Integer num, List<BlockWord> list) {
        this.id = num;
        this.words = list;
    }
}
