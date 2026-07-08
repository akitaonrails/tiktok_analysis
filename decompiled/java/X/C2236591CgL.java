package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236591CgL extends Message.Builder<C2236571CgJ, C2236591CgL> {
    public C2236631CgP LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236571CgJ build() {
        C2236631CgP c2236631CgP = this.LIZLLL;
        if (c2236631CgP != null && this.LJ != null) {
            return new C2236571CgJ(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236631CgP, "param", this.LJ, "callback");
        throw null;
    }
}
