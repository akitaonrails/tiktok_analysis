package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.126k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197016126k extends AbstractC2255721DQs<InterfaceC365660EVg> implements InterfaceC365660EVg, InterfaceC379610EuV {
    public static final C197019126n LLIZLLLIL = new Object() { // from class: X.126n
    };
    public static final int LLJ = 8;
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(479));
    public final ConcurrentHashMap<String, Integer> LLILLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C0TB8> LLILZ = new ConcurrentHashMap<>();
    public final List<InterfaceC197018126m> LLILZIL = Collections.synchronizedList(new ArrayList());
    public final ConcurrentHashMap<String, InterfaceC197018126m> LLILZLL = new ConcurrentHashMap<>();
    public final InterfaceC365660EVg LLIZ = this;

    private final void W1() {
        Iterator<Integer> it2 = this.LLILLL.values().iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            IDownloadService iDownloadServiceW2 = w2();
            if (iDownloadServiceW2 != null) {
                iDownloadServiceW2.cancel(iIntValue);
            }
        }
        this.LLILLL.clear();
        this.LLILZ.clear();
        this.LLILZLL.clear();
        this.LLILZIL.clear();
    }

    private final IDownloadService w2() {
        return (IDownloadService) this.LLILLJJLI.getValue();
    }

    private final String o2() {
        return C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), new CreativeInfo("EPResCacheCreativeInfo", 0, null, 4, null), EnumC20228014Cw.EP_DOWNLOAD_RES, null, 12);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        W1();
    }

    public InterfaceC365660EVg Z1() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C197016126k(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final String X1(C0FGJ c0fgj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(o2());
        sbLIZ.append(c0fgj.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC365660EVg
    public C0TB8 AO(String str) {
        C0TB8 c0tb8 = this.LLILZ.get(str);
        if (c0tb8 == null) {
            return new C0TB8() { // from class: X.0TBA
            };
        }
        return c0tb8;
    }

    public final void G2(String str) {
        this.LLILZ.put(str, C0TB9.LIZ);
        InterfaceC197018126m interfaceC197018126m = this.LLILZLL.get(str);
        if (interfaceC197018126m != null) {
            interfaceC197018126m.onCanceled();
        }
        synchronized (this.LLILZIL) {
            try {
                Iterator<InterfaceC197018126m> it2 = this.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().onCanceled();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILLL.remove(str);
        this.LLILZLL.remove(str);
    }

    @Override // X.InterfaceC365660EVg
    public void LJJIIJ(String str) {
        Integer num = this.LLILLL.get(str);
        if (num != null) {
            int iIntValue = num.intValue();
            IDownloadService iDownloadServiceW2 = w2();
            if (iDownloadServiceW2 != null) {
                iDownloadServiceW2.cancel(iIntValue);
            }
            this.LLILLL.remove(str);
            this.LLILZ.put(str, C0TB9.LIZ);
            this.LLILZLL.remove(str);
        }
    }

    @Override // X.InterfaceC365660EVg
    public void N40(InterfaceC197018126m interfaceC197018126m) {
        this.LLILZIL.remove(interfaceC197018126m);
    }

    @Override // X.InterfaceC365660EVg
    public String SC1(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(o2());
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC365660EVg
    public void VB2(InterfaceC197018126m interfaceC197018126m) {
        this.LLILZIL.add(interfaceC197018126m);
    }

    public final void H2(String str, final Exception exc) {
        this.LLILZ.put(str, new C0TB8(exc) { // from class: X.0TB6
            public final Exception LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0TB6) && Intrinsics.LJFF(this.LIZ, ((C0TB6) obj).LIZ);
            }

            public final int hashCode() {
                Exception exc2 = this.LIZ;
                if (exc2 == null) {
                    return 0;
                }
                return exc2.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FAILED(error=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = exc;
            }
        });
        InterfaceC197018126m interfaceC197018126m = this.LLILZLL.get(str);
        if (interfaceC197018126m != null) {
            interfaceC197018126m.onFailed();
        }
        synchronized (this.LLILZIL) {
            try {
                Iterator<InterfaceC197018126m> it2 = this.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().onFailed();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILLL.remove(str);
        this.LLILZLL.remove(str);
    }

    public final void T2(String str, final File file) {
        this.LLILZ.put(str, new C0TB8(file) { // from class: X.0TBB
            public final File LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0TBB) && Intrinsics.LJFF(this.LIZ, ((C0TBB) obj).LIZ);
            }

            public final int hashCode() {
                File file2 = this.LIZ;
                if (file2 == null) {
                    return 0;
                }
                return file2.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SUCCESS(file=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = file;
            }
        });
        InterfaceC197018126m interfaceC197018126m = this.LLILZLL.get(str);
        if (interfaceC197018126m != null) {
            interfaceC197018126m.onSuccess();
        }
        synchronized (this.LLILZIL) {
            try {
                Iterator<InterfaceC197018126m> it2 = this.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().onSuccess();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILLL.remove(str);
        this.LLILZLL.remove(str);
    }

    @Override // X.InterfaceC365660EVg
    public void Vm0(final C0FGJ c0fgj, InterfaceC197018126m interfaceC197018126m) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Starting download: ");
        sbLIZ.append(c0fgj.LIZ);
        sbLIZ.append(" -> ");
        sbLIZ.append(c0fgj.LIZIZ);
        C201955140j.LJIIIIZZ(c563650M8t, "EPResDownloader", C2188811AlT.LIZIZ(sbLIZ));
        if (c0fgj.LIZ.length() == 0) {
            C201955140j.LJIIIIZZ(c563650M8t, "EPResDownloader", "Error: Empty URL provided");
            return;
        }
        String strX1 = X1(c0fgj);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Checking existing file: ");
        sbLIZ2.append(strX1);
        C201955140j.LJIIIIZZ(c563650M8t, "EPResDownloader", C2188811AlT.LIZIZ(sbLIZ2));
        if (C2286708xd.LIZJ(strX1)) {
            C201955140j.LJIIIIZZ(c563650M8t, "EPResDownloader", "File already exists, skipping download");
            if (interfaceC197018126m != null) {
                new C0VSJ(strX1);
                interfaceC197018126m.onSuccess();
                return;
            }
            return;
        }
        C201955140j.LJIIIIZZ(c563650M8t, "EPResDownloader", "File not found, starting download process");
        if (interfaceC197018126m != null) {
            this.LLILZLL.put(c0fgj.LIZ, interfaceC197018126m);
        }
        if (this.LLILLL.containsKey(c0fgj.LIZ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Download already in progress for: ");
            sbLIZ3.append(c0fgj.LIZ);
            C201955140j.LJIIIIZZ(c563650M8t, "EPResDownloader", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Creating download task for: ");
        sbLIZ4.append(c0fgj.LIZ);
        C201955140j.LJIIIIZZ(c563650M8t, "EPResDownloader", C2188811AlT.LIZIZ(sbLIZ4));
        IDownloadService iDownloadServiceW2 = w2();
        if (iDownloadServiceW2 == null) {
            return;
        }
        AbstractC2199801B7q abstractC2199801B7qWith = iDownloadServiceW2.with(c0fgj.LIZ);
        abstractC2199801B7qWith.LIZJ = c0fgj.LIZIZ;
        abstractC2199801B7qWith.LJ = o2();
        abstractC2199801B7qWith.LJII = c0fgj.LIZJ;
        abstractC2199801B7qWith.LJIIL = new AbsDownloadListener() { // from class: X.126l
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Download canceled: ");
                sbLIZ5.append(c0fgj.LIZ);
                C201955140j.LJIIIIZZ(c563650M8t2, "EPResDownloader", C2188811AlT.LIZIZ(sbLIZ5));
                this.G2(c0fgj.LIZ);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                if (downloadInfo != null) {
                    C0FGJ c0fgj2 = c0fgj;
                    C197016126k c197016126k = this;
                    C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Progress: ");
                    sbLIZ5.append(c0fgj2.LIZ);
                    sbLIZ5.append(" - ");
                    int curBytes = (int) ((downloadInfo.getCurBytes() / downloadInfo.getTotalBytes()) * 100);
                    sbLIZ5.append(curBytes);
                    sbLIZ5.append('%');
                    C201955140j.LJIIIIZZ(c563650M8t2, "EPResDownloader", C2188811AlT.LIZIZ(sbLIZ5));
                    c197016126k.W2(c0fgj2.LIZ, curBytes);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                String savePath;
                String name;
                if (downloadInfo == null || (savePath = downloadInfo.getSavePath()) == null || (name = downloadInfo.getName()) == null) {
                    return;
                }
                C0VSJ c0vsj = new C0VSJ(savePath, name);
                C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Download completed: ");
                sbLIZ5.append(c0fgj.LIZ);
                sbLIZ5.append(" -> ");
                sbLIZ5.append(c0vsj.getAbsolutePath());
                C201955140j.LJIIIIZZ(c563650M8t2, "EPResDownloader", C2188811AlT.LIZIZ(sbLIZ5));
                this.T2(c0fgj.LIZ, c0vsj);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                String errorMessage;
                if (baseException == null || (errorMessage = baseException.getErrorMessage()) == null) {
                    errorMessage = "Download failed";
                }
                Exception exc = new Exception(errorMessage);
                C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Download failed: ");
                sbLIZ5.append(c0fgj.LIZ);
                sbLIZ5.append(" - ");
                sbLIZ5.append(exc.getMessage());
                C201955140j.LJIIIIZZ(c563650M8t2, "EPResDownloader", C2188811AlT.LIZIZ(sbLIZ5));
                this.H2(c0fgj.LIZ, exc);
            }
        };
        int iLIZJ = abstractC2199801B7qWith.LIZJ();
        this.LLILLL.put(c0fgj.LIZ, Integer.valueOf(iLIZJ));
        this.LLILZ.put(c0fgj.LIZ, new C0TB7(0));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("Download started with ID: ");
        sbLIZ5.append(iLIZJ);
        sbLIZ5.append(" for ");
        sbLIZ5.append(c0fgj.LIZ);
        C201955140j.LJIIIIZZ(c563650M8t, "EPResDownloader", C2188811AlT.LIZIZ(sbLIZ5));
    }

    public final void W2(String str, int i) {
        this.LLILZ.put(str, new C0TB7(i));
        InterfaceC197018126m interfaceC197018126m = this.LLILZLL.get(str);
        if (interfaceC197018126m != null) {
            interfaceC197018126m.LIZ();
        }
        synchronized (this.LLILZIL) {
            try {
                Iterator<InterfaceC197018126m> it2 = this.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
