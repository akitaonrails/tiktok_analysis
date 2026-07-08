package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664880Q6c implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final long LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C664880Q6c)) {
            return false;
        }
        C664880Q6c c664880Q6c = (C664880Q6c) obj;
        return Intrinsics.LJFF(this.LL, c664880Q6c.LL) && Intrinsics.LJFF(this.LLILLJJLI, c664880Q6c.LLILLJJLI) && this.LLILLL == c664880Q6c.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchHelpPostCardUpdateShowTimeAction(curUid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cardID=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showTimeStamp=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y52().LIZIZ(C13LE.LIZ(C664880Q6c.class), AFwS293S0000000_10.get$arr$(104));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C664880Q6c(String str, String str2, long j) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
    }
}
