package X;

import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagePerUserInboxResponse;
import com.squareup.wire.Message;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YSE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSE extends Message.Builder<MessagePerUserInboxResponse, C0YSE> {
    public Integer LIZLLL;
    public Boolean LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Integer LJIIIZ;
    public String LJIIJ;
    public C0YFV LJIIL;
    public List<MessageBody> LJ = C1516540pZE.LJIIIIZZ();
    public List<ByteString> LJFF = C1516540pZE.LJIIIIZZ();
    public List<ConversationBadgeCountInfo> LJIIJJI = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagePerUserInboxResponse build() {
        return new MessagePerUserInboxResponse(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
