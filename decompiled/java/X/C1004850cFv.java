package X;

import com.ss.android.ugc.aweme.upvote.experiment.RepostTriggerOptimizeConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0cFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004850cFv {
    public static final RepostTriggerOptimizeConfig LIZ = new RepostTriggerOptimizeConfig(0, 0, 0, false, 0, new ArrayList(), false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1004860cFw());
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final boolean LJ;
    public static final int LJFF;
    public static final List<String> LJI;
    public static final boolean LJII;

    static {
        LIZ();
        LIZJ = LIZ().shareOrCommentLimits;
        LIZLLL = LIZ().videoLoopLimits;
        LJ = LIZ().clientAILimits;
        LJFF = LIZ().videoPlayTimes;
        LJI = LIZ().cepRules;
        LJII = LIZ().enableCache;
    }

    public static RepostTriggerOptimizeConfig LIZ() {
        return (RepostTriggerOptimizeConfig) LIZIZ.getValue();
    }
}
