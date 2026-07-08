package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1Cns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241261Cns extends Message.Builder<C2241271Cnt, C2241261Cns> {
    public C2240711Cmz LIZLLL;
    public C2241301Cnw LJ;
    public Long LJFF;
    public String LJI;
    public Long LJII;
    public Map<String, String> LJIIIIZZ = new LinkedHashMap();
    public Boolean LJIIIZ;
    public C2242211CpP LJIIJ;
    public C2243941CsC LJIIJJI;
    public C1CH0 LJIIL;
    public C2241571CoN LJIILIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241271Cnt build() {
        return new C2241271Cnt(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, buildUnknownFields());
    }
}
