package Y;

import X.C1270500jAO;
import X.C1278740jNg;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1270560jAU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.MediaEncodeStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0102100_20 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
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
        InterfaceC1270560jAU interfaceC1270560jAU = ((C1270500jAO) this.l0).LLJJ;
        int i = this.i1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Recorder have an internal error (");
        sbLIZ.append(this.i2);
        sbLIZ.append(", ");
        sbLIZ.append(this.j3);
        sbLIZ.append(")");
        interfaceC1270560jAU.LIZIZ(i, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
        MediaEncodeStream mediaEncodeStream = ((C1270500jAO) this.l0).LLILLL;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.stop();
        }
    }

    public static final void run$0(ARunnableS0S0102100_20 aRunnableS0S0102100_20) {
        C1278740jNg c1278740jNg = (C1278740jNg) aRunnableS0S0102100_20.l0;
        long j = aRunnableS0S0102100_20.j3;
        int i = aRunnableS0S0102100_20.i1;
        int i2 = aRunnableS0S0102100_20.i2;
        c1278740jNg.getClass();
        C1C7U.LIZ("VeLiveLogService@5388.onProtocolDowngrade$1L");
        JSONObject jSONObjectLIZIZ = c1278740jNg.LIZIZ(null, j);
        if (jSONObjectLIZIZ != null) {
            try {
                jSONObjectLIZIZ.put("event_key", "protocol_downgrade").put("error_code", i).put("error_count", i2);
                c1278740jNg.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("VeLiveLogService@5388.onProtocolDowngrade$1L");
    }

    public static final void run$1(ARunnableS0S0102100_20 aRunnableS0S0102100_20) {
        boolean zLIZ;
        C1C7U.LIZ("RecorderManager@dfee.onTransportEvent$1");
        try {
            aRunnableS0S0102100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecorderManager@dfee.onTransportEvent$1");
    }

    public ARunnableS0S0102100_20(Object obj, long j, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.j3 = j;
        this.i1 = i;
        this.i2 = i2;
    }
}
