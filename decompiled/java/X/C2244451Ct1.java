package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Ct1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244451Ct1 extends Message.Builder<C2244431Csz, C2244451Ct1> {
    public Long LIZLLL;
    public Long LJ;
    public C2244091CsR LJFF;
    public C2244091CsR LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2244431Csz build() {
        return new C2244431Csz(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
