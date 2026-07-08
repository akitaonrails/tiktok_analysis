package X;

import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870310YCf extends Message.Builder<ReferencedMessageInfo, C870310YCf> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ReferencedMessageInfo build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new ReferencedMessageInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "referenced_message_id", this.LJ, "hint");
        throw null;
    }
}
