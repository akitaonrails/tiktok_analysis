package Y;

import X.C1270610jAZ;
import X.C1273010jER;
import X.C1273520jFG;
import X.C1278740jNg;
import X.C1C7U;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS1S0101200_20 implements Runnable {
    public final int $t;
    public int i1;
    public long j2;
    public long j3;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Matrix matrix;
        if (!((C1270610jAZ) this.l0).LLIFFJFJJ()) {
            C1270610jAZ c1270610jAZ = (C1270610jAZ) this.l0;
            c1270610jAZ.LLJIJIL(this.i1, false, c1270610jAZ.LLLJ, c1270610jAZ.LLLJIL, c1270610jAZ.LLJLLL, c1270610jAZ.LLLF, this.j2, null, this.j3, 0L);
            return;
        }
        if (C1273520jFG.LIZJ) {
            C1270610jAZ c1270610jAZ2 = (C1270610jAZ) this.l0;
            c1270610jAZ2.LLLLZLL.LIZ(c1270610jAZ2.LLJLLL, c1270610jAZ2.LLJJI, c1270610jAZ2.LLJJIII, c1270610jAZ2.LLLF);
            matrix = ((C1270610jAZ) this.l0).LLLLZLL.LIZ;
        } else {
            matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate(((C1270610jAZ) this.l0).LLJLLL);
            C1270610jAZ c1270610jAZ3 = (C1270610jAZ) this.l0;
            matrix.preScale(c1270610jAZ3.LLJJI ? -1.0f : 1.0f, c1270610jAZ3.LLJJIII ? -1.0f : 1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            matrix.postConcat(C1273010jER.LIZJ(0, ((C1270610jAZ) this.l0).LLLF));
        }
        C1270610jAZ c1270610jAZ4 = (C1270610jAZ) this.l0;
        c1270610jAZ4.LLJILJIL(this.i1, false, c1270610jAZ4.LLILZLL, c1270610jAZ4.LLIZ, matrix, this.j2, this.j3, 0L);
    }

    public static final void run$0(ARunnableS1S0101200_20 aRunnableS1S0101200_20) {
        int i;
        C1278740jNg c1278740jNg = (C1278740jNg) aRunnableS1S0101200_20.l0;
        long j = aRunnableS1S0101200_20.j2;
        int i2 = aRunnableS1S0101200_20.i1;
        long j2 = aRunnableS1S0101200_20.j3;
        c1278740jNg.getClass();
        C1C7U.LIZ("VeLiveLogService@5388.onReportBwAdjustTime$1L");
        JSONObject jSONObjectLIZIZ = c1278740jNg.LIZIZ(null, j);
        if (jSONObjectLIZIZ != null) {
            try {
                JSONObject jSONObjectPut = jSONObjectLIZIZ.put("event_key", "bitrate_adjust_timecost");
                if (i2 > 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObjectPut.put("adjustment", i).put("adjust_step", Math.abs(i2)).put("adjust_time_cost", j2);
                c1278740jNg.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("VeLiveLogService@5388.onReportBwAdjustTime$1L");
    }

    public static final void run$1(ARunnableS1S0101200_20 aRunnableS1S0101200_20) {
        boolean zLIZ;
        C1C7U.LIZ("CameraVideoCapturer@8f5e.tryDeliverFrame$1");
        try {
            aRunnableS1S0101200_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraVideoCapturer@8f5e.tryDeliverFrame$1");
    }

    public ARunnableS1S0101200_20(Object obj, long j, int i, long j2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.j2 = j;
        this.i1 = i;
        this.j3 = j2;
    }
}
