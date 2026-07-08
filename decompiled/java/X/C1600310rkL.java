package X;

/* JADX INFO: renamed from: X.0rkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600310rkL {
    public volatile int LIZ;

    public final boolean LIZ() {
        return this.LIZ == 100 || this.LIZ == 101 || this.LIZ == 5 || this.LIZ == 6;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightDataCenterStatus(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZIZ(int i) {
        if (i > this.LIZ) {
            this.LIZ = i;
            return true;
        }
        return false;
    }
}
