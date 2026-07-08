package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226541CCm extends Message.Builder<C2226521CCk, C2226541CCm> {
    public Long LIZLLL;
    public List<Long> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226521CCk build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C2226521CCk(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "state_id");
        throw null;
    }
}
