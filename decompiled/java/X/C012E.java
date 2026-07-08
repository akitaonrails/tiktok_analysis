package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.012E, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012E implements InterfaceC1126420fQ0 {
    public final long LIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public boolean LJFF;
    public final String LIZIZ = "live_gift_fuelBanner_cover_joinRally";
    public boolean LJ = true;

    @Override // X.InterfaceC1126420fQ0
    public final void LIZLLL() {
        this.LJFF = true;
    }

    @Override // X.InterfaceC1126420fQ0
    public final void LJ() {
        this.LJ = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C012E)) {
            return false;
        }
        C012E c012e = (C012E) obj;
        return this.LIZ == c012e.LIZ && Intrinsics.LJFF(this.LIZIZ, c012e.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c012e.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c012e.LIZLLL);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollabGiftingFuelGiftRecommendData(giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", starlingKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", starlingValue=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1126420fQ0
    public final boolean LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1126420fQ0
    public final boolean LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1126420fQ0
    public final String LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1126420fQ0
    public final long getGiftId() {
        return this.LIZ;
    }

    public C012E(long j, String str, String str2) {
        this.LIZ = j;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
