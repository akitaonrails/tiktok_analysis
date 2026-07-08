package X;

/* JADX INFO: renamed from: X.009U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009U extends C009T {
    public final int LIZ = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C009U) && this.LIZ == ((C009U) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftUpgradeStart(from=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
