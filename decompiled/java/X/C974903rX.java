package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.HintViewInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03rX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C974903rX implements InterfaceC1891350zJl {
    public final Address LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final Boolean LLILZLL;
    public final String LLIZ;
    public final Integer LLIZLLLIL;
    public final HintViewInfo LLJ;
    public final Map<String, Object> LLJI;
    public final int LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C974903rX)) {
            return false;
        }
        C974903rX c974903rX = (C974903rX) obj;
        return Intrinsics.LJFF(this.LL, c974903rX.LL) && this.LLILLJJLI == c974903rX.LLILLJJLI && this.LLILLL == c974903rX.LLILLL && this.LLILZ == c974903rX.LLILZ && Intrinsics.LJFF(this.LLILZIL, c974903rX.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c974903rX.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c974903rX.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c974903rX.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c974903rX.LLJ) && Intrinsics.LJFF(this.LLJI, c974903rX.LLJI) && this.LLJIJIL == c974903rX.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c974903rX.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c974903rX.LLJILJILJ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Address address = this.LL;
        int iHashCode = (((((((address == null ? 0 : address.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        String str = this.LLILZIL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LLIZLLLIL;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        HintViewInfo hintViewInfo = this.LLJ;
        int iHashCode6 = (iHashCode5 + (hintViewInfo == null ? 0 : hintViewInfo.hashCode())) * 31;
        Map<String, Object> map = this.LLJI;
        int iHashCode7 = (((iHashCode6 + (map == null ? 0 : map.hashCode())) * 31) + this.LLJIJIL) * 31;
        String str3 = this.LLJILJIL;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJILJILJ;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "UsAddressItemVO(address=" + this.LL + ", isSelect=" + this.LLILLJJLI + ", reachable=" + this.LLILLL + ", addressValid=" + this.LLILZ + ", invalidHintMessage=" + this.LLILZIL + ", availableForChange=" + this.LLILZLL + ", unavailableChangeHint=" + this.LLIZ + ", hintMessageStyle=" + this.LLIZLLLIL + ", hintViewInfo=" + this.LLJ + ", daInfo=" + this.LLJI + ", valid=" + this.LLJIJIL + ", jumpSchema=" + this.LLJILJIL + ", labelText=" + this.LLJILJILJ + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        if (interfaceC1891350zJl instanceof C974903rX) {
            Address address = this.LL;
            String str2 = null;
            if (address != null) {
                str = address.id;
            } else {
                str = null;
            }
            Address address2 = ((C974903rX) interfaceC1891350zJl).LL;
            if (address2 != null) {
                str2 = address2.id;
            }
            if (Intrinsics.LJFF(str, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C974903rX(Address address, boolean z, boolean z2, boolean z3, String str, Boolean bool, String str2, Integer num, HintViewInfo hintViewInfo, Map<String, ? extends Object> map, int i, String str3, String str4) {
        this.LL = address;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = str;
        this.LLILZLL = bool;
        this.LLIZ = str2;
        this.LLIZLLLIL = num;
        this.LLJ = hintViewInfo;
        this.LLJI = map;
        this.LLJIJIL = i;
        this.LLJILJIL = str3;
        this.LLJILJILJ = str4;
    }
}
