package X;

/* JADX INFO: renamed from: X.12CA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12CA {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C12CA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12CA)) {
            return false;
        }
        C12CA c12ca = (C12CA) obj;
        return this.LIZ == c12ca.LIZ && this.LIZIZ == c12ca.LIZIZ && this.LIZJ == c12ca.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullPagePreviewTitleBarState(fullScreenButtonState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showUserInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showTitle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C12CA(int i) {
        this(false, false, true);
    }

    public C12CA(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
