package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZO implements InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;

    public C07ZO() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07ZO)) {
            return false;
        }
        C07ZO c07zo = (C07ZO) obj;
        return Intrinsics.LJFF(this.LL, c07zo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c07zo.LLILLJJLI);
    }

    public final int hashCode() {
        String str = this.LL;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiWriteReviewInfo(poiCollectInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07ZO(String str, int i) {
        str = (i & 1) != 0 ? null : str;
        String str2 = (i & 2) != 0 ? "PoiWriteReviewInfo" : null;
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
