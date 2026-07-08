package X;

/* JADX INFO: renamed from: X.0ZNJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNJ implements C0ZNT {
    public final int LIZ = 2131831010;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZNJ) && this.LIZ == ((C0ZNJ) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HideCameraMsgInGroup(stringRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
