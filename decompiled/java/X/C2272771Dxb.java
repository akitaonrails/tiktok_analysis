package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Dxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2272771Dxb extends Message.Builder<C2272721DxW, C2272771Dxb> {
    public Long LJ;
    public Integer LJFF;
    public String LJI;
    public Long LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public Long LJIIJ;
    public Integer LJIIJJI;
    public Integer LJIIL;
    public Long LJIILIIL;
    public Long LJIILJJIL;
    public Long LJIILLIIL;
    public Long LJIIZILJ;
    public Integer LJIJ;
    public String LJIJI;
    public Long LJIJJ;
    public Long LJIJJLI;
    public List<C1CJ8> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<Long> LJIILL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2272721DxW build() {
        Long l = this.LJ;
        if (l != null && this.LJFF != null) {
            return new C2272721DxW(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "streak_start", this.LJFF, "streak_counter");
        throw null;
    }
}
