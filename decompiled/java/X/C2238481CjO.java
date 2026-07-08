package X;

import com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238481CjO extends Message.Builder<ConversationMessagePreViewResponseBody, C2238481CjO> {
    public List<MessageBody> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationMessagePreViewResponseBody build() {
        return new ConversationMessagePreViewResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
