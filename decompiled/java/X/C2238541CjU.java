package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerConversationSearchResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238541CjU extends Message.Builder<MessagesPerConversationSearchResponseBody, C2238541CjU> {
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<ConversationInfoV2> LJ = C1516540pZE.LJIIIIZZ();
    public Long LJFF;
    public Boolean LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerConversationSearchResponseBody build() {
        return new MessagesPerConversationSearchResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
