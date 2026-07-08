package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AddressJumpType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.StarlingKeyValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1026203zo implements InterfaceC1891350zJl {
    public final String LL;
    public final AnonymousClass0376 LLILLJJLI;
    public final String LLILLL;
    public final StarlingKeyValue LLILZ;
    public final AddressJumpType LLILZIL;
    public final String LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1026203zo)) {
            return false;
        }
        C1026203zo c1026203zo = (C1026203zo) obj;
        return Intrinsics.LJFF(this.LL, c1026203zo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1026203zo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1026203zo.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1026203zo.LLILZ) && this.LLILZIL == c1026203zo.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1026203zo.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AnonymousClass0376 anonymousClass0376 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (anonymousClass0376 == null ? 0 : anonymousClass0376.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StarlingKeyValue starlingKeyValue = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (starlingKeyValue == null ? 0 : starlingKeyValue.hashCode())) * 31;
        AddressJumpType addressJumpType = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (addressJumpType == null ? 0 : addressJumpType.hashCode())) * 31;
        String str3 = this.LLILZLL;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressInfoVO(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", address=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", button=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", code=");
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
        return interfaceC1891350zJl instanceof C1026203zo;
    }

    public C1026203zo(String str, AnonymousClass0376 anonymousClass0376, String str2, StarlingKeyValue starlingKeyValue, AddressJumpType addressJumpType, String str3) {
        this.LL = str;
        this.LLILLJJLI = anonymousClass0376;
        this.LLILLL = str2;
        this.LLILZ = starlingKeyValue;
        this.LLILZIL = addressJumpType;
        this.LLILZLL = str3;
    }
}
