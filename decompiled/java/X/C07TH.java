package X;

/* JADX INFO: renamed from: X.07TH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TH implements InterfaceC1690880u6Q {
    public final float LIZ = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07TH) && Float.compare(this.LIZ, ((C07TH) obj).LIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowChildHeight(maxHeightRatio=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }
}
