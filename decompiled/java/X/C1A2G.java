package X;

/* JADX INFO: renamed from: X.1A2G, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A2G implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A2G)) {
            return false;
        }
        C1A2G c1a2g = (C1A2G) obj;
        return this.LL == c1a2g.LL && this.LLILLJJLI == c1a2g.LLILLJJLI && this.LLILLL == c1a2g.LLILLL;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcPermissionState(isCameraGranted=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAlbumGranted=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isAlbumPartialGranted=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1A2G(boolean z, boolean z2, boolean z3) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
    }
}
