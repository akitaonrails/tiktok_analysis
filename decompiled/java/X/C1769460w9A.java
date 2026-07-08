package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w9A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769460w9A implements InterfaceC0148002o {
    public final C1769790w9h LL;
    public final C1769140w8e LLILLJJLI;
    public final C1769250w8p LLILLL;
    public final C1769130w8d LLILZ;

    public C1769460w9A() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1769460w9A)) {
            return false;
        }
        C1769460w9A c1769460w9A = (C1769460w9A) obj;
        return Intrinsics.LJFF(this.LL, c1769460w9A.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1769460w9A.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1769460w9A.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1769460w9A.LLILZ);
    }

    public final int hashCode() {
        C1769790w9h c1769790w9h = this.LL;
        int iHashCode = (c1769790w9h == null ? 0 : c1769790w9h.hashCode()) * 31;
        C1769140w8e c1769140w8e = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1769140w8e == null ? 0 : c1769140w8e.hashCode())) * 31;
        C1769250w8p c1769250w8p = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c1769250w8p == null ? 0 : c1769250w8p.hashCode())) * 31;
        C1769130w8d c1769130w8d = this.LLILZ;
        return iHashCode3 + (c1769130w8d != null ? c1769130w8d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomDotStateV2(tooltipPopupTask=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tooltipConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", iconConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", badgeConfig=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1769460w9A(C1769790w9h c1769790w9h, C1769140w8e c1769140w8e, C1769250w8p c1769250w8p, C1769130w8d c1769130w8d) {
        this.LL = c1769790w9h;
        this.LLILLJJLI = c1769140w8e;
        this.LLILLL = c1769250w8p;
        this.LLILZ = c1769130w8d;
    }

    public static C1769460w9A LIZ(C1769460w9A c1769460w9A, C1769790w9h c1769790w9h, C1769140w8e c1769140w8e, C1769250w8p c1769250w8p, C1769130w8d c1769130w8d, int i) {
        if ((i & 1) != 0) {
            c1769790w9h = c1769460w9A.LL;
        }
        if ((i & 2) != 0) {
            c1769140w8e = c1769460w9A.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1769250w8p = c1769460w9A.LLILLL;
        }
        if ((i & 8) != 0) {
            c1769130w8d = c1769460w9A.LLILZ;
        }
        c1769460w9A.getClass();
        return new C1769460w9A(c1769790w9h, c1769140w8e, c1769250w8p, c1769130w8d);
    }
}
