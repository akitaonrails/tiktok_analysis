package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238561CjW extends Message.Builder<ConversationMessage, C2238561CjW> {
    public ConversationInfoV2 LIZLLL;
    public List<MessageBody> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationMessage build() {
        ConversationInfoV2 conversationInfoV2 = this.LIZLLL;
        if (conversationInfoV2 != null) {
            return new ConversationMessage(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(conversationInfoV2, "conversations");
        throw null;
    }
}
