package X;

/* JADX INFO: renamed from: X.0E7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359500E7o {
    public final boolean LIZ;

    public C359500E7o() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C359500E7o) && this.LIZ == ((C359500E7o) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackGestureExclusionState(forceDisableAll=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C359500E7o(boolean z) {
        this.LIZ = z;
    }
}
