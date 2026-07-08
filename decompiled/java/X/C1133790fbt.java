package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133790fbt {
    public boolean LIZ;
    public String LIZIZ;
    public long LIZJ;
    public final Function0<Unit> LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public final Integer LJI;
    public final boolean LJII;

    public C1133790fbt() {
        this(false, null, 0L, null, null, null, false, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1133790fbt)) {
            return false;
        }
        C1133790fbt c1133790fbt = (C1133790fbt) obj;
        return this.LIZ == c1133790fbt.LIZ && Intrinsics.LJFF(this.LIZIZ, c1133790fbt.LIZIZ) && this.LIZJ == c1133790fbt.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1133790fbt.LIZLLL) && Intrinsics.LJFF(this.LJ, c1133790fbt.LJ) && Intrinsics.LJFF(this.LJFF, c1133790fbt.LJFF) && Intrinsics.LJFF(this.LJI, c1133790fbt.LJI) && this.LJII == c1133790fbt.LJII;
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        Function0<Unit> function0 = this.LIZLLL;
        int iHashCode = (iZ2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Integer num = this.LJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LJI;
        return ((iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownSpanConfig(autoCountdown=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replaceString=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", countdownFinishHandler=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", font=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", fontColor=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", needRoundUp=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1133790fbt(boolean z, String str, long j, Integer num, Integer num2, Integer num3, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        str = (i & 2) != 0 ? "countdown" : str;
        j = (i & 4) != 0 ? 0L : j;
        num = (i & 16) != 0 ? null : num;
        num2 = (i & 32) != 0 ? null : num2;
        num3 = (i & 64) != 0 ? null : num3;
        z2 = (i & 128) != 0 ? false : z2;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = null;
        this.LJ = num;
        this.LJFF = num2;
        this.LJI = num3;
        this.LJII = z2;
    }
}
