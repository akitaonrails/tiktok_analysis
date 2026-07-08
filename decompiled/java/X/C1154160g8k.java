package X;

import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicBarStyleConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154160g8k {
    public final List<DynamicColorConfig> LIZ;
    public final List<DynamicBarStyleConfig> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1154160g8k)) {
            return false;
        }
        C1154160g8k c1154160g8k = (C1154160g8k) obj;
        return Intrinsics.LJFF(this.LIZ, c1154160g8k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1154160g8k.LIZIZ);
    }

    public final int hashCode() {
        List<DynamicColorConfig> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DynamicBarStyleConfig> list2 = this.LIZIZ;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopMallDynamicStyleBridgeResult(dynamicColors=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dynamicBarStyles=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1154160g8k(List<DynamicColorConfig> list, List<DynamicBarStyleConfig> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
