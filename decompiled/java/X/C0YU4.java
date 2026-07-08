package X;

import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YU4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YU4 extends Message.Builder<GetMessageError, C0YU4> {
    public MessageIDIndexEntry LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessageError build() {
        MessageIDIndexEntry messageIDIndexEntry = this.LIZLLL;
        if (messageIDIndexEntry != null && this.LJ != null) {
            return new GetMessageError(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(messageIDIndexEntry, "entry", this.LJ, "status_code");
        throw null;
    }
}
