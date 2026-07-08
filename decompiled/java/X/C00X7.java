package X;

/* JADX INFO: renamed from: X.00X7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00X7 implements AnonymousClass0060 {
    public final boolean LIZ;

    public C00X7() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00X7) && this.LIZ == ((C00X7) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActiveStatusFetchParams(useCache=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00X7(boolean z) {
        this.LIZ = z;
    }
}
