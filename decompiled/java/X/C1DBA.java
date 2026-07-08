package X;

import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.UpdateConversationParticipantResult;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBA, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBA extends Message.Builder<UpdateConversationParticipantResult, C1DBA> {
    public Participant LIZLLL;
    public Integer LJ;
    public String LJFF;
    public Long LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationParticipantResult build() {
        return new UpdateConversationParticipantResult(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
