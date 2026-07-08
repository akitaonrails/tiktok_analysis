package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1721506of implements InterfaceC0148002o {
    public final C291001Au<IMUser> LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final C291001Au<Pair<EnumC879080YeA, Boolean>> LLILZLL;
    public final C291001Au<IMUser> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721506of)) {
            return false;
        }
        C1721506of c1721506of = (C1721506of) obj;
        return Intrinsics.LJFF(this.LL, c1721506of.LL) && this.LLILLJJLI == c1721506of.LLILLJJLI && this.LLILLL == c1721506of.LLILLL && this.LLILZ == c1721506of.LLILZ && this.LLILZIL == c1721506of.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1721506of.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1721506of.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        C291001Au<Pair<EnumC879080YeA, Boolean>> c291001Au = this.LLILZLL;
        return ((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleDetailState(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", muted=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pinned=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSpam=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isStarred=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", convTagChangeEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", displayUnblockToast=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1721506of LIZ(C1721506of c1721506of, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C291001Au<Pair<EnumC879080YeA, Boolean>> c291001Au3;
        C291001Au c291001Au4 = c291001Au2;
        C291001Au c291001Au5 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au5 = c1721506of.LL;
        }
        if ((i & 2) != 0) {
            z = c1721506of.LLILLJJLI;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = c1721506of.LLILLL;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = c1721506of.LLILZ;
        } else {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = c1721506of.LLILZIL;
        } else {
            z4 = false;
        }
        if ((i & 32) != 0) {
            c291001Au3 = c1721506of.LLILZLL;
        } else {
            c291001Au3 = null;
        }
        if ((i & 64) != 0) {
            c291001Au4 = c1721506of.LLIZ;
        }
        c1721506of.getClass();
        return new C1721506of(c291001Au5, z, z2, z3, z4, c291001Au3, c291001Au4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1721506of(C291001Au<? extends IMUser> c291001Au, boolean z, boolean z2, boolean z3, boolean z4, C291001Au<? extends Pair<? extends EnumC879080YeA, Boolean>> c291001Au2, C291001Au<? extends IMUser> c291001Au3) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = c291001Au2;
        this.LLIZ = c291001Au3;
    }
}
