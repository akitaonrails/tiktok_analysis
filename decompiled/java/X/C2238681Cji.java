package X;

import com.bytedance.im.core.proto.GetMessageByKeyError;
import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238681Cji extends Message.Builder<GetMessageByKeyError, C2238681Cji> {
    public MessageKey LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageByKeyError build() {
        MessageKey messageKey = this.LIZLLL;
        if (messageKey != null && this.LJ != null) {
            return new GetMessageByKeyError(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(messageKey, "key", this.LJ, "status_code");
        throw null;
    }
}
