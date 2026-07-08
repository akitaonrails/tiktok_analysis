package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11v5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19654511v5 implements InterfaceC0148002o {
    public final C19654911v9 LL;
    public final C19652311uj LLILLJJLI;
    public final C1556320qbO LLILLL;
    public final C19654411v4 LLILZ;
    public final C19653911uz LLILZIL;
    public final C291001Au<InterfaceC19653611uw> LLILZLL;
    public final C291001Au<Unit> LLIZ;

    public C19654511v5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19654511v5)) {
            return false;
        }
        C19654511v5 c19654511v5 = (C19654511v5) obj;
        return Intrinsics.LJFF(this.LL, c19654511v5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c19654511v5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c19654511v5.LLILLL) && Intrinsics.LJFF(this.LLILZ, c19654511v5.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c19654511v5.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c19654511v5.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c19654511v5.LLIZ);
    }

    public final int hashCode() {
        C19654911v9 c19654911v9 = this.LL;
        int iHashCode = (c19654911v9 == null ? 0 : c19654911v9.hashCode()) * 31;
        C19652311uj c19652311uj = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c19652311uj == null ? 0 : c19652311uj.hashCode())) * 31;
        C1556320qbO c1556320qbO = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c1556320qbO == null ? 0 : c1556320qbO.hashCode())) * 31;
        C19654411v4 c19654411v4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c19654411v4 == null ? 0 : c19654411v4.hashCode())) * 31;
        C19653911uz c19653911uz = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c19653911uz == null ? 0 : c19653911uz.hashCode())) * 31;
        C291001Au<InterfaceC19653611uw> c291001Au = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLIZ;
        return iHashCode6 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewsAnchorPublishVMState(titleInit=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", titleStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", linkInit=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", linkStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", confirmEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", keyboardEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", pageExit=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C19654511v5(int i) {
        this(null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19654511v5(C19654911v9 c19654911v9, C19652311uj c19652311uj, C1556320qbO c1556320qbO, C19654411v4 c19654411v4, C19653911uz c19653911uz, C291001Au<? extends InterfaceC19653611uw> c291001Au, C291001Au<Unit> c291001Au2) {
        this.LL = c19654911v9;
        this.LLILLJJLI = c19652311uj;
        this.LLILLL = c1556320qbO;
        this.LLILZ = c19654411v4;
        this.LLILZIL = c19653911uz;
        this.LLILZLL = c291001Au;
        this.LLIZ = c291001Au2;
    }

    public static C19654511v5 LIZ(C19654511v5 c19654511v5, C19654911v9 c19654911v9, C19652311uj c19652311uj, C1556320qbO c1556320qbO, C19654411v4 c19654411v4, C19653911uz c19653911uz, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        C19653911uz c19653911uz2 = c19653911uz;
        C19654411v4 c19654411v42 = c19654411v4;
        C1556320qbO c1556320qbO2 = c1556320qbO;
        C19652311uj c19652311uj2 = c19652311uj;
        C19654911v9 c19654911v92 = c19654911v9;
        if ((i & 1) != 0) {
            c19654911v92 = c19654511v5.LL;
        }
        if ((i & 2) != 0) {
            c19652311uj2 = c19654511v5.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1556320qbO2 = c19654511v5.LLILLL;
        }
        if ((i & 8) != 0) {
            c19654411v42 = c19654511v5.LLILZ;
        }
        if ((i & 16) != 0) {
            c19653911uz2 = c19654511v5.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au4 = c19654511v5.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au3 = c19654511v5.LLIZ;
        }
        c19654511v5.getClass();
        return new C19654511v5(c19654911v92, c19652311uj2, c1556320qbO2, c19654411v42, c19653911uz2, c291001Au4, c291001Au3);
    }
}
