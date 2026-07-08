package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.squareup.wire.Message;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YQN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQN extends Message.Builder<MessagesInConversationResponseBody, C0YQN> {
    public Long LJ;
    public Boolean LJFF;
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<ByteString> LJI = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesInConversationResponseBody build() {
        return new MessagesInConversationResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
