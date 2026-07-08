package X;

/* JADX INFO: renamed from: X.0qfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559040qfm implements InterfaceC111300bX {
    public final int LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public C1559040qfm() {
        this(0, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559040qfm)) {
            return false;
        }
        C1559040qfm c1559040qfm = (C1559040qfm) obj;
        return this.LL == c1559040qfm.LL && this.LLILLJJLI == c1559040qfm.LLILLJJLI && this.LLILLL == c1559040qfm.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcTakePhotoPageHierarchyData(extendAlbumHeight=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", alwaysShowExtendAlbum=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showLimitAccess=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1559040qfm(int i, boolean z, boolean z2) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }
}
