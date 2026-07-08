package X;

import com.bytedance.im.core.proto.status_message.DissolveConversationEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Yao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877000Yao extends Message.Builder<DissolveConversationEntity, C877000Yao> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DissolveConversationEntity build() {
        return new DissolveConversationEntity(this.LIZLLL, buildUnknownFields());
    }
}
