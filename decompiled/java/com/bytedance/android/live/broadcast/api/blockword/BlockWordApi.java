package com.bytedance.android.live.broadcast.api.blockword;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordAddResponse;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetExtra;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import webcast.api.room.RecommendSensitiveWordResp;

/* JADX INFO: loaded from: classes13.dex */
public interface BlockWordApi {
    @InterfaceC1501160pAQ("/webcast/room/add_sensitive_word/")
    C11NZ<C470590Icr<BlockWordAddResponse>> addBlockWord(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("word_list") String str2, @InterfaceC1501070pAH("block_similar_versions") int i);

    @InterfaceC1501160pAQ("/webcast/room/add_sensitive_word/")
    C11NZ<C470590Icr<BlockWordAddResponse>> addBlockWord(@InterfaceC1501070pAH("word") String str, @InterfaceC1501070pAH("sec_anchor_id") String str2, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("block_similar_versions") int i, @InterfaceC1501070pAH("force_add") boolean z);

    @InterfaceC1501160pAQ("/webcast/room/del_sensitive_word/")
    C11NZ<C470590Icr<Object>> deleteBlockWord(@InterfaceC1501070pAH("word_id") int i, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("uniq_id") String str2);

    @InterfaceC1501160pAQ("/webcast/room/get_sensitive_word/")
    C11NZ<BaseResponse<BlockWordGetResponse, BlockWordGetExtra>> getBlockWord(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/room/recommend_sensitive_word/")
    C11NZ<C470590Icr<RecommendSensitiveWordResp.ResponseData>> recommendBlockWord(@InterfaceC1501070pAH("content") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("action") int i, @InterfaceC1501070pAH("comment_msg_id") long j2);
}
