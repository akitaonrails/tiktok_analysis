package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CSC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSC extends Message.Builder<C1CSA, C1CSC> {
    public C2232591CZt LIZLLL;
    public C2232601CZu LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CSA build() {
        C2232591CZt c2232591CZt = this.LIZLLL;
        if (c2232591CZt != null && this.LJ != null) {
            return new C1CSA(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232591CZt, "full_info", this.LJ, "diff_info");
        throw null;
    }
}
