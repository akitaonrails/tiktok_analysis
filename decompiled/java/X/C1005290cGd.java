package X;

import com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard.AIProductItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005290cGd implements InterfaceC1891350zJl {
    public final AIProductItem LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final InterfaceC1014270cV7 LLILZIL;
    public final AbstractC1014240cV4 LLILZLL;
    public final InterfaceC1003440cDe LLIZ;
    public final C1009340cNA LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1005290cGd)) {
            return false;
        }
        C1005290cGd c1005290cGd = (C1005290cGd) obj;
        return Intrinsics.LJFF(this.LL, c1005290cGd.LL) && this.LLILLJJLI == c1005290cGd.LLILLJJLI && this.LLILLL == c1005290cGd.LLILLL && this.LLILZ == c1005290cGd.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1005290cGd.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1005290cGd.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1005290cGd.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1005290cGd.LLIZLLLIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        InterfaceC1014270cV7 interfaceC1014270cV7 = this.LLILZIL;
        int iHashCode2 = (iHashCode + (interfaceC1014270cV7 == null ? 0 : interfaceC1014270cV7.hashCode())) * 31;
        AbstractC1014240cV4 abstractC1014240cV4 = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (abstractC1014240cV4 == null ? 0 : abstractC1014240cV4.hashCode())) * 31;
        InterfaceC1003440cDe interfaceC1003440cDe = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (interfaceC1003440cDe == null ? 0 : interfaceC1003440cDe.hashCode())) * 31;
        C1009340cNA c1009340cNA = this.LLIZLLLIL;
        return iHashCode4 + (c1009340cNA != null ? c1009340cNA.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIProductItemInfo(cardItemInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSingleProduct=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showDivider=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isMultiAdFormat=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", anoleDelegate=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hostAnoleComponent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", searchAnoleSearchDelegate=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", anoleADModel=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1005290cGd(AIProductItem aIProductItem, boolean z, boolean z2, boolean z3, InterfaceC1014270cV7 interfaceC1014270cV7, AbstractC1014240cV4 abstractC1014240cV4, InterfaceC1003440cDe interfaceC1003440cDe, C1009340cNA c1009340cNA) {
        this.LL = aIProductItem;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = interfaceC1014270cV7;
        this.LLILZLL = abstractC1014240cV4;
        this.LLIZ = interfaceC1003440cDe;
        this.LLIZLLLIL = c1009340cNA;
    }
}
