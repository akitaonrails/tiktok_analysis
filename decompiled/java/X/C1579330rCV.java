package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579330rCV implements InterfaceC636340Oxc<C1579330rCV, C1581170rFT> {
    public final C627660Ojc<C1581170rFT> LL;
    public final C0DHZ LLILLJJLI;
    public final Integer LLILLL;
    public final EnumC1579340rCW LLILZ;
    public final C1245860iWe LLILZIL;
    public final String LLILZLL;

    public C1579330rCV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1579330rCV)) {
            return false;
        }
        C1579330rCV c1579330rCV = (C1579330rCV) obj;
        return Intrinsics.LJFF(this.LL, c1579330rCV.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1579330rCV.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1579330rCV.LLILLL) && this.LLILZ == c1579330rCV.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1579330rCV.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1579330rCV.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C0DHZ c0dhz = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c0dhz == null ? 0 : c0dhz.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        EnumC1579340rCW enumC1579340rCW = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (enumC1579340rCW == null ? 0 : enumC1579340rCW.hashCode())) * 31;
        C1245860iWe c1245860iWe = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c1245860iWe == null ? 0 : c1245860iWe.hashCode())) * 31;
        String str = this.LLILZLL;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolPostsListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", school=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", graduationYear=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", verifyStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", insertAwemeId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1581170rFT> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1581170rFT> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1579330rCV(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null, null, null, null, null);
    }

    public C1579330rCV(C627660Ojc<C1581170rFT> c627660Ojc, C0DHZ c0dhz, Integer num, EnumC1579340rCW enumC1579340rCW, C1245860iWe c1245860iWe, String str) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c0dhz;
        this.LLILLL = num;
        this.LLILZ = enumC1579340rCW;
        this.LLILZIL = c1245860iWe;
        this.LLILZLL = str;
    }

    public static C1579330rCV LIZ(C1579330rCV c1579330rCV, C627660Ojc c627660Ojc, C0DHZ c0dhz, Integer num, EnumC1579340rCW enumC1579340rCW, C1245860iWe c1245860iWe, String str, int i) {
        String str2 = str;
        C1245860iWe c1245860iWe2 = c1245860iWe;
        EnumC1579340rCW enumC1579340rCW2 = enumC1579340rCW;
        Integer num2 = num;
        C0DHZ c0dhz2 = c0dhz;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1579330rCV.LL;
        }
        if ((i & 2) != 0) {
            c0dhz2 = c1579330rCV.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            num2 = c1579330rCV.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC1579340rCW2 = c1579330rCV.LLILZ;
        }
        if ((i & 16) != 0) {
            c1245860iWe2 = c1579330rCV.LLILZIL;
        }
        if ((i & 32) != 0) {
            str2 = c1579330rCV.LLILZLL;
        }
        c1579330rCV.getClass();
        return new C1579330rCV(c627660Ojc2, c0dhz2, num2, enumC1579340rCW2, c1245860iWe2, str2);
    }
}
