package X;

import com.bytedance.im.core.proto.status_message.FirstMessageEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Yaq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877020Yaq extends Message.Builder<FirstMessageEntity, C877020Yaq> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FirstMessageEntity build() {
        return new FirstMessageEntity(this.LIZLLL, buildUnknownFields());
    }
}
