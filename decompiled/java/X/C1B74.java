package X;

import Y.ARunnableS134S0100000_34;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1B74, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B74 implements C1B7F {
    public static final String LLIZLLLIL = C1B74.class.getSimpleName();
    public WeakReference<Service> LL;
    public volatile boolean LLILZ;
    public final SparseArray<List<DownloadTask>> LLILLJJLI = new SparseArray<>();
    public volatile boolean LLILLL = false;
    public volatile boolean LLILZIL = false;
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS134S0100000_34 LLIZ = new ARunnableS134S0100000_34(this, 52);

    @Override // X.C1B7F
    public void LIZIZ() {
    }

    @Override // X.C1B7F
    public void LIZLLL(DownloadTask downloadTask) {
    }

    @Override // X.C1B7F
    public void LJ() {
    }

    public void LJII(Context context, ServiceConnection serviceConnection) {
    }

    @Override // X.C1B7F
    public void LIZ() {
        if (this.LLILLL) {
            return;
        }
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZIZ(LLIZLLLIL, "startService", "Run StartService");
        }
        LJII(C2199681B7e.LJFF(), null);
    }

    public final void LJI() {
        SparseArray<List<DownloadTask>> sparseArrayClone;
        synchronized (this.LLILLJJLI) {
            try {
                if (C1490830otl.LIZ()) {
                    String str = LLIZLLLIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PendingTasks.size:");
                    sbLIZ.append(this.LLILLJJLI.size());
                    C1490830otl.LIZIZ(str, "resumePendingTask", C2188811AlT.LIZIZ(sbLIZ));
                }
                sparseArrayClone = this.LLILLJJLI.clone();
                this.LLILLJJLI.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1B7G c1b7gLJIILIIL = C2199681B7e.LJIILIIL();
        if (c1b7gLJIILIIL != null) {
            for (int i = 0; i < sparseArrayClone.size(); i++) {
                List<DownloadTask> list = sparseArrayClone.get(sparseArrayClone.keyAt(i));
                if (list != null) {
                    for (DownloadTask downloadTask : list) {
                        if (C1490830otl.LIZ()) {
                            C1490830otl.LIZLLL(downloadTask.getDownloadId(), LLIZLLLIL, "resumePendingTask", "Resume Task");
                        }
                        c1b7gLJIILIIL.LJIL(downloadTask);
                    }
                }
            }
        }
    }

    @Override // X.C1B7F
    public IBinder LIZJ(Intent intent) {
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZIZ(LLIZLLLIL, "onBind", "OnBind Abs");
        }
        return new Binder();
    }

    public final void LJFF(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        int downloadId = downloadTask.getDownloadId();
        synchronized (this.LLILLJJLI) {
            try {
                if (C1490830otl.LIZ()) {
                    String str = LLIZLLLIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PendingTasks.size:");
                    sbLIZ.append(this.LLILLJJLI.size());
                    C1490830otl.LIZLLL(downloadId, str, "pendDownloadTask", C2188811AlT.LIZIZ(sbLIZ));
                }
                List<DownloadTask> arrayList = this.LLILLJJLI.get(downloadId);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.LLILLJJLI.put(downloadId, arrayList);
                }
                if (C1490830otl.LIZ()) {
                    String str2 = LLIZLLLIL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Before taskArray.size:");
                    sbLIZ2.append(arrayList.size());
                    C1490830otl.LIZLLL(downloadId, str2, "pendDownloadTask", C2188811AlT.LIZIZ(sbLIZ2));
                }
                arrayList.add(downloadTask);
                if (C1490830otl.LIZ()) {
                    String str3 = LLIZLLLIL;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("After pendingTasks.size:");
                    sbLIZ3.append(this.LLILLJJLI.size());
                    C1490830otl.LIZLLL(downloadId, str3, "pendDownloadTask", C2188811AlT.LIZIZ(sbLIZ3));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1B7F
    public void setLogLevel(int i) {
        C1490830otl.LIZ = i;
    }

    @Override // X.C1B7F
    public void tryDownload(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        boolean zLJI = C2199751B7l.LJFF(downloadTask.getDownloadId(), null).LJI("ignore_service_alive", false);
        if (!this.LLILLL) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZLLL(downloadTask.getDownloadId(), LLIZLLLIL, "tryDownload", "Service is not alive");
            }
            if (!zLJI) {
                LJFF(downloadTask);
            }
            if (!this.LLILZIL) {
                if (C1490830otl.LIZ()) {
                    C1490830otl.LIZLLL(downloadTask.getDownloadId(), LLIZLLLIL, "tryDownload", "Do StartService");
                }
                LJII(C2199681B7e.LJFF(), null);
                this.LLILZIL = true;
            } else {
                this.LLILZLL.removeCallbacks(this.LLIZ);
                C786410Ut5.LJLIIL(10L, this.LLILZLL, this.LLIZ);
            }
        }
        if (this.LLILLL || zLJI) {
            if (this.LLILLJJLI.get(downloadTask.getDownloadId()) != null) {
                synchronized (this.LLILLJJLI) {
                    try {
                        if (this.LLILLJJLI.get(downloadTask.getDownloadId()) != null) {
                            this.LLILLJJLI.remove(downloadTask.getDownloadId());
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C1B7G c1b7gLJIILIIL = C2199681B7e.LJIILIIL();
            if (c1b7gLJIILIIL != null) {
                c1b7gLJIILIIL.LJIL(downloadTask);
            }
            LJI();
        }
    }
}
