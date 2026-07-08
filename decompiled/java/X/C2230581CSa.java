package X;

import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody;
import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230581CSa extends Message.Builder<GetConversationParticipantsMinIndexV3ResponseBody, C2230581CSa> {
    public List<ParticipantMinIndex> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationParticipantsMinIndexV3ResponseBody build() {
        return new GetConversationParticipantsMinIndexV3ResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
