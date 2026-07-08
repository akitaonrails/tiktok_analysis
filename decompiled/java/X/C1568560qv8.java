package X;

import com.bytedance.android.livesdk.wallet.NoticesResult;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568560qv8 extends AbstractC1568580qvA {
    public final NoticesResult.Notice LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1568560qv8) && Intrinsics.LJFF(this.LIZ, ((C1568560qv8) obj).LIZ);
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
        sbLIZ.append("VaultBannerModel(bannerData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1568580qvA
    public final boolean LIZIZ() {
        Map<String, String> map;
        String str;
        Integer numLJIIJJI;
        NoticesResult.Notice notice = this.LIZ;
        if (notice == null || (map = notice.extra) == null || (str = map.get("gift_id")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) {
            return false;
        }
        numLJIIJJI.intValue();
        return true;
    }

    @Override // X.AbstractC1568580qvA
    public final EnumC1568540qv6 LIZ() {
        return EnumC1568540qv6.VAULT_RECHARGE_TO_UNLOCK;
    }

    public C1568560qv8(NoticesResult.Notice notice) {
        this.LIZ = notice;
    }
}
