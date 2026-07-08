package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0otp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490870otp {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public long LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public final List<Long> LJIIJ;
    public int LJIIJJI;

    public final void LIZIZ() {
        long jLongValue;
        if (this.LJIIIZ) {
            if (!((ArrayList) this.LJIIJ).isEmpty()) {
                try {
                    if (this.LIZ >= ((ArrayList) this.LJIIJ).size()) {
                        jLongValue = ((Long) ((ArrayList) this.LJIIJ).get(((ArrayList) r1).size() - 1)).longValue();
                    } else {
                        jLongValue = ((Long) ((ArrayList) this.LJIIJ).get(this.LIZ)).longValue();
                    }
                    if (C1490830otl.LIZ()) {
                        int i = this.LJIIJJI;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Sleep:");
                        sbLIZ.append(jLongValue);
                        C1490830otl.LIZLLL(i, "NetworkRetryStrategy", "delay", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    Thread.sleep(jLongValue);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    int i2 = this.LJIIJJI;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Error:");
                    sbLIZ2.append(th.toString());
                    C1490830otl.LJ(i2, "NetworkRetryStrategy", "delay", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            this.LIZ++;
            this.LIZIZ++;
            this.LJIIIIZZ++;
            if (C1490830otl.LIZ()) {
                int i3 = this.LJIIJJI;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("CurrentRetryCount:");
                sbLIZ3.append(this.LIZ);
                sbLIZ3.append(" currentPeriodRetryCount:");
                sbLIZ3.append(this.LIZIZ);
                sbLIZ3.append(" totalRetryCount:");
                sbLIZ3.append(this.LJIIIIZZ);
                C1490830otl.LIZLLL(i3, "NetworkRetryStrategy", "doRetry", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }

    public final void LIZLLL() {
        int i = this.LJII;
        if (i <= 0 || this.LIZLLL < i) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZLLL(this.LJIIJJI, "NetworkRetryStrategy", "reset", "Reset currentRetryResetCount");
            }
            this.LIZLLL++;
            this.LIZ = 0;
            return;
        }
        if (C1490830otl.LIZ()) {
            int i2 = this.LJIIJJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CurrentRetryResetCount:");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(" retryResetCountLimit:");
            sbLIZ.append(this.LJII);
            C1490830otl.LIZLLL(i2, "NetworkRetryStrategy", "resetLimit", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJIIIZ = false;
    }

    public C1490870otp(DownloadInfo downloadInfo) {
        int i;
        String strLIZIZ;
        ArrayList arrayList = new ArrayList();
        this.LJIIJ = arrayList;
        this.LJIIJJI = 0;
        try {
            LIZJ(downloadInfo);
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                int i2 = this.LJIIJJI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Init Error");
                sbLIZ.append(th.toString());
                C1490830otl.LJ(i2, "NetworkRetryStrategy", "NetworkRetryStrategy", C2188811AlT.LIZIZ(sbLIZ));
                if (C1490830otl.LIZ()) {
                    i = this.LJIIJJI;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Init retryCountLimit:");
                    sbLIZ2.append(this.LJ);
                    sbLIZ2.append(" delayIntervalMs:");
                    sbLIZ2.append(this.LJIIJ.toString());
                    sbLIZ2.append(" retryPeriodTime:");
                    sbLIZ2.append(this.LJI);
                    sbLIZ2.append(" periodRetryCountLimit:");
                    sbLIZ2.append(this.LJFF);
                    sbLIZ2.append(" retryResetCountLimit:");
                    sbLIZ2.append(this.LJII);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    return;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (C1490830otl.LIZ()) {
                    int i3 = this.LJIIJJI;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Init retryCountLimit:");
                    sbLIZ3.append(this.LJ);
                    sbLIZ3.append(" delayIntervalMs:");
                    sbLIZ3.append(this.LJIIJ.toString());
                    sbLIZ3.append(" retryPeriodTime:");
                    sbLIZ3.append(this.LJI);
                    sbLIZ3.append(" periodRetryCountLimit:");
                    sbLIZ3.append(this.LJFF);
                    sbLIZ3.append(" retryResetCountLimit:");
                    sbLIZ3.append(this.LJII);
                    C1490830otl.LIZLLL(i3, "NetworkRetryStrategy", "NetworkRetryStrategy", C2188811AlT.LIZIZ(sbLIZ3));
                }
                throw th2;
            }
        }
        if (C1490830otl.LIZ()) {
            i = this.LJIIJJI;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Init retryCountLimit:");
            sbLIZ4.append(this.LJ);
            sbLIZ4.append(" delayIntervalMs:");
            sbLIZ4.append(arrayList.toString());
            sbLIZ4.append(" retryPeriodTime:");
            sbLIZ4.append(this.LJI);
            sbLIZ4.append(" periodRetryCountLimit:");
            sbLIZ4.append(this.LJFF);
            sbLIZ4.append(" retryResetCountLimit:");
            sbLIZ4.append(this.LJII);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            C1490830otl.LIZLLL(i, "NetworkRetryStrategy", "NetworkRetryStrategy", strLIZIZ);
        }
    }

    public final boolean LIZ(BaseException baseException) {
        if (!this.LJIIIZ) {
            if (C1490830otl.LIZ()) {
                int i = this.LJIIJJI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Enabled: ");
                sbLIZ.append(this.LJIIIZ);
                C1490830otl.LIZLLL(i, "NetworkRetryStrategy", "canRetry", C2188811AlT.LIZIZ(sbLIZ));
            }
            return false;
        }
        if (C1490830otl.LIZ()) {
            int i2 = this.LJIIJJI;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CurrentRetryCount:");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(" retryCountLimit:");
            sbLIZ2.append(this.LJ);
            sbLIZ2.append(" error:");
            sbLIZ2.append(baseException.getErrorCode());
            C1490830otl.LIZLLL(i2, "NetworkRetryStrategy", "canRetry", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LJI > 0 && this.LJFF > 0) {
            if (this.LIZJ == 0) {
                this.LIZJ = System.currentTimeMillis();
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.LIZJ < this.LJI) {
                    if (this.LIZIZ > this.LJFF) {
                        if (C1490830otl.LIZ()) {
                            int i3 = this.LJIIJJI;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("CurrentPeriodRetryCount:");
                            sbLIZ3.append(this.LIZIZ);
                            sbLIZ3.append(" periodRetryCountLimit:");
                            sbLIZ3.append(this.LJFF);
                            sbLIZ3.append(" currentRetryPeriodTime:");
                            sbLIZ3.append(jCurrentTimeMillis - this.LIZJ);
                            sbLIZ3.append(" retryPeriodTime:");
                            sbLIZ3.append(this.LJI);
                            C1490830otl.LIZLLL(i3, "NetworkRetryStrategy", "retryLimit", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        this.LJIIIZ = false;
                        return false;
                    }
                } else {
                    this.LIZJ = System.currentTimeMillis();
                    this.LIZIZ = 0;
                }
            }
        }
        if (this.LIZ >= this.LJ || !C2199671B7d.LJJ(baseException)) {
            return false;
        }
        return true;
    }

    public final void LIZJ(DownloadInfo downloadInfo) {
        JSONObject jSONObjectLJIIIZ;
        if (downloadInfo != null) {
            int id = downloadInfo.getId();
            this.LJIIJJI = id;
            jSONObjectLJIIIZ = C2199751B7l.LJFF(id, null).LJIIIZ("retry_strategy");
        } else {
            jSONObjectLJIIIZ = C2199751B7l.LJFF.LJIIIZ("retry_strategy");
        }
        if (jSONObjectLJIIIZ == null) {
            return;
        }
        int iOptInt = jSONObjectLJIIIZ.optInt("retry_count");
        if (iOptInt > 0) {
            this.LJ = iOptInt;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectLJIIIZ.optJSONArray("delay_interval_ms");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                long jOptLong = jSONArrayOptJSONArray.optLong(i);
                if (jOptLong > 0) {
                    this.LJIIJ.add(Long.valueOf(jOptLong));
                }
            }
        }
        long jOptLong2 = jSONObjectLJIIIZ.optLong("retry_period_ms");
        if (jOptLong2 > 0) {
            this.LJI = jOptLong2;
        }
        int iOptInt2 = jSONObjectLJIIIZ.optInt("retry_count_limit_period");
        if (iOptInt2 > 0) {
            this.LJFF = iOptInt2;
        }
        int iOptInt3 = jSONObjectLJIIIZ.optInt("retry_reset_count_limit");
        if (iOptInt3 > 0) {
            this.LJII = iOptInt3;
        }
        if (this.LJ > 0 && this.LJII > 0) {
            this.LJIIIZ = true;
        }
    }
}
