package X;

import com.bytedance.im.core.proto.status_message.RefreshAllMessageEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Yaw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877080Yaw extends Message.Builder<RefreshAllMessageEntity, C877080Yaw> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RefreshAllMessageEntity build() {
        return new RefreshAllMessageEntity(this.LIZLLL, buildUnknownFields());
    }
}
