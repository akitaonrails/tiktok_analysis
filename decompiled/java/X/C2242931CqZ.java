package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242931CqZ extends Message.Builder<C2242891CqV, C2242931CqZ> {
    public Long LIZLLL;
    public Long LJ;
    public C2243521CrW LJFF;
    public C2243521CrW LJI;
    public C2244091CsR LJII;
    public EnumC2242941Cqa LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2242891CqV build() {
        return new C2242891CqV(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
