package X;

import com.bytedance.im.core.proto.ConversationParticipantsListResponseBody;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Y4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868190Y4b extends Message.Builder<ConversationParticipantsListResponseBody, C868190Y4b> {
    public ParticipantsPage LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationParticipantsListResponseBody build() {
        return new ConversationParticipantsListResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
