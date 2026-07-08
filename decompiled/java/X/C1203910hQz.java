package X;

/* JADX INFO: renamed from: X.0hQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203910hQz extends AbstractC1203920hR0 {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1203910hQz) && this.LIZ == ((C1203910hQz) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamComplete(totalChunks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1203910hQz(int i) {
        this.LIZ = i;
    }
}
