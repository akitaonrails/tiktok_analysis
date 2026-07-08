package X;

import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694800RNe {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        boolean z;
        if (AwemeExtKt.isPrivateV2(videoItemParams.getAweme()) && !AwemeExtKt.isPrivate(videoItemParams.getAweme())) {
            z = true;
        } else {
            z = false;
        }
        if (((Boolean) C281170B0h.LIZIZ.getValue()).booleanValue() && z) {
            return true;
        }
        return false;
    }
}
