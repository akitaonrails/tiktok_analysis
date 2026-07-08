package X;

import com.bytedance.im.core.proto.status_message.UpdateConversationSettingEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227141CEu extends Message.Builder<UpdateConversationSettingEntity, C2227141CEu> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateConversationSettingEntity build() {
        return new UpdateConversationSettingEntity(this.LIZLLL, buildUnknownFields());
    }
}
