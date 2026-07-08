package X;

import com.bytedance.im.core.proto.MessagesPerConversationSearchRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229321CNe extends Message.Builder<MessagesPerConversationSearchRequestBody, C2229321CNe> {
    public Long LIZLLL;
    public Integer LJ;
    public List<String> LJFF = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessagesPerConversationSearchRequestBody build() {
        Integer num = this.LJ;
        if (num != null) {
            return new MessagesPerConversationSearchRequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "limit");
        throw null;
    }
}
