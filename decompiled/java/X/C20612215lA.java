package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15lA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20612215lA implements InterfaceC0148002o {
    public final boolean LL;
    public final C291001Au<C20610415ks> LLILLJJLI;
    public final C291001Au<C330490CxT> LLILLL;
    public final int LLILZ;
    public final C291001Au<Integer> LLILZIL;
    public final boolean LLILZLL;

    public C20612215lA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20612215lA)) {
            return false;
        }
        C20612215lA c20612215lA = (C20612215lA) obj;
        return this.LL == c20612215lA.LL && Intrinsics.LJFF(this.LLILLJJLI, c20612215lA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c20612215lA.LLILLL) && this.LLILZ == c20612215lA.LLILZ && Intrinsics.LJFF(this.LLILZIL, c20612215lA.LLILZIL) && this.LLILZLL == c20612215lA.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionState(isMentionViewShow=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mentionItemSelectEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mentionQueryEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", statusViewState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mentionBlockedToastState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isMentionListVisible=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C20612215lA(int i) {
        this(false, new C291001Au(new C20610415ks(null, 0, false, false, 31)), new C291001Au(new C330490CxT(0)), Integer.MIN_VALUE, new C291001Au(0), false);
    }

    public C20612215lA(boolean z, C291001Au<C20610415ks> c291001Au, C291001Au<C330490CxT> c291001Au2, int i, C291001Au<Integer> c291001Au3, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = i;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = z2;
    }

    public static C20612215lA LIZ(C20612215lA c20612215lA, boolean z, C291001Au c291001Au, C291001Au c291001Au2, int i, C291001Au c291001Au3, boolean z2, int i2) {
        boolean z3 = z2;
        C291001Au c291001Au4 = c291001Au3;
        int i3 = i;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        boolean z4 = z;
        if ((i2 & 1) != 0) {
            z4 = c20612215lA.LL;
        }
        if ((i2 & 2) != 0) {
            c291001Au6 = c20612215lA.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            c291001Au5 = c20612215lA.LLILLL;
        }
        if ((i2 & 8) != 0) {
            i3 = c20612215lA.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c291001Au4 = c20612215lA.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            z3 = c20612215lA.LLILZLL;
        }
        c20612215lA.getClass();
        return new C20612215lA(z4, c291001Au6, c291001Au5, i3, c291001Au4, z3);
    }
}
