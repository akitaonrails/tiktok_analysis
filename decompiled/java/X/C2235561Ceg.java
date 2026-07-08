package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Ceg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235561Ceg extends Message.Builder<C2235541Cee, C2235561Ceg> {
    public C2235511Ceb LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235541Cee build() {
        C2235511Ceb c2235511Ceb = this.LIZLLL;
        if (c2235511Ceb != null && this.LJ != null) {
            return new C2235541Cee(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2235511Ceb, "param", this.LJ, "callback");
        throw null;
    }
}
