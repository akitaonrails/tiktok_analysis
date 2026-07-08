package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CIX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIX extends Message.Builder<C1CIV, C1CIX> {
    public C1CIG LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CIV build() {
        C1CIG c1cig = this.LIZLLL;
        if (c1cig != null) {
            return new C1CIV(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cig, "provider");
        throw null;
    }
}
