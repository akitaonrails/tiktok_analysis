package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0rAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578230rAj extends Message.Builder<C1578180rAe, C1578230rAj> {
    public Integer LIZLLL;
    public List<C1578210rAh> LJ = C1516540pZE.LJIIIIZZ();
    public List<C1578210rAh> LJFF = C1516540pZE.LJIIIIZZ();
    public List<C1578260rAm> LJI = C1516540pZE.LJIIIIZZ();
    public final C1504900pGS LJII = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1578180rAe build() {
        return new C1578180rAe(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
