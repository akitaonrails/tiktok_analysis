package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q3F, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q3F implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q3F)) {
            return false;
        }
        C0Q3F c0q3f = (C0Q3F) obj;
        return Intrinsics.LJFF(this.LL, c0q3f.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q3f.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateMidpageEnterFromAction(blankPageEnterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", blankPageEnterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Wg1().LIZIZ(C13LE.LIZ(C0Q3F.class), AFwS293S0000000_10.get$arr$(88));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0Q3F(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
