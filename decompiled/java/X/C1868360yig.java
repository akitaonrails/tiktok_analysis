package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0yig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868360yig implements InterfaceC951240arS<Object>, InterfaceC1868370yih {
    public final Playbook LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868360yig)) {
            return false;
        }
        C1868360yig c1868360yig = (C1868360yig) obj;
        return Intrinsics.LJFF(this.LIZ, c1868360yig.LIZ) && this.LIZIZ == c1868360yig.LIZIZ && this.LIZJ == c1868360yig.LIZJ && this.LIZLLL == c1868360yig.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookFavoritesItemData(playbook=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isUsing=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFirstPosition=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isLastPosition=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1868370yih
    public final Playbook LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        C1868360yig c1868360yig;
        if ((obj instanceof C1868360yig) && (c1868360yig = (C1868360yig) obj) != null && c1868360yig.LIZIZ == this.LIZIZ && Intrinsics.LJFF(c1868360yig.LIZ, this.LIZ) && c1868360yig.LIZJ == this.LIZJ && c1868360yig.LIZLLL == this.LIZLLL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        C1868360yig c1868360yig;
        Playbook playbook;
        if ((obj instanceof C1868360yig) && (c1868360yig = (C1868360yig) obj) != null && (playbook = c1868360yig.LIZ) != null && playbook.playbookId == this.LIZ.playbookId) {
            return true;
        }
        return false;
    }

    public C1868360yig(Playbook playbook, boolean z, boolean z2, boolean z3) {
        this.LIZ = playbook;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}
