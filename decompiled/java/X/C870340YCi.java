package X;

import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870340YCi extends Message.Builder<MessageKey, C870340YCi> {
    public String LIZLLL;
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageKey build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new MessageKey(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "conversation_id", this.LJ, "conversation_short_id", this.LJFF, "server_message_id");
        throw null;
    }
}
