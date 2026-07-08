package X;

import com.bytedance.keva.Keva;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445760nj4 {
    public static AbstractC2199801B7q LIZIZ;
    public static Function1<? super Boolean, Unit> LIZJ;
    public static Function0<Unit> LIZLLL;
    public static Function1<? super DownloadInfo, Unit> LJ;
    public static boolean LJFF;
    public static final C1445760nj4 LIZ = new C1445760nj4();
    public static final Keva LJI = Keva.getRepo("repo_edit_post_local_video");
    public static final C1443390nfF LJII = new AbsDownloadListener() { // from class: X.0nfF
        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            C1445760nj4.LJFF = false;
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            Function1<? super DownloadInfo, Unit> function1 = C1445760nj4.LJ;
            if (function1 != null) {
                function1.invoke(downloadInfo);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            C1445760nj4.LJFF = false;
            Function1<? super Boolean, Unit> function1 = C1445760nj4.LIZJ;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            C1445760nj4.LJFF = false;
            Function0<Unit> function0 = C1445760nj4.LIZLLL;
            if (function0 != null) {
                function0.invoke();
            }
        }
    };

    public static void LIZ(String str, String str2, String str3) {
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        abstractC2199801B7qWith.LIZJ = str3;
        abstractC2199801B7qWith.LJFF = true;
        abstractC2199801B7qWith.LJFF(Collections.singletonList(new HttpHeader("edit_post", "video")));
        abstractC2199801B7qWith.LJ = str2;
        abstractC2199801B7qWith.LJII = 3;
        abstractC2199801B7qWith.LJIIJJI = LJII;
        abstractC2199801B7qWith.LJJ = true;
        abstractC2199801B7qWith.LJIIJ = "edit_post";
        LIZIZ = abstractC2199801B7qWith;
        if (!LJFF) {
            LJFF = true;
            abstractC2199801B7qWith.LIZJ();
        }
    }
}
