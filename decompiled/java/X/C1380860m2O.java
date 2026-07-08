package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m2O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380860m2O implements InterfaceC2753014t {
    public final String LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final long LLILZIL;
    public final long LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380860m2O)) {
            return false;
        }
        C1380860m2O c1380860m2O = (C1380860m2O) obj;
        return Intrinsics.LJFF(this.LL, c1380860m2O.LL) && this.LLILLJJLI == c1380860m2O.LLILLJJLI && this.LLILLL == c1380860m2O.LLILLL && this.LLILZ == c1380860m2O.LLILZ && this.LLILZIL == c1380860m2O.LLILZIL && this.LLILZLL == c1380860m2O.LLILZLL && this.LLIZ == c1380860m2O.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1380860m2O.LLIZLLLIL);
    }

    public final int hashCode() {
        return (((((((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaterMarkAbilityConfigProperty(filePrefix=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAddInterMark=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isInstagram=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isUseVESDKWaterMark=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", startWatermark=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", endWatermark=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1380860m2O(boolean z, String str, boolean z2, boolean z3, String str2, long j, long j2, int i) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = i;
        this.LLIZLLLIL = str2;
    }
}
