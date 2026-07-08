package X;

/* JADX INFO: renamed from: X.0vDW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733720vDW {
    public final int LIZ;
    public final int LIZIZ = 2;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1733720vDW)) {
            return false;
        }
        C1733720vDW c1733720vDW = (C1733720vDW) obj;
        return this.LIZ == c1733720vDW.LIZ && this.LIZIZ == c1733720vDW.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotifyTarget(component=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", animType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1733720vDW(int i) {
        this.LIZ = i;
    }
}
