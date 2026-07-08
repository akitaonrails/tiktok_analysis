package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940260aZk {
    public final long LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final long LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C940260aZk)) {
            return false;
        }
        C940260aZk c940260aZk = (C940260aZk) obj;
        return this.LIZ == c940260aZk.LIZ && this.LIZIZ == c940260aZk.LIZIZ && this.LIZJ == c940260aZk.LIZJ && Intrinsics.LJFF(this.LIZLLL, c940260aZk.LIZLLL) && Intrinsics.LJFF(this.LJ, c940260aZk.LJ) && Intrinsics.LJFF(this.LJFF, c940260aZk.LJFF) && this.LJI == c940260aZk.LJI && this.LJII == c940260aZk.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScoreBizViewData(score=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scoreType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iconName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", animationName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", ticketUiStyle=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", completionProgressPercent=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C940260aZk(long j, int i, int i2, String str, String str2, String str3, int i3, long j2) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = i3;
        this.LJII = j2;
    }
}
