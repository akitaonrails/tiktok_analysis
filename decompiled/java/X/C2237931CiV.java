package X;

import com.bytedance.im.core.proto.status_message.MarkConversationReadEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237931CiV extends Message.Builder<MarkConversationReadEntity, C2237931CiV> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MarkConversationReadEntity build() {
        return new MarkConversationReadEntity(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
