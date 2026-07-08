package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650910Pg1 implements C0PWT {
    public final Map<String, String> LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public C650910Pg1() {
        this(31, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C650910Pg1)) {
            return false;
        }
        C650910Pg1 c650910Pg1 = (C650910Pg1) obj;
        return Intrinsics.LJFF(this.LL, c650910Pg1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c650910Pg1.LLILLJJLI) && this.LLILLL == c650910Pg1.LLILLL && Intrinsics.LJFF(this.LLILZ, c650910Pg1.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c650910Pg1.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31;
        String str = this.LLILZIL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEntranceWithEventAction(extraLogParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterCommentId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFromOutside=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFromPhoto=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", lsAttributionParams=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().gX().LIZIZ(C13LE.LIZ(C650910Pg1.class), new C650920Pg2());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C650910Pg1(int i, String str, String str2, Map map, boolean z) {
        map = (i & 1) != 0 ? C2097608Jq.LJ() : map;
        str = (i & 2) != 0 ? "" : str;
        z = (i & 4) != 0 ? false : z;
        str2 = (i & 8) != 0 ? "" : str2;
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = null;
    }
}
