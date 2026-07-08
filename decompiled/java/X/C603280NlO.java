package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0NlO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603280NlO {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(videoItemParams.getAweme().getAid());
        sbLIZ.append('/');
        sbLIZ.append(c690870R8b.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
