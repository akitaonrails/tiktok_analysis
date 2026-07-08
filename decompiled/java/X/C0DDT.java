package X;

/* JADX INFO: renamed from: X.0DDT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DDT {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DDT)) {
            return false;
        }
        C0DDT c0ddt = (C0DDT) obj;
        return this.LIZ == c0ddt.LIZ && this.LIZIZ == c0ddt.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaIndicatorStyle(sizePx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isActive=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DDT(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
