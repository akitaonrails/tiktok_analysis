package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CN7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CN7 extends Message.Builder<C1CN5, C1CN7> {
    public String LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public C1CN8 LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CN5 build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C1CN5(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "codec", this.LJ, "b_frame", this.LJFF, "profile", this.LJI, "fps", this.LJII, "gop", this.LJIIIIZZ, "layout_info");
        throw null;
    }
}
