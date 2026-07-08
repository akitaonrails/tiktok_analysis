package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236321Cfu extends Message.Builder<C2236301Cfs, C2236321Cfu> {
    public C2236331Cfv LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236301Cfs build() {
        C2236331Cfv c2236331Cfv = this.LIZLLL;
        if (c2236331Cfv != null && this.LJ != null) {
            return new C2236301Cfs(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236331Cfv, "param", this.LJ, "callback");
        throw null;
    }
}
