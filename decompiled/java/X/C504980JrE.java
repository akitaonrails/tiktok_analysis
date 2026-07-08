package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.CommentSendResp;

/* JADX INFO: renamed from: X.0JrE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504980JrE extends C09AY implements Function1<C506340JtQ, C506340JtQ> {
    public final /* synthetic */ C470590Icr<CommentSendResp.ResponseData> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504980JrE(C470590Icr<CommentSendResp.ResponseData> c470590Icr) {
        super(1);
        this.LL = c470590Icr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C506340JtQ invoke(C506340JtQ c506340JtQ) {
        SpaceCommentItem spaceCommentItem;
        C506340JtQ c506340JtQ2 = c506340JtQ;
        CommentSendResp.ResponseData responseData = this.LL.data;
        if (responseData != null) {
            spaceCommentItem = responseData.comment;
        } else {
            spaceCommentItem = null;
        }
        return C506340JtQ.LIZ(c506340JtQ2, null, null, null, null, null, null, new C291001Au(spaceCommentItem), null, null, null, null, 7935);
    }
}
