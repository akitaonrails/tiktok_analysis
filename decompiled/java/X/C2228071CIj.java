package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228071CIj extends Message.Builder<C2228051CIh, C2228071CIj> {
    public C2227501CGe LIZLLL;
    public C1CIG LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228051CIh build() {
        C2227501CGe c2227501CGe = this.LIZLLL;
        if (c2227501CGe != null) {
            return new C2228051CIh(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c2227501CGe, "param");
        throw null;
    }
}
