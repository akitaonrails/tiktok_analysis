package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1Cno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241221Cno extends Message.Builder<C2241171Cnj, C2241221Cno> {
    public C2241211Cnn LIZLLL;
    public C2241191Cnl LJ;
    public C2238691Cjj LJFF;
    public Long LJI;
    public String LJII;
    public Long LJIIIIZZ;
    public Map<String, String> LJIIIZ = new LinkedHashMap();
    public Boolean LJIIJ;
    public C2242211CpP LJIIJJI;
    public C2243941CsC LJIIL;
    public C1CH0 LJIILIIL;
    public C2241571CoN LJIILJJIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241171Cnj build() {
        return new C2241171Cnj(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, buildUnknownFields());
    }
}
