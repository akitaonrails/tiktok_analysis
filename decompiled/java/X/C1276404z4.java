package X;

/* JADX INFO: renamed from: X.04z4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1276404z4 {
    public final long LIZ;

    public C1276404z4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1276404z4) && this.LIZ == ((C1276404z4) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnpaidOrderExpirationConfig(expirationMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1276404z4(int i) {
        this.LIZ = 21600000L;
    }
}
