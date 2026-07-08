package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.012C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012C implements InterfaceC1126420fQ0 {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC1126420fQ0
    public final void LIZLLL() {
        this.LJ = true;
    }

    @Override // X.InterfaceC1126420fQ0
    public final void LJ() {
        this.LIZLLL = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C012C)) {
            return false;
        }
        C012C c012c = (C012C) obj;
        return this.LIZ == c012c.LIZ && Intrinsics.LJFF(this.LIZIZ, c012c.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c012c.LIZJ) && this.LIZLLL == c012c.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExclusiveGiftPanelRecommendData(giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", starlingKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", starlingValue=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shouldShowHighlightAnimation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1126420fQ0
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1126420fQ0
    public final boolean LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1126420fQ0
    public final String LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1126420fQ0
    public final long getGiftId() {
        return this.LIZ;
    }

    public C012C(long j, String str, String str2, boolean z) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
    }
}
