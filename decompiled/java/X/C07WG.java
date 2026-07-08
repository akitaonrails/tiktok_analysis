package X;

/* JADX INFO: renamed from: X.07WG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WG {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07WG) && this.LIZ == ((C07WG) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullPagePreviewMuteState(muted=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07WG(boolean z) {
        this.LIZ = z;
    }
}
