package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CIR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIR extends Message.Builder<C1CIP, C1CIR> {
    public C1CIG LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CIP build() {
        C1CIG c1cig = this.LIZLLL;
        if (c1cig != null) {
            return new C1CIP(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cig, "canvas");
        throw null;
    }
}
