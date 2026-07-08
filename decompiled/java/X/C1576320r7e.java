package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoBotCenterResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576320r7e implements InterfaceC0148002o {
    public final AbstractC1623806Xk<TakoBotCenterResponse> LL;
    public final boolean LLILLJJLI;
    public final long LLILLL;
    public final TakoBotCenterResponse LLILZ;
    public final Pair<String, List<TakoBotInfo>> LLILZIL;

    public C1576320r7e() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1576320r7e)) {
            return false;
        }
        C1576320r7e c1576320r7e = (C1576320r7e) obj;
        return Intrinsics.LJFF(this.LL, c1576320r7e.LL) && this.LLILLJJLI == c1576320r7e.LLILLJJLI && this.LLILLL == c1576320r7e.LLILLL && Intrinsics.LJFF(this.LLILZ, c1576320r7e.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1576320r7e.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31;
        TakoBotCenterResponse takoBotCenterResponse = this.LLILZ;
        int iHashCode2 = (iHashCode + (takoBotCenterResponse == null ? 0 : takoBotCenterResponse.hashCode())) * 31;
        Pair<String, List<TakoBotInfo>> pair = this.LLILZIL;
        return iHashCode2 + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoBotCenterState(loadingState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasRecentlyItems=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shouldUpdateHint=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", recentlyItems=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", bots=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1576320r7e(int i) {
        this(C491101vh.LIZ, false, 0L, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1576320r7e(AbstractC1623806Xk<TakoBotCenterResponse> abstractC1623806Xk, boolean z, long j, TakoBotCenterResponse takoBotCenterResponse, Pair<String, ? extends List<TakoBotInfo>> pair) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = takoBotCenterResponse;
        this.LLILZIL = pair;
    }

    public static C1576320r7e LIZ(C1576320r7e c1576320r7e, AbstractC1623806Xk abstractC1623806Xk, boolean z, long j, TakoBotCenterResponse takoBotCenterResponse, Pair pair, int i) {
        TakoBotCenterResponse takoBotCenterResponse2 = takoBotCenterResponse;
        long j2 = j;
        boolean z2 = z;
        Pair pair2 = pair;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk2 = c1576320r7e.LL;
        }
        if ((i & 2) != 0) {
            z2 = c1576320r7e.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            j2 = c1576320r7e.LLILLL;
        }
        if ((i & 8) != 0) {
            takoBotCenterResponse2 = c1576320r7e.LLILZ;
        }
        if ((i & 16) != 0) {
            pair2 = c1576320r7e.LLILZIL;
        }
        c1576320r7e.getClass();
        return new C1576320r7e(abstractC1623806Xk2, z2, j2, takoBotCenterResponse2, pair2);
    }
}
