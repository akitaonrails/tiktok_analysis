package X;

import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;

/* JADX INFO: renamed from: X.0QP7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QP7 {
    public static long LIZ;
    public static long LIZIZ;
    public static final /* synthetic */ int LIZJ = 0;

    public static void LIZ(ISearchMiddleForECService iSearchMiddleForECService, C19EG c19eg) {
        C0QP6.LIZ.getClass();
        if (C0QP6.LIZ(c19eg)) {
            if (iSearchMiddleForECService != null) {
                iSearchMiddleForECService.LJJIIZI();
            }
        } else {
            LIZ = 0L;
            LIZIZ = 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0QP8] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0Q78, X.0QP8] */
    public static C0QP8 LIZIZ(ISearchMiddleForECService iSearchMiddleForECService, C19EG c19eg) {
        C0QP6.LIZ.getClass();
        if (C0QP6.LIZ(c19eg)) {
            if (iSearchMiddleForECService != null) {
                iSearchMiddleForECService.LJJII();
            }
            return new C665950QAf<C0QP8>() { // from class: X.0QP8
            };
        }
        ?? r4 = new C665950QAf<C0QP8>() { // from class: X.0QP8
        };
        r4.LJIILLIIL("new_sug_session_start_time", String.valueOf(LIZ));
        r4.LJIILLIIL("new_sug_session_end_time", String.valueOf(LIZIZ));
        r4.LJIILLIIL("new_sug_session_cost", String.valueOf(LIZIZ - LIZ));
        return r4;
    }

    public static void LIZJ(ISearchMiddleForECService iSearchMiddleForECService, C19EG c19eg) {
        C0QP6.LIZ.getClass();
        if (C0QP6.LIZ(c19eg)) {
            if (iSearchMiddleForECService != null) {
                iSearchMiddleForECService.LJ();
            }
        } else if (LIZ == 0) {
            LIZ = System.currentTimeMillis();
        }
    }
}
