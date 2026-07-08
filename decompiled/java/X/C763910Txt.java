package X;

/* JADX INFO: renamed from: X.0Txt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C763910Txt extends AbstractC764660Tz6 {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C763910Txt)) {
            return false;
        }
        C763910Txt c763910Txt = (C763910Txt) obj;
        return this.LIZ == c763910Txt.LIZ && this.LIZIZ == c763910Txt.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewRequestsCount(newRequestListenCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", newRequestSingCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C763910Txt(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
