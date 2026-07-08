package X;

import com.bytedance.im.core.proto.DeleteMultiStrangerConversationResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C60, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C60 extends Message.Builder<DeleteMultiStrangerConversationResponseBody, C1C60> {
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteMultiStrangerConversationResponseBody build() {
        return new DeleteMultiStrangerConversationResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
