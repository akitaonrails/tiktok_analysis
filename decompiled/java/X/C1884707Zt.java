package X;

import com.bytedance.i18n.region.privacy.PrivacyDataInjectionRule;
import java.util.List;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1884707Zt {
    public final List<PrivacyDataInjectionRule> LIZ;
    public final boolean LIZIZ;
    public final C01GW LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1884707Zt)) {
            return false;
        }
        C1884707Zt c1884707Zt = (C1884707Zt) obj;
        return Intrinsics.LJFF(this.LIZ, c1884707Zt.LIZ) && this.LIZIZ == c1884707Zt.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataInjectionConfig(rules=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1884707Zt() {
        this(C13BV.INSTANCE, false);
    }

    public C1884707Zt(List<PrivacyDataInjectionRule> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new AwS547S0100000_3(this, 186));
    }
}
