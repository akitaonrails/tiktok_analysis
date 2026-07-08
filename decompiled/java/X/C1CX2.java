package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CX2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CX2 extends Message.Builder<C2231691CWh, C1CX2> {
    public Long LIZLLL;
    public C1CXQ LJ;
    public C2227321CFm LJFF;
    public C2232921CaQ LJI;
    public C2227291CFj LJII;
    public C2232931CaR LJIIIIZZ;
    public Double LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231691CWh build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJIIIZ != null) {
            return new C2231691CWh(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "msg_id", this.LJ, "im_type", this.LJIIIZ, "receive_timestamp");
        throw null;
    }
}
