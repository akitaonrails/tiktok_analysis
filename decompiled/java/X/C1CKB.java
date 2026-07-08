package X;

import com.bytedance.im.core.proto.BroadcastUserCounterRequestBody;
import com.bytedance.im.core.proto.ConversationRequest;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CKB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKB extends Message.Builder<BroadcastUserCounterRequestBody, C1CKB> {
    public List<ConversationRequest> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BroadcastUserCounterRequestBody build() {
        return new BroadcastUserCounterRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
