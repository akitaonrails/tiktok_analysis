package X;

import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.squareup.wire.Message;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YSF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSF extends Message.Builder<MessagesPerUserResponseBody, C0YSF> {
    public Long LJ;
    public Boolean LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIZ;
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<ConversationBadgeCountInfo> LJIIIIZZ = C1516540pZE.LJIIIIZZ();
    public List<ByteString> LJIIJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerUserResponseBody build() {
        return new MessagesPerUserResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
    }
}
