package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233481CbK extends Message.Builder<C2233461CbI, C2233481CbK> {
    public String LIZLLL;
    public String LJ;
    public Double LJFF;
    public String LJI;
    public Boolean LJII;
    public C2232771CaB LJIIIIZZ;
    public Long LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233461CbI build() {
        String str = this.LJ;
        if (str != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIZ != null) {
            return new C2233461CbI(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "layout_key", this.LJFF, "ratio", this.LJI, "mode", this.LJII, "has_split_line", this.LJIIIZ, "dsl_version");
        throw null;
    }
}
