package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CPU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPU extends Message.Builder<C1CPS, C1CPU> {
    public C1CPQ LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CPS build() {
        C1CPQ c1cpq = this.LIZLLL;
        if (c1cpq != null) {
            return new C1CPS(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cpq, "param");
        throw null;
    }
}
