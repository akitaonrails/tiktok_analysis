package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDX extends Message.Builder<C1CDV, C1CDX> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CDV build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C1CDV(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "token");
        throw null;
    }
}
