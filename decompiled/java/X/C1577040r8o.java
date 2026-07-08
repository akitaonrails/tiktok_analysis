package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0r8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577040r8o extends Message.Builder<C1577050r8p, C1577040r8o> {
    public String LIZLLL;
    public Boolean LJ;
    public C1578280rAo LJI;
    public Boolean LJIIIIZZ;
    public C1577190r93 LJIIIZ;
    public C1578240rAk LJIIJ;
    public Integer LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public List<C1578280rAo> LJFF = C1516540pZE.LJIIIIZZ();
    public List<C1578210rAh> LJII = C1516540pZE.LJIIIIZZ();
    public List<C1578210rAh> LJIILJJIL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1577050r8p build() {
        return new C1577050r8p(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, buildUnknownFields());
    }
}
