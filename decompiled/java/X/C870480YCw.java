package X;

import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870480YCw extends Message.Builder<BatchGetConversationParticipantsReadIndexRequestBody, C870480YCw> {
    public List<String> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<Long> LJ = C1516540pZE.LJIIIIZZ();
    public String LJFF;
    public Boolean LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchGetConversationParticipantsReadIndexRequestBody build() {
        return new BatchGetConversationParticipantsReadIndexRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
