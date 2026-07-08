package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.02jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C673202jy extends Message.Builder<C673002jw, C673202jy> {
    public String LIZLLL;
    public List<String> LJ = C1516540pZE.LJIIIIZZ();
    public Integer LJFF;
    public Integer LJI;
    public String LJII;
    public Long LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public C757702xb LJIILIIL;
    public C673402k0 LJIILJJIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C673002jw build() {
        return new C673002jw(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, buildUnknownFields());
    }
}
