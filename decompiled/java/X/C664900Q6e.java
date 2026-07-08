package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664900Q6e implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C664900Q6e)) {
            return false;
        }
        C664900Q6e c664900Q6e = (C664900Q6e) obj;
        return Intrinsics.LJFF(this.LL, c664900Q6e.LL) && Intrinsics.LJFF(this.LLILLJJLI, c664900Q6e.LLILLJJLI) && this.LLILLL == c664900Q6e.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchHelpPostCardUpdatePublishAction(curUid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cardID=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPublished=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y52().LIZIZ(C13LE.LIZ(C664900Q6e.class), AFwS293S0000000_10.get$arr$(98));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C664900Q6e(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
