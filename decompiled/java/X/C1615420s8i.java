package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615420s8i {
    public final String LIZ;
    public final Boolean LIZIZ;
    public final C11NJ LIZJ;
    public final String LIZLLL;

    public C1615420s8i() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1615420s8i)) {
            return false;
        }
        C1615420s8i c1615420s8i = (C1615420s8i) obj;
        return Intrinsics.LJFF(this.LIZ, c1615420s8i.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1615420s8i.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1615420s8i.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1615420s8i.LIZLLL);
    }

    public C1615420s8i(int i) {
        Boolean bool = Boolean.TRUE;
        this.LIZ = "";
        this.LIZIZ = bool;
        this.LIZJ = null;
        this.LIZLLL = null;
    }
}
