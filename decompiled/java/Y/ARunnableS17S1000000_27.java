package Y;

import X.C07IH;
import X.C1847760yBS;
import X.C1847770yBT;
import X.C1858380ySa;
import X.C1859360yUA;
import X.C1859410yUF;
import X.C1C7U;
import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS17S1000000_27 implements Runnable {
    public final int $t;
    public String s0;

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

    public final void LIZ$0() throws JSONException {
        C1858380ySa c1858380ySa = C1858380ySa.LIZ;
        String str = this.s0;
        c1858380ySa.getClass();
        C1858380ySa.LIZJ = str;
        long jCurrentTimeMillis = System.currentTimeMillis() - C1858380ySa.LIZIZ;
        if (jCurrentTimeMillis > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost", jCurrentTimeMillis);
            jSONObject.put("isFirst", C1858380ySa.LIZLLL);
            jSONObject.put("schema", C1858380ySa.LIZJ);
            jSONObject.put("logId", C1858380ySa.LJ);
            jSONObject.put("source", C1858380ySa.LJFF);
            AppLogNewUtils.onEventV3("tako_lynx_perf_tracker", jSONObject);
            C1858380ySa.LIZIZ = 0L;
            C1858380ySa.LIZJ = "";
            C1858380ySa.LIZLLL = 0;
            C1858380ySa.LJ = "";
            C1858380ySa.LJFF = -1;
        }
    }

    public static final void run$0(ARunnableS17S1000000_27 aRunnableS17S1000000_27) {
        boolean zLIZ;
        C1859410yUF c1859410yUF;
        C1C7U.LIZ("TakoTypewriterPauseController@5bc8.ensureReceiveFinishedListener$1$1");
        try {
            C1859360yUA c1859360yUA = C1859360yUA.LIZ;
            String str = aRunnableS17S1000000_27.s0;
            c1859360yUA.getClass();
            if (C07IH.LIZ() && (C07IH.LIZIZ() & 4) != 0 && C1859360yUA.LJFF && Intrinsics.LJFF(str, C1859360yUA.LJ) && (c1859410yUF = C1859360yUA.LIZJ.get(str)) != null) {
                c1859410yUF.LIZIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoTypewriterPauseController@5bc8.ensureReceiveFinishedListener$1$1");
    }

    public static final void run$1(ARunnableS17S1000000_27 aRunnableS17S1000000_27) {
        boolean zLIZ;
        C1C7U.LIZ("ExposureHelper@fce9.addToExposureTaskQueue$1");
        try {
            C1847770yBT c1847770yBTRemove = C1847760yBS.LIZ.remove(aRunnableS17S1000000_27.s0);
            if (c1847770yBTRemove != null) {
                C1847760yBS.LIZ(c1847770yBTRemove);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExposureHelper@fce9.addToExposureTaskQueue$1");
    }

    public static final void run$2(ARunnableS17S1000000_27 aRunnableS17S1000000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoLynxAssem@d066.lynxPerfMonitor$1");
        try {
            aRunnableS17S1000000_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoLynxAssem@d066.lynxPerfMonitor$1");
    }

    public ARunnableS17S1000000_27(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
