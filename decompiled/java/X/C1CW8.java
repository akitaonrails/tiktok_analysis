package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CW8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CW8 extends Message.Builder<C1CW6, C1CW8> {
    public Long LIZLLL;
    public Long LJ;
    public String LJFF;
    public List<C1CW4> LJI = C1516540pZE.LJIIIIZZ();
    public List<C1CZI> LJII = C1516540pZE.LJIIIIZZ();
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CW6 build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C1CW6(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "channel_id", this.LJ, "state_version", this.LJFF, "layout_id");
        throw null;
    }
}
