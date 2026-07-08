package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240951CnN extends Message.Builder<C2240961CnO, C2240951CnN> {
    public String LIZLLL;
    public C2243941CsC LJ;
    public String LJFF;
    public C1CH0 LJI;
    public C2241571CoN LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2240961CnO build() {
        return new C2240961CnO(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
