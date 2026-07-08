package X;

/* JADX INFO: renamed from: X.009S, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009S extends C009T {
    public final int LIZ;
    public final C009R LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C009S)) {
            return false;
        }
        C009S c009s = (C009S) obj;
        return this.LIZ == c009s.LIZ && this.LIZIZ == c009s.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftUpgradeComplete(resultCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tipType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C009S(int i, C009R c009r) {
        this.LIZ = i;
        this.LIZIZ = c009r;
    }
}
