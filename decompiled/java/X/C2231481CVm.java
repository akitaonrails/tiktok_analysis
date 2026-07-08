package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231481CVm extends Message.Builder<C2231461CVk, C2231481CVm> {
    public Long LIZLLL;
    public Long LJ;
    public Double LJFF;
    public ByteString LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231461CVk build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C2231461CVk(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "msg_id", this.LJ, "group_channel_id", this.LJFF, "receive_timestamp");
        throw null;
    }
}
