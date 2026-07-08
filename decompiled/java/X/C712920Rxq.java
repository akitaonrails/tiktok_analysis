package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712920Rxq implements InterfaceC0148002o {
    public Pair<String, String> LL;
    public String LLILLJJLI;
    public Pair<Boolean, String> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C712920Rxq)) {
            return false;
        }
        C712920Rxq c712920Rxq = (C712920Rxq) obj;
        return Intrinsics.LJFF(this.LL, c712920Rxq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c712920Rxq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c712920Rxq.LLILLL);
    }

    public final int hashCode() {
        Pair<String, String> pair = this.LL;
        int iHashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        String str = this.LLILLJJLI;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideCardFilterState(commonStoryReadInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cardSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cardUnselected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C712920Rxq(Pair<String, String> pair, String str, Pair<Boolean, String> pair2) {
        this.LL = pair;
        this.LLILLJJLI = str;
        this.LLILLL = pair2;
    }

    public static C712920Rxq LIZ(C712920Rxq c712920Rxq, Pair pair, String str, Pair pair2, int i) {
        if ((i & 1) != 0) {
            pair = c712920Rxq.LL;
        }
        if ((i & 2) != 0) {
            str = c712920Rxq.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            pair2 = c712920Rxq.LLILLL;
        }
        c712920Rxq.getClass();
        return new C712920Rxq(pair, str, pair2);
    }
}
