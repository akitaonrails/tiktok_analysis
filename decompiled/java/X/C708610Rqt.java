package X;

import com.ss.android.ugc.aweme.story.experiment.StoryAnchor;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Rqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708610Rqt {
    public static final C01GW LIZ;
    public static final StoryAnchor[] LIZIZ;
    public static final C01GW LIZJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(384));
        LIZ = c01gwLIZIZ;
        LIZIZ = (StoryAnchor[]) c01gwLIZIZ.getValue();
        LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(385));
    }

    public static boolean LIZ(int i) {
        return ((HashMap) LIZJ.getValue()).containsKey(Integer.valueOf(i));
    }
}
