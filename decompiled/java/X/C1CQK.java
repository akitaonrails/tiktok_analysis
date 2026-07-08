package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CQK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQK extends Message.Builder<C1CQI, C1CQK> {
    public Long LIZLLL;
    public Long LJ;
    public List<C1CQP> LJFF = C1516540pZE.LJIIIIZZ();
    public List<C1CQM> LJI = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQI build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C1CQI(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "start_at_flow_id", this.LJ, "min_app_version");
        throw null;
    }
}
