package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236081CfW extends Message.Builder<C2236061CfU, C2236081CfW> {
    public C2236091CfX LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236061CfU build() {
        C2236091CfX c2236091CfX = this.LIZLLL;
        if (c2236091CfX != null && this.LJ != null) {
            return new C2236061CfU(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2236091CfX, "param", this.LJ, "callback");
        throw null;
    }
}
