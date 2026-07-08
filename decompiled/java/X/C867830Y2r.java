package X;

import com.bytedance.im.core.proto.status_message.UpdateConversationParticipantValue;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Y2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867830Y2r extends Message.Builder<UpdateConversationParticipantValue, C867830Y2r> {
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<Long> LJ = C1516540pZE.LJIIIIZZ();
    public List<Long> LJFF = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationParticipantValue build() {
        return new UpdateConversationParticipantValue(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
