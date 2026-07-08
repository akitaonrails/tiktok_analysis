package X;

/* JADX INFO: renamed from: X.0gDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157260gDk {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157260gDk)) {
            return false;
        }
        C1157260gDk c1157260gDk = (C1157260gDk) obj;
        return this.LIZ == c1157260gDk.LIZ && this.LIZIZ == c1157260gDk.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Font(font=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", color=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157260gDk(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
