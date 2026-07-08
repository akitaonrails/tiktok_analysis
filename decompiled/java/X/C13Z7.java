package X;

/* JADX INFO: renamed from: X.13Z7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13Z7 {
    public int LIZ;

    public final boolean LIZ() {
        return this.LIZ != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append("{ location = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C13Z7(int i) {
        this.LIZ = i;
    }
}
