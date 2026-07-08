package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527150pqL extends Message.Builder<C1527130pqJ, C1527150pqL> {
    public C1527140pqK LIZLLL;
    public C1527080pqE LJ;
    public EnumC1527270pqX LJFF;
    public Long LJI;
    public EnumC1527260pqW LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Long LJIIJ;
    public Map<String, String> LJIIJJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1527130pqJ build() {
        C1527140pqK c1527140pqK = this.LIZLLL;
        if (c1527140pqK != null) {
            return new C1527130pqJ(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(c1527140pqK, "cursor");
        throw null;
    }
}
