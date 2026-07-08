package X;

import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251191D9h extends Message.Builder<GetConversationParticipantsMinIndexV3RequestBody, C2251191D9h> {
    public Long LIZLLL;
    public Integer LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationParticipantsMinIndexV3RequestBody build() {
        return new GetConversationParticipantsMinIndexV3RequestBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
