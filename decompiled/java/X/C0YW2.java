package X;

import com.bytedance.im.core.proto.status_message.DeleteMessageEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YW2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YW2 extends Message.Builder<DeleteMessageEntity, C0YW2> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteMessageEntity build() {
        return new DeleteMessageEntity(this.LIZLLL, buildUnknownFields());
    }
}
