package X;

/* JADX INFO: renamed from: X.030j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7735030j {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7735030j)) {
            return false;
        }
        C7735030j c7735030j = (C7735030j) obj;
        return this.LIZ == c7735030j.LIZ && this.LIZIZ == c7735030j.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuantityLimit(min=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", max=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7735030j(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }

    public static C7735030j LIZ(C7735030j c7735030j, int i) {
        int i2 = c7735030j.LIZ;
        c7735030j.getClass();
        return new C7735030j(i2, i);
    }
}
