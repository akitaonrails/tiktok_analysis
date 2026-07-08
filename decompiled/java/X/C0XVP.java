package X;

/* JADX INFO: renamed from: X.0XVP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XVP extends C0XVT {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0XVP) && this.LIZ == ((C0XVP) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogoutContext(isChildrenModeUser=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0XVP(boolean z) {
        this.LIZ = z;
    }
}
