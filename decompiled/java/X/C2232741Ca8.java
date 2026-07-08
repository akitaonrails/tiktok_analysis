package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1Ca8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232741Ca8 extends Message.Builder<C2232721Ca6, C2232741Ca8> {
    public String LIZLLL;
    public String LJ;
    public Long LJFF;
    public Double LJII;
    public C2232731Ca7 LJIIIIZZ;
    public C2233351Cb7 LJIIJ;
    public C2232771CaB LJIIJJI;
    public Map<String, C2232531CZn> LJI = new LinkedHashMap();
    public List<Long> LJIIIZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2232721Ca6 build() {
        String str = this.LJ;
        if (str != null && this.LJFF != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIJ != null) {
            return new C2232721Ca6(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "layout_key", this.LJFF, "ver", this.LJII, "ratio", this.LJIIIIZZ, "link_layout_container", this.LJIIJ, "layout_extra");
        throw null;
    }
}
