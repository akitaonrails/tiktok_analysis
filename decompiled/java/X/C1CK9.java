package X;

import com.bytedance.im.core.proto.ConversationRequest;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CK9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CK9 extends Message.Builder<ConversationRequest, C1CK9> {
    public Long LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationRequest build() {
        return new ConversationRequest(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
