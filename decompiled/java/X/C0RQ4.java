package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.config.SearchCommentInflowMeta;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RQ4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQ4 {
    public static final SearchCommentInflowMeta LIZ = new SearchCommentInflowMeta(3, 6);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(390));

    public static long LIZ() {
        return ((long) Math.max(0, ((SearchCommentInflowMeta) LIZIZ.getValue()).beforeShowLatencySecond)) * 1000;
    }

    public static long LIZIZ() {
        return ((long) Math.max(0, ((SearchCommentInflowMeta) LIZIZ.getValue()).showDurationSecond)) * 1000;
    }

    public static boolean LIZJ() {
        return ((Number) C1830607Ey.LIZ.getValue()).intValue() == 2;
    }
}
