package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240671Cmv extends Message.Builder<C2240651Cmt, C2240671Cmv> {
    public Long LIZLLL;
    public C2240621Cmq LJ;
    public C2240621Cmq LJFF;
    public EnumC2240681Cmw LJI;
    public String LJII;
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2240651Cmt build() {
        return new C2240651Cmt(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
