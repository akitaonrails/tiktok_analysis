package com.bytedance.android.live.aireply;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.chatroom.model.CommentReplyFeedbackResponse;
import com.bytedance.android.livesdk.chatroom.model.CommentReplyListResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LiveAIReplyApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/comment_reply/feedback/")
    Object commentReplyFeedback(@InterfaceC1501050pAF("reply_id") long j, @InterfaceC1501050pAF("anchor_id") long j2, @InterfaceC1501050pAF("feedback_status") int i, InterfaceC1364105Vn<? super C470590Icr<CommentReplyFeedbackResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/comment_reply/list/")
    Object commentReplyList(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("offset") int i, @InterfaceC1501070pAH("limit") int i2, InterfaceC1364105Vn<? super C470590Icr<CommentReplyListResponse.ResponseData>> interfaceC1364105Vn);
}
