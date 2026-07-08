package X;

import com.bytedance.im.core.proto.MessagesInConversationWithRangeResponseBody;
import com.squareup.wire.Message;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YSN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSN extends Message.Builder<MessagesInConversationWithRangeResponseBody, C0YSN> {
    public List<ByteString> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesInConversationWithRangeResponseBody build() {
        return new MessagesInConversationWithRangeResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
