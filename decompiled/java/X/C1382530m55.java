package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0m55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382530m55 {
    public static final void LIZIZ(EnumC1381780m3s enumC1381780m3s, Aweme aweme) {
        StringBuilder sb = new StringBuilder("ForbidDownload:ForbidType:");
        sb.append(enumC1381780m3s);
        if (aweme != null) {
            sb.append(",aweme_id");
            sb.append(aweme.getAid());
        }
        C612410O0h.LIZIZ("aweme_movie_download_error_message", "download", sb.toString(), "");
    }

    public static final void LIZ(Aweme aweme, BaseException baseException, String str) {
        StringBuilder sb = new StringBuilder("DownloaderError:");
        sb.append("error_code:");
        sb.append(baseException.getErrorCode());
        sb.append(",error_message:");
        sb.append(baseException.getMessage());
        if (aweme != null) {
            sb.append(",aweme_id:");
            sb.append(aweme.getAid());
        }
        C612410O0h.LIZIZ("aweme_movie_download_error_message", "download", sb.toString(), str);
    }
}
