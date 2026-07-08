package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Crp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243711Crp extends Message.Builder<C2243611Crf, C2243711Crp> {
    public C2243521CrW LIZLLL;
    public EnumC19363210pC LJFF;
    public C2243941CsC LJI;
    public Integer LJIIIZ;
    public C1CH0 LJIIJJI;
    public C2241571CoN LJIIL;
    public List<C2244431Csz> LJ = C1516540pZE.LJIIIIZZ();
    public List<C2242541Cpw> LJII = C1516540pZE.LJIIIIZZ();
    public List<C2244321Cso> LJIIIIZZ = C1516540pZE.LJIIIIZZ();
    public List<Integer> LJIIJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243611Crf build() {
        return new C2243611Crf(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
