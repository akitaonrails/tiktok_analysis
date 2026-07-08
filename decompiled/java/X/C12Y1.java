package X;

import android.net.Uri;
import android.view.View;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0001000_29;

/* JADX INFO: renamed from: X.12Y1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Y1 extends AbsDownloadListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        if (1 - this.$t != 0) {
            super.onCanceled(downloadInfo);
        } else {
            onCanceled$0(this, downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        if (1 - this.$t != 0) {
            super.onFailed(downloadInfo, baseException);
        } else {
            onFailed$0(this, downloadInfo, baseException);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        if (1 - this.$t != 0) {
            super.onProgress(downloadInfo);
        } else {
            onProgress$0(this, downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        switch (this.$t) {
            case 0:
                onSuccessed$0(this, downloadInfo);
                break;
            case 1:
                onSuccessed$1(this, downloadInfo);
                break;
            default:
                super.onSuccessed(downloadInfo);
                break;
        }
    }

    public C12Y1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCanceled$0(C12Y1 c12y1, DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        ((ShoutoutsPlayViewModel) c12y1.l0).setState(AFwS273S0000000_29.get$arr$(143));
    }

    public static final void onProgress$0(C12Y1 c12y1, DownloadInfo downloadInfo) {
        ((ShoutoutsPlayViewModel) c12y1.l0).setState(new AwS41S0001000_29((int) ((downloadInfo.getCurBytes() / downloadInfo.getTotalBytes()) * 100), 24));
    }

    public static final void onSuccessed$0(C12Y1 c12y1, DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        View view = ((CanvasGestureGuideWidget) c12y1.l0).LIZJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        CanvasGestureGuideWidget canvasGestureGuideWidget = (CanvasGestureGuideWidget) c12y1.l0;
        canvasGestureGuideWidget.getClass();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJIIJJI = true;
        c1320810kTXLIZJ.LJI(Uri.fromFile(new C0VSJ(canvasGestureGuideWidget.LIZIZ())));
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        C1322110kVd c1322110kVd = canvasGestureGuideWidget.LIZIZ;
        if (c1322110kVd != null) {
            c1322110kVd.setController(abstractC1320710kTNLIZ);
        }
        ((CanvasGestureGuideWidget) c12y1.l0).LJI = C11QJ.LL.LJ(5L, TimeUnit.SECONDS).LJIILJJIL(C1701940uOG.LIZIZ()).LJIJI(new C09JN() { // from class: X.11Tp
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("CanvasGestureGuideWidget@3eca.threadListener$1$onSuccessed$2");
                C1C7U.LIZIZ("CanvasGestureGuideWidget@3eca.threadListener$1$onSuccessed$2");
            }
        }, new C19773912Yf((CanvasGestureGuideWidget) c12y1.l0, 1));
    }

    public static final void onSuccessed$1(C12Y1 c12y1, DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        ((ShoutoutsPlayViewModel) c12y1.l0).setState(AFwS273S0000000_29.get$arr$(145));
    }

    public static final void onFailed$0(C12Y1 c12y1, DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        ((ShoutoutsPlayViewModel) c12y1.l0).setState(AFwS273S0000000_29.get$arr$(144));
    }
}
