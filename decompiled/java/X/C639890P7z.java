package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639890P7z implements C0PWT {
    public final boolean LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C639890P7z)) {
            return false;
        }
        C639890P7z c639890P7z = (C639890P7z) obj;
        return this.LL == c639890P7z.LL && Intrinsics.LJFF(this.LLILLJJLI, c639890P7z.LLILLJJLI);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchIsResumeFromPublishedAction(isResumeFromPublished=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", publishId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ww1().LIZIZ(C13LE.LIZ(C639890P7z.class), AFwS293S0000000_10.get$arr$(133));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C639890P7z(boolean z, String str) {
        this.LL = z;
        this.LLILLJJLI = str;
    }
}
