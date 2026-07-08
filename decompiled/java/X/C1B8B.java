package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.downloader.Downloader;

/* JADX INFO: renamed from: X.1B8B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B8B {
    public static void LIZ(Context context, AbstractC2199801B7q abstractC2199801B7q) {
        if (context != null && abstractC2199801B7q != null) {
            int i = abstractC2199801B7q.LIZIZ;
            if (abstractC2199801B7q.LJIIJJI != null) {
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(context).removeMainThreadListener(i, abstractC2199801B7q.LJIIJJI);
            }
            if (abstractC2199801B7q.LJIIL != null) {
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(context).removeSubThreadListener(i, abstractC2199801B7q.LJIIL);
            }
        }
    }
}
