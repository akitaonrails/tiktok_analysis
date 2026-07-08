package X;

import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody;
import com.bytedance.im.core.proto.MessagesCheckInfo;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1DAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251511DAn extends Message.Builder<GetMessagesCheckInfoInConversationResponseBody, C2251511DAn> {
    public List<MessagesCheckInfo> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Integer LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesCheckInfoInConversationResponseBody build() {
        return new GetMessagesCheckInfoInConversationResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
