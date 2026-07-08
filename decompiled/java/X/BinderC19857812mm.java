package X;

import Y.ARunnableS99S0200000_30;
import android.os.Binder;
import android.os.RemoteException;
import com.ss.android.ugc.cut_downloader.AbsDownloadService;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.12mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class BinderC19857812mm extends AbstractBinderC19858212mq {
    public final /* synthetic */ AbsDownloadService LLILLJJLI;

    public BinderC19857812mm(AbsDownloadService absDownloadService) {
        this.LLILLJJLI = absDownloadService;
    }

    @Override // X.InterfaceC19858412ms
    public final void J(InterfaceC19858112mp interfaceC19858112mp) {
        if (interfaceC19858112mp != null) {
            AbsDownloadService absDownloadService = this.LLILLJJLI;
            C786410Ut5.LJJZZIII(absDownloadService.LL, new ARunnableS99S0200000_30(absDownloadService, interfaceC19858112mp, 36));
            return;
        }
        throw new RemoteException("callback null");
    }

    public final void LJJJZ(String str) {
        C19858012mo c19858012mo = (C19858012mo) ((LinkedHashMap) this.LLILLJJLI.LLILLL).get(str);
        if (c19858012mo != null) {
            c19858012mo.LIZJ.remove(Integer.valueOf(Binder.getCallingPid()));
            if (c19858012mo.LIZJ.isEmpty()) {
                LJJJZ(str);
            }
        }
    }

    @Override // X.InterfaceC19858412ms
    public final void f0(final String str, final String str2) {
        if (str != null) {
            final AbsDownloadService absDownloadService = this.LLILLJJLI;
            C786410Ut5.LJJZZIII(absDownloadService.LL, new Runnable() { // from class: X.12mn
                @Override // java.lang.Runnable
                public final void run() {
                    AbsDownloadService absDownloadService2 = absDownloadService;
                    String str3 = str;
                    String str4 = str2;
                    C1C7U.LIZ("AbsDownloadService$DownloadServiceBinder@20fd.download$1L");
                    C19858012mo c19858012mo = (C19858012mo) ((LinkedHashMap) absDownloadService2.LLILLL).get(str3);
                    if (c19858012mo != null) {
                        c19858012mo.LIZJ.add(Integer.valueOf(Binder.getCallingPid()));
                        String str5 = c19858012mo.LIZIZ;
                        if (str5 != null) {
                            c19858012mo.LIZ(c19858012mo.LIZ, str5);
                        }
                    } else {
                        C19858012mo c19858012mo2 = new C19858012mo(absDownloadService2, str3);
                        absDownloadService2.LLILLL.put(str3, c19858012mo2);
                        c19858012mo2.LIZJ.add(Integer.valueOf(Binder.getCallingPid()));
                        String str6 = c19858012mo2.LIZIZ;
                        if (str6 != null) {
                            c19858012mo2.LIZ(str3, str6);
                        }
                        absDownloadService2.LIZ(str3, str4, c19858012mo2);
                    }
                    C1C7U.LIZIZ("AbsDownloadService$DownloadServiceBinder@20fd.download$1L");
                }
            });
            return;
        }
        throw new RemoteException("url null");
    }
}
