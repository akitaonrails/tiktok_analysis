package X;

/* JADX INFO: renamed from: X.07WN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WN {
    public final float LIZ;

    public C07WN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07WN) && Float.compare(this.LIZ, ((C07WN) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPPanelTrackState(videoCursorProgress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public C07WN(float f) {
        this.LIZ = f;
    }

    public /* synthetic */ C07WN(int i) {
        this(-1.0f);
    }
}
