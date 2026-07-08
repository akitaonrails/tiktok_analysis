package X;

import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicBarStyleConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249411D2l {
    public final boolean LIZ;
    public final C2249371D2h LIZIZ;
    public final DynamicBarStyleConfig LIZJ;
    public final DynamicBarStyleConfig LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2249411D2l)) {
            return false;
        }
        C2249411D2l c2249411D2l = (C2249411D2l) obj;
        return this.LIZ == c2249411D2l.LIZ && Intrinsics.LJFF(this.LIZIZ, c2249411D2l.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2249411D2l.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2249411D2l.LIZLLL) && Intrinsics.LJFF(this.LJ, c2249411D2l.LJ) && Intrinsics.LJFF(this.LJFF, c2249411D2l.LJFF) && Intrinsics.LJFF(this.LJI, c2249411D2l.LJI);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        DynamicBarStyleConfig dynamicBarStyleConfig = this.LIZJ;
        int iHashCode = (iZ2 + (dynamicBarStyleConfig == null ? 0 : dynamicBarStyleConfig.hashCode())) * 31;
        DynamicBarStyleConfig dynamicBarStyleConfig2 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (dynamicBarStyleConfig2 == null ? 0 : dynamicBarStyleConfig2.hashCode())) * 31;
        String str = this.LJ;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopMallDynamicStyleSnapshot(isSticky=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", backgroundSnapshot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", statusBarStyleConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", searchBarStyleConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", statusBarContentStyle=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", searchBarDynamicStyle=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", searchBarDynamicColor=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2249411D2l(boolean z, C2249371D2h c2249371D2h, DynamicBarStyleConfig dynamicBarStyleConfig, DynamicBarStyleConfig dynamicBarStyleConfig2, String str, String str2, String str3) {
        this.LIZ = z;
        this.LIZIZ = c2249371D2h;
        this.LIZJ = dynamicBarStyleConfig;
        this.LIZLLL = dynamicBarStyleConfig2;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = str3;
    }
}
