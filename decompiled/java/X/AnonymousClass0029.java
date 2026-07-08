package X;

/* JADX INFO: renamed from: X.0029, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0029 implements InterfaceC0143002j {
    public final boolean LIZ;

    public AnonymousClass0029() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0029) && this.LIZ == ((AnonymousClass0029) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumViewCustomTabDirListExpandedEvent(expanded=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0029(boolean z) {
        this.LIZ = z;
    }
}
