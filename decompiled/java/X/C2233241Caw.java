package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Caw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233241Caw extends Message.Builder<C2233221Cau, C2233241Caw> {
    public C2233171Cap LIZLLL;
    public String LJ;
    public Double LJFF;
    public Double LJI;
    public Double LJII;
    public Double LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public Long LJIIJJI;
    public Double LJIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233221Cau build() {
        C2233171Cap c2233171Cap = this.LIZLLL;
        if (c2233171Cap != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIIL != null) {
            return new C2233221Cau(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2233171Cap, "spot", this.LJFF, "x", this.LJI, "y", this.LJII, "width", this.LJIIIIZZ, "height", this.LJIIIZ, "z_order_stream", this.LJIIJ, "z_order_round_avatar", this.LJIIJJI, "z_order_gauss_bg", this.LJIIL, "radius");
        throw null;
    }
}
