package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Crv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243771Crv extends Message.Builder<C2243641Cri, C2243771Crv> {
    public Long LIZLLL;
    public String LJ;
    public C2244091CsR LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243641Cri build() {
        return new C2243641Cri(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
