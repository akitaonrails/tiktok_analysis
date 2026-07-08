package X;

/* JADX INFO: renamed from: X.0HIE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HIE extends AbstractC942990ae9 {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0HIE) && this.LIZ == ((C0HIE) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteCountDownWallpaperChange(time=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HIE(long j) {
        this.LIZ = j;
    }
}
