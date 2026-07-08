package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;

/* JADX INFO: renamed from: X.0SGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718460SGe {
    public static final C718460SGe LIZ = new C718460SGe();
    public static volatile C1281304zr LIZIZ;

    public final synchronized void LIZ(Aweme aweme) {
        PaidContentMiniDramaInfo paidContentMiniDramaInfo;
        if (aweme == null) {
            return;
        }
        PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
        if (paidContentInfo != null && (paidContentMiniDramaInfo = paidContentInfo.getPaidContentMiniDramaInfo()) != null) {
            String jumpEpisodeVideoId = paidContentMiniDramaInfo.getJumpEpisodeVideoId();
            Long jumpEpisodeVideoOffsetMs = paidContentMiniDramaInfo.getJumpEpisodeVideoOffsetMs();
            String aid = aweme.getAid();
            if (jumpEpisodeVideoId != null && jumpEpisodeVideoId.length() != 0 && jumpEpisodeVideoOffsetMs != null && jumpEpisodeVideoOffsetMs.longValue() >= 0) {
                LIZIZ = new C1281304zr(aid, jumpEpisodeVideoId, jumpEpisodeVideoOffsetMs.longValue());
            }
        }
    }
}
