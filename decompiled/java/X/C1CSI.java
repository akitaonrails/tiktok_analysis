package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CSI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSI extends Message.Builder<C1CSG, C1CSI> {
    public C1CSJ LIZLLL;
    public C2229671COn LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CSG build() {
        C1CSJ c1csj = this.LIZLLL;
        if (c1csj != null && this.LJ != null) {
            return new C1CSG(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1csj, "origin", this.LJ, "size");
        throw null;
    }
}
