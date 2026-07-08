package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233961Cc6 extends Message.Builder<C2233941Cc4, C2233961Cc6> {
    public C2233611CbX LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233941Cc4 build() {
        C2233611CbX c2233611CbX = this.LIZLLL;
        if (c2233611CbX != null) {
            return new C2233941Cc4(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2233611CbX, "source");
        throw null;
    }
}
