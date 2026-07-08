package X;

import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YJK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJK extends Message.Builder<GetConversationParticipantsReadIndexV3RequestBody, C0YJK> {
    public Long LIZLLL;
    public Integer LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationParticipantsReadIndexV3RequestBody build() {
        return new GetConversationParticipantsReadIndexV3RequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
