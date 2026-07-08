package X;

import Y.ARunnableS103S0200000_34;
import android.app.Notification;
import android.content.Context;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B78, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B78 extends C1B7A {
    public final C1B79 LLILLJJLI = new C1B79(true);

    @Override // X.C1B7C
    public final boolean LJJIJIL() {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return false;
        }
        return c1b79.LJJIJIL();
    }

    @Override // X.C1B7C
    public final void clearData() {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.clearData();
    }

    @Override // X.C1B7C
    public final List<DownloadInfo> getAllDownloadInfo() {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return null;
        }
        return c1b79.getAllDownloadInfo();
    }

    @Override // X.C1B7C
    public final boolean isDownloadCacheSyncSuccess() {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return false;
        }
        return c1b79.isDownloadCacheSyncSuccess();
    }

    @Override // X.C1B7C
    public final void pauseAll() {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.pauseAll();
    }

    @Override // X.C1B7C
    public final boolean LJIIIIZZ(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return false;
        }
        return c1b79.LJIIIIZZ(i);
    }

    @Override // X.C1B7C
    public final void LJIIIZ(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.LJIIIZ(i);
    }

    @Override // X.C1B7C
    public final boolean LJIILLIIL(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return false;
        }
        return c1b79.LJIILLIIL(i);
    }

    @Override // X.C1B7C
    public final void LJJIIZ(boolean z) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.LJJIIZ(z);
    }

    @Override // X.C1B7C
    public final int LJJLIIIJL(int i) {
        return C1B7M.LJ().LIZLLL(i);
    }

    @Override // X.C1B7C
    public final void LLLLLLLLL(final InterfaceC2199541B6q interfaceC2199541B6q) {
        if (this.LLILLJJLI == null) {
            return;
        }
        if (interfaceC2199541B6q == null) {
            Context context = C2199681B7e.LIZ;
        } else {
            ((CopyOnWriteArrayList) C2199681B7e.LJJIFFI).add(new InterfaceC2199571B6t() { // from class: X.1B6s
                @Override // X.InterfaceC2199571B6t
                public final void LJJLIIIJJIZ(int i, int i2) {
                    try {
                        interfaceC2199541B6q.LJJLIIIJJIZ(i, i2);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
    }

    @Override // X.C1B7C
    public final void W(InterfaceC2199581B6u interfaceC2199581B6u) {
        C1B5P c1b5p;
        InterfaceC2199461B6i interfaceC2199461B6i;
        IDownloadDepend iDownloadDepend;
        AbstractC2199441B6g abstractC2199441B6g;
        C2199301B5s c2199301B5s;
        C2199381B6a c2199381B6a;
        C19860612nE c19860612nE;
        C1B6C c1b6c;
        InterfaceC2199471B6j interfaceC2199471B6j;
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        DownloadTask downloadTask = null;
        if (interfaceC2199581B6u != null) {
            try {
                DownloadTask downloadTask2 = new DownloadTask(interfaceC2199581B6u.getDownloadInfo());
                C1B5O c1b5oK = interfaceC2199581B6u.k();
                if (c1b5oK == null) {
                    c1b5p = null;
                } else {
                    c1b5p = new C1B5P(c1b5oK);
                }
                downloadTask2.notificationEventListener(c1b5p);
                final C1B6M interceptor = interfaceC2199581B6u.getInterceptor();
                if (interceptor == null) {
                    interfaceC2199461B6i = null;
                } else {
                    interfaceC2199461B6i = new InterfaceC2199461B6i() { // from class: X.1B6Y
                        @Override // X.InterfaceC2199461B6i
                        public final boolean LIZ() {
                            try {
                                return interceptor.LJIILIIL();
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return false;
                            }
                        }
                    };
                }
                downloadTask2.interceptor(interfaceC2199461B6i);
                final C1B63 c1b63Mh = interfaceC2199581B6u.Mh();
                if (c1b63Mh == null) {
                    iDownloadDepend = null;
                } else {
                    iDownloadDepend = new IDownloadDepend() { // from class: X.1B66
                        @Override // com.ss.android.socialbase.downloader.depend.IDownloadDepend
                        public final void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
                            if (downloadInfo == null) {
                                return;
                            }
                            try {
                                c1b63Mh.monitorLogSend(downloadInfo, baseException, i);
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    };
                }
                downloadTask2.depend(iDownloadDepend);
                final InterfaceC2199491B6l interfaceC2199491B6lLJJII = interfaceC2199581B6u.LJJII();
                if (interfaceC2199491B6lLJJII == null) {
                    abstractC2199441B6g = null;
                } else {
                    abstractC2199441B6g = new AbstractC2199441B6g() { // from class: X.1B6m
                        @Override // X.AbstractC2199441B6g
                        public final int[] LIZ() {
                            try {
                                return interfaceC2199491B6lLJJII.b1();
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return null;
                            }
                        }

                        @Override // X.InterfaceC2199431B6f
                        public final String getEventPage() {
                            try {
                                return interfaceC2199491B6lLJJII.getEventPage();
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return "";
                            }
                        }

                        @Override // X.InterfaceC2199431B6f
                        public final void monitorLogSend(JSONObject jSONObject) {
                            try {
                                interfaceC2199491B6lLJJII.Q0(C786410Ut5.J3(jSONObject));
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    };
                }
                downloadTask2.monitorDepend(abstractC2199441B6g);
                InterfaceC2199311B5t interfaceC2199311B5tLLLZIIL = interfaceC2199581B6u.LLLZIIL();
                if (interfaceC2199311B5tLLLZIIL == null) {
                    c2199301B5s = null;
                } else {
                    c2199301B5s = new C2199301B5s(interfaceC2199311B5tLLLZIIL);
                }
                downloadTask2.forbiddenHandler(c2199301B5s);
                InterfaceC2199401B6c interfaceC2199401B6cQ = interfaceC2199581B6u.q();
                if (interfaceC2199401B6cQ == null) {
                    c2199381B6a = null;
                } else {
                    c2199381B6a = new C2199381B6a(interfaceC2199401B6cQ);
                }
                downloadTask2.diskSpaceHandler(c2199381B6a);
                InterfaceC19860412nC fileProvider = interfaceC2199581B6u.getFileProvider();
                if (fileProvider == null) {
                    c19860612nE = null;
                } else {
                    c19860612nE = new C19860612nE(fileProvider);
                }
                downloadTask2.fileUriProvider(c19860612nE);
                C1B6B c1b6bX = interfaceC2199581B6u.X();
                if (c1b6bX == null) {
                    c1b6c = null;
                } else {
                    c1b6c = new C1B6C(c1b6bX);
                }
                downloadTask2.notificationClickCallback(c1b6c);
                final C1B6N c1b6nLLILLJJLI = interfaceC2199581B6u.LLILLJJLI();
                if (c1b6nLLILLJJLI == null) {
                    interfaceC2199471B6j = null;
                } else {
                    interfaceC2199471B6j = new InterfaceC2199471B6j() { // from class: X.1B6P
                        @Override // X.InterfaceC2199471B6j
                        public final long LJJJJZI(int i, int i2) {
                            try {
                                return c1b6nLLILLJJLI.LJJJJZI(i, i2);
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return 0L;
                            }
                        }
                    };
                }
                downloadTask2.retryDelayTimeCalculator(interfaceC2199471B6j);
                C1B72 c1b72 = C1B72.MAIN;
                InterfaceC2200291B9n interfaceC2200291B9nLLLLLJLJLL = interfaceC2199581B6u.LLLLLJLJLL(c1b72.ordinal());
                if (interfaceC2200291B9nLLLLLJLJLL != null) {
                    downloadTask2.mainThreadListenerWithHashCode(interfaceC2200291B9nLLLLLJLJLL.hashCode(), C2199591B6v.LIZ(interfaceC2200291B9nLLLLLJLJLL));
                }
                C1B72 c1b722 = C1B72.SUB;
                InterfaceC2200291B9n interfaceC2200291B9nLLLLLJLJLL2 = interfaceC2199581B6u.LLLLLJLJLL(c1b722.ordinal());
                if (interfaceC2200291B9nLLLLLJLJLL2 != null) {
                    downloadTask2.subThreadListenerWithHashCode(interfaceC2200291B9nLLLLLJLJLL2.hashCode(), C2199591B6v.LIZ(interfaceC2200291B9nLLLLLJLJLL2));
                }
                C1B72 c1b723 = C1B72.NOTIFICATION;
                InterfaceC2200291B9n interfaceC2200291B9nLLLLLJLJLL3 = interfaceC2199581B6u.LLLLLJLJLL(c1b723.ordinal());
                if (interfaceC2200291B9nLLLLLJLJLL3 != null) {
                    downloadTask2.notificationListenerWithHashCode(interfaceC2200291B9nLLLLLJLJLL3.hashCode(), C2199591B6v.LIZ(interfaceC2200291B9nLLLLLJLJLL3));
                }
                C2199591B6v.LIZIZ(downloadTask2, interfaceC2199581B6u, c1b72);
                C2199591B6v.LIZIZ(downloadTask2, interfaceC2199581B6u, c1b722);
                C2199591B6v.LIZIZ(downloadTask2, interfaceC2199581B6u, c1b723);
                for (int i = 0; i < interfaceC2199581B6u.A(); i++) {
                    final InterfaceC2199371B5z interfaceC2199371B5zP = interfaceC2199581B6u.P(i);
                    if (interfaceC2199371B5zP != null) {
                        downloadTask2.addDownloadCompleteHandler(new InterfaceC2199361B5y() { // from class: X.1B60
                            @Override // X.InterfaceC2199361B5y
                            public final void LJJLIIJ(DownloadInfo downloadInfo) throws BaseException {
                                try {
                                    interfaceC2199371B5zP.LJJLIIJ(downloadInfo);
                                } catch (RemoteException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    throw new BaseException(1008, e);
                                }
                            }

                            @Override // X.InterfaceC2199361B5y
                            public final boolean LJJLL(DownloadInfo downloadInfo) {
                                try {
                                    return interfaceC2199371B5zP.LJJLL(downloadInfo);
                                } catch (RemoteException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return false;
                                }
                            }
                        });
                    }
                }
                downloadTask = downloadTask2;
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c1b79.LJFF(new ARunnableS103S0200000_34(downloadTask, c1b79, 32));
    }

    @Override // X.C1B7C
    public final boolean canResume(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return false;
        }
        return c1b79.canResume(i);
    }

    @Override // X.C1B7C
    public final void forceDownloadIngoreRecommendSize(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.forceDownloadIngoreRecommendSize(i);
    }

    @Override // X.C1B7C
    public final long getCurBytes(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return 0L;
        }
        return c1b79.getCurBytes(i);
    }

    @Override // X.C1B7C
    public final InterfaceC19860412nC getDownloadFileUriProvider(int i) {
        InterfaceC19860712nF downloadFileUriProvider;
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null || (downloadFileUriProvider = c1b79.getDownloadFileUriProvider(i)) == null) {
            return null;
        }
        return new BinderC19860512nD(downloadFileUriProvider);
    }

    @Override // X.C1B7C
    public final DownloadInfo getDownloadInfo(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return null;
        }
        return c1b79.getDownloadInfo(i);
    }

    @Override // X.C1B7C
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return null;
        }
        return c1b79.getDownloadInfoList(str);
    }

    @Override // X.C1B7C
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return null;
        }
        return c1b79.getDownloadInfosByFileExtension(str);
    }

    @Override // X.C1B7C
    public final C1B5O getDownloadNotificationEventListener(int i) {
        C1B5Q downloadNotificationEventListener;
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null || (downloadNotificationEventListener = c1b79.getDownloadNotificationEventListener(i)) == null) {
            return null;
        }
        return new C1B5N(downloadNotificationEventListener);
    }

    @Override // X.C1B7C
    public final List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return null;
        }
        return c1b79.getDownloadingDownloadInfosWithMimeType(str);
    }

    @Override // X.C1B7C
    public final C1B6B getNotificationClickCallback(int i) {
        C1B6D notificationClickCallback;
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null || (notificationClickCallback = c1b79.getNotificationClickCallback(i)) == null) {
            return null;
        }
        return new C1B6A(notificationClickCallback);
    }

    @Override // X.C1B7C
    public final int getStatus(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return 0;
        }
        return c1b79.getStatus(i);
    }

    @Override // X.C1B7C
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return null;
        }
        return c1b79.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // X.C1B7C
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return null;
        }
        return c1b79.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // X.C1B7C
    public final boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return false;
        }
        return c1b79.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    @Override // X.C1B7C
    public final boolean isDownloading(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return false;
        }
        return c1b79.isDownloading(i);
    }

    @Override // X.C1B7C
    public final void restart(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.restart(i);
    }

    @Override // X.C1B7C
    public final void restartAllFailedDownloadTasks(List<String> list) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.restartAllFailedDownloadTasks(list);
    }

    @Override // X.C1B7C
    public final void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 != null) {
            c1b79.restartAllPauseReserveOnWifiDownloadTasks(list);
        }
    }

    @Override // X.C1B7C
    public final void resume(int i) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.resume(i);
    }

    @Override // X.C1B7C
    public final void setLogLevel(int i) {
        if (this.LLILLJJLI == null) {
            return;
        }
        C1490830otl.LIZ = i;
    }

    @Override // X.C1B7C
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return false;
        }
        return c1b79.updateDownloadInfo(downloadInfo);
    }

    @Override // X.C1B7C
    public final void LJJJJJ(int i, int i2) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.LJJJJJ(i, i2);
    }

    @Override // X.C1B7C
    public final void LJJLIIIJJI(int i, boolean z) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.LJJLIIIJJI(i, z);
    }

    @Override // X.C1B7C
    public final void LJJLIIIJLJLI(int i, boolean z) {
        C1B7M.LJ().LJII(i, z);
    }

    @Override // X.C1B7C
    public final void LJLI(int i, Notification notification) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.LJLI(i, notification);
    }

    @Override // X.C1B7C
    public final void cancel(int i, boolean z) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.cancel(i, z);
    }

    @Override // X.C1B7C
    public final void f(int i, C1B5O c1b5o) {
        C1B5P c1b5p;
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        if (c1b5o == null) {
            c1b5p = null;
        } else {
            c1b5p = new C1B5P(c1b5o);
        }
        c1b79.setDownloadNotificationEventListener(i, c1b5p);
    }

    @Override // X.C1B7C
    public final void LJJJJZ(int i, boolean z, boolean z2) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.LJJJJZ(i, z, z2);
    }

    @Override // X.C1B7C
    public final void setThrottleNetSpeed(int i, long j, int i2) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.setThrottleNetSpeed(i, j, i2);
    }

    @Override // X.C1B7C
    public final void LJLJJLL(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.LIZJ(i, i2, C2199591B6v.LIZ(interfaceC2200291B9n), C2199661B7c.LJ(i3), z);
    }

    @Override // X.C1B7C
    public final void v0(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.LJ(i, i2, C2199591B6v.LIZ(interfaceC2200291B9n), C2199661B7c.LJ(i3), z);
    }

    @Override // X.C1B7C
    public final void A0(int i, int i2, InterfaceC2200291B9n interfaceC2200291B9n, int i3, boolean z, boolean z2) {
        C1B79 c1b79 = this.LLILLJJLI;
        if (c1b79 == null) {
            return;
        }
        c1b79.LIZIZ(i, i2, C2199591B6v.LIZ(interfaceC2200291B9n), C2199661B7c.LJ(i3), z, z2);
    }
}
