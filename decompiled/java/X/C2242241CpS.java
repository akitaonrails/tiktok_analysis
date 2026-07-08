package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242241CpS extends Message.Builder<C2242181CpM, C2242241CpS> {
    public C2244091CsR LIZLLL;
    public C2244091CsR LJ;
    public C2243941CsC LJFF;
    public C2244321Cso LJI;
    public C2242201CpO LJII;
    public C2244091CsR LJIIIIZZ;
    public C2244091CsR LJIIIZ;
    public ByteString LJIIJ;
    public C1CH0 LJIIJJI;
    public C2241571CoN LJIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2242181CpM build() {
        return new C2242181CpM(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
