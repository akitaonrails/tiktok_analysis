package X;

import com.bytedance.im.core.proto.DeleteMultiStrangerConversationRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224821C5w extends Message.Builder<DeleteMultiStrangerConversationRequestBody, C2224821C5w> {
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final DeleteMultiStrangerConversationRequestBody build() {
        return new DeleteMultiStrangerConversationRequestBody(this.LIZLLL, buildUnknownFields());
    }
}
