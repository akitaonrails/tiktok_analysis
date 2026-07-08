package X;

/* JADX INFO: renamed from: X.07WO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WO {
    public final float LIZ;
    public final boolean LIZIZ;

    public C07WO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07WO)) {
            return false;
        }
        C07WO c07wo = (C07WO) obj;
        return Float.compare(this.LIZ, c07wo.LIZ) == 0 && this.LIZIZ == c07wo.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPPanelTrackState(videoCursorProgress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSeekStarted=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public /* synthetic */ C07WO(int i) {
        this(-1.0f, false);
    }

    public C07WO(float f, boolean z) {
        this.LIZ = f;
        this.LIZIZ = z;
    }
}
