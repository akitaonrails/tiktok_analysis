package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.social.experiment.FollowingListFreqParams;

/* JADX INFO: renamed from: X.0j1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265270j1x {
    public static final C1265270j1x LIZ = new C1265270j1x();
    public static final FollowingListFreqParams LIZIZ;
    public static final C1265410j2B LIZJ;
    public static String LIZLLL;
    public static boolean LJ;

    static {
        C1265410j2B c1265410j2B = C1265410j2B.LIZ;
        LIZIZ = (FollowingListFreqParams) C1265410j2B.LIZJ.getValue();
        LIZJ = c1265410j2B;
        LIZLLL = "";
    }

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("f_recommend_prefix_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
