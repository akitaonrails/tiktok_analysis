package X;

import com.bytedance.im.core.proto.MessageCheckInfoV2;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875160YUw extends Message.Builder<MessageCheckInfoV2, C875160YUw> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageCheckInfoV2 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new MessageCheckInfoV2(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "msg_id", this.LJ, "index_in_conv");
        throw null;
    }
}
