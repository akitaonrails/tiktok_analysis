package Y;

import X.C1490830otl;
import X.C1B58;
import X.C1B79;
import X.C1B7G;
import X.C1C7U;
import X.C2188811AlT;
import X.C2189941AnI;
import X.C2209911BeP;
import X.C2254301DLg;
import X.InterfaceC2183551Acz;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.vesdk.k;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS45S0101000_34 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        InterfaceC2183551Acz interfaceC2183551Acz = ((C2254301DLg) this.l0).LIZ.LJJJZ;
        if (interfaceC2183551Acz != null) {
            interfaceC2183551Acz.onDone(this.i1);
        }
        k kVar = ((C2254301DLg) this.l0).LIZ;
        kVar.LJJJZ = null;
        if (kVar.LJLILLLLZI) {
            kVar.LJJIFFI(1022, this.i1, "stopRecord in stopPreview!!");
            ((C2254301DLg) this.l0).LIZ.LJLILLLLZI = false;
        }
    }

    public final void LIZ$1() {
        C1B7G c1b7g = ((C1B79) this.l0).LIZ;
        int i = this.i1;
        synchronized (c1b7g) {
            if (C1490830otl.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Trace:");
                sbLIZ.append(Log.getStackTraceString(new Throwable()));
                C1490830otl.LIZLLL(i, "AbsDownloadEngine", "resume", C2188811AlT.LIZIZ(sbLIZ));
            }
            DownloadTask downloadTask = c1b7g.LIZ.get(i);
            if (downloadTask != null) {
                DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                if (downloadInfo != null) {
                    downloadInfo.setDownloadFromReserveWifi(false);
                }
                c1b7g.LJIL(downloadTask);
            } else {
                c1b7g.LJIJI(i);
            }
        }
    }

    public static final void run$0(ARunnableS45S0101000_34 aRunnableS45S0101000_34) {
        boolean zLIZ;
        C1C7U.LIZ("TERecorder@aadd.<init>$1$onCallback$1");
        try {
            aRunnableS45S0101000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TERecorder@aadd.<init>$1$onCallback$1");
    }

    public static final void run$1(ARunnableS45S0101000_34 aRunnableS45S0101000_34) {
        boolean zLIZ;
        C1C7U.LIZ("TERecorder@aadd.<init>$1$onCallback$2");
        try {
            InterfaceC2183551Acz interfaceC2183551Acz = ((C2254301DLg) aRunnableS45S0101000_34.l0).LIZ.LJJJLZIJ;
            if (interfaceC2183551Acz != null) {
                interfaceC2183551Acz.onDone(aRunnableS45S0101000_34.i1);
            }
            ((C2254301DLg) aRunnableS45S0101000_34.l0).LIZ.LJJJLZIJ = null;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TERecorder@aadd.<init>$1$onCallback$2");
    }

    public static final void run$2(ARunnableS45S0101000_34 aRunnableS45S0101000_34) {
        C2209911BeP c2209911BeP = (C2209911BeP) aRunnableS45S0101000_34.l0;
        int i = aRunnableS45S0101000_34.i1;
        c2209911BeP.getClass();
        C1C7U.LIZ("Engine@f645.triggerReport$1L");
        try {
            c2209911BeP.LJIIL(i, c2209911BeP.LLJI);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2209911BeP.LLILLL.LJJJJLI.LJI("Engine triggerReport exception", th, true);
        }
        C1C7U.LIZIZ("Engine@f645.triggerReport$1L");
    }

    public static final void run$3(ARunnableS45S0101000_34 aRunnableS45S0101000_34) {
        boolean zLIZ;
        C2189941AnI c2189941AnI;
        C1C7U.LIZ("SqlDownloadCache@494c.removeDownloadInfo$1");
        try {
            ((C1B58) aRunnableS45S0101000_34.l0).m1();
            if (C1B58.LLILZLL != null && (c2189941AnI = ((C1B58) aRunnableS45S0101000_34.l0).LLILLJJLI) != null) {
                try {
                    int i = aRunnableS45S0101000_34.i1;
                    SQLiteStatement sQLiteStatementLIZ = c2189941AnI.LIZ();
                    if (sQLiteStatementLIZ != null) {
                        try {
                            synchronized (sQLiteStatementLIZ) {
                                try {
                                    sQLiteStatementLIZ.bindLong(1, i);
                                    sQLiteStatementLIZ.execute();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SqlDownloadCache@494c.removeDownloadInfo$1");
    }

    public static final void run$4(ARunnableS45S0101000_34 aRunnableS45S0101000_34) {
        boolean zLIZ;
        C1C7U.LIZ("SqlDownloadCache@494c.removeDownloadTaskData$1");
        try {
            ((C1B58) aRunnableS45S0101000_34.l0).LJIILLIIL(aRunnableS45S0101000_34.i1);
            ((C1B58) aRunnableS45S0101000_34.l0).LJJJZ(aRunnableS45S0101000_34.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SqlDownloadCache@494c.removeDownloadTaskData$1");
    }

    public static final void run$5(ARunnableS45S0101000_34 aRunnableS45S0101000_34) {
        boolean zLIZ;
        DownloadInfo downloadInfo;
        C1C7U.LIZ("ProcessDownloadHandler@bc34.forceDownloadIngoreRecommendSize$1");
        try {
            C1B7G c1b7g = ((C1B79) aRunnableS45S0101000_34.l0).LIZ;
            int i = aRunnableS45S0101000_34.i1;
            synchronized (c1b7g) {
                DownloadTask downloadTask = c1b7g.LIZ.get(i);
                if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
                    downloadInfo.setForceIgnoreRecommendSize(true);
                    c1b7g.LJIL(downloadTask);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProcessDownloadHandler@bc34.forceDownloadIngoreRecommendSize$1");
    }

    public static final void run$6(ARunnableS45S0101000_34 aRunnableS45S0101000_34) {
        boolean zLIZ;
        C1C7U.LIZ("ProcessDownloadHandler@bc34.resume$1");
        try {
            aRunnableS45S0101000_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProcessDownloadHandler@bc34.resume$1");
    }

    public ARunnableS45S0101000_34(C2209911BeP c2209911BeP, int i) {
        this.$t = i;
        this.l0 = c2209911BeP;
        this.i1 = 14;
    }

    public ARunnableS45S0101000_34(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
