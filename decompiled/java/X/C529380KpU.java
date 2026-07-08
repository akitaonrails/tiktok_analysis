package X;

/* JADX INFO: renamed from: X.0KpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529380KpU implements InterfaceC529350KpR {
    public final int LIZIZ;

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        int i = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LessThanMinDuration(minDuration=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZIZ;
        if (!(obj instanceof C529380KpU) || i != ((C529380KpU) obj).LIZIZ) {
            return false;
        }
        return true;
    }
}
