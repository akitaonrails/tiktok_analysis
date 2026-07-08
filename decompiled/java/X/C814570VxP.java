package X;

/* JADX INFO: renamed from: X.0VxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814570VxP {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Encoding{name=\"");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("\"}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C814570VxP(String str) {
        if (str != null) {
            this.LIZ = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C814570VxP)) {
            return false;
        }
        return this.LIZ.equals(((C814570VxP) obj).LIZ);
    }
}
