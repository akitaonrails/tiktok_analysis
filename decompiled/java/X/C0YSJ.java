package X;

import com.bytedance.im.core.proto.status_message.RefreshAllMessageValue;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSJ extends Message.Builder<RefreshAllMessageValue, C0YSJ> {
    public C0YGM LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RefreshAllMessageValue build() {
        return new RefreshAllMessageValue(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
