package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLL extends Message.Builder<C1CLJ, C1CLL> {
    public C2229011CLz LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CLJ build() {
        C2229011CLz c2229011CLz = this.LIZLLL;
        if (c2229011CLz != null) {
            return new C1CLJ(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2229011CLz, "config");
        throw null;
    }
}
