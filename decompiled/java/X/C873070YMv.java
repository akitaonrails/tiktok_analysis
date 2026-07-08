package X;

import com.bytedance.im.core.proto.MessageRange;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873070YMv extends Message.Builder<MessageRange, C873070YMv> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageRange build() {
        return new MessageRange(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
