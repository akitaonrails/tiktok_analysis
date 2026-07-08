package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1ChD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237131ChD extends Message.Builder<C2237111ChB, C2237131ChD> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237111ChB build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C2237111ChB(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "native_im_sdk_received_time", this.LJ, "native_after_decode_time", this.LJFF, "native_msg_from");
        throw null;
    }
}
