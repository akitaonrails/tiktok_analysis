package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209641Bdy {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public final C2209901BeO LJI;
    public final C2209571Bdr LJII;
    public long LJIIIIZZ;

    public final boolean LIZ(int i) {
        if (this.LIZ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.LIZJ;
            long j2 = this.LJIIIIZZ;
            if (jCurrentTimeMillis < j + j2) {
                int i2 = this.LIZLLL;
                if (i2 >= this.LIZIZ) {
                    return true;
                }
                this.LIZLLL = i2 + 1;
            } else {
                this.LIZJ = j + (((jCurrentTimeMillis - j) / j2) * j2);
                this.LIZLLL = 1;
            }
        }
        int i3 = this.LIZ;
        if (i3 >= 10000) {
            return true;
        }
        if (i3 > 0 && new Random().nextInt(10000) < this.LIZ) {
            return true;
        }
        if ((this.LJ > 0 && 1 == i) || (this.LJFF > 0 && 3 == i)) {
            return true;
        }
        return false;
    }

    public C2209641Bdy(C2209901BeO c2209901BeO, C2209571Bdr c2209571Bdr, long j) {
        this.LJI = c2209901BeO;
        this.LJII = c2209571Bdr;
        this.LJIIIIZZ = j;
    }

    public final void LIZIZ(JSONObject jSONObject, long j, C2209631Bdx c2209631Bdx) {
        int i;
        int i2;
        C2209911BeP c2209911BeP;
        List<AbstractC2209821BeG> list;
        int i3;
        this.LJIIIIZZ = j;
        int iOptInt = jSONObject.optInt("backoff_ratio", 0);
        this.LIZ = iOptInt;
        if (iOptInt < 0 || iOptInt > 10000) {
            this.LIZ = 0;
        }
        if (c2209631Bdx != null && -1 != (i3 = c2209631Bdx.LIZ)) {
            if (i3 == 0) {
                i = Integer.MAX_VALUE;
            } else {
                i = 60;
            }
        } else {
            i = 12;
        }
        int iOptInt2 = jSONObject.optInt("max_request_frequency", i);
        this.LIZIZ = iOptInt2;
        if (iOptInt2 <= 0) {
            this.LIZIZ = 12;
        }
        int i4 = this.LIZ;
        if (i4 > 0) {
            if (this.LIZJ == 0) {
                this.LIZJ = System.currentTimeMillis();
                this.LIZLLL = 1;
            }
        } else if (i4 == 0) {
            this.LIZJ = 0L;
            this.LIZLLL = 0;
        }
        this.LJ = jSONObject.optInt("disable_session_start_request", 0);
        this.LJFF = jSONObject.optInt("disable_session_end_request", 0);
        if (this.LIZ == 0 && (i2 = this.LIZIZ) > 0 && (c2209911BeP = this.LJII.LJIILL) != null && (list = c2209911BeP.LLJI) != null && !((ArrayList) list).isEmpty()) {
            for (AbstractC2209821BeG abstractC2209821BeG : (ArrayList) c2209911BeP.LLJI) {
                if (abstractC2209821BeG instanceof C2209891BeN) {
                    C2209891BeN c2209891BeN = (C2209891BeN) abstractC2209821BeG;
                    if (c2209631Bdx != null) {
                        if (c2209631Bdx == c2209891BeN.LJII) {
                            Iterator<C2210091Beh> it2 = c2209891BeN.LJI.values().iterator();
                            while (it2.hasNext()) {
                                it2.next().LJIIIIZZ[0][2] = i2;
                            }
                        }
                    } else {
                        c2209891BeN.getClass();
                    }
                }
            }
        }
        C2209791BeD c2209791BeD = this.LJI.LJJZZI;
        List<String> listSingletonList = Collections.singletonList("BackoffController");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseBackoffControllerFromResp mEventInterval: ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mBackoffRatio: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mMaxRequestFrequency: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mBackoffWindowStartTime: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mBackoffWindowSendCount: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mDisableSessionStartRequest: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mDisableSessionEndRequest: ");
        sbLIZ.append(this.LJFF);
        c2209791BeD.LJIIIZ(0, listSingletonList, C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
    }
}
