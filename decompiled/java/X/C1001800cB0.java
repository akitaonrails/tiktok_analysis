package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0cB0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001800cB0 extends C1001820cB2 {
    public static final C1001800cB0 LIZ;
    public static final C1002190cBd LIZIZ;
    public static final C1002190cBd LIZJ;
    public static final C1002190cBd LIZLLL;
    public static final C1002190cBd LJ;
    public static final C1001850cB5 LJFF;
    public static final C1002190cBd LJI;
    public static final C1001850cB5 LJII;
    public static final C1002190cBd LJIIIIZZ;
    public static final C1001850cB5 LJIIIZ;
    public static final C1001850cB5 LJIIJ;
    public static final C1002190cBd LJIIJJI;
    public static final C1002190cBd LJIIL;

    static {
        C1001800cB0 c1001800cB0 = new C1001800cB0();
        LIZ = c1001800cB0;
        LIZIZ = C1001860cB6.LJII("task_type", null);
        LIZJ = C1001860cB6.LJII(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, null);
        LIZLLL = C1001860cB6.LJII("failed_strategy", null);
        LJ = C1001860cB6.LIZLLL("block_count", null);
        LJFF = C1001860cB6.LIZ(c1001800cB0, "is_idle");
        LJI = C1001860cB6.LIZIZ(c1001800cB0, "resource_score");
        LJII = C1001860cB6.LIZ(c1001800cB0, "is_main_thread_idle");
        LJIIIIZZ = C1001860cB6.LIZIZ(c1001800cB0, "res_dash_score");
        LJIIIZ = C1001860cB6.LIZ(c1001800cB0, "is_fast_scroll");
        LJIIJ = C1001860cB6.LIZ(c1001800cB0, "is_scrolling");
        LJIIJJI = C1001860cB6.LJFF("duration", null);
        LJIIL = C1001860cB6.LIZLLL("task_complete_index", null);
    }
}
