package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243281Cr8 extends Message.Builder<C2243261Cr6, C2243281Cr8> {
    public C2242211CpP LJIIIZ;
    public C2243941CsC LJIIJ;
    public ByteString LJIILJJIL;
    public C1CH0 LJIILL;
    public C2241571CoN LJIILLIIL;
    public Map<String, C2243521CrW> LIZLLL = new LinkedHashMap();
    public Map<String, C2244091CsR> LJ = new LinkedHashMap();
    public Map<String, C2244321Cso> LJFF = new LinkedHashMap();
    public Map<String, C2243081Cqo> LJI = new LinkedHashMap();
    public Map<String, C2244101CsS> LJII = new LinkedHashMap();
    public Map<String, C2242541Cpw> LJIIIIZZ = new LinkedHashMap();
    public Map<String, C2244091CsR> LJIIJJI = new LinkedHashMap();
    public Map<String, C2244101CsS> LJIIL = new LinkedHashMap();
    public Map<String, C2242541Cpw> LJIILIIL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243261Cr6 build() {
        return new C2243261Cr6(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, buildUnknownFields());
    }
}
