package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Ct4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244481Ct4 extends Message.Builder<C2244461Ct2, C2244481Ct4> {
    public String LIZLLL;
    public Integer LJ;
    public Boolean LJFF;
    public EnumC19362110p1 LJI;
    public Integer LJII;
    public String LJIIIIZZ;
    public Integer LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2244461Ct2 build() {
        return new C2244461Ct2(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
