package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CQX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQX extends Message.Builder<C1CQV, C1CQX> {
    public Long LIZLLL;
    public Boolean LJ;
    public String LJFF;
    public String LJI;
    public List<Long> LJII = C1516540pZE.LJIIIIZZ();
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQV build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJIIIIZZ != null && this.LJIIIZ != null) {
            return new C1CQV(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "next", this.LJ, "end", this.LJFF, "name", this.LJIIIIZZ, "version", this.LJIIIZ, "min_app_version");
        throw null;
    }
}
