package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136310ffx {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1136310ffx)) {
            return false;
        }
        C1136310ffx c1136310ffx = (C1136310ffx) obj;
        return this.LIZ == c1136310ffx.LIZ && Intrinsics.LJFF(this.LIZIZ, c1136310ffx.LIZIZ) && this.LIZJ == c1136310ffx.LIZJ && this.LIZLLL == c1136310ffx.LIZLLL && this.LJ == c1136310ffx.LJ && this.LJFF == c1136310ffx.LJFF && this.LJI == c1136310ffx.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrayStatus(pos=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", comboKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", giftType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", giftID=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", currentComboNumber=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", needDownloadOnDequeueCheck=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hash=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1136310ffx(long j, String str, int i, int i2, int i3, int i4, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = i3;
        this.LJFF = z;
        this.LJI = i4;
    }
}
