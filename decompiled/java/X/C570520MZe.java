package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;

/* JADX INFO: renamed from: X.0MZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570520MZe {
    public static final int LIZ(LivePhotoModel livePhotoModel) {
        if (!livePhotoModel.enableLiveMode) {
            return 0;
        }
        int i = C570510MZd.LIZ[livePhotoModel.previewMode.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return 0;
            }
            throw new C1954807lC();
        }
        return 1;
    }

    public static final String LIZIZ(LivePhotoPreviewMode livePhotoPreviewMode, boolean z) {
        int i = C570510MZd.LIZ[livePhotoPreviewMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (z) {
                        return "";
                    }
                    return "static";
                }
                throw new C1954807lC();
            }
            return "loop";
        }
        return "once";
    }
}
