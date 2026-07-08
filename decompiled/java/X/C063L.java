package X;

/* JADX INFO: renamed from: X.063L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C063L implements C063K {
    public final boolean LIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C063L) && this.LIZ == ((C063L) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowUserInfo(show=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
