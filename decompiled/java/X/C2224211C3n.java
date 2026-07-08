package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224211C3n extends Message.Builder<C2224191C3l, C2224211C3n> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2224191C3l build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2224191C3l(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "ret");
        throw null;
    }
}
