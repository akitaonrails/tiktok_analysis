package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513800KDa implements InterfaceC0148002o {
    public final Boolean LL;
    public final C0KCH LLILLJJLI;
    public final boolean LLILLL;
    public final Pair<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> LLILZ;
    public final PGCSubscriptionProductDetailWithTemplateInfo LLILZIL;
    public final C0KDT LLILZLL;
    public final C0KDZ LLIZ;
    public final C0KDP LLIZLLLIL;
    public final C291001Au<C0KCZ> LLJ;

    public C513800KDa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C513800KDa)) {
            return false;
        }
        C513800KDa c513800KDa = (C513800KDa) obj;
        return Intrinsics.LJFF(this.LL, c513800KDa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c513800KDa.LLILLJJLI) && this.LLILLL == c513800KDa.LLILLL && Intrinsics.LJFF(this.LLILZ, c513800KDa.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c513800KDa.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c513800KDa.LLILZLL) && this.LLIZ == c513800KDa.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c513800KDa.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c513800KDa.LLJ);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C0KCH c0kch = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (c0kch == null ? 0 : c0kch.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        Pair<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> pair = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (pair == null ? 0 : pair.hashCode())) * 31;
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = this.LLILZIL;
        int iHashCode4 = (((((((iHashCode3 + (pGCSubscriptionProductDetailWithTemplateInfo == null ? 0 : pGCSubscriptionProductDetailWithTemplateInfo.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        C291001Au<C0KCZ> c291001Au = this.LLJ;
        return iHashCode4 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubPackagePageVMState(isLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", allTierProductInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", forceShowProduct=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedPackage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedProduct=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", pgcUiData=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", payProgress=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", payResult=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", pageAction=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C513800KDa(int i) {
        this(null, null, false, null, null, new C0KDT(0), C0KDZ.PAY_NOT_STARTED, new C0KDP(0), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C513800KDa(Boolean bool, C0KCH c0kch, boolean z, Pair<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> pair, PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo, C0KDT c0kdt, C0KDZ c0kdz, C0KDP c0kdp, C291001Au<? extends C0KCZ> c291001Au) {
        this.LL = bool;
        this.LLILLJJLI = c0kch;
        this.LLILLL = z;
        this.LLILZ = pair;
        this.LLILZIL = pGCSubscriptionProductDetailWithTemplateInfo;
        this.LLILZLL = c0kdt;
        this.LLIZ = c0kdz;
        this.LLIZLLLIL = c0kdp;
        this.LLJ = c291001Au;
    }

    public static C513800KDa LIZ(C513800KDa c513800KDa, Boolean bool, C0KCH c0kch, Pair pair, PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo, C0KDT c0kdt, C0KDZ c0kdz, C0KDP c0kdp, int i) {
        boolean z;
        C291001Au<C0KCZ> c291001Au;
        C0KDP c0kdp2 = c0kdp;
        C0KDZ c0kdz2 = c0kdz;
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo;
        Pair pair2 = pair;
        C0KCH c0kch2 = c0kch;
        C0KDT c0kdt2 = c0kdt;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            bool2 = c513800KDa.LL;
        }
        if ((i & 2) != 0) {
            c0kch2 = c513800KDa.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c513800KDa.LLILLL;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            pair2 = c513800KDa.LLILZ;
        }
        if ((i & 16) != 0) {
            pGCSubscriptionProductDetailWithTemplateInfo2 = c513800KDa.LLILZIL;
        }
        if ((i & 32) != 0) {
            c0kdt2 = c513800KDa.LLILZLL;
        }
        if ((i & 64) != 0) {
            c0kdz2 = c513800KDa.LLIZ;
        }
        if ((i & 128) != 0) {
            c0kdp2 = c513800KDa.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au = c513800KDa.LLJ;
        } else {
            c291001Au = null;
        }
        c513800KDa.getClass();
        return new C513800KDa(bool2, c0kch2, z, pair2, pGCSubscriptionProductDetailWithTemplateInfo2, c0kdt2, c0kdz2, c0kdp2, c291001Au);
    }
}
