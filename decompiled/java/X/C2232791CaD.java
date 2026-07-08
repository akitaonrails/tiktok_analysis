package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232791CaD extends Message.Builder<C2232771CaB, C2232791CaD> {
    public Double LIZLLL;
    public Double LJ;
    public Double LJFF;
    public Double LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232771CaB build() {
        Double d = this.LIZLLL;
        if (d != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2232771CaB(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(d, "left", this.LJ, "top", this.LJFF, "right", this.LJI, "bottom");
        throw null;
    }
}
