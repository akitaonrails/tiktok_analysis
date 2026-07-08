package X;

/* JADX INFO: renamed from: X.00EF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EF {
    public final float LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00EF)) {
            return false;
        }
        C00EF c00ef = (C00EF) obj;
        return Float.compare(this.LIZ, c00ef.LIZ) == 0 && this.LIZIZ == c00ef.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricProgressSample(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resetFromPlaybackStart=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public C00EF(float f, boolean z) {
        this.LIZ = f;
        this.LIZIZ = z;
    }
}
