package X;

/* JADX INFO: renamed from: X.0M8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563470M8b extends C0M8P {
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C563470M8b) && this.LIZIZ == ((C563470M8b) obj).LIZIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaPermissionResultReceived(permissionGranted=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C563470M8b(boolean z) {
        super(false);
        this.LIZIZ = z;
    }
}
