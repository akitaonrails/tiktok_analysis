package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527100pqG extends Message.Builder<C1527010pq7, C1527100pqG> {
    public EnumC1527210pqR LIZLLL;
    public String LJ;
    public String LJFF;
    public Long LJI;
    public EnumC1526160pok LJII;
    public String LJIIIIZZ;
    public EnumC1526180pom LJIIIZ;
    public EnumC1527220pqS LJIIJ;
    public Map<Integer, ByteString> LJIIJJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1527010pq7 build() {
        EnumC1527210pqR enumC1527210pqR = this.LIZLLL;
        if (enumC1527210pqR != null) {
            return new C1527010pq7(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC1527210pqR, "version");
        throw null;
    }
}
