package Y;

import X.C1490830otl;
import X.C1B72;
import X.C1B79;
import X.C1B7G;
import X.C1B7V;
import X.C1C7U;
import X.C2188811AlT;
import X.C2199671B7d;
import X.C2199681B7e;
import X.C2199751B7l;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS8S0111000_34 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ((C1B7G) this.l0).LJI(this.i2);
        C1B7G c1b7g = (C1B7G) this.l0;
        int i = this.i2;
        boolean z = this.z1;
        if (!c1b7g.LJIIIIZZ) {
            try {
                DownloadInfo downloadInfo = c1b7g.LJII.getDownloadInfo(i);
                if (downloadInfo != null) {
                    C2199671B7d.LJ(downloadInfo, z);
                    downloadInfo.erase();
                }
                try {
                    c1b7g.LJII.updateDownloadInfo(downloadInfo);
                } catch (SQLiteException th) {
                }
                if (c1b7g.LIZJ.get(i) != null) {
                    c1b7g.LIZJ.remove(i);
                }
                if (c1b7g.LIZIZ.get(i) != null) {
                    c1b7g.LIZIZ.remove(i);
                }
                c1b7g.LJFF.remove(Integer.valueOf(i));
                C2199751B7l.LJIIL(i);
                return;
            } catch (Throwable th2) {
                return;
            }
        }
        try {
            DownloadInfo downloadInfo2 = c1b7g.LJII.getDownloadInfo(i);
            if (downloadInfo2 != null) {
                C2199671B7d.LJ(downloadInfo2, z);
                downloadInfo2.erase();
            }
            try {
                c1b7g.LJII.updateDownloadInfo(downloadInfo2);
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            synchronized (c1b7g) {
                try {
                    if (c1b7g.LIZJ.get(i) != null) {
                        c1b7g.LIZJ.remove(i);
                    }
                    if (c1b7g.LIZIZ.get(i) != null) {
                        c1b7g.LIZIZ.remove(i);
                    }
                    c1b7g.LJFF.remove(Integer.valueOf(i));
                    C2199751B7l.LJIIL(i);
                } finally {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        } catch (Throwable th22) {
        }
    }

    public final void LIZ$1() {
        C1B7G c1b7g = ((C1B79) this.l0).LIZ;
        int i = this.i2;
        boolean z = this.z1;
        if (c1b7g.LJIIIIZZ) {
            if (C1490830otl.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Trace:");
                sbLIZ.append(Log.getStackTraceString(new Throwable()));
                C1490830otl.LIZLLL(i, "AbsDownloadEngine", "cancel", C2188811AlT.LIZIZ(sbLIZ));
            }
            DownloadTask downloadTaskLJIIL = c1b7g.LJIIL(i);
            if (downloadTaskLJIIL != null) {
                DownloadInfo downloadInfo = downloadTaskLJIIL.getDownloadInfo();
                if (downloadInfo != null) {
                    downloadInfo.setStatus(-4);
                }
                c1b7g.LJIIIZ.post(new ARunnableS42S0400000_34(downloadTaskLJIIL.getDownloadListeners(C1B72.MAIN), downloadInfo, downloadTaskLJIIL, downloadTaskLJIIL.getDownloadListeners(C1B72.NOTIFICATION), 2));
            }
            DownloadInfo downloadInfo2 = c1b7g.LJII.getDownloadInfo(i);
            if (downloadInfo2 != null) {
                downloadInfo2.setStatus(-4);
            }
            c1b7g.LIZLLL(i, z, false);
            return;
        }
        synchronized (c1b7g) {
            if (C1490830otl.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Trace:");
                sbLIZ2.append(Log.getStackTraceString(new Throwable()));
                C1490830otl.LIZLLL(i, "AbsDownloadEngine", "cancel", C2188811AlT.LIZIZ(sbLIZ2));
            }
            DownloadTask downloadTaskLJIIL2 = c1b7g.LJIIL(i);
            if (downloadTaskLJIIL2 != null) {
                if (!C2199751B7l.LJFF(i, null).LJI("fix_on_cancel_call_twice", true)) {
                    new C1B7V(downloadTaskLJIIL2, c1b7g.LJIIIZ).LJIIL(-4, null, true);
                }
                DownloadInfo downloadInfo3 = downloadTaskLJIIL2.getDownloadInfo();
                c1b7g.LJIIIZ.post(new ARunnableS42S0400000_34(downloadTaskLJIIL2.getDownloadListeners(C1B72.MAIN), downloadInfo3, downloadTaskLJIIL2, downloadTaskLJIIL2.getDownloadListeners(C1B72.NOTIFICATION), 3));
            }
            DownloadInfo downloadInfo4 = c1b7g.LJII.getDownloadInfo(i);
            if (downloadInfo4 != null) {
                downloadInfo4.setStatus(-4);
            }
            c1b7g.LIZLLL(i, z, false);
        }
    }

    public final void LIZ$2() {
        C1B7G c1b7g = ((C1B79) this.l0).LIZ;
        int i = this.i2;
        boolean z = this.z1;
        if (C1490830otl.LIZ()) {
            c1b7g.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DeleteFile:");
            sbLIZ.append(z);
            sbLIZ.append("Trace:");
            sbLIZ.append(Log.getStackTraceString(new Throwable()));
            C1490830otl.LIZLLL(i, "AbsDownloadEngine", "resetDownloadData", C2188811AlT.LIZIZ(sbLIZ));
        }
        DownloadInfo downloadInfo = c1b7g.LJII.getDownloadInfo(i);
        if (downloadInfo != null) {
            C1B7G.LIZJ(downloadInfo);
        }
        c1b7g.LJIIIZ.post(new ARunnableS9S0001000_31(i, 1));
        C2199681B7e.LJJIIZ(new ARunnableS8S0111000_34(c1b7g, i, z, 0));
    }

    public static final void run$0(ARunnableS8S0111000_34 aRunnableS8S0111000_34) {
        boolean zLIZ;
        C1C7U.LIZ("AbsDownloadEngine@9f1b.resetDownloadData$2");
        try {
            aRunnableS8S0111000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsDownloadEngine@9f1b.resetDownloadData$2");
    }

    public static final void run$1(ARunnableS8S0111000_34 aRunnableS8S0111000_34) {
        boolean zLIZ;
        C1C7U.LIZ("ProcessDownloadHandler@bc34.cancel$1");
        try {
            aRunnableS8S0111000_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProcessDownloadHandler@bc34.cancel$1");
    }

    public static final void run$2(ARunnableS8S0111000_34 aRunnableS8S0111000_34) {
        boolean zLIZ;
        C1C7U.LIZ("ProcessDownloadHandler@bc34.resetDownloadData$1");
        try {
            aRunnableS8S0111000_34.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProcessDownloadHandler@bc34.resetDownloadData$1");
    }

    public ARunnableS8S0111000_34(C1B79 c1b79, int i, int i2) {
        this.$t = i2;
        this.l0 = c1b79;
        this.i2 = i;
        this.z1 = true;
    }

    public ARunnableS8S0111000_34(Object obj, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.z1 = z;
    }
}
