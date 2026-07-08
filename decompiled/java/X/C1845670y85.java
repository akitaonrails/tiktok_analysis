package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y85, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845670y85 implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;
    public final C291001Au<EnumC1779050wOd> LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final C291001Au<Unit> LLILZIL;
    public final AbstractC1623806Xk<EnumC1845790y8H> LLILZLL;

    public C1845670y85() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1845670y85)) {
            return false;
        }
        C1845670y85 c1845670y85 = (C1845670y85) obj;
        return Intrinsics.LJFF(this.LL, c1845670y85.LL) && this.LLILLJJLI == c1845670y85.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1845670y85.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1845670y85.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1845670y85.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1845670y85.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<EnumC1779050wOd> c291001Au = this.LLILLL;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.LLILZIL;
        return ((iHashCode3 + (c291001Au3 != null ? c291001Au3.hashCode() : 0)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RssLinkState(rssLinkText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isInputValid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onInitEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onRssUrlUnlinkEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onIntroSheetDismissed=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", apiState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1845670y85(int i) {
        this("", false, null, null, null, C491101vh.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1845670y85(String str, boolean z, C291001Au<? extends EnumC1779050wOd> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Unit> c291001Au3, AbstractC1623806Xk<? extends EnumC1845790y8H> abstractC1623806Xk) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au;
        this.LLILZ = c291001Au2;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = abstractC1623806Xk;
    }

    public static C1845670y85 LIZ(C1845670y85 c1845670y85, String str, boolean z, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, AbstractC1623806Xk abstractC1623806Xk, int i) {
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        boolean z2 = z;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c1845670y85.LL;
        }
        if ((i & 2) != 0) {
            z2 = c1845670y85.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au6 = c1845670y85.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au5 = c1845670y85.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au4 = c1845670y85.LLILZIL;
        }
        if ((i & 32) != 0) {
            abstractC1623806Xk2 = c1845670y85.LLILZLL;
        }
        c1845670y85.getClass();
        return new C1845670y85(str2, z2, c291001Au6, c291001Au5, c291001Au4, abstractC1623806Xk2);
    }
}
