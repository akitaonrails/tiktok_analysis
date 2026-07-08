package X;

import com.bytedance.im.core.proto.GetMessagesRequestBody;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870320YCg extends Message.Builder<GetMessagesRequestBody, C870320YCg> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public List<MessageIDIndexEntry> LJI = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetMessagesRequestBody build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new GetMessagesRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "conversation_id", this.LJ, "conversation_type", this.LJFF, "conversation_short_id");
        throw null;
    }
}
