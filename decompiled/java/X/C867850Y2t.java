package X;

import com.bytedance.im.core.proto.status_message.DeleteMessageValue;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867850Y2t extends Message.Builder<DeleteMessageValue, C867850Y2t> {
    public Integer LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteMessageValue build() {
        return new DeleteMessageValue(this.LIZLLL, buildUnknownFields());
    }
}
