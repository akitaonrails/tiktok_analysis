package X;

import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561130qj9 implements InterfaceC2753014t, InterfaceC111300bX {
    public final String LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;
    public String LLIZLLLIL;
    public final String LLJ;
    public final long LL = 0;
    public final int LLILLJJLI = 1;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(593));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1561130qj9)) {
            return false;
        }
        C1561130qj9 c1561130qj9 = (C1561130qj9) obj;
        return this.LL == c1561130qj9.LL && this.LLILLJJLI == c1561130qj9.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1561130qj9.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1561130qj9.LLILZ) && this.LLILZIL == c1561130qj9.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1561130qj9.LLILZLL) && this.LLIZ == c1561130qj9.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1561130qj9.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1561130qj9.LLJ);
    }

    public final int hashCode() {
        return (((((((((((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesCenterListHierarchyData(creatorUid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listSource=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", startScene=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", startCategoryId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isFromInnerfeedDiscover=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", dynamicSessionId=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1561130qj9(String str, String str2, int i, String str3, boolean z, String str4, String str5) {
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = str3;
        this.LLIZ = z;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
    }
}
