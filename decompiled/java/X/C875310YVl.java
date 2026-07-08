package X;

import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YVl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875310YVl extends Message.Builder<UpdateConversationParticipantResponseBody, C875310YVl> {
    public Participant LIZLLL;
    public Integer LJ;
    public String LJFF;
    public Long LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationParticipantResponseBody build() {
        return new UpdateConversationParticipantResponseBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
