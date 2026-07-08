package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import java.io.File;
import java.util.Collections;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0m6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383600m6o extends AbstractC1382740m5Q {
    @Override // X.AbstractC1382740m5Q
    public final boolean LIZ(String str, String str2, String str3) {
        if (str != null && str2 != null && str3 != null) {
            LIZJ(str, str2, str3);
            return true;
        }
        return false;
    }

    public final void LIZJ(String str, String str2, String str3) {
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        AbstractC2199801B7q abstractC2199801B7qWith = downloadServiceManager.getDownloadService().with(str);
        abstractC2199801B7qWith.LIZJ = str2;
        abstractC2199801B7qWith.LJFF(Collections.singletonList(new HttpHeader("downloader_scene", "video")));
        abstractC2199801B7qWith.LJ = str3;
        abstractC2199801B7qWith.LJII = downloadServiceManager.getRetryExpCount();
        abstractC2199801B7qWith.LJIIJJI = this.LIZIZ;
        abstractC2199801B7qWith.LJJ = downloadServiceManager.isAutoRemoveListener();
        abstractC2199801B7qWith.LJIIJ = "feed_video";
        this.LIZ = abstractC2199801B7qWith.LJ(new InterfaceC2329409Au() { // from class: X.0m6p
            @Override // X.InterfaceC2329409Au
            public final void onStart(int i) {
            }
        });
    }

    @Override // X.AbstractC1382740m5Q
    public final boolean LIZIZ(String str, final String str2, final String str3, final String str4) {
        if (str != null && str2 != null && str3 != null && str4 != null) {
            LocalVideoPlayerManager localVideoPlayerManagerLJ = LocalVideoPlayerManager.LJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str4);
            sbLIZ.append(str3);
            boolean zLJIIJ = localVideoPlayerManagerLJ.LJIIJ(str, C2188811AlT.LIZIZ(sbLIZ), new C14E5() { // from class: X.0m6x
                @Override // X.C14E5
                public final void onFailed() {
                    this.LIZ.LIZJ(str2, str3, str4);
                }

                @Override // X.C14E5
                public final void onSuccess(String str5) {
                    C0VSJ c0vsj = new C0VSJ(str5);
                    ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("download_success");
                    DownloadInfo downloadInfo = new DownloadInfo();
                    C2199771B7n c2199771B7n = new C2199771B7n();
                    downloadInfo.setCurBytes(c0vsj.length());
                    downloadInfo.setTotalBytes(c0vsj.length());
                    AbsDownloadListener absDownloadListener = this.LIZ.LIZIZ;
                    if (absDownloadListener != null) {
                        absDownloadListener.onProgress(downloadInfo);
                    }
                    String str6 = File.separator;
                    String strLJJLJLI = a0.LJJLJLI(str5, str6, str5);
                    String strLJL = a0.LJL(str5, str6, str5);
                    AbsDownloadListener absDownloadListener2 = this.LIZ.LIZIZ;
                    if (absDownloadListener2 != null) {
                        c2199771B7n.LIZ = strLJJLJLI;
                        c2199771B7n.LIZLLL = strLJL;
                        absDownloadListener2.onSuccessed(c2199771B7n.LIZ());
                    }
                }
            });
            this.LIZJ = zLJIIJ;
            return zLJIIJ;
        }
        return false;
    }
}
