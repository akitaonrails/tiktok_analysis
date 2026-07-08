package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236951Cgv extends Message.Builder<C2236941Cgu, C2236951Cgv> {
    public String LIZLLL;
    public C1CXX LJ;
    public String LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236941Cgu build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2236941Cgu(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "tag", this.LJ, "level", this.LJFF, "message", this.LJI, "extra");
        throw null;
    }
}
