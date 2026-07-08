package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KGF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGF implements InterfaceC0148002o {
    public final Boolean LL;
    public final C514600KGc LLILLJJLI;
    public final boolean LLILLL;
    public final Pair<String, List<SubscriptionProductDetailWithTemplateInfo>> LLILZ;
    public final SubscriptionProductDetailWithTemplateInfo LLILZIL;
    public final C514770KGt LLILZLL;
    public final EnumC513810KDb LLIZ;
    public final C0KIP LLIZLLLIL;
    public final C291001Au<EnumC514890KHf> LLJ;

    public C0KGF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KGF)) {
            return false;
        }
        C0KGF c0kgf = (C0KGF) obj;
        return Intrinsics.LJFF(this.LL, c0kgf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0kgf.LLILLJJLI) && this.LLILLL == c0kgf.LLILLL && Intrinsics.LJFF(this.LLILZ, c0kgf.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0kgf.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0kgf.LLILZLL) && this.LLIZ == c0kgf.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c0kgf.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0kgf.LLJ);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C514600KGc c514600KGc = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (c514600KGc == null ? 0 : c514600KGc.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        Pair<String, List<SubscriptionProductDetailWithTemplateInfo>> pair = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (pair == null ? 0 : pair.hashCode())) * 31;
        SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = this.LLILZIL;
        int iHashCode4 = (((((((iHashCode3 + (subscriptionProductDetailWithTemplateInfo == null ? 0 : subscriptionProductDetailWithTemplateInfo.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        C291001Au<EnumC514890KHf> c291001Au = this.LLJ;
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
        sbLIZ.append(", uiData=");
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

    public /* synthetic */ C0KGF(int i) {
        this(null, null, false, null, null, new C514770KGt(0), EnumC513810KDb.PAY_NOT_STARTED, new C0KIP(0), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0KGF(Boolean bool, C514600KGc c514600KGc, boolean z, Pair<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> pair, SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo, C514770KGt c514770KGt, EnumC513810KDb enumC513810KDb, C0KIP c0kip, C291001Au<? extends EnumC514890KHf> c291001Au) {
        this.LL = bool;
        this.LLILLJJLI = c514600KGc;
        this.LLILLL = z;
        this.LLILZ = pair;
        this.LLILZIL = subscriptionProductDetailWithTemplateInfo;
        this.LLILZLL = c514770KGt;
        this.LLIZ = enumC513810KDb;
        this.LLIZLLLIL = c0kip;
        this.LLJ = c291001Au;
    }

    public static C0KGF LIZ(C0KGF c0kgf, Boolean bool, C514600KGc c514600KGc, Pair pair, SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo, C514770KGt c514770KGt, EnumC513810KDb enumC513810KDb, C0KIP c0kip, int i) {
        boolean z;
        C291001Au<EnumC514890KHf> c291001Au;
        C0KIP c0kip2 = c0kip;
        EnumC513810KDb enumC513810KDb2 = enumC513810KDb;
        SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo2 = subscriptionProductDetailWithTemplateInfo;
        Pair pair2 = pair;
        C514600KGc c514600KGc2 = c514600KGc;
        C514770KGt c514770KGt2 = c514770KGt;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            bool2 = c0kgf.LL;
        }
        if ((i & 2) != 0) {
            c514600KGc2 = c0kgf.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c0kgf.LLILLL;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            pair2 = c0kgf.LLILZ;
        }
        if ((i & 16) != 0) {
            subscriptionProductDetailWithTemplateInfo2 = c0kgf.LLILZIL;
        }
        if ((i & 32) != 0) {
            c514770KGt2 = c0kgf.LLILZLL;
        }
        if ((i & 64) != 0) {
            enumC513810KDb2 = c0kgf.LLIZ;
        }
        if ((i & 128) != 0) {
            c0kip2 = c0kgf.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au = c0kgf.LLJ;
        } else {
            c291001Au = null;
        }
        c0kgf.getClass();
        return new C0KGF(bool2, c514600KGc2, z, pair2, subscriptionProductDetailWithTemplateInfo2, c514770KGt2, enumC513810KDb2, c0kip2, c291001Au);
    }
}
