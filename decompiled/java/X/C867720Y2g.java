package X;

import com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Y2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867720Y2g extends Message.Builder<BatchMarkConversationReadRequestBody, C867720Y2g> {
    public List<MarkConversationReadRequestBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchMarkConversationReadRequestBody build() {
        return new BatchMarkConversationReadRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
