package X;

import com.bytedance.im.core.proto.BatchMarkConversationReadResponseBody;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Y2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867870Y2v extends Message.Builder<BatchMarkConversationReadResponseBody, C867870Y2v> {
    public List<MarkConversationReadRequestBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchMarkConversationReadResponseBody build() {
        return new BatchMarkConversationReadResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
