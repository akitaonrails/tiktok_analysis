package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0pqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527110pqH extends Message.Builder<C1527020pq8, C1527110pqH> {
    public EnumC1527170pqN LIZLLL;
    public EnumC1527250pqV LJ;
    public EnumC1525890poJ LJFF;
    public Long LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public List<C1527130pqJ> LJIIIZ = C1516540pZE.LJIIIIZZ();
    public EnumC1527240pqU LJIIJ;
    public Long LJIIJJI;
    public String LJIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1527020pq8 build() {
        EnumC1527170pqN enumC1527170pqN = this.LIZLLL;
        if (enumC1527170pqN != null && this.LJFF != null) {
            return new C1527020pq8(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC1527170pqN, "flag", this.LJFF, "topic_type");
        throw null;
    }
}
