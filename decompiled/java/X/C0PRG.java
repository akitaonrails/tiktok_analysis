package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PRG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRG implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PRG)) {
            return false;
        }
        C0PRG c0prg = (C0PRG) obj;
        return Intrinsics.LJFF(this.LL, c0prg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0prg.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0prg.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0prg.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0prg.LLILZIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateVisualSearchTagOriginalEntranceAction(reqSearchEnterTagType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reqSearchEnterVisualUnifiedTagId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reqSearchEnterPauseTime=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", vsResultFeedImprId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", reqVisualUnifiedTagId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C0PRG.class), AFwS293S0000000_10.get$arr$(204));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PRG(String str, String str2, String str3, String str4, String str5) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
    }
}
