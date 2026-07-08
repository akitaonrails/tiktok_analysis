package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C818903Hv implements InterfaceC0148002o {
    public final AnonymousClass0376 LL;
    public final String LLILLJJLI;
    public final IdentityInfo LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Boolean LLILZLL;

    public C818903Hv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C818903Hv)) {
            return false;
        }
        C818903Hv c818903Hv = (C818903Hv) obj;
        return Intrinsics.LJFF(this.LL, c818903Hv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c818903Hv.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c818903Hv.LLILLL) && Intrinsics.LJFF(this.LLILZ, c818903Hv.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c818903Hv.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c818903Hv.LLILZLL);
    }

    public final int hashCode() {
        AnonymousClass0376 anonymousClass0376 = this.LL;
        int iHashCode = (anonymousClass0376 == null ? 0 : anonymousClass0376.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        IdentityInfo identityInfo = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (identityInfo == null ? 0 : identityInfo.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspAddressState(addressVO=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cpfContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", identityInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", identityName=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", identityValue=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", highLightRecipientIdentityInfo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C818903Hv(int i) {
        this(null, null, null, null, null, Boolean.FALSE);
    }

    public C818903Hv(AnonymousClass0376 anonymousClass0376, String str, IdentityInfo identityInfo, String str2, String str3, Boolean bool) {
        this.LL = anonymousClass0376;
        this.LLILLJJLI = str;
        this.LLILLL = identityInfo;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = bool;
    }

    public static C818903Hv LIZ(C818903Hv c818903Hv, String str, IdentityInfo identityInfo, String str2, String str3, Boolean bool, int i) {
        AnonymousClass0376 anonymousClass0376;
        Boolean bool2 = bool;
        String str4 = str3;
        String str5 = str2;
        IdentityInfo identityInfo2 = identityInfo;
        String str6 = str;
        if ((i & 1) != 0) {
            anonymousClass0376 = c818903Hv.LL;
        } else {
            anonymousClass0376 = null;
        }
        if ((i & 2) != 0) {
            str6 = c818903Hv.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            identityInfo2 = c818903Hv.LLILLL;
        }
        if ((i & 8) != 0) {
            str5 = c818903Hv.LLILZ;
        }
        if ((i & 16) != 0) {
            str4 = c818903Hv.LLILZIL;
        }
        if ((i & 32) != 0) {
            bool2 = c818903Hv.LLILZLL;
        }
        c818903Hv.getClass();
        return new C818903Hv(anonymousClass0376, str6, identityInfo2, str5, str4, bool2);
    }
}
