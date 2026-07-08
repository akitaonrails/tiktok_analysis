package X;

import android.content.Context;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13SQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13SQ implements C13N1 {
    public final Object LIZ;
    public final C13NB LIZIZ;
    public final Context LIZJ;
    public final ConcurrentHashMap<String, C443120HZe<String, DownloadTask, C13N8>> LIZLLL;
    public final ConcurrentHashMap<Integer, Object> LJ;

    public final void LIZ(DownloadTask downloadTask) {
        if (this.LJ.get(Integer.valueOf(downloadTask.getDownloadId())) == null) {
            this.LJ.put(Integer.valueOf(downloadTask.getDownloadId()), new Object());
        }
        Object obj = this.LJ.get(Integer.valueOf(downloadTask.getDownloadId()));
        if (obj != null) {
            synchronized (obj) {
                try {
                    try {
                        obj.wait();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LJ.remove(Integer.valueOf(downloadTask.getDownloadId()));
    }

    public final void LIZIZ(int i) {
        Object obj = this.LJ.get(Integer.valueOf(i));
        if (obj != null) {
            synchronized (obj) {
                try {
                    try {
                        obj.notifyAll();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C13N1
    public final void LJJIIJ(String str) {
        String url;
        Iterator<T> it2 = this.LIZLLL.values().iterator();
        Object first = "";
        Object second = null;
        while (it2.hasNext()) {
            C443120HZe c443120HZe = (C443120HZe) it2.next();
            DownloadInfo downloadInfo = ((DownloadTask) c443120HZe.getSecond()).getDownloadInfo();
            if (downloadInfo != null) {
                url = downloadInfo.getUrl();
            } else {
                url = null;
            }
            if (u.LJIJI(url, str, false)) {
                first = c443120HZe.getFirst();
                second = c443120HZe.getSecond();
            }
        }
        DownloadTask downloadTask = (DownloadTask) second;
        if (downloadTask != null) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Cancel][InvokeSDK][");
            sbLIZ.append((String) first);
            sbLIZ.append("][WorkingTaskCount:");
            sbLIZ.append(this.LIZLLL.values().size());
            sbLIZ.append("][DownLoadID : ");
            sbLIZ.append(downloadTask.getDownloadId());
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("JKL", strLIZIZ, null);
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZJ).cancel(downloadTask.getDownloadId());
            if (!C0IB2.LIZ()) {
                LIZ(downloadTask);
            }
        }
    }

    @Override // X.C13NB
    public final C13N8 fetchFromNetwork(C0XSU c0xsu) {
        boolean zLJI = MethodIDManager.LJI(137384);
        C13N8 c13n8FetchFromNetwork = this.LIZIZ.fetchFromNetwork(c0xsu);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c13n8FetchFromNetwork;
    }

    @Override // X.C13N1
    public final void pause(String str) {
        String url;
        Iterator<T> it2 = this.LIZLLL.values().iterator();
        String url2 = null;
        Object first = "";
        Object second = null;
        while (it2.hasNext()) {
            C443120HZe c443120HZe = (C443120HZe) it2.next();
            DownloadInfo downloadInfo = ((DownloadTask) c443120HZe.getSecond()).getDownloadInfo();
            if (downloadInfo != null) {
                url = downloadInfo.getUrl();
            } else {
                url = null;
            }
            if (u.LJIJI(url, str, false)) {
                first = c443120HZe.getFirst();
                second = c443120HZe.getSecond();
            }
        }
        DownloadTask downloadTask = (DownloadTask) second;
        if (downloadTask != null) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Pause][InvokeSDK][");
            sbLIZ.append((String) first);
            sbLIZ.append("][WorkingTaskCount:");
            sbLIZ.append(this.LIZLLL.values().size());
            sbLIZ.append("][PauseURL:");
            DownloadInfo downloadInfo2 = downloadTask.getDownloadInfo();
            if (downloadInfo2 != null) {
                url2 = downloadInfo2.getUrl();
            }
            sbLIZ.append(url2);
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LJ("JKL", strLIZIZ);
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZJ).pause(downloadTask.getDownloadId());
            if (!C0IB2.LIZ()) {
                LIZ(downloadTask);
            }
        }
    }

    public C13SQ(Object obj, int i, C13NB c13nb) {
        this.LIZ = obj;
        this.LIZIZ = c13nb;
        Context context = (Context) obj;
        this.LIZJ = context;
        new C1B84(context);
        this.LIZLLL = new ConcurrentHashMap<>();
        this.LJ = new ConcurrentHashMap<>();
        C786410Ut5.d4(i);
    }

    @Override // X.C13N1
    public final C13N8 LJJIIJZLJL(C0XSU c0xsu, String str, String str2, final C13MU c13mu) {
        DownloadTask downloadTaskWith;
        Object obj;
        Object obj2;
        Integer num;
        int iIntValue;
        Integer num2;
        int iIntValue2;
        C13N8 c13n8;
        boolean zLJI = MethodIDManager.LJI(137778);
        C443120HZe<String, DownloadTask, C13N8> c443120HZe = this.LIZLLL.get(c0xsu.LIZ);
        Object obj3 = null;
        if (c443120HZe != null) {
            downloadTaskWith = c443120HZe.getSecond();
        } else {
            downloadTaskWith = null;
        }
        if (downloadTaskWith != null && downloadTaskWith.getDownloadId() != 0) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ResumeRequest][SDK][");
            sbLIZ.append(str2);
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("JKL", strLIZIZ);
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(this.LIZJ).resume(downloadTaskWith.getDownloadId());
        } else {
            downloadTaskWith = C2200151B8z.with(this.LIZJ);
            downloadTaskWith.url(c0xsu.LIZ);
            List<String> list = c0xsu.LIZIZ;
            if (list != null) {
                downloadTaskWith.backUpUrls(list);
            }
            downloadTaskWith.savePath(C20012413Ry.LJIIJJI(str));
            downloadTaskWith.name(C20012413Ry.LJIIIZ(str));
            Map<String, Object> map = c0xsu.LJIIIIZZ;
            if (map != null) {
                obj = map.get("ParamsNetLimit");
            } else {
                obj = null;
            }
            if ((obj instanceof Long) && !Intrinsics.LJFF(obj, 0L)) {
                downloadTaskWith.throttleNetSpeed(((Number) obj).longValue());
            }
            Map<String, Object> map2 = c0xsu.LJIIIIZZ;
            if (map2 != null) {
                obj2 = map2.get("RetryCount");
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof Integer) && (num2 = (Integer) obj2) != null && (iIntValue2 = num2.intValue()) > 0) {
                downloadTaskWith.retryCount(iIntValue2);
            }
            Map<String, Object> map3 = c0xsu.LJIIIIZZ;
            if (map3 != null) {
                obj3 = map3.get("BackupUrlRetryCount");
            }
            if ((obj3 instanceof Integer) && (num = (Integer) obj3) != null && (iIntValue = num.intValue()) > 0) {
                downloadTaskWith.backUpUrlRetryCount(iIntValue);
            }
            downloadTaskWith.subThreadListener(new IDownloadListener() { // from class: X.13SR
                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFirstStart(DownloadInfo downloadInfo) {
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFirstSuccess(DownloadInfo downloadInfo) {
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onPrepare(DownloadInfo downloadInfo) {
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onCanceled(DownloadInfo downloadInfo) {
                    String first;
                    C13N8 third;
                    C443120HZe<String, DownloadTask, C13N8> c443120HZe2 = this.LL.LIZLLL.get(downloadInfo.getUrl());
                    if (c443120HZe2 == null || (first = c443120HZe2.getFirst()) == null) {
                        first = "";
                    }
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Cancel][SDK][");
                    sbLIZ2.append(first);
                    sbLIZ2.append("][StatusCode：");
                    sbLIZ2.append(downloadInfo.getHttpStatusCode());
                    sbLIZ2.append("][Duration:");
                    sbLIZ2.append(downloadInfo.getDownloadTime());
                    sbLIZ2.append(']');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZIZ("JKL", strLIZIZ2, null);
                    C443120HZe<String, DownloadTask, C13N8> c443120HZe3 = this.LL.LIZLLL.get(downloadInfo.getUrl());
                    if (c443120HZe3 != null && (third = c443120HZe3.getThird()) != null) {
                        third.LIZ = 600;
                        third.LIZIZ = new C0XSW();
                        third.LIZJ = -3L;
                    }
                    this.LL.LIZLLL.remove(downloadInfo.getUrl());
                    this.LL.LIZIZ(downloadInfo.getId());
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onPause(DownloadInfo downloadInfo) {
                    String first;
                    C13N8 third;
                    C443120HZe<String, DownloadTask, C13N8> c443120HZe2 = this.LL.LIZLLL.get(downloadInfo.getUrl());
                    if (c443120HZe2 == null || (first = c443120HZe2.getFirst()) == null) {
                        first = "";
                    }
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Pause][SDK][");
                    sbLIZ2.append(first);
                    sbLIZ2.append("][NetworkCode:");
                    sbLIZ2.append(downloadInfo.getHttpStatusCode());
                    sbLIZ2.append("][Progress:");
                    sbLIZ2.append(downloadInfo.getDownloadProcess());
                    sbLIZ2.append(']');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LJ("JKL", strLIZIZ2);
                    C443120HZe<String, DownloadTask, C13N8> c443120HZe3 = this.LL.LIZLLL.get(downloadInfo.getUrl());
                    if (c443120HZe3 != null && (third = c443120HZe3.getThird()) != null) {
                        third.LIZ = 206;
                        third.LIZIZ = new C0XSW();
                        third.LIZJ = -2L;
                    }
                    this.LL.LIZIZ(downloadInfo.getId());
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onProgress(DownloadInfo downloadInfo) {
                    C13MU c13mu2 = c13mu;
                    if (c13mu2 != null) {
                        c13mu2.onProgress(downloadInfo.getDownloadProcess(), downloadInfo.getTotalBytes());
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onStart(DownloadInfo downloadInfo) {
                    String first;
                    C443120HZe<String, DownloadTask, C13N8> c443120HZe2 = this.LL.LIZLLL.get(downloadInfo.getUrl());
                    if (c443120HZe2 == null || (first = c443120HZe2.getFirst()) == null) {
                        first = "";
                    }
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Start][SDK][");
                    sbLIZ2.append(first);
                    sbLIZ2.append(']');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZ("JKL", strLIZIZ2);
                }

                /* JADX WARN: Type inference failed for: r0v14, types: [X.13ST] */
                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    String first;
                    C13N8 third;
                    C443120HZe<String, DownloadTask, C13N8> c443120HZe2 = this.LL.LIZLLL.get(downloadInfo.getUrl());
                    if (c443120HZe2 == null || (first = c443120HZe2.getFirst()) == null) {
                        first = "";
                    }
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Suc][SDK][");
                    sbLIZ2.append(first);
                    sbLIZ2.append("][StatusCode:");
                    sbLIZ2.append(downloadInfo.getHttpStatusCode());
                    sbLIZ2.append("][TotalSize:");
                    sbLIZ2.append(downloadInfo.getTotalBytes());
                    sbLIZ2.append("][Duration:");
                    sbLIZ2.append(downloadInfo.getDownloadTime());
                    sbLIZ2.append(']');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZ("JKL", strLIZIZ2);
                    final C0VSP c0vsp = new C0VSP(new C0VSJ(downloadInfo.getTargetFilePath()));
                    final ?? r0 = new FilterInputStream(c0vsp) { // from class: X.13ST
                        public final /* synthetic */ FileInputStream LL;

                        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() throws IOException {
                            super.close();
                            this.LL.close();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(c0vsp);
                            this.LL = c0vsp;
                        }
                    };
                    InterfaceC20008913Qp interfaceC20008913Qp = new InterfaceC20008913Qp(r0) { // from class: X.13SU
                        public final InputStream LIZ;

                        @Override // X.InterfaceC20008913Qp
                        public final boolean available() {
                            return this.LIZ.available() >= 0;
                        }

                        @Override // X.InterfaceC20008913Qp
                        public final void close() throws IOException {
                            this.LIZ.close();
                        }

                        {
                            this.LIZ = r0;
                        }

                        @Override // X.InterfaceC20008913Qp
                        public final int read(byte[] bArr, int i, int i2) {
                            return this.LIZ.read(bArr, 0, i2);
                        }
                    };
                    C443120HZe<String, DownloadTask, C13N8> c443120HZe3 = this.LL.LIZLLL.get(downloadInfo.getUrl());
                    if (c443120HZe3 != null && (third = c443120HZe3.getThird()) != null) {
                        third.LIZ = 200;
                        third.LIZIZ = interfaceC20008913Qp;
                        third.LIZJ = downloadInfo.getTotalBytes();
                    }
                    this.LL.LIZLLL.remove(downloadInfo.getUrl());
                    this.LL.LIZIZ(downloadInfo.getId());
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    String first;
                    boolean zLJJIIZI;
                    C13N8 third;
                    int httpStatusCode;
                    C443120HZe<String, DownloadTask, C13N8> c443120HZe2 = this.LL.LIZLLL.get(downloadInfo.getUrl());
                    if (c443120HZe2 == null || (first = c443120HZe2.getFirst()) == null) {
                        first = "";
                    }
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Fail][SDK][");
                    sbLIZ2.append(first);
                    sbLIZ2.append("][Duration:");
                    sbLIZ2.append(downloadInfo.getDownloadTime());
                    sbLIZ2.append("][StatusCode:");
                    sbLIZ2.append(downloadInfo.getHttpStatusCode());
                    sbLIZ2.append("][Size：");
                    sbLIZ2.append(downloadInfo.getExpectFileLength());
                    sbLIZ2.append("][ErrorMsg:");
                    sbLIZ2.append(baseException.getErrorMessage());
                    sbLIZ2.append(']');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZIZ("JKL", strLIZIZ2, null);
                    String message = baseException.getMessage();
                    boolean zLJJIIZI2 = false;
                    if (message != null) {
                        zLJJIIZI = a0.LJJIIZI(message, "SocketTimeoutException", true);
                    } else {
                        zLJJIIZI = false;
                    }
                    String message2 = baseException.getMessage();
                    if (message2 != null) {
                        zLJJIIZI2 = a0.LJJIIZI(message2, "NetworkExceptionImpl", true);
                    }
                    C443120HZe<String, DownloadTask, C13N8> c443120HZe3 = this.LL.LIZLLL.get(downloadInfo.getUrl());
                    if (c443120HZe3 != null && (third = c443120HZe3.getThird()) != null) {
                        if (!zLJJIIZI2 && !zLJJIIZI) {
                            if (downloadInfo.getHttpStatusCode() == 200) {
                                httpStatusCode = 601;
                            } else {
                                httpStatusCode = downloadInfo.getHttpStatusCode();
                            }
                        } else {
                            httpStatusCode = 602;
                        }
                        third.LIZ = httpStatusCode;
                        third.LIZIZ = new C0XSW();
                        third.LIZJ = -1L;
                        third.LIZLLL = baseException.getErrorMessage();
                    }
                    this.LL.LIZLLL.remove(downloadInfo.getUrl());
                    this.LL.LIZIZ(downloadInfo.getId());
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Retry][SDK] : ");
                    sbLIZ2.append(downloadInfo.getId());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZIZ("JKL", strLIZIZ2, null);
                }
            });
            c443120HZe = new C443120HZe<>(str2, downloadTaskWith, new C13N8(601, new C0XSW()));
            this.LIZLLL.put(c0xsu.LIZ, c443120HZe);
            downloadTaskWith.download();
            C13SS c13ss2 = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[ReceiveRequest][SDK][");
            sbLIZ2.append(str2);
            sbLIZ2.append(']');
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss2.getClass();
            C13SS.LIZ("JKL", strLIZIZ2);
        }
        LIZ(downloadTaskWith);
        if (c443120HZe == null || (c13n8 = c443120HZe.getThird()) == null) {
            c13n8 = new C13N8(601, new C0XSW());
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c13n8;
    }
}
