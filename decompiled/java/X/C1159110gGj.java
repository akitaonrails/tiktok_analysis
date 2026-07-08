package X;

/* JADX INFO: renamed from: X.0gGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159110gGj extends AbstractC1159090gGh {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1159110gGj) && this.LIZ == ((C1159110gGj) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadingOrder(collectionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1159090gGh
    public final long LIZ() {
        return this.LIZ;
    }

    public C1159110gGj(long j) {
        super(j);
        this.LIZ = j;
    }
}
