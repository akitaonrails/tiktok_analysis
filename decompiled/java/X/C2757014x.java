package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.host_board.DisplayPosition;
import webcast.data.host_board.HostBoard;

/* JADX INFO: renamed from: X.014x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2757014x {
    public HostBoard LIZ;
    public AnonymousClass0151 LIZIZ;
    public InterfaceC201500q5 LIZJ;
    public DisplayPosition LIZLLL;
    public boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2757014x)) {
            return false;
        }
        C2757014x c2757014x = (C2757014x) obj;
        return Intrinsics.LJFF(this.LIZ, c2757014x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2757014x.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2757014x.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2757014x.LIZLLL) && this.LJ == c2757014x.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardPageData(hostBoard=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", syncWithServer=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2757014x(HostBoard hostBoard, AnonymousClass0151 anonymousClass0151, InterfaceC201500q5 interfaceC201500q5, DisplayPosition displayPosition, boolean z, int i) {
        anonymousClass0151 = (i & 2) != 0 ? null : anonymousClass0151;
        interfaceC201500q5 = (i & 4) != 0 ? null : interfaceC201500q5;
        displayPosition = (i & 8) != 0 ? null : displayPosition;
        z = (i & 16) != 0 ? false : z;
        this.LIZ = hostBoard;
        this.LIZIZ = anonymousClass0151;
        this.LIZJ = interfaceC201500q5;
        this.LIZLLL = displayPosition;
        this.LJ = z;
    }
}
