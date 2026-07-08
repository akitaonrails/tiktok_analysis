package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231681CWg extends Message.Builder<C2231661CWe, C2231681CWg> {
    public Long LIZLLL;
    public EnumC2231801CWs LJ;
    public C1CXR LJFF;
    public EnumC2231901CXc LJI;
    public ByteString LJII;
    public Double LJIIIIZZ;
    public C2228211CIx LJIIIZ;
    public C2233011CaZ LJIIJ;
    public C2233041Cac LJIIJJI;
    public C2232891CaN LJIIL;
    public C1CFY LJIILIIL;
    public C2227201CFa LJIILJJIL;
    public C2232981CaW LJIILL;
    public C1CKY LJIILLIIL;
    public C1CPN LJIIZILJ;
    public C1CJO LJIJ;
    public C2227241CFe LJIJI;
    public C2227261CFg LJIJJ;
    public C2227321CFm LJIJJLI;
    public C1CHQ LJIL;
    public C2232921CaQ LJJ;
    public C2227291CFj LJJI;
    public C1CHN LJJIFFI;
    public C2232931CaR LJJII;
    public C2229461CNs LJJIII;
    public C1CNW LJJIIJ;
    public C1CNT LJJIIJZLJL;
    public C1CFU LJJIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231661CWe build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJIIIIZZ != null) {
            return new C2231661CWe(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJI, this.LJJIFFI, this.LJJII, this.LJJIII, this.LJJIIJ, this.LJJIIJZLJL, this.LJJIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "msg_id", this.LJ, "im_type", this.LJFF, "sub_type", this.LJI, "mode", this.LJIIIIZZ, "receive_timestamp");
        throw null;
    }
}
