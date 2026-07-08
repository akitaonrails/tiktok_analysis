package X;

/* JADX INFO: renamed from: X.07YL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YL implements C07YN {
    public final boolean LIZ;

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        boolean z = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModifyBottomUI(hasBottomMargin=");
        sbLIZ.append(z);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C07YL(boolean z) {
        this.LIZ = z;
    }

    public final boolean equals(Object obj) {
        boolean z = this.LIZ;
        if (!(obj instanceof C07YL) || z != ((C07YL) obj).LIZ) {
            return false;
        }
        return true;
    }
}
