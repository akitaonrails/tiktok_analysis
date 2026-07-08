package X;

import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.GetFypAffiliateInfoResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892050zKt implements InterfaceC0148002o {
    public final C291001Au<GetFypAffiliateInfoResponse> LL;
    public final C291001Au<C1892080zKw> LLILLJJLI;

    public C1892050zKt() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1892050zKt)) {
            return false;
        }
        C1892050zKt c1892050zKt = (C1892050zKt) obj;
        return Intrinsics.LJFF(this.LL, c1892050zKt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1892050zKt.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<GetFypAffiliateInfoResponse> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<C1892080zKw> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcProductAddButtonState(responseData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", buttonShowEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1892050zKt(C291001Au<GetFypAffiliateInfoResponse> c291001Au, C291001Au<C1892080zKw> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
