package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1DC9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DC9 extends Message.Builder<C1DCB, C1DC9> {
    public Integer LJ;
    public Long LJI;
    public String LJII;
    public String LJIIIIZZ;
    public Integer LJIIIZ;
    public Integer LJIIJ;
    public Integer LJIIJJI;
    public Integer LJIIL;
    public C2251481DAk LJIILIIL;
    public C2251481DAk LJIILJJIL;
    public C2251671DBd LJIILLIIL;
    public C1517790pbF LJIIZILJ;
    public Long LJIJ;
    public List<C1DCH> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<String> LJFF = C1516540pZE.LJIIIIZZ();
    public List<C2251371D9z> LJIILL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1DCB build() {
        return new C1DCB(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, buildUnknownFields());
    }
}
