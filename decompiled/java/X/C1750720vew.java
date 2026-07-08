package X;

import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750720vew implements InterfaceC0148002o {
    public final C291001Au<EnumC1751090vfX> LL;
    public final boolean LLILLJJLI;
    public final TradeEntranceInfo LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1750720vew)) {
            return false;
        }
        C1750720vew c1750720vew = (C1750720vew) obj;
        return Intrinsics.LJFF(this.LL, c1750720vew.LL) && this.LLILLJJLI == c1750720vew.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1750720vew.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        TradeEntranceInfo tradeEntranceInfo = this.LLILLL;
        return iHashCode + (tradeEntranceInfo == null ? 0 : tradeEntranceInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageCenterPageState(state=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadDone=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", orderCenterEntry=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1750720vew(C291001Au<? extends EnumC1751090vfX> c291001Au, boolean z, TradeEntranceInfo tradeEntranceInfo) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = tradeEntranceInfo;
    }

    public static C1750720vew LIZ(C1750720vew c1750720vew, C291001Au c291001Au, boolean z, TradeEntranceInfo tradeEntranceInfo, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1750720vew.LL;
        }
        if ((i & 2) != 0) {
            z = c1750720vew.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            tradeEntranceInfo = c1750720vew.LLILLL;
        }
        c1750720vew.getClass();
        return new C1750720vew(c291001Au, z, tradeEntranceInfo);
    }
}
