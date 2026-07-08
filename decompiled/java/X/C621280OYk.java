package X;

/* JADX INFO: renamed from: X.0OYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621280OYk {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C621280OYk)) {
            return false;
        }
        C621280OYk c621280OYk = (C621280OYk) obj;
        return this.LIZ == c621280OYk.LIZ && this.LIZIZ == c621280OYk.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProgressEntry(positionMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C621280OYk(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
