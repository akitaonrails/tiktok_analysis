package X;

import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPerfConfigV1Model;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0w9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769810w9j {
    public static final C1769810w9j LIZ = new C1769810w9j();
    public static final EcMixMallPerfConfigV1Model LIZIZ = new EcMixMallPerfConfigV1Model(0, 0, 0, 0, 0, 1, 1, 0, 0, 0, null, 0, 0, 0, 0, 1, 1);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(437));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(435));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(434));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(436));

    public static EcMixMallPerfConfigV1Model LIZ() {
        return (EcMixMallPerfConfigV1Model) LIZJ.getValue();
    }

    public static Integer LIZIZ() {
        return Integer.valueOf(((Number) LIZLLL.getValue()).intValue());
    }

    public static boolean LIZJ() {
        Integer num;
        EcMixMallPerfConfigV1Model ecMixMallPerfConfigV1ModelLIZ = LIZ();
        return (ecMixMallPerfConfigV1ModelLIZ == null || (num = ecMixMallPerfConfigV1ModelLIZ.optPrefetchTiming) == null || num.intValue() != 1) ? false : true;
    }
}
