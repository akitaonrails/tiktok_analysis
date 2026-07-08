package X;

import com.bytedance.im.core.proto.BatchGetMessagesRequestBody;
import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YD5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YD5 extends Message.Builder<BatchGetMessagesRequestBody, C0YD5> {
    public List<MessageKey> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchGetMessagesRequestBody build() {
        return new BatchGetMessagesRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
