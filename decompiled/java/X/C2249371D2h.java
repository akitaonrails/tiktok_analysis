package X;

import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249371D2h {
    public final DynamicColorConfig LIZ;
    public final DynamicColorConfig LIZIZ;
    public final DynamicColorConfig LIZJ;
    public final Map<String, DynamicColorConfig> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2249371D2h)) {
            return false;
        }
        C2249371D2h c2249371D2h = (C2249371D2h) obj;
        return Intrinsics.LJFF(this.LIZ, c2249371D2h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2249371D2h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2249371D2h.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2249371D2h.LIZLLL);
    }

    public final int hashCode() {
        DynamicColorConfig dynamicColorConfig = this.LIZ;
        int iHashCode = (dynamicColorConfig == null ? 0 : dynamicColorConfig.hashCode()) * 31;
        DynamicColorConfig dynamicColorConfig2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (dynamicColorConfig2 == null ? 0 : dynamicColorConfig2.hashCode())) * 31;
        DynamicColorConfig dynamicColorConfig3 = this.LIZJ;
        return ((iHashCode2 + (dynamicColorConfig3 != null ? dynamicColorConfig3.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopMallDynamicBackgroundSnapshot(pageConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", headerConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bodyConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", itemConfigsById=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2249371D2h(DynamicColorConfig dynamicColorConfig, DynamicColorConfig dynamicColorConfig2, DynamicColorConfig dynamicColorConfig3, Map<String, DynamicColorConfig> map) {
        this.LIZ = dynamicColorConfig;
        this.LIZIZ = dynamicColorConfig2;
        this.LIZJ = dynamicColorConfig3;
        this.LIZLLL = map;
    }
}
