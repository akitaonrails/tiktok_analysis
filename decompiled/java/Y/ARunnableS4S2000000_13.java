package Y;

import X.C08OL;
import X.C08OM;
import X.C1551330qTL;
import X.C1C7U;
import X.C802400Vdm;
import X.C823280WRi;
import X.C827520WdC;
import X.C840160Wxa;
import X.EnumC797980VSa;
import X.InterfaceC827270Wcn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS4S2000000_13 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            C802400Vdm.LIZJ();
            if (this.s0 == null) {
                C08OM c08om = C802400Vdm.LIZ;
                String str = C802400Vdm.LIZIZ;
                ((C08OL) c08om).LIZ(str).erase(this.s1);
                return;
            }
            C08OM c08om2 = C802400Vdm.LIZ;
            String str2 = C802400Vdm.LIZIZ;
            ((C08OL) c08om2).LIZ(str2).storeString(this.s1, this.s0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void run$0(ARunnableS4S2000000_13 aRunnableS4S2000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("TagService@f7b3.saveTag$1");
        try {
            aRunnableS4S2000000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TagService@f7b3.saveTag$1");
    }

    public static final void run$1(ARunnableS4S2000000_13 aRunnableS4S2000000_13) {
        boolean zLIZ;
        long jLJ;
        C1C7U.LIZ("ALog@eae2.init$3");
        try {
            for (InterfaceC827270Wcn interfaceC827270Wcn : ALog.getNativeFuncAddrCallbackList()) {
                if (interfaceC827270Wcn != null) {
                    if (C827520WdC.LIZ != null) {
                        jLJ = C827520WdC.LIZ.LJ();
                    } else {
                        jLJ = 0;
                    }
                    interfaceC827270Wcn.LIZ(jLJ);
                }
            }
            try {
                Thread.sleep(15000L);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ALog.removeLegacyFiles(aRunnableS4S2000000_13.s0, aRunnableS4S2000000_13.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ALog@eae2.init$3");
    }

    public static final void run$2(ARunnableS4S2000000_13 aRunnableS4S2000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ALog@eae2.init$5");
        try {
            ALog.removeLegacyFiles(aRunnableS4S2000000_13.s0, aRunnableS4S2000000_13.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ALog@eae2.init$5");
    }

    public static final void run$3(ARunnableS4S2000000_13 aRunnableS4S2000000_13) throws JSONException {
        String str = aRunnableS4S2000000_13.s0;
        String str2 = aRunnableS4S2000000_13.s1;
        C1C7U.LIZ("NetworkEventSession@9196.makeDecision$1L");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("report_category", "control");
        jSONObject.put("strategy_id", "sandbox_ag");
        jSONObject.put("blocked", "true");
        jSONObject.put("trigger_by", "sandbox");
        jSONObject.put("domain", str);
        jSONObject.put("sample_rate", C840160Wxa.LJFF);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("path", str2);
        C823280WRi.LJI("pumbaa_standard_event", jSONObject, null, jSONObject2);
        C1C7U.LIZIZ("NetworkEventSession@9196.makeDecision$1L");
    }

    public static final void run$4(ARunnableS4S2000000_13 aRunnableS4S2000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ResLoadUtilsNew@422c.getLatestChannelVersionWithDecompress$3");
        try {
            C1551330qTL c1551330qTL = C1551330qTL.LIZ;
            String str = aRunnableS4S2000000_13.s0;
            String str2 = aRunnableS4S2000000_13.s1;
            EnumC797980VSa enumC797980VSa = EnumC797980VSa.GET_VERSION;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1551330qTL.getClass();
            C1551330qTL.LJIIIZ(str, str2, 0L, enumC797980VSa, false, jCurrentTimeMillis, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ResLoadUtilsNew@422c.getLatestChannelVersionWithDecompress$3");
    }

    public ARunnableS4S2000000_13(String str, String str2, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 4:
                this.s0 = str;
                this.s1 = str2;
                break;
            case 3:
            default:
                this.s0 = str;
                this.s1 = str2;
                break;
        }
    }
}
