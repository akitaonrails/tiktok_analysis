package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1D0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248941D0q extends Message.Builder<C2248921D0o, C2248941D0q> {
    public String LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Double LJII;
    public Double LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public Long LJIIJJI;
    public Long LJIIL;
    public Long LJIILIIL;
    public Long LJIILJJIL;
    public Boolean LJIILL;
    public Long LJIILLIIL;
    public Long LJIIZILJ;
    public Long LJIJ;
    public Long LJIJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2248921D0o build() {
        Long l = this.LJ;
        if (l != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIIL != null && this.LJIILIIL != null && this.LJIILJJIL != null && this.LJIILL != null && this.LJIILLIIL != null && this.LJIIZILJ != null && this.LJIJ != null && this.LJIJI != null) {
            return new C2248921D0o(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "delay", this.LJFF, "width", this.LJI, "height", this.LJII, "video_loss_rate", this.LJIIIIZZ, "received_kb", this.LJIIIZ, "received_frame_rate", this.LJIIJ, "decoder_output_frame_rate", this.LJIIJJI, "render_output_frame_rate", this.LJIIL, "stall_count", this.LJIILIIL, "stall_duration", this.LJIILJJIL, "e2e_delay", this.LJIILL, "is_screen", this.LJIILLIIL, "stats_interval", this.LJIIZILJ, "rtt", this.LJIJ, "frozen_rate", this.LJIJI, "video_index");
        throw null;
    }
}
