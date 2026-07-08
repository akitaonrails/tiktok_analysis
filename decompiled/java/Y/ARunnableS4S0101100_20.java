package Y;

import X.C1274830jHN;
import X.C1274930jHX;
import X.C1275090jHn;
import X.C1275130jHr;
import X.C1278740jNg;
import X.C1C7U;
import X.EnumC1275260jI4;
import X.EnumC1275320jIA;
import X.InterfaceC1275670jIj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS4S0101100_20 implements Runnable {
    public final int $t;
    public int i1;
    public long j2;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1274830jHN c1274830jHN = (C1274830jHN) this.l0;
        JSONObject jSONObjectLIZIZ = c1274830jHN.LJJI != null ? c1274830jHN.LIZIZ(this.j2, "rtc_engine_api_callback") : c1274830jHN.LIZIZ(this.j2, "rtc_publish_stream");
        if (jSONObjectLIZIZ == null) {
            return;
        }
        try {
            jSONObjectLIZIZ.put("error_code", this.i1);
            if (((C1274830jHN) this.l0).LJJI != null) {
                jSONObjectLIZIZ.put("api", "rtc_publish_stream");
            }
            if (((C1274830jHN) this.l0).LIZIZ.LIZ() != null) {
                C1274930jHX c1274930jHXLIZ = ((C1274830jHN) this.l0).LIZIZ.LIZ();
                String strLIZIZ = c1274930jHXLIZ.LIZIZ();
                JSONObject jSONObjectPut = jSONObjectLIZIZ.put("url", c1274930jHXLIZ.LIZJ());
                C1274830jHN c1274830jHN2 = (C1274830jHN) this.l0;
                EnumC1275260jI4 enumC1275260jI4 = c1274930jHXLIZ.LJIILJJIL;
                c1274830jHN2.getClass();
                int i = C1275130jHr.LIZJ[enumC1275260jI4.ordinal()];
                String str = "";
                JSONObject jSONObjectPut2 = jSONObjectPut.put("audio_profile", i != 1 ? i != 2 ? "" : "HE" : "LC").put("meta_video_bitrate", c1274930jHXLIZ.LIZLLL).put("meta_video_framerate", c1274930jHXLIZ.LJ).put("width", c1274930jHXLIZ.LIZ).put("height", c1274930jHXLIZ.LIZIZ);
                C1274830jHN c1274830jHN3 = (C1274830jHN) this.l0;
                EnumC1275320jIA enumC1275320jIA = c1274930jHXLIZ.LJII;
                c1274830jHN3.getClass();
                int i2 = C1275130jHr.LIZLLL[enumC1275320jIA.ordinal()];
                if (i2 == 1) {
                    str = "h264";
                } else if (i2 == 2) {
                    str = "bytevc1";
                }
                jSONObjectPut2.put("video_codec", str).put("live_stream_session_id", strLIZIZ);
            }
            ((C1274830jHN) this.l0).LJJ(jSONObjectLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.ioe("live_client_monitor_log", String.valueOf(e));
        }
    }

    public static final void run$0(ARunnableS4S0101100_20 aRunnableS4S0101100_20) {
        boolean zLIZ;
        C1C7U.LIZ("VeLiveLogService@5388.onSendPktSlow$1");
        try {
            JSONObject jSONObjectLIZIZ = ((C1278740jNg) aRunnableS4S0101100_20.l0).LIZIZ(null, aRunnableS4S0101100_20.j2);
            if (jSONObjectLIZIZ != null) {
                try {
                    jSONObjectLIZIZ.put("event_key", "send_package_slow").put("send_package_duration", aRunnableS4S0101100_20.i1);
                    ((C1278740jNg) aRunnableS4S0101100_20.l0).LLJIJIL.LIZIZ(jSONObjectLIZIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VeLiveLogService@5388.onSendPktSlow$1");
    }

    public static final void run$1(ARunnableS4S0101100_20 aRunnableS4S0101100_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.onPublishStream$1");
        try {
            aRunnableS4S0101100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.onPublishStream$1");
    }

    public static final void run$2(ARunnableS4S0101100_20 aRunnableS4S0101100_20) {
        boolean zLIZ;
        C1C7U.LIZ("VideoContentReportManager@9a11.addVadSample$1");
        try {
            InterfaceC1275670jIj interfaceC1275670jIj = ((C1275090jHn) aRunnableS4S0101100_20.l0).LLJ;
            if (interfaceC1275670jIj != null) {
                interfaceC1275670jIj.LIZIZ(aRunnableS4S0101100_20.i1, aRunnableS4S0101100_20.j2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoContentReportManager@9a11.addVadSample$1");
    }

    public static final void run$3(ARunnableS4S0101100_20 aRunnableS4S0101100_20) {
        boolean zLIZ;
        C1C7U.LIZ("VideoContentReportManager@9a11.addFaceDetectSample$1");
        try {
            InterfaceC1275670jIj interfaceC1275670jIj = ((C1275090jHn) aRunnableS4S0101100_20.l0).LLIZLLLIL;
            if (interfaceC1275670jIj != null) {
                interfaceC1275670jIj.LIZIZ(aRunnableS4S0101100_20.i1, aRunnableS4S0101100_20.j2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoContentReportManager@9a11.addFaceDetectSample$1");
    }

    public ARunnableS4S0101100_20(C1275090jHn c1275090jHn, int i, int i2) {
        this.$t = i2;
        this.l0 = c1275090jHn;
        this.i1 = i;
        this.j2 = System.currentTimeMillis();
    }

    public ARunnableS4S0101100_20(C1274830jHN c1274830jHN, long j, int i) {
        this.$t = i;
        this.l0 = c1274830jHN;
        this.j2 = j;
        this.i1 = 0;
    }

    public ARunnableS4S0101100_20(C1278740jNg c1278740jNg, long j, int i, int i2) {
        this.$t = i2;
        this.l0 = c1278740jNg;
        this.j2 = j;
        this.i1 = i;
    }
}
