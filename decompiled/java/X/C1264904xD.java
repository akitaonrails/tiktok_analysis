package X;

/* JADX INFO: renamed from: X.04xD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264904xD {
    public final boolean LIZ;

    public C1264904xD() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1264904xD) && this.LIZ == ((C1264904xD) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowSessionStoreConfig(enableWatch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1264904xD(boolean z) {
        this.LIZ = z;
    }
}
