package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Ca0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232661Ca0 extends Message.Builder<C2232601CZu, C2232661Ca0> {
    public String LIZLLL;
    public String LJ;
    public C2228421CJs LJFF;
    public List<C1CZJ> LJI = C1516540pZE.LJIIIIZZ();
    public List<C2232631CZx> LJII = C1516540pZE.LJIIIIZZ();
    public List<C1CZJ> LJIIIIZZ = C1516540pZE.LJIIIIZZ();
    public C2233351Cb7 LJIIIZ;
    public C2233351Cb7 LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232601CZu build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2232601CZu(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "layout_key", this.LJ, "old_layout_key");
        throw null;
    }
}
