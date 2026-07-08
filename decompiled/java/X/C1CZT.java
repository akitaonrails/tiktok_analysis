package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CZT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZT extends Message.Builder<C1CZR, C1CZT> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public Long LJIIJJI;
    public Long LJIIL;
    public String LJIILIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CZR build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIIL != null && this.LJIILIIL != null) {
            return new C1CZR(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "cap_fps_min", this.LJ, "cap_fps_max", this.LJFF, "cap_width", this.LJI, "cap_height", this.LJII, "effect_fps", this.LJIIIIZZ, "effect_width", this.LJIIIZ, "effect_height", this.LJIIJ, "codec_fps", this.LJIIJJI, "codec_width", this.LJIIL, "codec_height", this.LJIILIIL, "business_id");
        throw null;
    }
}
