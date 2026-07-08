package X;

import com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226371CBv extends Message.Builder<MarkStrangerConversationReadRequestBody, C2226371CBv> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkStrangerConversationReadRequestBody build() {
        return new MarkStrangerConversationReadRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
