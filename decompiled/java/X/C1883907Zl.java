package X;

/* JADX INFO: renamed from: X.07Zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1883907Zl {
    public final int LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1883907Zl)) {
            return false;
        }
        C1883907Zl c1883907Zl = (C1883907Zl) obj;
        return this.LIZ == c1883907Zl.LIZ && this.LIZIZ == c1883907Zl.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BitmapStat(count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1883907Zl(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
