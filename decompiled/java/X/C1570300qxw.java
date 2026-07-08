package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570300qxw implements InterfaceC111300bX {
    public final InterfaceC1589690rTD LL;
    public final ITabStrip LLILLJJLI;

    public C1570300qxw() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1570300qxw)) {
            return false;
        }
        C1570300qxw c1570300qxw = (C1570300qxw) obj;
        return Intrinsics.LJFF(this.LL, c1570300qxw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1570300qxw.LLILLJJLI);
    }

    public final int hashCode() {
        InterfaceC1589690rTD interfaceC1589690rTD = this.LL;
        int iHashCode = (interfaceC1589690rTD == null ? 0 : interfaceC1589690rTD.hashCode()) * 31;
        ITabStrip iTabStrip = this.LLILLJJLI;
        return iHashCode + (iTabStrip != null ? iTabStrip.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MFViewPagerHierachyData(pagerAdapter=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pagerTabStrip=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1570300qxw(InterfaceC1589690rTD interfaceC1589690rTD, ITabStrip iTabStrip) {
        this.LL = interfaceC1589690rTD;
        this.LLILLJJLI = iTabStrip;
    }
}
