package X;

import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* JADX INFO: renamed from: X.1B6S, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B6S extends C1B6R {
    public final /* synthetic */ DownloadTask LLILLJJLI;

    @Override // X.InterfaceC2199581B6u
    public final int A() {
        return this.LLILLJJLI.getDownloadCompleteHandlers().size();
    }

    @Override // X.InterfaceC2199581B6u
    public final InterfaceC2199491B6l LJJII() {
        InterfaceC2199431B6f monitorDepend = this.LLILLJJLI.getMonitorDepend();
        if (monitorDepend == null) {
            return null;
        }
        return new C1B6V(monitorDepend);
    }

    @Override // X.InterfaceC2199581B6u
    public final C1B6N LLILLJJLI() {
        InterfaceC2199471B6j retryDelayTimeCalculator = this.LLILLJJLI.getRetryDelayTimeCalculator();
        if (retryDelayTimeCalculator == null) {
            return null;
        }
        return new C1B6O(retryDelayTimeCalculator);
    }

    @Override // X.InterfaceC2199581B6u
    public final InterfaceC2199311B5t LLLZIIL() {
        InterfaceC2199321B5u forbiddenHandler = this.LLILLJJLI.getForbiddenHandler();
        if (forbiddenHandler == null) {
            return null;
        }
        return new BinderC2199291B5r(forbiddenHandler);
    }

    @Override // X.InterfaceC2199581B6u
    public final C1B63 Mh() {
        IDownloadDepend depend = this.LLILLJJLI.getDepend();
        if (depend == null) {
            return null;
        }
        return new C1B65(depend);
    }

    @Override // X.InterfaceC2199581B6u
    public final C1B6B X() {
        C1B6D notificationClickCallback = this.LLILLJJLI.getNotificationClickCallback();
        if (notificationClickCallback == null) {
            return null;
        }
        return new C1B6A(notificationClickCallback);
    }

    @Override // X.InterfaceC2199581B6u
    public final DownloadInfo getDownloadInfo() {
        return this.LLILLJJLI.getDownloadInfo();
    }

    @Override // X.InterfaceC2199581B6u
    public final InterfaceC19860412nC getFileProvider() {
        InterfaceC19860712nF fileUriProvider = this.LLILLJJLI.getFileUriProvider();
        if (fileUriProvider == null) {
            return null;
        }
        return new BinderC19860512nD(fileUriProvider);
    }

    @Override // X.InterfaceC2199581B6u
    public final C1B6M getInterceptor() {
        InterfaceC2199461B6i interceptor = this.LLILLJJLI.getInterceptor();
        if (interceptor == null) {
            return null;
        }
        return new C1B6Q(interceptor);
    }

    @Override // X.InterfaceC2199581B6u
    public final C1B5O k() {
        C1B5Q notificationEventListener = this.LLILLJJLI.getNotificationEventListener();
        if (notificationEventListener == null) {
            return null;
        }
        return new C1B5N(notificationEventListener);
    }

    @Override // X.InterfaceC2199581B6u
    public final InterfaceC2199401B6c q() {
        InterfaceC2199481B6k diskSpaceHandler = this.LLILLJJLI.getDiskSpaceHandler();
        if (diskSpaceHandler == null) {
            return null;
        }
        return new C1B6Z(diskSpaceHandler);
    }

    public C1B6S(DownloadTask downloadTask) {
        this.LLILLJJLI = downloadTask;
    }

    @Override // X.InterfaceC2199581B6u
    public final int LLLLJ(int i) {
        return this.LLILLJJLI.getDownloadListenerSize(C2199661B7c.LJ(i));
    }

    @Override // X.InterfaceC2199581B6u
    public final InterfaceC2200291B9n LLLLLJLJLL(int i) {
        boolean z;
        IDownloadListener singleDownloadListener = this.LLILLJJLI.getSingleDownloadListener(C2199661B7c.LJ(i));
        if (i == C1B72.SUB.ordinal()) {
            z = false;
        } else {
            z = true;
        }
        if (singleDownloadListener == null) {
            return null;
        }
        return new BinderC2199601B6w(singleDownloadListener, z);
    }

    @Override // X.InterfaceC2199581B6u
    public final InterfaceC2199371B5z P(int i) {
        InterfaceC2199361B5y downloadCompleteHandlerByIndex = this.LLILLJJLI.getDownloadCompleteHandlerByIndex(i);
        if (downloadCompleteHandlerByIndex == null) {
            return null;
        }
        return new BinderC2199351B5x(downloadCompleteHandlerByIndex);
    }

    @Override // X.InterfaceC2199581B6u
    public final InterfaceC2200291B9n LLIILZL(int i, int i2) {
        boolean z;
        IDownloadListener downloadListenerByIndex = this.LLILLJJLI.getDownloadListenerByIndex(C2199661B7c.LJ(i), i2);
        if (i == C1B72.SUB.ordinal()) {
            z = false;
        } else {
            z = true;
        }
        if (downloadListenerByIndex == null) {
            return null;
        }
        return new BinderC2199601B6w(downloadListenerByIndex, z);
    }
}
