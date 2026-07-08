package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.relation.storage.experiment.RelationStorageConfig;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816930W2x {
    public static final RelationStorageConfig LIZ = new RelationStorageConfig(0, 86400000L, 172800000L, 5, null, 100, 30, -1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(16));
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        Integer num = LIZIZ().maxLocalMaf;
        LIZJ = num != null ? num.intValue() : 100;
        Integer num2 = LIZIZ().maxDisplayMaf;
        LIZLLL = num2 != null ? num2.intValue() : 30;
    }

    public static RelationStorageConfig LIZIZ() {
        return (RelationStorageConfig) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        Integer num = LIZIZ().enable;
        return (num == null || num.intValue() != 1 || (ComplianceServiceProvider.LJI().LJIIJ(false) && ((Number) C276220As8.LIZ.getValue()).intValue() == 1 && Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE))) ? false : true;
    }
}
