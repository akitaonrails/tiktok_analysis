package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import com.bytedance.im.core.proto.GetConversationsCheckInfoV2ResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YRQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YRQ extends Message.Builder<GetConversationsCheckInfoV2ResponseBody, C0YRQ> {
    public List<ConversationCheckInfoV2> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Boolean LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationsCheckInfoV2ResponseBody build() {
        return new GetConversationsCheckInfoV2ResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
