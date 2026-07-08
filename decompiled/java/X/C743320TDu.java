package X;

/* JADX INFO: renamed from: X.0TDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743320TDu extends AbstractC743230TDl {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C743320TDu)) {
            return false;
        }
        C743320TDu c743320TDu = (C743320TDu) obj;
        return this.LIZ == c743320TDu.LIZ && this.LIZIZ == c743320TDu.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnRetryConnectError(what=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C743320TDu(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
