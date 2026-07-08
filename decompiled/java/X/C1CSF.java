package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CSF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSF extends Message.Builder<C1CSD, C1CSF> {
    public C1CSG LIZLLL;
    public Boolean LJ;
    public Long LJFF;
    public Double LJI;
    public String LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CSD build() {
        C1CSG c1csg = this.LIZLLL;
        if (c1csg != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJIIIIZZ != null) {
            return new C1CSD(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1csg, "rect", this.LJ, "is_talk", this.LJFF, "z_order", this.LJI, "corner_radius", this.LJIIIIZZ, "win_id");
        throw null;
    }
}
