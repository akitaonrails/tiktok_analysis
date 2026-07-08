package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15lW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20614415lW implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<C317910CdB> LLILLJJLI;
    public final C291001Au<C20614215lU> LLILLL;
    public final C291001Au<C20614615lY> LLILZ;
    public final C291001Au<C20614315lV> LLILZIL;
    public final C291001Au<C20614915lb> LLILZLL;
    public final boolean LLIZ;

    public C20614415lW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20614415lW)) {
            return false;
        }
        C20614415lW c20614415lW = (C20614415lW) obj;
        return Intrinsics.LJFF(this.LL, c20614415lW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c20614415lW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c20614415lW.LLILLL) && Intrinsics.LJFF(this.LLILZ, c20614415lW.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c20614415lW.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c20614415lW.LLILZLL) && this.LLIZ == c20614415lW.LLIZ;
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryUserListPanelState(awemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onUserSearchEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedUsersEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onPanelViewStateEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onUserSelectEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", userDmStateEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isSearchBarFocused=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C20614415lW(int i) {
        this(new C291001Au(new C317910CdB(0)), new C291001Au(new C20614215lU(0)), new C291001Au(new C20614615lY(0)), new C291001Au(new C20614315lV(0)), new C291001Au(new C20614915lb(0)), "", false);
    }

    public C20614415lW(C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = c291001Au5;
        this.LLIZ = z;
    }

    public static C20614415lW LIZ(C20614415lW c20614415lW, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, boolean z, int i) {
        String str;
        boolean z2 = z;
        C291001Au c291001Au6 = c291001Au5;
        C291001Au c291001Au7 = c291001Au4;
        C291001Au c291001Au8 = c291001Au3;
        C291001Au c291001Au9 = c291001Au2;
        C291001Au c291001Au10 = c291001Au;
        if ((i & 1) != 0) {
            str = c20614415lW.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            c291001Au10 = c20614415lW.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au9 = c20614415lW.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au8 = c20614415lW.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au7 = c20614415lW.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au6 = c20614415lW.LLILZLL;
        }
        if ((i & 64) != 0) {
            z2 = c20614415lW.LLIZ;
        }
        c20614415lW.getClass();
        return new C20614415lW(c291001Au10, c291001Au9, c291001Au8, c291001Au7, c291001Au6, str, z2);
    }
}
