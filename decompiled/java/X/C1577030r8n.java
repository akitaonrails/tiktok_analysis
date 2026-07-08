package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0r8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577030r8n extends Message.Builder<C1577080r8s, C1577030r8n> {
    public Integer LIZLLL;
    public String LJ;
    public Integer LJFF;
    public List<C5186020i> LJI = C1516540pZE.LJIIIIZZ();
    public C1577210r95 LJII;
    public C1578240rAk LJIIIIZZ;
    public Boolean LJIIIZ;
    public C1577130r8x LJIIJ;
    public Integer LJIIJJI;
    public Integer LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public C1578240rAk LJIILL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1577080r8s build() {
        return new C1577080r8s(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, buildUnknownFields());
    }
}
