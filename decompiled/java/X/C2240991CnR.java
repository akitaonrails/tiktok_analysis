package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240991CnR extends Message.Builder<C2241001CnS, C2240991CnR> {
    public Long LIZLLL;
    public EnumC901220ZXc LJ;
    public Long LJFF;
    public C2243941CsC LJI;
    public C2242211CpP LJII;
    public C1CH0 LJIIIIZZ;
    public C2241571CoN LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241001CnS build() {
        return new C2241001CnS(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
