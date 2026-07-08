package X;

/* JADX INFO: renamed from: X.0RsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709470RsH {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C709470RsH)) {
            return false;
        }
        C709470RsH c709470RsH = (C709470RsH) obj;
        return this.LIZ == c709470RsH.LIZ && this.LIZIZ == c709470RsH.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBarEndLayout(endMargin=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endPadding=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C709470RsH(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
