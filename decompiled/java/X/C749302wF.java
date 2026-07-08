package X;

import com.bytedance.touchpoint.core.experiment.IncentiveLynxCardConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.02wF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C749302wF {
    public static final IncentiveLynxCardConfig LIZ = new IncentiveLynxCardConfig(false, false, null, 7, null);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final List<Integer> LJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(484));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((IncentiveLynxCardConfig) c01gwLIZIZ.getValue()).enableOptErr;
        LIZLLL = ((IncentiveLynxCardConfig) c01gwLIZIZ.getValue()).enableOptLynxFB;
        LJ = ((IncentiveLynxCardConfig) c01gwLIZIZ.getValue()).incentiveLynxCardConfig;
    }
}
