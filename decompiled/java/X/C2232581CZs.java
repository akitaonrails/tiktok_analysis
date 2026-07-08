package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232581CZs extends Message.Builder<C2232561CZq, C2232581CZs> {
    public Double LIZLLL;
    public Double LJ;
    public Double LJFF;
    public Double LJI;
    public Double LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232561CZq build() {
        Double d = this.LIZLLL;
        if (d != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null) {
            return new C2232561CZq(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(d, "left", this.LJ, "top", this.LJFF, "right", this.LJI, "bottom", this.LJII, "radius");
        throw null;
    }
}
