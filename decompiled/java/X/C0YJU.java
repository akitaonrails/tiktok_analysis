package X;

import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YJU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJU extends Message.Builder<ConversationParticipantReadIndex, C0YJU> {
    public String LIZLLL;
    public Long LJ;
    public List<ParticipantReadIndex> LJFF = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationParticipantReadIndex build() {
        return new ConversationParticipantReadIndex(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
