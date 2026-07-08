package X;

import com.ss.android.ugc.aweme.creative.model.album.AlbumOpenApiModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0t28, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649780t28 {
    public static final boolean LIZ(ShortVideoContext shortVideoContext) {
        AlbumOpenApiModel albumOpenApiModel = shortVideoContext.creativeModel.albumOpenApiModel;
        if (albumOpenApiModel != null) {
            if (((albumOpenApiModel.getSupportFlags() & 1) != 0 || (albumOpenApiModel.getSupportFlags() & 2) != 0) && (albumOpenApiModel.getSupportFlags() & 4) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(ShortVideoContext shortVideoContext) {
        AlbumOpenApiModel albumOpenApiModel = shortVideoContext.creativeModel.albumOpenApiModel;
        if (albumOpenApiModel != null && (albumOpenApiModel.getSupportFlags() & 4) != 0 && (albumOpenApiModel.getSupportFlags() & 1) == 0 && (albumOpenApiModel.getSupportFlags() & 2) == 0) {
            return true;
        }
        return false;
    }
}
