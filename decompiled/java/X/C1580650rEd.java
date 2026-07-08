package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580650rEd {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public C1580650rEd() {
        this(null, null, null, null, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1580650rEd)) {
            return false;
        }
        C1580650rEd c1580650rEd = (C1580650rEd) obj;
        return Intrinsics.LJFF(this.LIZ, c1580650rEd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1580650rEd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1580650rEd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1580650rEd.LIZLLL) && this.LJ == c1580650rEd.LJ && Intrinsics.LJFF(this.LJFF, c1580650rEd.LJFF);
    }

    public C1580650rEd(Integer num, Integer num2, String str, String str2, boolean z, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        num2 = (i & 8) != 0 ? null : num2;
        z = (i & 16) != 0 ? false : z;
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = num2;
        this.LJ = z;
        this.LJFF = null;
    }
}
