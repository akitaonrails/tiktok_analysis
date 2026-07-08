package X;

/* JADX INFO: renamed from: X.0XJI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJI extends C0XJJ {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0XJI) && this.LIZ == ((C0XJI) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0XJI(int i) {
        this.LIZ = i;
    }
}
