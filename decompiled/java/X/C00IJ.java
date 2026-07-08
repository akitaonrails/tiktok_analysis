package X;

/* JADX INFO: renamed from: X.00IJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IJ implements C00II {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00IJ) && this.LIZ == ((C00IJ) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoLoop(startTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00IJ(int i) {
        this.LIZ = i;
    }
}
