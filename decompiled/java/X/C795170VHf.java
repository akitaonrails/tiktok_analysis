package X;

/* JADX INFO: renamed from: X.0VHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795170VHf extends AbstractC795160VHe {
    public final C795380VIa LIZ = C795380VIa.LIZIZ;

    public final int hashCode() {
        return (C795170VHf.class.getName().hashCode() * 31) + this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure {mOutputData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C795170VHf.class == obj.getClass()) {
            return this.LIZ.equals(((C795170VHf) obj).LIZ);
        }
        return false;
    }
}
