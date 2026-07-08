package X;

import com.ss.android.ugc.aweme.model.PaidCollectionRefundResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611650s2d implements InterfaceC0148002o {
    public final Boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final AbstractC1623806Xk<PaidCollectionRefundResponse> LLILZLL;
    public final String LLIZ;

    public C1611650s2d() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1611650s2d)) {
            return false;
        }
        C1611650s2d c1611650s2d = (C1611650s2d) obj;
        return Intrinsics.LJFF(this.LL, c1611650s2d.LL) && this.LLILLJJLI == c1611650s2d.LLILLJJLI && this.LLILLL == c1611650s2d.LLILLL && this.LLILZ == c1611650s2d.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1611650s2d.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1611650s2d.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1611650s2d.LLIZ);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        return ((((((((((((bool == null ? 0 : bool.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentDetailPurchaseState(hasRefund=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shouldBlockUIFromRefund=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasSubmittedRating=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", ratingValue=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", webPaymentPrice=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", refundResponse=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", refundReason=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1611650s2d(int i) {
        this(null, false, false, 0, "", C491101vh.LIZ, "");
    }

    public C1611650s2d(Boolean bool, boolean z, boolean z2, int i, String str, AbstractC1623806Xk<PaidCollectionRefundResponse> abstractC1623806Xk, String str2) {
        this.LL = bool;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = abstractC1623806Xk;
        this.LLIZ = str2;
    }

    public static C1611650s2d LIZ(C1611650s2d c1611650s2d, Boolean bool, boolean z, String str, AbstractC1623806Xk abstractC1623806Xk, String str2, int i) {
        boolean z2;
        int i2;
        String str3 = str2;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        String str4 = str;
        boolean z3 = z;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            bool2 = c1611650s2d.LL;
        }
        if ((i & 2) != 0) {
            z3 = c1611650s2d.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c1611650s2d.LLILLL;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            i2 = c1611650s2d.LLILZ;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            str4 = c1611650s2d.LLILZIL;
        }
        if ((i & 32) != 0) {
            abstractC1623806Xk2 = c1611650s2d.LLILZLL;
        }
        if ((i & 64) != 0) {
            str3 = c1611650s2d.LLIZ;
        }
        c1611650s2d.getClass();
        return new C1611650s2d(bool2, z3, z2, i2, str4, abstractC1623806Xk2, str3);
    }
}
