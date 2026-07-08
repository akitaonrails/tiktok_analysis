package X;

import com.bytedance.im.core.proto.status_message.ModeChangeEntity;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Yas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877040Yas extends Message.Builder<ModeChangeEntity, C877040Yas> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ModeChangeEntity build() {
        return new ModeChangeEntity(this.LIZLLL, buildUnknownFields());
    }
}
