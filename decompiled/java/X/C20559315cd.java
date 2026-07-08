package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;

/* JADX INFO: renamed from: X.15cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20559315cd {
    public static final boolean LIZ(VideoAdaptionParams videoAdaptionParams) {
        if (videoAdaptionParams.getContainerWidth() > 0 && videoAdaptionParams.getContainerHeight() > 0 && videoAdaptionParams.getVideoWidth() > 0 && videoAdaptionParams.getVideoHeight() > 0) {
            return true;
        }
        return false;
    }
}
