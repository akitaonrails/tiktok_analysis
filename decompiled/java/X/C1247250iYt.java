package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247250iYt {
    public final String LIZ;
    public final int LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1247250iYt)) {
            return false;
        }
        C1247250iYt c1247250iYt = (C1247250iYt) obj;
        return Intrinsics.LJFF(this.LIZ, c1247250iYt.LIZ) && this.LIZIZ == c1247250iYt.LIZIZ && Double.compare(this.LIZJ, c1247250iYt.LIZJ) == 0 && Double.compare(this.LIZLLL, c1247250iYt.LIZLLL) == 0;
    }

    public C1247250iYt() {
        this(0, -1.0d, -1.0d, "");
    }

    public C1247250iYt(int i, double d, double d2, String str) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = d;
        this.LIZLLL = d2;
    }
}
