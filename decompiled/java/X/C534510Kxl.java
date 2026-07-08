package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.downloader.DownloadTaskImpl;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.downloader.DownloadTaskImpl$start$2$2", f = "DownloadTask.kt", l = {}, m = "invokeSuspend")
public final class C534510Kxl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DownloadTaskImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534510Kxl(DownloadTaskImpl downloadTaskImpl, InterfaceC1364105Vn<? super C534510Kxl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = downloadTaskImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534510Kxl(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadTaskImpl@fc86.start$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final DownloadTaskImpl downloadTaskImpl = this.LL;
        for (final C534490Kxj c534490Kxj : downloadTaskImpl.LJ) {
            DownloadTask downloadTaskWith = C2200151B8z.with(downloadTaskImpl.LIZJ);
            downloadTaskWith.url(c534490Kxj.LIZJ);
            downloadTaskWith.savePath(c534490Kxj.LIZLLL);
            downloadTaskWith.mimeType(c534490Kxj.LJFF);
            downloadTaskWith.name(c534490Kxj.LIZ());
            downloadTaskWith.monitorScene(downloadTaskImpl.LIZIZ);
            downloadTaskWith.minProgressTimeMsInterval(LSPassThroughRecordSizeConfig.DEFAULT);
            downloadTaskWith.retryCount(3);
            downloadTaskWith.mainThreadListener(new AbsDownloadListener() { // from class: X.0Kxm
                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onCanceled(DownloadInfo downloadInfo) {
                    super.onCanceled(downloadInfo);
                    C534500Kxk c534500Kxk = downloadTaskImpl.LJFF;
                    C534490Kxj c534490Kxj2 = c534490Kxj;
                    c534500Kxk.getClass();
                    C534580Kxs c534580Kxs = C534580Kxs.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSingleTaskCancel, config: ");
                    sbLIZ.append(c534490Kxj2);
                    sbLIZ.append(", ");
                    sbLIZ.append(c534500Kxk.LJIIJ.get());
                    C201955140j.LIZLLL(c534580Kxs, "DownloadCallback", C2188811AlT.LIZIZ(sbLIZ));
                    if (c534500Kxk.LJIIJ.get()) {
                        DownloadInfo downloadInfo2 = new DownloadInfo();
                        downloadInfo2.setFailedException(new BaseException(-999, "cancel"));
                        c534500Kxk.LJFF(downloadInfo2, c534490Kxj2);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onProgress(DownloadInfo downloadInfo) {
                    super.onProgress(downloadInfo);
                    if (downloadInfo != null) {
                        int downloadProcess = downloadInfo.getDownloadProcess();
                        DownloadTaskImpl downloadTaskImpl2 = downloadTaskImpl;
                        downloadTaskImpl2.LJFF.LJI(c534490Kxj, downloadProcess);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    super.onStart(downloadInfo);
                    C534500Kxk c534500Kxk = downloadTaskImpl.LJFF;
                    C534490Kxj c534490Kxj2 = c534490Kxj;
                    c534500Kxk.getClass();
                    C534580Kxs c534580Kxs = C534580Kxs.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSingleTaskStart, config: ");
                    sbLIZ.append(c534490Kxj2);
                    sbLIZ.append(", ");
                    sbLIZ.append(c534500Kxk.LJIIJ.get());
                    C201955140j.LIZLLL(c534580Kxs, "DownloadCallback", C2188811AlT.LIZIZ(sbLIZ));
                    if (c534500Kxk.LJIIJ.get() && downloadInfo != null) {
                        int id = downloadInfo.getId();
                        ((ArrayList) c534500Kxk.LJI).add(Integer.valueOf(id));
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    super.onSuccessed(downloadInfo);
                    downloadTaskImpl.LJFF.LJI(c534490Kxj, 100);
                    C534500Kxk c534500Kxk = downloadTaskImpl.LJFF;
                    C534490Kxj c534490Kxj2 = c534490Kxj;
                    c534500Kxk.getClass();
                    C534580Kxs c534580Kxs = C534580Kxs.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSingleTaskFinish, config: ");
                    sbLIZ.append(c534490Kxj2);
                    sbLIZ.append(", ");
                    sbLIZ.append(c534500Kxk.LJIIJ.get());
                    C201955140j.LIZLLL(c534580Kxs, "DownloadCallback", C2188811AlT.LIZIZ(sbLIZ));
                    if (c534500Kxk.LJIIJ.get()) {
                        Function2<? super C534490Kxj, ? super DownloadInfo, Unit> function2 = c534500Kxk.LIZLLL;
                        if (function2 != null) {
                            function2.invoke(c534490Kxj2, downloadInfo);
                        }
                        int i = c534500Kxk.LJIIIZ + 1;
                        c534500Kxk.LJIIIZ = i;
                        int i2 = c534500Kxk.LJII;
                        if (i == i2 && i2 != 0) {
                            c534500Kxk.LJIIJ.set(false);
                            Function0<Unit> function0 = c534500Kxk.LJ;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }
                        if (downloadInfo != null) {
                            int id = downloadInfo.getId();
                            ((ArrayList) c534500Kxk.LJI).remove(Integer.valueOf(id));
                        }
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    super.onFailed(downloadInfo, baseException);
                    downloadTaskImpl.LJFF.LJFF(downloadInfo, c534490Kxj);
                }
            });
            downloadTaskWith.extra(String.valueOf(c534490Kxj.LIZ));
            downloadTaskWith.download();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadTaskImpl@fc86.start$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
