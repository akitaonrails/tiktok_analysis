package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0nmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448020nmi {
    public static final String LIZ(ShortVideoContext shortVideoContext, String str) {
        if (!C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            return "no_permission";
        }
        if (!shortVideoContext.mIsFromDraft && shortVideoContext.LJJLL()) {
            if (!shortVideoContext.cameraComponentModel.duetContext.micDefaultState) {
                return "off";
            }
            return "on";
        }
        if (!shortVideoContext.LJJJJLL() && !shortVideoContext.LJJLL()) {
            if (C123100dR.LIZ(str)) {
                return "off";
            }
            return "on";
        }
        if (shortVideoContext.cameraComponentModel.isMuted) {
            return "off";
        }
        return "on";
    }
}
