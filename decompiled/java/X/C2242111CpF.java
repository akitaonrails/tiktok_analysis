package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242111CpF extends Message.Builder<C2242071CpB, C2242111CpF> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public C18SX LJIIJ;
    public String LJIIJJI;
    public Map<String, String> LJIIL = new LinkedHashMap();
    public C2242091CpD LJIILIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2242071CpB build() {
        return new C2242071CpB(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, buildUnknownFields());
    }
}
