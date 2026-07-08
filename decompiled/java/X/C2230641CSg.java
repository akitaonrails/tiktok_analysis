package X;

import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230641CSg extends Message.Builder<GetConversationsCheckInfoResponseBody, C2230641CSg> {
    public List<ConversationCheckInfo> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationsCheckInfoResponseBody build() {
        return new GetConversationsCheckInfoResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
