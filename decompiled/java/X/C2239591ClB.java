package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PreviewerMessagesInConversationResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1ClB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239591ClB extends Message.Builder<PreviewerMessagesInConversationResponseBody, C2239591ClB> {
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;
    public Boolean LJFF;
    public Integer LJI;
    public Long LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PreviewerMessagesInConversationResponseBody build() {
        return new PreviewerMessagesInConversationResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
