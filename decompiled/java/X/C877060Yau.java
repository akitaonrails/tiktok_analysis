package X;

import com.bytedance.im.core.proto.status_message.RecallMessageEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Yau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877060Yau extends Message.Builder<RecallMessageEntity, C877060Yau> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RecallMessageEntity build() {
        return new RecallMessageEntity(this.LIZLLL, buildUnknownFields());
    }
}
