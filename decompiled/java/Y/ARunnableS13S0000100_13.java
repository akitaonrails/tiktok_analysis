package Y;

import X.C1C7U;
import X.C1DS1;
import X.C788300Uw8;
import X.C804290Vgp;
import X.C804330Vgt;
import X.C823280WRi;
import X.C826910WcD;
import X.EnumC804170Vgd;
import X.EnumC805430Vif;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS13S0000100_13 implements Runnable {
    public final int $t;
    public long j0;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            Object[] objArr = C788300Uw8.LIZIZ;
            Object obj = (objArr == null ? null : objArr)[1];
            if (objArr == null) {
                objArr = null;
            }
            Object obj2 = objArr[3];
            if (obj != null || obj2 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.j0 <= 0) {
                    this.j0 = jCurrentTimeMillis;
                }
                if (jCurrentTimeMillis - this.j0 >= 1000) {
                    this.j0 = jCurrentTimeMillis;
                }
            }
            C788300Uw8.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public ARunnableS13S0000100_13(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS13S0000100_13 aRunnableS13S0000100_13) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsTabTechMonitor@425.reportBSRIfNeed$1");
        try {
            if (aRunnableS13S0000100_13.j0 > ((Number) C1DS1.LJJJIL.getValue()).longValue()) {
                C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.FRIENDS, EnumC804170Vgd.FRIENDS_TAB_LANDING_TIME, null, 0L, 28));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsTabTechMonitor@425.reportBSRIfNeed$1");
    }

    public static final void run$1(ARunnableS13S0000100_13 aRunnableS13S0000100_13) {
        boolean zLIZ;
        C1C7U.LIZ("SearchMiddleMonitor@cd45.reportBSRIfNeed$1");
        try {
            if (aRunnableS13S0000100_13.j0 > ((Number) C1DS1.LJJIL.getValue()).longValue()) {
                C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.SEARCH, EnumC804170Vgd.SEARCH_MIDDLE_TIME, null, 0L, 28));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchMiddleMonitor@cd45.reportBSRIfNeed$1");
    }

    public static final void run$2(ARunnableS13S0000100_13 aRunnableS13S0000100_13) {
        boolean zLIZ;
        C1C7U.LIZ("FpsAnimationMonitor@a3be.inputRunnableAction$1");
        try {
            aRunnableS13S0000100_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FpsAnimationMonitor@a3be.inputRunnableAction$1");
    }

    public static final void run$3(ARunnableS13S0000100_13 aRunnableS13S0000100_13) throws JSONException {
        long j = aRunnableS13S0000100_13.j0;
        C1C7U.LIZ("UserInputActionInvoker@1a50.postInvoke$1L");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger_id", "20001");
        jSONObject.put("trigger_biz", "UserInput");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cost", j);
        C823280WRi.LJI("pumbaa_performance", jSONObject, jSONObject2, null);
        C1C7U.LIZIZ("UserInputActionInvoker@1a50.postInvoke$1L");
    }

    public static final void run$4(ARunnableS13S0000100_13 aRunnableS13S0000100_13) {
        boolean zLIZ;
        C1C7U.LIZ("HomePageBusiness@e300.startTrack$1");
        try {
            C826910WcD c826910WcD = C826910WcD.LIZ;
            long j = aRunnableS13S0000100_13.j0;
            c826910WcD.getClass();
            C826910WcD.LIZLLL(j);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HomePageBusiness@e300.startTrack$1");
    }

    public static final void run$5(ARunnableS13S0000100_13 aRunnableS13S0000100_13) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadStatics@8b16.reportBSRIfNeed$1");
        try {
            if (aRunnableS13S0000100_13.j0 > ((Number) C1DS1.LJJJ.getValue()).longValue()) {
                C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.INBOX, EnumC804170Vgd.INBOX_SECTION_TTI_TIME, null, 0L, 28));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadStatics@8b16.reportBSRIfNeed$1");
    }

    public ARunnableS13S0000100_13(long j, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 4:
            case 5:
                this.j0 = j;
                break;
            case 2:
            case 3:
            default:
                this.j0 = j;
                break;
        }
    }
}
