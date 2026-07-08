package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332510D1t extends AbstractC332520D1u {
    public final List<C0D4T> LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    public final C332510D1t copy(List<C0D4T> list, int i, boolean z) {
        return new C332510D1t(list, i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332510D1t)) {
            return false;
        }
        C332510D1t c332510D1t = (C332510D1t) obj;
        return Intrinsics.LJFF(this.LL, c332510D1t.LL) && this.LLILLJJLI == c332510D1t.LLILLJJLI && this.LLILLL == c332510D1t.LLILLL;
    }

    public int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(reviews=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasMore() {
        return this.LLILLL;
    }

    public final List<C0D4T> getReviews() {
        return this.LL;
    }

    public final int getTotalCount() {
        return this.LLILLJJLI;
    }

    public C332510D1t(List<C0D4T> list, int i, boolean z) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }
}
