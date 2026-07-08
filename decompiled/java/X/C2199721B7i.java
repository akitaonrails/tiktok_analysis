package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity;
import com.ss.android.ugc.aweme.download.component_api.depend.DownloadMonitorDepend;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS278S0300000_34;
import kotlin.jvm.internal.AwS435S0200000_34;

/* JADX INFO: renamed from: X.1B7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199721B7i extends AbstractC2199801B7q implements InterfaceC2199631B6z {
    public final DownloadTask LJJI;
    public C2199611B6x LJJIFFI;
    public C2199611B6x LJJII;

    @Override // X.AbstractC2199801B7q
    public final int LIZJ() {
        return LIZLLL(EnumC565770MGx.DEFAULT);
    }

    @Override // X.InterfaceC2199631B6z
    public final void LIZ(DownloadInfo downloadInfo) {
        if (EnumC565770MGx.ZIP == this.LJIILJJIL && this.LJIILLIIL) {
            InterfaceC2199931B8d interfaceC2199931B8d = this.LJIJ;
            if (downloadInfo != null) {
                try {
                    String targetFilePath = downloadInfo.getTargetFilePath();
                    if (!TextUtils.isEmpty(targetFilePath)) {
                        if (!C2199671B7d.LJIJ(downloadInfo, downloadInfo.isForce(), downloadInfo.getMd5())) {
                            C2199671B7d.LJ(downloadInfo, true);
                        } else if (!TextUtils.isEmpty(this.LJIIZILJ)) {
                            C0VSJ c0vsj = new C0VSJ(this.LJIIZILJ);
                            if (c0vsj.exists() && c0vsj.listFiles().length != 0) {
                                try {
                                    C361901ar.LIZ(c0vsj.getPath());
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C1AF0.LJ(e);
                                }
                            }
                            File fileLIZIZ = C2137908Zd.LIZJ.LIZIZ(this.LJIIZILJ);
                            if (fileLIZIZ != null) {
                                if (interfaceC2199931B8d != null) {
                                    interfaceC2199931B8d.LIZJ();
                                }
                                C2111208Ow.LIZIZ(new C0VSJ(targetFilePath), (C0VSJ) fileLIZIZ);
                                if (interfaceC2199931B8d != null) {
                                    interfaceC2199931B8d.LIZ(fileLIZIZ.getPath());
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJ(e2);
                    if (interfaceC2199931B8d != null) {
                        interfaceC2199931B8d.LIZIZ();
                    }
                }
            }
        }
        if (this.LJJ) {
            if (downloadInfo != null) {
                C1B8B.LIZ(this.LIZ, this);
            }
            if (((Boolean) C258230AAb.LIZ.getValue()).booleanValue()) {
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).removeMainThreadListener(this.LIZIZ, this.LJJIFFI);
                Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).removeSubThreadListener(this.LIZIZ, this.LJJII);
                C1B8Q c1b8qLIZ = C1B8O.LIZ();
                if (c1b8qLIZ != null) {
                    c1b8qLIZ.LIZ.remove(this.LIZIZ);
                }
            }
        }
    }

    @Override // X.AbstractC2199801B7q
    public final int LIZLLL(EnumC565770MGx enumC565770MGx) {
        this.LJIILJJIL = enumC565770MGx;
        LJII(this.LJJI);
        LJIIIIZZ(this.LJJI);
        LJI(new AwS435S0200000_34(this, this.LJJI, 4));
        return Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).getDownloadId(this.LIZLLL, this.LJ);
    }

    @Override // X.AbstractC2199801B7q
    public final int LJ(InterfaceC2329409Au interfaceC2329409Au) {
        this.LJIILJJIL = EnumC565770MGx.DEFAULT;
        LJII(this.LJJI);
        LJIIIIZZ(this.LJJI);
        LJI(new AwS278S0300000_34(this.LJJI, interfaceC2329409Au, this, 2));
        return Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZ).getDownloadId(this.LIZLLL, this.LJ);
    }

    public final void LJI(final Function0<Unit> function0) {
        boolean z;
        String[] strArr;
        int i = this.LIZ.getApplicationInfo().targetSdkVersion;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || (i != 29 ? i <= 29 : Environment.isExternalStorageLegacy())) {
            z = false;
        } else {
            z = true;
        }
        if (this.LJIILIIL && !z) {
            Context context = this.LIZ;
            C0XR5 c0xr5 = new C0XR5() { // from class: X.1B8R
                @Override // X.C0XR5
                public final void LIZIZ() {
                }

                @Override // X.C0XR5
                public final void LIZ() {
                    function0.invoke();
                }
            };
            if (i2 >= 34) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
            } else if (i2 == 33) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
            } else {
                strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
            }
            for (String str : strArr) {
                if (context != null && C838410Wul.LIZ(context, str) == 0) {
                    c0xr5.LIZ();
                    return;
                }
            }
            if (context == null || strArr.length == 0) {
                return;
            }
            String strValueOf = String.valueOf(System.currentTimeMillis());
            if (!TextUtils.isEmpty(strValueOf)) {
                C0XR4.LIZ.put(strValueOf, c0xr5);
            }
            Intent intent = new Intent(context, (Class<?>) DownloadDelegateActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("type", 1);
            intent.putExtra("permission_id_key", strValueOf);
            intent.putExtra("permission_content_key", strArr);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6ndJHC0zMm6yCBcxmSwX7Po9gF0adZN2oJMcpF2F77cNwToLBLqxUn69JvTAImWLWUpF22yf0+", null));
            return;
        }
        function0.invoke();
    }

    public final void LJII(DownloadTask downloadTask) {
        downloadTask.url(this.LIZLLL);
        downloadTask.backUpUrls(this.LJIIIIZZ);
        downloadTask.name(this.LIZJ);
        downloadTask.title(null);
        downloadTask.savePath(this.LJ);
        downloadTask.onlyWifi(false);
        downloadTask.extraHeaders(this.LJI);
        downloadTask.addTTNetCommonParam(this.LJFF);
        downloadTask.depend(null);
        downloadTask.retryCount(this.LJII);
        downloadTask.backUpUrlRetryCount(this.LJIJJ);
        downloadTask.showNotification(false);
        downloadTask.extra(null);
        downloadTask.mimeType(null);
        downloadTask.force(this.LJIL);
        downloadTask.minProgressTimeMsInterval(0);
        downloadTask.maxProgressCount(0);
        downloadTask.notificationListener(null);
        downloadTask.notificationEventListener(null);
        downloadTask.autoResumed(false);
        downloadTask.showNotificationForAutoResumed(false);
        downloadTask.needHttpsToHttpRetry(false);
        downloadTask.packageName(null);
        downloadTask.md5(this.LJIIIZ);
        downloadTask.fileUriProvider(null);
        downloadTask.expectFileLength(0L);
        downloadTask.retryDelayTimeCalculator(null);
        downloadTask.iconUrl(null);
        downloadTask.addListenerToSameTask(this.LJIJJLI);
        downloadTask.needSDKMonitor(true);
        downloadTask.monitorScene(this.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1B6x, com.ss.android.socialbase.downloader.depend.IDownloadListener] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1B6x, com.ss.android.socialbase.downloader.depend.IDownloadListener] */
    public final void LJIIIIZZ(DownloadTask downloadTask) {
        final IDownloadListener iDownloadListener = this.LJIIJJI;
        if (iDownloadListener != null) {
            ?? r0 = new IDownloadListener(iDownloadListener, this) { // from class: X.1B6x
                public final IDownloadListener LL;
                public final InterfaceC2199631B6z LLILLJJLI;

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onCanceled(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onCanceled(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFirstStart(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onFirstStart(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFirstSuccess(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onFirstSuccess(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onPause(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onPause(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onPrepare(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onPrepare(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onProgress(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onProgress(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onStart(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    InterfaceC2199631B6z interfaceC2199631B6z = this.LLILLJJLI;
                    if (interfaceC2199631B6z != null) {
                        interfaceC2199631B6z.LIZ(downloadInfo);
                    }
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onSuccessed(downloadInfo);
                    }
                }

                {
                    this.LL = iDownloadListener;
                    this.LLILLJJLI = this;
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onFailed(downloadInfo, baseException);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onRetry(downloadInfo, baseException);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                    IDownloadListener iDownloadListener2 = this.LL;
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onRetryDelay(downloadInfo, baseException);
                    }
                }
            };
            this.LJJIFFI = r0;
            downloadTask.mainThreadListener(r0);
        }
        final IDownloadListener iDownloadListener2 = this.LJIIL;
        if (iDownloadListener2 != null) {
            ?? r02 = new IDownloadListener(iDownloadListener2, this) { // from class: X.1B6x
                public final IDownloadListener LL;
                public final InterfaceC2199631B6z LLILLJJLI;

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onCanceled(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onCanceled(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFirstStart(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onFirstStart(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFirstSuccess(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onFirstSuccess(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onPause(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onPause(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onPrepare(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onPrepare(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onProgress(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onProgress(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onStart(downloadInfo);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    InterfaceC2199631B6z interfaceC2199631B6z = this.LLILLJJLI;
                    if (interfaceC2199631B6z != null) {
                        interfaceC2199631B6z.LIZ(downloadInfo);
                    }
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onSuccessed(downloadInfo);
                    }
                }

                {
                    this.LL = iDownloadListener2;
                    this.LLILLJJLI = this;
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onFailed(downloadInfo, baseException);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onRetry(downloadInfo, baseException);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                    IDownloadListener iDownloadListener22 = this.LL;
                    if (iDownloadListener22 != null) {
                        iDownloadListener22.onRetryDelay(downloadInfo, baseException);
                    }
                }
            };
            this.LJJII = r02;
            downloadTask.subThreadListener(r02);
        }
        if (this.LJIJI) {
            DownloadMonitorDepend downloadMonitorDepend = this.LJIILL;
            if (downloadMonitorDepend == null) {
                downloadMonitorDepend = new DownloadMonitorDepend(DownloadServiceImpl.LIZJ, null, null, null);
            }
            downloadTask.monitorDepend(downloadMonitorDepend);
        }
    }

    public C2199721B7i(Context context, String str) {
        super(context, str);
        this.LJJI = C2200151B8z.with(context);
    }

    @Override // X.AbstractC2199801B7q
    public final void LIZIZ(int i, C12Y1 c12y1, C1B72 c1b72) {
        this.LJJI.addDownloadListener(i, c12y1, c1b72, true);
    }
}
