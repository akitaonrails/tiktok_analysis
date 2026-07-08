package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567220qsy extends AbstractC1568580qvA {
    public final NoticesResult.Notice LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1567220qsy) && Intrinsics.LJFF(this.LIZ, ((C1567220qsy) obj).LIZ);
    }

    public final int hashCode() {
        NoticesResult.Notice notice = this.LIZ;
        if (notice == null) {
            return 0;
        }
        return notice.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickChargeBannerModel(bannerData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1568580qvA
    public final boolean LIZIZ() {
        NoticesResult.Notice notice = this.LIZ;
        if (notice == null) {
            return false;
        }
        int i = notice.maxViewCount;
        String str = notice.id;
        Map<String, Double> mapLJ = InterfaceC1106030et7.O5.LIZIZ().get(String.valueOf(UserService.getInstance().user() == null ? 0L : UserService.getInstance().user().getCurrentUserId()));
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Double d = mapLJ.get(str);
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        int i2 = notice.dayLimit;
        HashMap map = (HashMap) InterfaceC1106030et7.P5.LIZ();
        if (map == null) {
            map = new HashMap();
        }
        Long l = (Long) map.get(str);
        return C1567180qsu.LIZ(new C1567170qst((long) dDoubleValue, i, l != null ? l.longValue() : 0L, i2)).LIZ;
    }

    @Override // X.AbstractC1568580qvA
    public final EnumC1568540qv6 LIZ() {
        return EnumC1568540qv6.QUICK_CHARGE;
    }

    public C1567220qsy(NoticesResult.Notice notice) {
        this.LIZ = notice;
    }
}
