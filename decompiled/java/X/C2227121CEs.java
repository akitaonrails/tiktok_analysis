package X;

import com.bytedance.im.core.proto.status_message.UpdateConversationCoreInfoEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227121CEs extends Message.Builder<UpdateConversationCoreInfoEntity, C2227121CEs> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationCoreInfoEntity build() {
        return new UpdateConversationCoreInfoEntity(this.LIZLLL, buildUnknownFields());
    }
}
