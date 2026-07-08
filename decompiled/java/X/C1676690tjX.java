package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676690tjX {
    public final C1676520tjG LIZ;
    public final C1676530tjH LIZIZ;
    public final C1676760tje LIZJ;
    public final C1676660tjU LIZLLL;
    public final boolean LJ;
    public final Map<Object, Object> LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C1676690tjX() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1676690tjX)) {
            return false;
        }
        C1676690tjX c1676690tjX = (C1676690tjX) obj;
        return Intrinsics.LJFF(this.LIZ, c1676690tjX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1676690tjX.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1676690tjX.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1676690tjX.LIZLLL) && this.LJ == c1676690tjX.LJ && Intrinsics.LJFF(this.LJFF, c1676690tjX.LJFF);
    }

    public C1676690tjX(C1676520tjG c1676520tjG, C1676530tjH c1676530tjH, C1676760tje c1676760tje, C1676660tjU c1676660tjU, boolean z, Map<Object, Object> map) {
        this.LIZ = c1676520tjG;
        this.LIZIZ = c1676530tjH;
        this.LIZJ = c1676760tje;
        this.LIZLLL = c1676660tjU;
        this.LJ = z;
        this.LJFF = map;
    }

    public /* synthetic */ C1676690tjX(C1676520tjG c1676520tjG, C1676530tjH c1676530tjH, C1676760tje c1676760tje, C1676660tjU c1676660tjU, boolean z, Map map, int i) {
        this((i & 1) != 0 ? null : c1676520tjG, (i & 2) != 0 ? null : c1676530tjH, (i & 4) != 0 ? null : c1676760tje, (i & 8) == 0 ? c1676660tjU : null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? C2097608Jq.LJ() : map);
    }
}
