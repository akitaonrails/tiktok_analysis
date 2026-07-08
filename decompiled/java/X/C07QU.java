package X;

import com.ss.android.ugc.aweme.tako.experiment.TakoWaitNewMsgWhileLoadingExperimentConfig;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07QU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07QU {
    public static final TakoWaitNewMsgWhileLoadingExperimentConfig LIZ = new TakoWaitNewMsgWhileLoadingExperimentConfig(true, 3000);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final long LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(187));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((TakoWaitNewMsgWhileLoadingExperimentConfig) c01gwLIZIZ.getValue()).enable;
        LIZLLL = ((TakoWaitNewMsgWhileLoadingExperimentConfig) c01gwLIZIZ.getValue()).timeout;
    }
}
