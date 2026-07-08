package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229161CMo extends Message.Builder<C2229141CMm, C2229161CMo> {
    public Long LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229141CMm build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2229141CMm(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "err_code", this.LJ, "err_msg");
        throw null;
    }
}
