package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CEJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CEJ extends Message.Builder<C1CEH, C1CEJ> {
    public C1CEF LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CEH build() {
        C1CEF c1cef = this.LIZLLL;
        if (c1cef != null) {
            return new C1CEH(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cef, "link");
        throw null;
    }
}
