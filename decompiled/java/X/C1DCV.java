package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DCV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCV extends Message.Builder<C1DCT, C1DCV> {
    public String LIZLLL;
    public Integer LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public Long LJIIIZ;
    public Boolean LJIIJ;
    public Boolean LJIIJJI;
    public C1518290pc3 LJIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1DCT build() {
        return new C1DCT(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
