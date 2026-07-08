package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242911CqX extends Message.Builder<C2242861CqS, C2242911CqX> {
    public C2242891CqV LIZLLL;
    public C2243941CsC LJ;
    public C2242541Cpw LJFF;
    public List<C2243521CrW> LJI = C1516540pZE.LJIIIIZZ();
    public EnumC2242921CqY LJII;
    public C2242771CqJ LJIIIIZZ;
    public C1CH0 LJIIIZ;
    public C2241571CoN LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2242861CqS build() {
        return new C2242861CqS(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
    }
}
