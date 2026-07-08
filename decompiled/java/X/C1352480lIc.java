package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostAttributes;
import com.ss.android.ugc.aweme.now.NowPostInfo;

/* JADX INFO: renamed from: X.0lIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352480lIc {
    public static final int LIZ(Aweme aweme) {
        NowPostAttributes nowPostAttributes;
        NowPostInfo nowPostInfo = aweme.nowPostInfo;
        if (nowPostInfo == null || ((nowPostAttributes = nowPostInfo.attributes) != null && nowPostAttributes.nowPostCameraType == 0)) {
            return 1;
        }
        return 0;
    }

    public static final int LIZIZ(InterfaceC1353860lKq interfaceC1353860lKq) {
        NowPostAttributes nowPostAttributes;
        NowPostInfo nowPostInfo = interfaceC1353860lKq.getAweme().nowPostInfo;
        if (nowPostInfo == null || ((nowPostAttributes = nowPostInfo.attributes) != null && nowPostAttributes.nowPostCameraType == 0)) {
            return 1;
        }
        return 0;
    }

    public static final int LIZJ(Aweme aweme) {
        NowPostInfo nowPostInfo;
        NowPostAttributes nowPostAttributes;
        if (aweme == null || (nowPostInfo = aweme.nowPostInfo) == null || (nowPostAttributes = nowPostInfo.attributes) == null || nowPostAttributes.creationType != 1) {
            return 0;
        }
        return 1;
    }
}
