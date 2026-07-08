package X;

import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229841CPe extends Message.Builder<StatusMessage, C2229841CPe> {
    public Integer LIZLLL;
    public ByteString LJ;
    public ByteString LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final StatusMessage build() {
        return new StatusMessage(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
