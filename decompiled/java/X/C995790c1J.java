package X;

/* JADX INFO: renamed from: X.0c1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995790c1J implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995790c1J)) {
            return false;
        }
        C995790c1J c995790c1J = (C995790c1J) obj;
        return this.LL == c995790c1J.LL && this.LLILLJJLI == c995790c1J.LLILLJJLI;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcPermissionState(isAlbumGranted=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAlbumPartialGranted=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995790c1J(boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}
