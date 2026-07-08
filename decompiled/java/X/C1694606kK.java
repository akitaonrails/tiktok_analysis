package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06kK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1694606kK implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final C291001Au<Integer> LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1694606kK)) {
            return false;
        }
        C1694606kK c1694606kK = (C1694606kK) obj;
        return this.LL == c1694606kK.LL && this.LLILLJJLI == c1694606kK.LLILLJJLI && this.LLILLL == c1694606kK.LLILLL && this.LLILZ == c1694606kK.LLILZ && this.LLILZIL == c1694606kK.LLILZIL && this.LLILZLL == c1694606kK.LLILZLL && this.LLIZ == c1694606kK.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1694606kK.LLIZLLLIL);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        C291001Au<Integer> c291001Au = this.LLIZLLLIL;
        return iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotDetailState(muted=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pinned=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isSuggestedReplyEnabled=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSuggestedReplyLoading=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isAutoReplyEnabled=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isAutoReplyLoading=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isDeleteBotLoading=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", quitDetailPage=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1694606kK(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C291001Au<Integer> c291001Au) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
        this.LLILZIL = z5;
        this.LLILZLL = z6;
        this.LLIZ = z7;
        this.LLIZLLLIL = c291001Au;
    }

    public static C1694606kK LIZ(C1694606kK c1694606kK, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        boolean z8 = z7;
        boolean z9 = z6;
        boolean z10 = z5;
        boolean z11 = z4;
        boolean z12 = z3;
        boolean z13 = z2;
        boolean z14 = z;
        if ((i & 1) != 0) {
            z14 = c1694606kK.LL;
        }
        if ((i & 2) != 0) {
            z13 = c1694606kK.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z12 = c1694606kK.LLILLL;
        }
        if ((i & 8) != 0) {
            z11 = c1694606kK.LLILZ;
        }
        if ((i & 16) != 0) {
            z10 = c1694606kK.LLILZIL;
        }
        if ((i & 32) != 0) {
            z9 = c1694606kK.LLILZLL;
        }
        if ((i & 64) != 0) {
            z8 = c1694606kK.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au2 = c1694606kK.LLIZLLLIL;
        }
        c1694606kK.getClass();
        return new C1694606kK(z14, z13, z12, z11, z10, z9, z8, c291001Au2);
    }
}
