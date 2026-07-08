package X;

/* JADX INFO: renamed from: X.0nQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434370nQh {
    public final EnumC1431770nMV LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1434370nQh)) {
            return false;
        }
        C1434370nQh c1434370nQh = (C1434370nQh) obj;
        return this.LIZ == c1434370nQh.LIZ && this.LIZIZ == c1434370nQh.LIZIZ && this.LIZJ == c1434370nQh.LIZJ;
    }

    public C1434370nQh(EnumC1431770nMV enumC1431770nMV, long j, int i) {
        this.LIZ = enumC1431770nMV;
        this.LIZIZ = j;
        this.LIZJ = i;
    }
}
