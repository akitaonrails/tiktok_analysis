package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575830r6r implements InterfaceC0148002o {
    public final C291001Au<C1594780rbQ> LL;
    public final boolean LLILLJJLI;
    public final C291001Au<C1575790r6n> LLILLL;
    public final C291001Au<C1583670rJV> LLILZ;
    public final boolean LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final boolean LLIZ;

    public C1575830r6r() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1575830r6r)) {
            return false;
        }
        C1575830r6r c1575830r6r = (C1575830r6r) obj;
        return Intrinsics.LJFF(this.LL, c1575830r6r.LL) && this.LLILLJJLI == c1575830r6r.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1575830r6r.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1575830r6r.LLILZ) && this.LLILZIL == c1575830r6r.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1575830r6r.LLILZLL) && this.LLIZ == c1575830r6r.LLIZ;
    }

    public final int hashCode() {
        C291001Au<C1594780rbQ> c291001Au = this.LL;
        return ((((((((((((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedSkylightContainerState(triggerRefreshState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showSkylightViews=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listDisplayState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", bubbleDisplayState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", publishLanding=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hostFeedIsEmpty=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", friendsV3SkylightShowState=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1575830r6r(int i) {
        this(null, false, new C291001Au(new C1575790r6n(false, false, null, false, null, 63)), new C291001Au(new C1583670rJV(0)), false, new C291001Au(Boolean.FALSE), false);
    }

    public C1575830r6r(C291001Au<C1594780rbQ> c291001Au, boolean z, C291001Au<C1575790r6n> c291001Au2, C291001Au<C1583670rJV> c291001Au3, boolean z2, C291001Au<Boolean> c291001Au4, boolean z3) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = z2;
        this.LLILZLL = c291001Au4;
        this.LLIZ = z3;
    }

    public static C1575830r6r LIZ(C1575830r6r c1575830r6r, C291001Au c291001Au, boolean z, C291001Au c291001Au2, C291001Au c291001Au3, boolean z2, C291001Au c291001Au4, boolean z3, int i) {
        boolean z4 = z3;
        C291001Au c291001Au5 = c291001Au4;
        boolean z5 = z2;
        C291001Au c291001Au6 = c291001Au3;
        C291001Au c291001Au7 = c291001Au2;
        boolean z6 = z;
        C291001Au c291001Au8 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au8 = c1575830r6r.LL;
        }
        if ((i & 2) != 0) {
            z6 = c1575830r6r.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au7 = c1575830r6r.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au6 = c1575830r6r.LLILZ;
        }
        if ((i & 16) != 0) {
            z5 = c1575830r6r.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au5 = c1575830r6r.LLILZLL;
        }
        if ((i & 64) != 0) {
            z4 = c1575830r6r.LLIZ;
        }
        c1575830r6r.getClass();
        return new C1575830r6r(c291001Au8, z6, c291001Au7, c291001Au6, z5, c291001Au5, z4);
    }
}
