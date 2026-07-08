package X;

import com.bytedance.im.core.proto.AckMessage;
import com.bytedance.im.core.proto.BatchAckMessageRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YKZ extends Message.Builder<BatchAckMessageRequestBody, C0YKZ> {
    public List<AckMessage> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchAckMessageRequestBody build() {
        return new BatchAckMessageRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
