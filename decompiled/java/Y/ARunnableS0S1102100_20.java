package Y;

import X.C1269780j9E;
import X.C1271450jBv;
import X.C1278740jNg;
import X.C1278760jNi;
import X.C1278940jO0;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1266880j4Y;
import X.InterfaceC1271470jBx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.params.RtmpCacheConfig;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S1102100_20 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public long j4;
    public Object l1;
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
        int i = this.i2;
        int i2 = 1;
        if (i == 1) {
            AVLog.iod("VideoCatcher", "Video encoder created");
            return;
        }
        if (i != 2) {
            if (i == 5) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Video encoder format changed: code1 ");
                sbLIZ.append(this.i2);
                sbLIZ.append(", code2 ");
                sbLIZ.append(this.i3);
                sbLIZ.append(", code3 ");
                sbLIZ.append(this.j4);
                sbLIZ.append(", msg \"");
                sbLIZ.append(this.s0);
                sbLIZ.append("\"");
                AVLog.iow("VideoCatcher", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        C1271450jBv c1271450jBv = (C1271450jBv) this.l1;
        String string = c1271450jBv.LLIZLLLIL.getString("video_type");
        if (c1271450jBv.LLILLL != null) {
            String string2 = c1271450jBv.LLIZLLLIL.getString("video_type");
            int i3 = c1271450jBv.LLIZLLLIL.getInt("video_profileLevel");
            if (!c1271450jBv.LLIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Video encoder(");
                sbLIZ2.append(string);
                sbLIZ2.append(") created failed");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                AVLog.ioe("VideoCatcher", strLIZIZ);
                InterfaceC1271470jBx interfaceC1271470jBx = c1271450jBv.LLJJIJIIJIL;
                if (interfaceC1271470jBx != null) {
                    interfaceC1271470jBx.onError(-4, strLIZIZ);
                    return;
                }
                return;
            }
            if (i3 == 1) {
                c1271450jBv.LLIZ = false;
                string2 = "video/bytevc0";
                i2 = 3;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Video encoder switch to ");
            sbLIZ3.append(string2);
            sbLIZ3.append(", hardware ");
            sbLIZ3.append(c1271450jBv.LLIZ);
            sbLIZ3.append(", profile ");
            sbLIZ3.append(i2);
            AVLog.iow("VideoCatcher", C2188811AlT.LIZIZ(sbLIZ3));
            c1271450jBv.LLIZLLLIL.setString("video_type", string2);
            c1271450jBv.LLIZLLLIL.setBool("video_enable_accelera", c1271450jBv.LLIZ);
            c1271450jBv.LLIZLLLIL.setInt("video_profileLevel", i2);
            c1271450jBv.LLILLL.setParameter(c1271450jBv.LLIZLLLIL);
        }
    }

    public final void LIZ$1() {
        JSONObject jSONObjectLIZIZ = ((C1269780j9E) this.l1).LIZIZ(this.j4);
        if (jSONObjectLIZIZ != null) {
            try {
                jSONObjectLIZIZ.put("event_key", "live_ext_shutdown").put("error_type", this.i2).put("error_code", this.i3).put("msg", this.s0);
                InterfaceC1266880j4Y interfaceC1266880j4Y = ((C1269780j9E) this.l1).LLILZIL;
                if (interfaceC1266880j4Y != null) {
                    interfaceC1266880j4Y.LIZ(jSONObjectLIZIZ);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void run$0(ARunnableS0S1102100_20 aRunnableS0S1102100_20) {
        int i;
        int i2;
        C1278740jNg c1278740jNg = (C1278740jNg) aRunnableS0S1102100_20.l1;
        long j = aRunnableS0S1102100_20.j4;
        int i3 = aRunnableS0S1102100_20.i2;
        int i4 = aRunnableS0S1102100_20.i3;
        String str = aRunnableS0S1102100_20.s0;
        c1278740jNg.getClass();
        C1C7U.LIZ("VeLiveLogService@5388.onFpsAdjust$1L");
        JSONObject jSONObjectLIZIZ = c1278740jNg.LIZIZ(null, j);
        if (jSONObjectLIZIZ != null) {
            try {
                RtmpCacheConfig rtmpCacheConfig = c1278740jNg.LLILZLL.LJI.LIZJ;
                if (rtmpCacheConfig != null && rtmpCacheConfig.LIZ()) {
                    i = rtmpCacheConfig.minVideoFps;
                    i2 = rtmpCacheConfig.maxVideoFps;
                } else {
                    i = 0;
                    i2 = 0;
                }
                jSONObjectLIZIZ.put("event_key", "fps_adjust").put("fps_beforeadjust", i3).put("fps_afteradjust", i4).put("min_fps", i).put("max_fps", i2).put("adjustment", str).put("adjust_step", Math.abs(i4 - i3));
                c1278740jNg.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("VeLiveLogService@5388.onFpsAdjust$1L");
    }

    public static final void run$1(ARunnableS0S1102100_20 aRunnableS0S1102100_20) {
        C1278740jNg c1278740jNg = (C1278740jNg) aRunnableS0S1102100_20.l1;
        long j = aRunnableS0S1102100_20.j4;
        int i = aRunnableS0S1102100_20.i2;
        int i2 = aRunnableS0S1102100_20.i3;
        String str = aRunnableS0S1102100_20.s0;
        c1278740jNg.getClass();
        C1C7U.LIZ("VeLiveLogService@5388.extError$1L");
        JSONObject jSONObjectLIZIZ = c1278740jNg.LIZIZ(null, j);
        if (jSONObjectLIZIZ != null) {
            try {
                jSONObjectLIZIZ.put("event_key", "live_ext_shutdown").put("error_type", i).put("error_code", i2).put("message", str);
                c1278740jNg.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("VeLiveLogService@5388.extError$1L");
    }

    public static final void run$2(ARunnableS0S1102100_20 aRunnableS0S1102100_20) {
        boolean zLIZ;
        C1C7U.LIZ("VideoCatcher@f6d7.onMediaEncodeStreamEvent$1");
        try {
            aRunnableS0S1102100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCatcher@f6d7.onMediaEncodeStreamEvent$1");
    }

    public static final void run$3(ARunnableS0S1102100_20 aRunnableS0S1102100_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStreamLogService@648d.extError$1");
        try {
            aRunnableS0S1102100_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStreamLogService@648d.extError$1");
    }

    public static final void run$4(ARunnableS0S1102100_20 aRunnableS0S1102100_20) {
        boolean zLIZ;
        C1C7U.LIZ("VeLiveTransportWrapper@6ba5.onRtmpFailed$1");
        try {
            ((C1278940jO0) aRunnableS0S1102100_20.l1).LIZLLL(aRunnableS0S1102100_20.i2, aRunnableS0S1102100_20.i3, aRunnableS0S1102100_20.j4, aRunnableS0S1102100_20.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VeLiveTransportWrapper@6ba5.onRtmpFailed$1");
    }

    public static final void run$5(ARunnableS0S1102100_20 aRunnableS0S1102100_20) {
        C1278760jNi c1278760jNi = (C1278760jNi) aRunnableS0S1102100_20.l1;
        int i = aRunnableS0S1102100_20.i2;
        int i2 = aRunnableS0S1102100_20.i3;
        long j = aRunnableS0S1102100_20.j4;
        String str = aRunnableS0S1102100_20.s0;
        c1278760jNi.getClass();
        C1C7U.LIZ("VeLiveMediaStreamWrapper@344b.onMediaEncodeStreamEvent$1L");
        c1278760jNi.onMediaEncodeStreamEvent(i, i2, j, str);
        C1C7U.LIZIZ("VeLiveMediaStreamWrapper@344b.onMediaEncodeStreamEvent$1L");
    }

    public static final void run$6(ARunnableS0S1102100_20 aRunnableS0S1102100_20) {
        C1278940jO0 c1278940jO0 = (C1278940jO0) aRunnableS0S1102100_20.l1;
        int i = aRunnableS0S1102100_20.i2;
        int i2 = aRunnableS0S1102100_20.i3;
        long j = aRunnableS0S1102100_20.j4;
        String str = aRunnableS0S1102100_20.s0;
        c1278940jO0.getClass();
        C1C7U.LIZ("VeLiveTransportWrapper@6ba5.onTransportEvent$1L");
        c1278940jO0.LJ(i, i2, j, str);
        C1C7U.LIZIZ("VeLiveTransportWrapper@6ba5.onTransportEvent$1L");
    }

    public ARunnableS0S1102100_20(C1278940jO0 c1278940jO0, int i, int i2, long j, String str, int i3) {
        this.$t = i3;
        if (4 - i3 != 0) {
            this.l1 = c1278940jO0;
            this.i2 = i;
            this.i3 = i2;
            this.j4 = j;
            this.s0 = str;
            return;
        }
        this.l1 = c1278940jO0;
        this.i2 = i;
        this.i3 = i2;
        this.j4 = j;
        this.s0 = str;
    }

    public ARunnableS0S1102100_20(Object obj, long j, int i, int i2, String str, int i3) {
        this.$t = i3;
        this.l1 = obj;
        this.j4 = j;
        this.i2 = i;
        this.i3 = i2;
        this.s0 = str;
    }
}
