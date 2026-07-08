package X;

/* JADX INFO: renamed from: X.0jZ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285820jZ6 {
    public final int LIZ;
    public final double LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1285820jZ6)) {
            return false;
        }
        C1285820jZ6 c1285820jZ6 = (C1285820jZ6) obj;
        return this.LIZ == c1285820jZ6.LIZ && Double.compare(this.LIZIZ, c1285820jZ6.LIZIZ) == 0;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.X2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GradientStop(color=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1285820jZ6() {
        this(0, 0.0d);
    }

    public C1285820jZ6(int i, double d) {
        this.LIZ = i;
        this.LIZIZ = d;
    }
}
