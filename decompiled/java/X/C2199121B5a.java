package X;

import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199121B5a implements C1B5T {
    public final /* synthetic */ SparseArray LIZ;
    public final /* synthetic */ C1B5Z LIZIZ;

    public final void LIZ() {
        if (this.LIZ != null) {
            for (int i = 0; i < this.LIZ.size(); i++) {
                int iKeyAt = this.LIZ.keyAt(i);
                if (iKeyAt != 0) {
                    this.LIZIZ.LL.LIZ((DownloadInfo) this.LIZ.get(iKeyAt));
                }
            }
        }
        C1B5Z c1b5z = this.LIZIZ;
        if (C1490830otl.LIZ()) {
            c1b5z.getClass();
            C1490830otl.LIZIZ("DefaultDownloadCache", "onDownloadCacheSyncSuccess", "Run");
        }
        if (c1b5z.LL.LLILLL) {
            c1b5z.LIZIZ();
        } else {
            synchronized (c1b5z) {
                try {
                    c1b5z.LLILLL = true;
                    c1b5z.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1B5Z c1b5z2 = this.LIZIZ;
        c1b5z2.getClass();
        c1b5z2.LLILZLL.sendMessageDelayed(c1b5z2.LLILZLL.obtainMessage(1), C2199751B7l.LJFF.LJI("task_resume_delay", false) ? 4000L : 1000L);
        C2199681B7e.LJJ(EnumC1152910g6j.SYNC_SUCCESS);
    }

    public C2199121B5a(C1B5Z c1b5z, SparseArray sparseArray) {
        this.LIZIZ = c1b5z;
        this.LIZ = sparseArray;
    }
}
