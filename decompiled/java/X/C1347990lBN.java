package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347990lBN implements InterfaceC0148002o {
    public final boolean LL;
    public final C1348140lBc LLILLJJLI;
    public final boolean LLILLL;
    public final C1348130lBb LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final C1348000lBO LLIZ;

    public C1347990lBN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1347990lBN)) {
            return false;
        }
        C1347990lBN c1347990lBN = (C1347990lBN) obj;
        return this.LL == c1347990lBN.LL && Intrinsics.LJFF(this.LLILLJJLI, c1347990lBN.LLILLJJLI) && this.LLILLL == c1347990lBN.LLILLL && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LLILZ, c1347990lBN.LLILZ) && this.LLILZIL == c1347990lBN.LLILZIL && this.LLILZLL == c1347990lBN.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1347990lBN.LLIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C1348140lBc c1348140lBc = this.LLILLJJLI;
        int iHashCode = (((iZ2 + (c1348140lBc == null ? 0 : c1348140lBc.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31 * 31;
        C1348130lBb c1348130lBb = this.LLILZ;
        return ((((((iHashCode + (c1348130lBb != null ? c1348130lBb.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyboardIconGroupVMState(init=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", videoStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", atStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", emojiStatus=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", giftStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", imageStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", audioStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", plusStatus=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1347990lBN(int i) {
        this(false, null, true, null, true, false, new C1348000lBO(false, false));
    }

    public C1347990lBN(boolean z, C1348140lBc c1348140lBc, boolean z2, C1348130lBb c1348130lBb, boolean z3, boolean z4, C1348000lBO c1348000lBO) {
        this.LL = z;
        this.LLILLJJLI = c1348140lBc;
        this.LLILLL = z2;
        this.LLILZ = c1348130lBb;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
        this.LLIZ = c1348000lBO;
    }

    public static C1347990lBN LIZ(C1347990lBN c1347990lBN, C1348140lBc c1348140lBc, C1348130lBb c1348130lBb, boolean z, boolean z2, C1348000lBO c1348000lBO, int i) {
        boolean z3;
        C1348000lBO c1348000lBO2 = c1348000lBO;
        boolean z4 = z2;
        boolean z5 = z;
        C1348130lBb c1348130lBb2 = c1348130lBb;
        C1348140lBc c1348140lBc2 = c1348140lBc;
        boolean z6 = false;
        if ((i & 1) != 0) {
            z3 = c1347990lBN.LL;
        } else {
            z3 = false;
        }
        if ((i & 2) != 0) {
            c1348140lBc2 = c1347990lBN.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z6 = c1347990lBN.LLILLL;
        }
        if ((i & 8) != 0) {
            c1347990lBN.getClass();
        }
        if ((i & 16) != 0) {
            c1348130lBb2 = c1347990lBN.LLILZ;
        }
        if ((i & 32) != 0) {
            z5 = c1347990lBN.LLILZIL;
        }
        if ((i & 64) != 0) {
            z4 = c1347990lBN.LLILZLL;
        }
        if ((i & 128) != 0) {
            c1348000lBO2 = c1347990lBN.LLIZ;
        }
        c1347990lBN.getClass();
        return new C1347990lBN(z3, c1348140lBc2, z6, c1348130lBb2, z5, z4, c1348000lBO2);
    }
}
