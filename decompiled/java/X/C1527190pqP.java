package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0pqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527190pqP extends Message.Builder<C1527060pqC, C1527190pqP> {
    public C1527010pq7 LIZLLL;
    public List<C1527020pq8> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1527060pqC build() {
        C1527010pq7 c1527010pq7 = this.LIZLLL;
        if (c1527010pq7 != null) {
            return new C1527060pqC(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1527010pq7, "header");
        throw null;
    }
}
