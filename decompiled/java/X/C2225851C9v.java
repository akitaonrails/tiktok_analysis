package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225851C9v extends Message.Builder<C2225831C9t, C2225851C9v> {
    public C2225801C9q LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2225831C9t build() {
        C2225801C9q c2225801C9q = this.LIZLLL;
        if (c2225801C9q != null) {
            return new C2225831C9t(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2225801C9q, "event");
        throw null;
    }
}
