package X;

import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C62, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C62 extends Message.Builder<MarkMultiStrangerConversationReadResponseBody, C1C62> {
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMultiStrangerConversationReadResponseBody build() {
        return new MarkMultiStrangerConversationReadResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
