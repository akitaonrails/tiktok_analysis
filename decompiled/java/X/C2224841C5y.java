package X;

import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224841C5y extends Message.Builder<MarkMultiStrangerConversationReadRequestBody, C2224841C5y> {
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkMultiStrangerConversationReadRequestBody build() {
        return new MarkMultiStrangerConversationReadRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
