package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Crq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243721Crq extends Message.Builder<C2243601Cre, C2243721Crq> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public Long LJI;
    public EnumC2240681Cmw LJII;
    public EnumC2243741Crs LJIIIIZZ;
    public Long LJIIIZ;
    public String LJIIJ;
    public Long LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243601Cre build() {
        Long l = this.LJI;
        if (l != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C2243601Cre(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "material_sticker_id", this.LJII, "material_sticker_type", this.LJIIIIZZ, "element_type");
        throw null;
    }
}
