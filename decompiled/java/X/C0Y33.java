package X;

import com.bytedance.im.core.proto.ConversationLeaveRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y33, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y33 extends Message.Builder<ConversationLeaveRequestBody, C0Y33> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationLeaveRequestBody build() {
        return new ConversationLeaveRequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
