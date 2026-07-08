package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756010vnT implements InterfaceC0148002o {
    public final String LL;
    public final PdpBottomAreaElem LLILLJJLI;
    public final AbstractC1623806Xk<Unit> LLILLL;
    public final EnumC1985207q6 LLILZ;
    public final C00C8 LLILZIL;
    public final C047F LLILZLL;
    public final LinkRichText LLIZ;

    public C1756010vnT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1756010vnT)) {
            return false;
        }
        C1756010vnT c1756010vnT = (C1756010vnT) obj;
        return Intrinsics.LJFF(this.LL, c1756010vnT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1756010vnT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1756010vnT.LLILLL) && this.LLILZ == c1756010vnT.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1756010vnT.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1756010vnT.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1756010vnT.LLIZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PdpBottomAreaElem pdpBottomAreaElem = this.LLILLJJLI;
        int iHashCode2 = (((((((iHashCode + (pdpBottomAreaElem == null ? 0 : pdpBottomAreaElem.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        C047F c047f = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (c047f == null ? 0 : c047f.hashCode())) * 31;
        LinkRichText linkRichText = this.LLIZ;
        return iHashCode3 + (linkRichText != null ? linkRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BundleState(productId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bottomAreaElem=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", lynxLoadStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", networkState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", dataFetchStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showToast=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", protectionProgramText=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1756010vnT(int i) {
        this("", null, new C1623706Xj(), EnumC1985207q6.DEFAULT, new C00C8() { // from class: X.00C9
        }, null, null);
    }

    public C1756010vnT(String str, PdpBottomAreaElem pdpBottomAreaElem, AbstractC1623806Xk<Unit> abstractC1623806Xk, EnumC1985207q6 enumC1985207q6, C00C8 c00c8, C047F c047f, LinkRichText linkRichText) {
        this.LL = str;
        this.LLILLJJLI = pdpBottomAreaElem;
        this.LLILLL = abstractC1623806Xk;
        this.LLILZ = enumC1985207q6;
        this.LLILZIL = c00c8;
        this.LLILZLL = c047f;
        this.LLIZ = linkRichText;
    }

    public static C1756010vnT LIZ(C1756010vnT c1756010vnT, String str, PdpBottomAreaElem pdpBottomAreaElem, AbstractC1623806Xk abstractC1623806Xk, C00C7 c00c7, C047F c047f, int i) {
        EnumC1985207q6 enumC1985207q6;
        C047F c047f2 = c047f;
        C00C8 c00c8 = c00c7;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        PdpBottomAreaElem pdpBottomAreaElem2 = pdpBottomAreaElem;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c1756010vnT.LL;
        }
        if ((i & 2) != 0) {
            pdpBottomAreaElem2 = c1756010vnT.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk2 = c1756010vnT.LLILLL;
        }
        LinkRichText linkRichText = null;
        if ((i & 8) != 0) {
            enumC1985207q6 = c1756010vnT.LLILZ;
        } else {
            enumC1985207q6 = null;
        }
        if ((i & 16) != 0) {
            c00c8 = c1756010vnT.LLILZIL;
        }
        if ((i & 32) != 0) {
            c047f2 = c1756010vnT.LLILZLL;
        }
        if ((i & 64) != 0) {
            linkRichText = c1756010vnT.LLIZ;
        }
        c1756010vnT.getClass();
        return new C1756010vnT(str2, pdpBottomAreaElem2, abstractC1623806Xk2, enumC1985207q6, c00c8, c047f2, linkRichText);
    }
}
