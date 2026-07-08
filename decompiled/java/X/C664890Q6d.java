package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664890Q6d implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C664890Q6d)) {
            return false;
        }
        C664890Q6d c664890Q6d = (C664890Q6d) obj;
        return Intrinsics.LJFF(this.LL, c664890Q6d.LL) && Intrinsics.LJFF(this.LLILLJJLI, c664890Q6d.LLILLJJLI) && this.LLILLL == c664890Q6d.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchHelpPostCardUpdateClickAction(curUid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cardID=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isClicked=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y52().LIZIZ(C13LE.LIZ(C664890Q6d.class), AFwS293S0000000_10.get$arr$(92));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C664890Q6d(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
