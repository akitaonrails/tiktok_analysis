package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;

/* JADX INFO: renamed from: X.0MGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565720MGs {
    public static final boolean LIZ(ForwardMedia forwardMedia) {
        if (forwardMedia.awemeType != 150) {
            if ((!forwardMedia.isStory() || forwardMedia.awemeType != 152) && forwardMedia.photoModeImageInfo == null) {
                return false;
            }
            return true;
        }
        return true;
    }
}
