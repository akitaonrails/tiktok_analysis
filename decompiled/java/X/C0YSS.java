package X;

import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YSS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSS extends Message.Builder<GetRecentMessageRespBody, C0YSS> {
    public Long LIZLLL;
    public List<ConversationRecentMessage> LJ = C1516540pZE.LJIIIIZZ();
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetRecentMessageRespBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJFF != null) {
            return new GetRecentMessageRespBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "next_conversation_version", this.LJFF, "has_more");
        throw null;
    }
}
