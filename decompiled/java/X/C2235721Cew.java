package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235721Cew extends Message.Builder<C2235701Ceu, C2235721Cew> {
    public C2235731Cex LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235701Ceu build() {
        C2235731Cex c2235731Cex = this.LIZLLL;
        if (c2235731Cex != null) {
            return new C2235701Ceu(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2235731Cex, "param");
        throw null;
    }
}
