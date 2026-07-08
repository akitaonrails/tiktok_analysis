package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229901CPk extends Message.Builder<C2229881CPi, C2229901CPk> {
    public List<Long> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;
    public C1CQM LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229881CPi build() {
        Long l = this.LJ;
        if (l != null && this.LJFF != null) {
            return new C2229881CPi(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "next_state_id", this.LJFF, "state");
        throw null;
    }
}
