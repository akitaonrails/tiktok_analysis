package X;

import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637320OzC implements InterfaceC0148002o {
    public final EnumC637310OzB LL;
    public final InterfaceC1891350zJl LLILLJJLI;
    public final InboxBannerInfo LLILLL;

    public C637320OzC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C637320OzC)) {
            return false;
        }
        C637320OzC c637320OzC = (C637320OzC) obj;
        return this.LL == c637320OzC.LL && Intrinsics.LJFF(this.LLILLJJLI, c637320OzC.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c637320OzC.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        InterfaceC1891350zJl interfaceC1891350zJl = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (interfaceC1891350zJl == null ? 0 : interfaceC1891350zJl.hashCode())) * 31;
        InboxBannerInfo inboxBannerInfo = this.LLILLL;
        return iHashCode2 + (inboxBannerInfo != null ? inboxBannerInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxBannerViewModelState(bannerState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bannerItem=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bannerInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C637320OzC(int i) {
        this(EnumC637310OzB.INIT, null, null);
    }

    public C637320OzC(EnumC637310OzB enumC637310OzB, InterfaceC1891350zJl interfaceC1891350zJl, InboxBannerInfo inboxBannerInfo) {
        this.LL = enumC637310OzB;
        this.LLILLJJLI = interfaceC1891350zJl;
        this.LLILLL = inboxBannerInfo;
    }

    public static C637320OzC LIZ(C637320OzC c637320OzC, EnumC637310OzB enumC637310OzB, InterfaceC1891350zJl interfaceC1891350zJl, InboxBannerInfo inboxBannerInfo, int i) {
        if ((i & 1) != 0) {
            enumC637310OzB = c637320OzC.LL;
        }
        if ((i & 2) != 0) {
            interfaceC1891350zJl = c637320OzC.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            inboxBannerInfo = c637320OzC.LLILLL;
        }
        c637320OzC.getClass();
        return new C637320OzC(enumC637310OzB, interfaceC1891350zJl, inboxBannerInfo);
    }
}
