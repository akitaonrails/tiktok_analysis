package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0e4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074450e4B {
    public final C19EG LIZ;
    public final EnumC1074240e3q LIZIZ;
    public final C1074520e4I LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C1722300uv6 LJI;
    public final C1722300uv6 LJII;
    public final boolean LJIIIIZZ;
    public final ConcurrentHashMap<Pair<String, String>, Boolean> LJIIIZ;

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        C1722300uv6 c1722300uv6 = this.LJI;
        int iHashCode2 = (iHashCode + (c1722300uv6 == null ? 0 : c1722300uv6.hashCode())) * 31;
        C1722300uv6 c1722300uv62 = this.LJII;
        return ((((iHashCode2 + (c1722300uv62 != null ? c1722300uv62.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode();
    }

    public C1074450e4B(C19EG c19eg, EnumC1074240e3q enumC1074240e3q, C1074520e4I c1074520e4I, boolean z) {
        ConcurrentHashMap<Pair<String, String>, Boolean> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZ = c19eg;
        this.LIZIZ = enumC1074240e3q;
        this.LIZJ = c1074520e4I;
        this.LIZLLL = true;
        this.LJ = true;
        this.LJFF = true;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = z;
        this.LJIIIZ = concurrentHashMap;
    }
}
