package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0Rr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708690Rr1 {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        C2222971BzT c2222971BzT;
        String str;
        C1C1T c1c1t = C2203191BKr.LIZ(videoItemParams.getAweme()).socialBlob;
        if (c1c1t != null && (c2222971BzT = c1c1t.attribution_link_story_anchor_blob) != null && (str = c2222971BzT.link_address) != null) {
            return C1533950q1J.LJ(str);
        }
        return false;
    }
}
