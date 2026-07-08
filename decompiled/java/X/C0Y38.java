package X;

import com.bytedance.im.core.proto.BatchDeleteConversationResponseBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Y38, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y38 extends Message.Builder<BatchDeleteConversationResponseBody, C0Y38> {
    public List<DeleteConversationRequestBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchDeleteConversationResponseBody build() {
        return new BatchDeleteConversationResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
