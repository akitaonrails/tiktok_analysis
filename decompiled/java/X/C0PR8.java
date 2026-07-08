package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PR8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PR8 implements C0PWT {
    public final int LL;
    public final String LLILLJJLI;

    public C0PR8() {
        this(0, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PR8)) {
            return false;
        }
        C0PR8 c0pr8 = (C0PR8) obj;
        return this.LL == c0pr8.LL && Intrinsics.LJFF(this.LLILLJJLI, c0pr8.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTabSwitchAction(tabIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", searchPosition=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C0PR8.class), AFwS293S0000000_10.get$arr$(186));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PR8(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
