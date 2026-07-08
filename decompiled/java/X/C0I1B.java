package X;

/* JADX INFO: renamed from: X.0I1B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1B extends C0I1F {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0I1B) && this.LIZ == ((C0I1B) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyboardVisibilityChanged(isShowing=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I1B(boolean z) {
        this.LIZ = z;
    }
}
