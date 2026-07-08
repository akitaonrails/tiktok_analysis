package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKU extends Message.Builder<C1CKS, C1CKU> {
    public C1CKP LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CKS build() {
        C1CKP c1ckp = this.LIZLLL;
        if (c1ckp != null) {
            return new C1CKS(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1ckp, "param");
        throw null;
    }
}
