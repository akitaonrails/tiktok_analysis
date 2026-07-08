package X;

import com.bytedance.im.core.proto.status_message.UpdateConversationParticipantEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPF extends Message.Builder<UpdateConversationParticipantEntity, C1CPF> {
    public String LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationParticipantEntity build() {
        return new UpdateConversationParticipantEntity(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
