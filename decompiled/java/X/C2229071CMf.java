package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229071CMf extends Message.Builder<C2229051CMd, C2229071CMf> {
    public C1CMY LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229051CMd build() {
        C1CMY c1cmy = this.LIZLLL;
        if (c1cmy != null) {
            return new C2229051CMd(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cmy, "response");
        throw null;
    }
}
