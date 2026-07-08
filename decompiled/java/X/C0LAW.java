package X;

/* JADX INFO: renamed from: X.0LAW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LAW extends C0LAU {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LAW) && this.LIZ == ((C0LAW) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loading(leftMinutes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LAW(int i) {
        this.LIZ = i;
    }
}
