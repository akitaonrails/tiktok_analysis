package X;

import com.bytedance.im.core.proto.status_message.RefreshMessageEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237951CiX extends Message.Builder<RefreshMessageEntity, C2237951CiX> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RefreshMessageEntity build() {
        return new RefreshMessageEntity(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
