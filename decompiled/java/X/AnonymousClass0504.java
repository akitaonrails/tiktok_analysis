package X;

/* JADX INFO: renamed from: X.0504, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0504 {
    public final boolean LIZ;

    public AnonymousClass0504() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0504) && this.LIZ == ((AnonymousClass0504) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetCurrencyParam(fromCache=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0504(boolean z) {
        this.LIZ = z;
    }
}
