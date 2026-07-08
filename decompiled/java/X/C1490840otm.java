package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS34S0101000_23;
import Y.ARunnableS4S0111000_23;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0otm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490840otm implements Handler.Callback, InterfaceC1490890otr {
    public static volatile C1490840otm LLIZLLLIL;
    public final boolean LLILZ;
    public long LLILZIL;
    public ConnectivityManager LLIZ;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper(), this);
    public final SparseArray<C1490820otk> LLILLL = new SparseArray<>();
    public int LLILZLL = 0;
    public final Context LL = C2199681B7e.LJFF();

    public final int LIZLLL() {
        try {
            if (this.LLIZ == null) {
                this.LLIZ = (ConnectivityManager) C786410Ut5.H2(C786410Ut5.N3(this.LL), "connectivity");
            }
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(this.LLIZ);
            if (networkInfoLJIJ == null || !networkInfoLJIJ.isConnected()) {
                return 0;
            }
            return C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisofPP81MBTDVFXHKaQXSHdFau6F5UykLCFA==", null)) == 1 ? 2 : 1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // X.InterfaceC1490890otr
    public final void onAppBackground() {
        LJI(3, false);
    }

    @Override // X.InterfaceC1490890otr
    public final void onAppForeground() {
        LJI(4, false);
    }

    public static C1490840otm LIZJ() {
        if (LLIZLLLIL == null) {
            synchronized (C1490840otm.class) {
                try {
                    if (LLIZLLLIL == null) {
                        LLIZLLLIL = new C1490840otm();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLIZLLLIL;
    }

    public C1490840otm() {
        if (C2199751B7l.LJFF.LJIIIIZZ("use_network_callback", 0) == 1) {
            C2199681B7e.LJI().execute(new ARunnableS123S0100000_23(this, 128));
        }
        this.LLILZ = C2199661B7c.LJIIL();
        C1490910ott c1490910ott = C1490860oto.LIZ;
        synchronized (c1490910ott.LIZIZ) {
            try {
                if (!((ArrayList) c1490910ott.LIZIZ).contains(this)) {
                    ((ArrayList) c1490910ott.LIZIZ).add(this);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C1490820otk LIZ(int i) {
        int iOptInt;
        int iOptInt2;
        int[] iArr = null;
        C2199751B7l c2199751B7lLJFF = C2199751B7l.LJFF(i, null);
        int iLJIIIIZZ = c2199751B7lLJFF.LJIIIIZZ("retry_schedule", 0);
        JSONObject jSONObjectLJIIIZ = c2199751B7lLJFF.LJIIIZ("retry_schedule_config");
        int i2 = 60;
        if (jSONObjectLJIIIZ != null) {
            iOptInt2 = jSONObjectLJIIIZ.optInt("max_count", 60);
            int iOptInt3 = jSONObjectLJIIIZ.optInt("interval_sec", 60);
            iOptInt = jSONObjectLJIIIZ.optInt("interval_sec_acceleration", 60);
            String strOptString = jSONObjectLJIIIZ.optString("allow_error_code");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    String[] strArrSplit = strOptString.split(",");
                    if (strArrSplit.length > 0) {
                        int[] iArr2 = new int[strArrSplit.length];
                        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                            iArr2[i3] = CastIntegerProtector.parseInt(strArrSplit[i3]);
                        }
                        iArr = iArr2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            i2 = iOptInt3;
        } else {
            iOptInt = 60;
            iOptInt2 = 60;
        }
        return new C1490820otk(i, iLJIIIIZZ, iOptInt2, i2 * LSPassThroughRecordSizeConfig.DEFAULT, iOptInt * LSPassThroughRecordSizeConfig.DEFAULT, iArr);
    }

    public final C1490820otk LJ(int i) {
        C1490820otk c1490820otkLIZ;
        C1490820otk c1490820otk = this.LLILLL.get(i);
        if (c1490820otk == null) {
            synchronized (this.LLILLL) {
                try {
                    c1490820otkLIZ = this.LLILLL.get(i);
                    if (c1490820otkLIZ == null) {
                        c1490820otkLIZ = LIZ(i);
                    }
                    this.LLILLL.put(i, c1490820otkLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c1490820otkLIZ;
        }
        return c1490820otk;
    }

    public final void LJFF(int i) {
        synchronized (this.LLILLL) {
            try {
                this.LLILLL.remove(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        if (message.what == 0) {
            int i = message.arg1;
            if (message.arg2 == 1) {
                z = true;
            } else {
                z = false;
            }
            C2199681B7e.LJI().execute(new ARunnableS4S0111000_23(this, i, z, 4));
            return true;
        }
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZLLL(message.what, "RetryScheduler", "handleMessage", "DoSchedulerRetry");
        }
        C2199681B7e.LJI().execute(new ARunnableS34S0101000_23(this, message.what, 15));
        return true;
    }

    public final void LJI(int i, boolean z) {
        if (this.LLILZLL <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (!z) {
                try {
                    if (jCurrentTimeMillis - this.LLILZIL < 10000) {
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLILZIL = jCurrentTimeMillis;
            if (C1490830otl.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("level = [");
                sbLIZ.append(i);
                sbLIZ.append("], force = [");
                sbLIZ.append(z);
                sbLIZ.append(e3.f);
                C1490830otl.LIZIZ("RetryScheduler", "scheduleAllTaskRetry", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (z) {
                this.LLILLJJLI.removeMessages(0);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            messageObtain.arg1 = i;
            messageObtain.arg2 = z ? 1 : 0;
            C786410Ut5.LJLJLJ(this.LLILLJJLI, messageObtain, 2000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0198 A[PHI: r9
      0x0198: PHI (r9v5 boolean) = (r9v0 boolean), (r9v6 boolean) binds: [B:58:0x00d2, B:90:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1490840otm.LIZIZ(int, int, boolean):void");
    }

    public final void LJII(DownloadInfo downloadInfo, boolean z, int i) {
        BaseException failedException = downloadInfo.getFailedException();
        if (failedException == null) {
            return;
        }
        C1490820otk c1490820otkLJ = LJ(downloadInfo.getId());
        if (c1490820otkLJ.LJIIIIZZ.get() > c1490820otkLJ.LIZJ) {
            if (C1490830otl.LIZ()) {
                int id = downloadInfo.getId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Id = ");
                sbLIZ.append(c1490820otkLJ.LIZ);
                sbLIZ.append(", mRetryCount = ");
                sbLIZ.append(c1490820otkLJ.LJIIIIZZ);
                sbLIZ.append(", maxCount = ");
                sbLIZ.append(c1490820otkLJ.LIZJ);
                C1490830otl.LIZLLL(id, "RetryScheduler", "tryStartScheduleRetry", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        int errorCode = failedException.getErrorCode();
        if (!C2199671B7d.LJIJJ(failedException) && !C2199671B7d.LJJ(failedException) && (!downloadInfo.statusInPause() || !downloadInfo.isPauseReserveOnWifi())) {
            int[] iArr = c1490820otkLJ.LJI;
            if (iArr != null && iArr.length != 0) {
                for (int i2 : iArr) {
                    if (i2 == errorCode) {
                        if (C1490830otl.LIZ()) {
                            int id2 = downloadInfo.getId();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Allow error code, id = ");
                            sbLIZ2.append(c1490820otkLJ.LIZ);
                            sbLIZ2.append(", error code = ");
                            sbLIZ2.append(errorCode);
                            C1490830otl.LIZLLL(id2, "RetryScheduler", "tryStartScheduleRetry", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                }
                return;
            }
            return;
        }
        c1490820otkLJ.LJIIIZ = z;
        synchronized (this.LLILLL) {
            try {
                if (!c1490820otkLJ.LJIIJJI) {
                    c1490820otkLJ.LJIIJJI = true;
                    this.LLILZLL++;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        int i3 = c1490820otkLJ.LJII.get();
        if (C1490830otl.LIZ()) {
            int id3 = downloadInfo.getId();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Id = ");
            sbLIZ3.append(c1490820otkLJ.LIZ);
            sbLIZ3.append(", delayTimeMills = ");
            sbLIZ3.append(i3);
            sbLIZ3.append(", mWaitingRetryTasks = ");
            sbLIZ3.append(this.LLILZLL);
            C1490830otl.LIZLLL(id3, "RetryScheduler", "tryStartScheduleRetry", C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (c1490820otkLJ.LJFF) {
            if (i == 0) {
                c1490820otkLJ.LJII.set(c1490820otkLJ.LIZLLL);
            }
            if (this.LLILZ) {
                c1490820otkLJ.LJIIJ.set(System.currentTimeMillis());
                c1490820otkLJ.LJIIIIZZ.incrementAndGet();
                c1490820otkLJ.LJII.addAndGet(c1490820otkLJ.LJ);
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.LLILLJJLI.removeMessages(downloadInfo.getId());
        C786410Ut5.LJLJJI(downloadInfo.getId(), i3, this.LLILLJJLI);
    }
}
