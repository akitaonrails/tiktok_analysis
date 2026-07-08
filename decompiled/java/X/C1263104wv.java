package X;

/* JADX INFO: renamed from: X.04wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1263104wv {
    public final long LIZ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1263104wv) && this.LIZ == ((C1263104wv) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cursor(cursor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
