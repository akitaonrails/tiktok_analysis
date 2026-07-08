package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1Cl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239551Cl7 extends Message.Builder<C2239531Cl5, C2239551Cl7> {
    public String LIZLLL;
    public C06G0 LJ;
    public Long LJFF;
    public String LJI;
    public Integer LJII;
    public String LJIIIZ;
    public Long LJIIJJI;
    public Long LJIIL;
    public EnumC1571506Dh LJIILIIL;
    public Integer LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public List<Integer> LJIIIIZZ = C1516540pZE.LJIIIIZZ();
    public Map<Integer, C2244461Ct2> LJIIJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2239531Cl5 build() {
        return new C2239531Cl5(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, buildUnknownFields());
    }
}
