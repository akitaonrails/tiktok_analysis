package X;

/* JADX INFO: renamed from: X.0iu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260400iu6 {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1260400iu6)) {
            return false;
        }
        C1260400iu6 c1260400iu6 = (C1260400iu6) obj;
        return this.LIZ == c1260400iu6.LIZ && this.LIZIZ == c1260400iu6.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowTrackingSnapshot(bannerShowing=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", statusShowing=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1260400iu6(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
