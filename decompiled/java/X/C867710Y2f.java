package X;

import com.bytedance.im.core.proto.BatchDeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Y2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867710Y2f extends Message.Builder<BatchDeleteConversationRequestBody, C867710Y2f> {
    public List<DeleteConversationRequestBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchDeleteConversationRequestBody build() {
        return new BatchDeleteConversationRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
