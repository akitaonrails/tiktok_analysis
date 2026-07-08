package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0KxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534280KxO {
    public static final Pair<Integer, Integer> LIZ(LivePhotoPreviewMode livePhotoPreviewMode) {
        int i = C534270KxN.LIZ[livePhotoPreviewMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new Pair<>(Integer.valueOf(R.raw.icon_live_photo_slash), 2131836578);
                }
                throw new C1954807lC();
            }
            return new Pair<>(Integer.valueOf(R.raw.icon_live_photo_unlimited), 2131836577);
        }
        return new Pair<>(Integer.valueOf(R.raw.icon_live_photo), 2131829940);
    }

    public static final Pair<Integer, Integer> LIZIZ(LivePhotoPreviewMode livePhotoPreviewMode) {
        int i = C534270KxN.LIZ[livePhotoPreviewMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1657820tF6.LIZ.getClass();
                    if (C1657820tF6.LIZIZ()) {
                        return new Pair<>(Integer.valueOf(R.raw.icon_color_live_photo_slash), 2131836578);
                    }
                    return new Pair<>(Integer.valueOf(R.raw.icon_live_photo_slash), 2131836578);
                }
                throw new C1954807lC();
            }
            C1657820tF6.LIZ.getClass();
            if (C1657820tF6.LIZIZ()) {
                return new Pair<>(Integer.valueOf(R.raw.icon_color_live_photo_unlimited), 2131836577);
            }
            return new Pair<>(Integer.valueOf(R.raw.icon_live_photo_unlimited), 2131836577);
        }
        C1657820tF6.LIZ.getClass();
        if (C1657820tF6.LIZIZ()) {
            return new Pair<>(Integer.valueOf(R.raw.icon_color_live_photo), 2131836576);
        }
        return new Pair<>(Integer.valueOf(R.raw.icon_live_photo), 2131836576);
    }
}
