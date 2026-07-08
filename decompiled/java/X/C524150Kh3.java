package X;

import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode;

/* JADX INFO: renamed from: X.0Kh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524150Kh3 {
    public static final boolean LIZ(AlbumSelectionMode albumSelectionMode, int i, int i2) {
        if (albumSelectionMode instanceof AlbumSelectionMode.Single) {
            if (i + i2 < 1) {
                return false;
            }
        } else if (albumSelectionMode instanceof AlbumSelectionMode.Multiple) {
            AlbumSelectionMode.Multiple multiple = (AlbumSelectionMode.Multiple) albumSelectionMode;
            if (i < multiple.maxVideoCount && i2 < multiple.maxPhotoCount && i + i2 < multiple.maxCount) {
                return false;
            }
        } else {
            throw new C1954807lC();
        }
        return true;
    }
}
