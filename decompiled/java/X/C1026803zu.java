package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.StarlingKeyValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1026803zu implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final StarlingKeyValue LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1026803zu)) {
            return false;
        }
        C1026803zu c1026803zu = (C1026803zu) obj;
        return Intrinsics.LJFF(this.LL, c1026803zu.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1026803zu.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1026803zu.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1026803zu.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1026803zu.LLILZIL) && this.LLILZLL == c1026803zu.LLILZLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StarlingKeyValue starlingKeyValue = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (starlingKeyValue == null ? 0 : starlingKeyValue.hashCode())) * 31;
        String str4 = this.LLILZIL;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaxInfoVO(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", taxCode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", subText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", button=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isPrefill=");
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
        return interfaceC1891350zJl instanceof C1026803zu;
    }

    public C1026803zu(String str, String str2, String str3, StarlingKeyValue starlingKeyValue, String str4, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = starlingKeyValue;
        this.LLILZIL = str4;
        this.LLILZLL = z;
    }
}
