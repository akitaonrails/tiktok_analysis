package X;

import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YRU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YRU extends Message.Builder<MessageIDIndexEntry, C0YRU> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageIDIndexEntry build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new MessageIDIndexEntry(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "server_message_id", this.LJ, "index_in_conversation");
        throw null;
    }
}
