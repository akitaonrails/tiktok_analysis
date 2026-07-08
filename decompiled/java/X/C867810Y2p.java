package X;

import com.bytedance.im.core.proto.status_message.DeleteConversationValue;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867810Y2p extends Message.Builder<DeleteConversationValue, C867810Y2p> {
    public Integer LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteConversationValue build() {
        return new DeleteConversationValue(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
