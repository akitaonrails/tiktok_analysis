package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781420wSS {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781420wSS)) {
            return false;
        }
        C1781420wSS c1781420wSS = (C1781420wSS) obj;
        return this.LIZ == c1781420wSS.LIZ && Intrinsics.LJFF(this.LIZIZ, c1781420wSS.LIZIZ) && this.LIZJ == c1781420wSS.LIZJ;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ;
    }

    public final String toString() {
        return "Envelope(t=" + this.LIZ + ", v=" + this.LIZIZ + ", s=" + this.LIZJ + ")";
    }

    public C1781420wSS(int i, String str, int i2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
    }
}
