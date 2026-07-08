package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332710D2n implements Serializable {
    public final C0DHO entryCheckoutType;
    public final EnumC043500Dp paymentType;
    public final EnumC20722089w viewSiteType;
    public final String viewSiteUrl;

    public C332710D2n() {
        this(C0DHO.STANDARD, null, null, null);
    }

    public final C332710D2n copy(C0DHO c0dho, EnumC043500Dp enumC043500Dp, EnumC20722089w enumC20722089w, String str) {
        return new C332710D2n(c0dho, enumC043500Dp, enumC20722089w, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332710D2n)) {
            return false;
        }
        C332710D2n c332710D2n = (C332710D2n) obj;
        return this.entryCheckoutType == c332710D2n.entryCheckoutType && this.paymentType == c332710D2n.paymentType && this.viewSiteType == c332710D2n.viewSiteType && Intrinsics.LJFF(this.viewSiteUrl, c332710D2n.viewSiteUrl);
    }

    public int hashCode() {
        int iHashCode = this.entryCheckoutType.hashCode() * 31;
        EnumC043500Dp enumC043500Dp = this.paymentType;
        int iHashCode2 = (iHashCode + (enumC043500Dp == null ? 0 : enumC043500Dp.hashCode())) * 31;
        EnumC20722089w enumC20722089w = this.viewSiteType;
        int iHashCode3 = (iHashCode2 + (enumC20722089w == null ? 0 : enumC20722089w.hashCode())) * 31;
        String str = this.viewSiteUrl;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpEntryContext(entryCheckoutType=");
        sbLIZ.append(this.entryCheckoutType);
        sbLIZ.append(", paymentType=");
        sbLIZ.append(this.paymentType);
        sbLIZ.append(", viewSiteType=");
        sbLIZ.append(this.viewSiteType);
        sbLIZ.append(", viewSiteUrl=");
        sbLIZ.append(this.viewSiteUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getShouldLaunchCspCheckout() {
        return this.paymentType == EnumC043500Dp.LAUNCH_CSP_CHECKOUT;
    }

    public final boolean getShouldShowVisitSite() {
        return this.viewSiteType == EnumC20722089w.VISIBLE;
    }

    public C332710D2n(C0DHO c0dho, EnumC043500Dp enumC043500Dp, EnumC20722089w enumC20722089w, String str) {
        this.entryCheckoutType = c0dho;
        this.paymentType = enumC043500Dp;
        this.viewSiteType = enumC20722089w;
        this.viewSiteUrl = str;
    }
}
