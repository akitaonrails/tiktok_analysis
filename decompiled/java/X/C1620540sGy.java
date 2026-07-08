package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0sGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620540sGy extends Message.Builder<C1620520sGw, C1620540sGy> {
    public Integer LIZLLL;
    public String LJ;
    public Integer LJFF;
    public final C1504900pGS LJI = C1516540pZE.LJIIIIZZ();
    public C1518060pbg LJII;
    public C1620500sGu LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1620520sGw build() {
        Integer num = this.LJFF;
        if (num != null) {
            return new C1620520sGw(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "has_more");
        throw null;
    }
}
