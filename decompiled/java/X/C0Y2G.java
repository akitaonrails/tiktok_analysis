package X;

import com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y2G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y2G extends Message.Builder<DeleteStrangerConversationRequestBody, C0Y2G> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteStrangerConversationRequestBody build() {
        return new DeleteStrangerConversationRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
