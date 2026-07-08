package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359370E7b {
    public final InterfaceC359570E7v LIZ;
    public final C0E8Y LIZIZ = null;
    public final C0E8N LIZJ;
    public final C0E8M LIZLLL;
    public final InterfaceC368840Ed8 LJ;
    public final C0E7Y LJFF;
    public final C0E8D LJI;
    public final InterfaceC369050EdT LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C359370E7b)) {
            return false;
        }
        C359370E7b c359370E7b = (C359370E7b) obj;
        return Intrinsics.LJFF(this.LIZ, c359370E7b.LIZ) && Intrinsics.LJFF(this.LIZIZ, c359370E7b.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c359370E7b.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c359370E7b.LIZLLL) && Intrinsics.LJFF(this.LJ, c359370E7b.LJ) && Intrinsics.LJFF(this.LJFF, c359370E7b.LJFF) && Intrinsics.LJFF(this.LJI, c359370E7b.LJI) && Intrinsics.LJFF(this.LJII, c359370E7b.LJII);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0E8Y c0e8y = this.LIZIZ;
        return ((((((((((((iHashCode + (c0e8y == null ? 0 : c0e8y.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackPanelActions(frameCacheCenter=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", trackPanelMobAction=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trackPanelAction=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mainTrackAction=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", subTrackAction=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", trackClipHandler=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", trackILegacyTrackApi=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", subTrackDragAction=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C359370E7b(C359360E7a c359360E7a, C359170E6h c359170E6h, C0E7X c0e7x, C0E7W c0e7w, C0E7Y c0e7y, C0E8D c0e8d, C356950Dz3 c356950Dz3) {
        this.LIZ = c359360E7a;
        this.LIZJ = c359170E6h;
        this.LIZLLL = c0e7x;
        this.LJ = c0e7w;
        this.LJFF = c0e7y;
        this.LJI = c0e8d;
        this.LJII = c356950Dz3;
    }
}
