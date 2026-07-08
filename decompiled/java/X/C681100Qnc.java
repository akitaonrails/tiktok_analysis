package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qnc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681100Qnc implements InterfaceC0148002o {
    public final int LL;
    public final String LLILLJJLI;
    public final C679990Qlp LLILLL;
    public final boolean LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final String LLILZLL;

    public C681100Qnc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C681100Qnc)) {
            return false;
        }
        C681100Qnc c681100Qnc = (C681100Qnc) obj;
        return this.LL == c681100Qnc.LL && Intrinsics.LJFF(this.LLILLJJLI, c681100Qnc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c681100Qnc.LLILLL) && this.LLILZ == c681100Qnc.LLILZ && Intrinsics.LJFF(this.LLILZIL, c681100Qnc.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c681100Qnc.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31;
        C679990Qlp c679990Qlp = this.LLILLL;
        return ((((((iHashCode + (c679990Qlp == null ? 0 : c679990Qlp.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChooseSearchMusicState(pageType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", searchKeyword=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", searchParam=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSearchBarFocused=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enableFilter=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C681100Qnc(int i) {
        this(-1, "", null, false, new C291001Au(Boolean.FALSE), "");
    }

    public C681100Qnc(int i, String str, C679990Qlp c679990Qlp, boolean z, C291001Au<Boolean> c291001Au, String str2) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = c679990Qlp;
        this.LLILZ = z;
        this.LLILZIL = c291001Au;
        this.LLILZLL = str2;
    }

    public static C681100Qnc LIZ(C681100Qnc c681100Qnc, int i, String str, C679990Qlp c679990Qlp, boolean z, C291001Au c291001Au, String str2, int i2) {
        String str3 = str2;
        C291001Au c291001Au2 = c291001Au;
        boolean z2 = z;
        C679990Qlp c679990Qlp2 = c679990Qlp;
        String str4 = str;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c681100Qnc.LL;
        }
        if ((i2 & 2) != 0) {
            str4 = c681100Qnc.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            c679990Qlp2 = c681100Qnc.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z2 = c681100Qnc.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c291001Au2 = c681100Qnc.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            str3 = c681100Qnc.LLILZLL;
        }
        c681100Qnc.getClass();
        return new C681100Qnc(i3, str4, c679990Qlp2, z2, c291001Au2, str3);
    }
}
