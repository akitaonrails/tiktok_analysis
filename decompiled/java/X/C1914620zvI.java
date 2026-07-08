package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntryType;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914620zvI implements InterfaceC1914160zuY {
    public static final Map<Integer, String> LJFF = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(RecReasonEntryType.LIKE.getType()), "ThumbsUp"), new Pair(Integer.valueOf(RecReasonEntryType.SHARE.getType()), "ArrowTurnUpRight"), new Pair(Integer.valueOf(RecReasonEntryType.COMMENT.getType()), "ChatLTR"), new Pair(Integer.valueOf(RecReasonEntryType.FINISH.getType()), "TickCircle"), new Pair(Integer.valueOf(RecReasonEntryType.POPULARITY.getType()), "Fire3"), new Pair(Integer.valueOf(RecReasonEntryType.FOLLOWERSHIP.getType()), "TwoPerson"), new Pair(Integer.valueOf(RecReasonEntryType.INTEREST_TOPICS.getType()), "Star"), new Pair(Integer.valueOf(RecReasonEntryType.LONG_VIDEO.getType()), "VideoPlus"), new Pair(Integer.valueOf(RecReasonEntryType.SOCIAL.getType()), "Person"), new Pair(Integer.valueOf(RecReasonEntryType.LIVE_HEAD.getType()), "LiveWave"), new Pair(Integer.valueOf(RecReasonEntryType.BOOST.getType()), "LineChart"), new Pair(Integer.valueOf(RecReasonEntryType.OTHER_HOMEPAGE.getType()), "House"), new Pair(Integer.valueOf(RecReasonEntryType.COLD_START.getType()), "FeedContent"), new Pair(Integer.valueOf(RecReasonEntryType.SEARCH_SIMILAR.getType()), "Play"), new Pair(Integer.valueOf(RecReasonEntryType.ALGO_REFRESH.getType()), "ArrowDoubleDirectionCircle"), new Pair(Integer.valueOf(RecReasonEntryType.USER_BOOST.getType()), "Post"), new Pair(Integer.valueOf(RecReasonEntryType.LIKED_BEFORE.getType()), "Like"), new Pair(Integer.valueOf(RecReasonEntryType.FAVORITE_BEFORE.getType()), "Bookmark"), new Pair(Integer.valueOf(RecReasonEntryType.DOWNLOADED_BEFORE.getType()), "ArrowDownToLine"));
    public final Context LIZ;
    public final RecReasonsStruct LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final IAlgoRefreshService LJ = (IAlgoRefreshService) PluggableExtentionKt.pluggableSpi$default(IAlgoRefreshService.class, false, false, false, 14, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0a4f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    @Override // X.InterfaceC1914160zuY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C15O7<com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse> LIZIZ() {
        /*
            Method dump skipped, instruction units count: 2671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1914620zvI.LIZIZ():X.15O7");
    }

    @Override // X.InterfaceC1914160zuY
    public final C15O7<Unit> LIZ(String str, Map<String, String> map) {
        return C15O7.LJIIJ(Unit.LIZ);
    }

    public static final Map LIZJ(String str, String str2, boolean z) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("content_top_center", new UniversalPopupBlockElement("text", str, "Headline-Semibold", null, null, null, "left", null, null, null, 952, null)));
        if (z) {
            mapLJIIJ.put("action_top_right", new UniversalPopupBlockElement("disclosure", str2, null, null, null, null, null, null, null, null, 1020, null));
        }
        return mapLJIIJ;
    }

    public C1914620zvI(Context context, RecReasonsStruct recReasonsStruct, boolean z, boolean z2) {
        this.LIZ = context;
        this.LIZIZ = recReasonsStruct;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
