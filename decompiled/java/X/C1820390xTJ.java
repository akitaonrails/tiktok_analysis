package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xTJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820390xTJ implements InterfaceC1891350zJl, InterfaceC515600KJy {
    public String LL;
    public String LLILLJJLI;
    public EnumC1778960wOU LLILLL;
    public C1820590xTd LLILZ;
    public List<? extends AbstractC1820610xTf> LLILZIL;
    public C1820460xTQ LLILZLL;

    @Override // X.InterfaceC515600KJy
    public final boolean LIZ(InterfaceC515600KJy interfaceC515600KJy) {
        return false;
    }

    @Override // X.InterfaceC515600KJy
    public final String LJJJ() {
        return "item_promotion";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1820390xTJ)) {
            return false;
        }
        C1820390xTJ c1820390xTJ = (C1820390xTJ) obj;
        return Intrinsics.LJFF(this.LL, c1820390xTJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1820390xTJ.LLILLJJLI) && this.LLILLL == c1820390xTJ.LLILLL && Intrinsics.LJFF(this.LLILZ, c1820390xTJ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1820390xTJ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1820390xTJ.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        C1820460xTQ c1820460xTQ = this.LLILZLL;
        return iHashCode + (c1820460xTQ == null ? 0 : c1820460xTQ.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionCardItem(cardHeader=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", challengeStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", optInEligibilityData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", tasks=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", campaignFooter=");
        sbLIZ.append(this.LLILZLL);
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

    public C1820390xTJ(String str, String str2, EnumC1778960wOU enumC1778960wOU, C1820590xTd c1820590xTd, List<? extends AbstractC1820610xTf> list, C1820460xTQ c1820460xTQ) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = enumC1778960wOU;
        this.LLILZ = c1820590xTd;
        this.LLILZIL = list;
        this.LLILZLL = c1820460xTQ;
    }
}
