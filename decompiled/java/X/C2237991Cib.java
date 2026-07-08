package X;

import com.bytedance.im.core.proto.status_message.UpdateMessagePropertyEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237991Cib extends Message.Builder<UpdateMessagePropertyEntity, C2237991Cib> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateMessagePropertyEntity build() {
        return new UpdateMessagePropertyEntity(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
