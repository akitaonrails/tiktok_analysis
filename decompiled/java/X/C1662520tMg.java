package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662520tMg {
    public final Boolean LIZ;
    public final Boolean LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1662520tMg() {
        Boolean bool = null;
        this(bool, bool, bool, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1662520tMg)) {
            return false;
        }
        C1662520tMg c1662520tMg = (C1662520tMg) obj;
        return Intrinsics.LJFF(this.LIZ, c1662520tMg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1662520tMg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1662520tMg.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1662520tMg.LIZLLL);
    }

    public /* synthetic */ C1662520tMg(Boolean bool, Boolean bool2, Boolean bool3, int i) {
        this((i & 1) != 0 ? null : bool, (Boolean) null, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3);
    }

    public C1662520tMg(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.LIZ = bool;
        this.LIZIZ = bool2;
        this.LIZJ = bool3;
        this.LIZLLL = bool4;
    }
}
