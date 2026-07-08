package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230071CQb extends Message.Builder<C1CQZ, C2230071CQb> {
    public Long LIZLLL;
    public Boolean LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public List<Long> LJIIIZ = C1516540pZE.LJIIIIZZ();
    public List<Long> LJIIJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQZ build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C1CQZ(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "next", this.LJ, "end");
        throw null;
    }
}
