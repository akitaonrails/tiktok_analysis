package X;

import com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1DBC, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBC extends Message.Builder<ConversationRemoveParticipantsResponseBody, C1DBC> {
    public Integer LJ;
    public String LJFF;
    public Long LJI;
    public String LJII;
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<SecUidPair> LJIIIIZZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationRemoveParticipantsResponseBody build() {
        return new ConversationRemoveParticipantsResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
