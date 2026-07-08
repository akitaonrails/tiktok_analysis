package X;

import com.bytedance.im.core.proto.status_message.UpdateMessageExtEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237971CiZ extends Message.Builder<UpdateMessageExtEntity, C2237971CiZ> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UpdateMessageExtEntity build() {
        return new UpdateMessageExtEntity(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
