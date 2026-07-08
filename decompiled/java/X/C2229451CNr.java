package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229451CNr extends Message.Builder<C2229431CNp, C2229451CNr> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public String LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229431CNp build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null) {
            return new C2229431CNp(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "effect_width", this.LJ, "effect_height", this.LJFF, "w", this.LJI, "h", this.LJII, "fps", this.LJIIIIZZ, "bits", this.LJIIIZ, "bits_1_2", this.LJIIJ, "business_id");
        throw null;
    }
}
