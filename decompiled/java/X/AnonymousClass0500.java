package X;

/* JADX INFO: renamed from: X.0500, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0500 {
    public final boolean LIZ;

    public AnonymousClass0500() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0500) && this.LIZ == ((AnonymousClass0500) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiCoverProgressPayload(updateProgress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0500(int i) {
        this.LIZ = true;
    }
}
