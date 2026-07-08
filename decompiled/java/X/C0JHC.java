package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JHC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JHC implements InterfaceC2753014t {
    public final Long LL;
    public final Long LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JHC)) {
            return false;
        }
        C0JHC c0jhc = (C0JHC) obj;
        return Intrinsics.LJFF(this.LL, c0jhc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0jhc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0jhc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0jhc.LLILZ) && this.LLILZIL == c0jhc.LLILZIL;
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LLILLJJLI;
        return ((((((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CourseManageSource(anchorUid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", courseId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", uiVersion=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JHC(String str, String str2, Long l, Long l2, int i) {
        this.LL = l;
        this.LLILLJJLI = l2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
    }
}
