package X;

import com.ss.android.ugc.aweme.experiment.PostModeBoostModel;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07TP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TP {
    public static final PostModeBoostModel LIZ = new PostModeBoostModel(0, false, false, null, 15, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(426));

    public static PostModeBoostModel LIZ() {
        return (PostModeBoostModel) LIZIZ.getValue();
    }

    public static boolean LIZIZ(String str) {
        List<String> list;
        if (LIZ().value == 0 || (list = LIZ().scene) == null || !list.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(String str) {
        if (!LIZIZ(str) && LIZ().enableFpsMonitor) {
            return true;
        }
        return false;
    }
}
