package Y;

import X.C1277550jLl;
import X.C1277680jLy;
import X.C1278260jMu;
import X.C1279540jOy;
import X.C1339170kx9;
import X.C1C7U;
import X.EnumC1279390jOj;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.core.LynxEngineProxy;
import com.ss.lyrax.ILyraxSubscriber;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS4S0110100_20 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
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

    public static final void run$0(ARunnableS4S0110100_20 aRunnableS4S0110100_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxEngineProxy@d809.startEventFire$1");
        try {
            LynxEngineProxy lynxEngineProxy = (LynxEngineProxy) aRunnableS4S0110100_20.l0;
            long j = lynxEngineProxy.LIZ;
            if (j == 0) {
                LynxLog.e("LynxEngineProxy", "startEventFire failed since mNativePtr is null");
            } else {
                lynxEngineProxy.nativeStartEventFire(j, aRunnableS4S0110100_20.z1, aRunnableS4S0110100_20.j2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxEngineProxy@d809.startEventFire$1");
    }

    public static final void run$1(ARunnableS4S0110100_20 aRunnableS4S0110100_20) throws JSONException {
        String str;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        Object objValueOf4;
        Object objValueOf5;
        Object objValueOf6;
        Object objValueOf7;
        Object objValueOf8;
        Object objValueOf9;
        Object objValueOf10;
        Object objValueOf11;
        Object objValueOf12;
        Object objValueOf13;
        Object objValueOf14;
        Object objValueOf15;
        Object objValueOf16;
        Object objValueOf17;
        Object objValueOf18;
        long j;
        long j2;
        long j3;
        Object objValueOf19;
        Object objValueOf20;
        C1277680jLy c1277680jLy = (C1277680jLy) aRunnableS4S0110100_20.l0;
        boolean z = aRunnableS4S0110100_20.z1;
        long j4 = aRunnableS4S0110100_20.j2;
        C1C7U.LIZ("LyraxPlayerImpl@d373.stop$1L");
        EnumC1279390jOj enumC1279390jOj = c1277680jLy.LJJIFFI;
        EnumC1279390jOj enumC1279390jOj2 = EnumC1279390jOj.STOPPED;
        if (enumC1279390jOj != enumC1279390jOj2) {
            C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
            if (c1279540jOy != null) {
                C1339170kx9 c1339170kx9 = c1279540jOy.LJJJJJL;
                if (c1339170kx9 != null) {
                    c1339170kx9.cancel();
                }
                c1279540jOy.LJJJJJL = null;
                if (!c1279540jOy.LJJIIJ && c1279540jOy.LJI && c1279540jOy.LJJIIZ) {
                    c1279540jOy.LJIILJJIL = c1279540jOy.LJIJI;
                    c1279540jOy.LJJIIJ = true;
                }
                if (!c1279540jOy.LJJIIJZLJL && !c1279540jOy.LIZLLL) {
                    c1279540jOy.LJIIIIZZ();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j5 = c1279540jOy.LJJJJI;
                if (j5 > 0) {
                    long j6 = jCurrentTimeMillis - j5;
                    if (j6 > 200) {
                        c1279540jOy.LJJJ++;
                        c1279540jOy.LJJJI += j6;
                    }
                }
                long j7 = c1279540jOy.LJJJJIZL;
                if (j7 > 0) {
                    long j8 = jCurrentTimeMillis - j7;
                    if (j8 > 200) {
                        c1279540jOy.LJJJIL++;
                        c1279540jOy.LJJJJ += j8;
                    }
                }
                c1279540jOy.LJIIJJI(j4);
                JSONObject jSONObjectPut = new JSONObject().put("event_key", "lyrax_play_stop");
                if (z) {
                    str = "player_end";
                } else {
                    str = "player_switch";
                }
                JSONObject jSONObjectPut2 = jSONObjectPut.put("stop_type", str).put("is_stream_received", c1279540jOy.LJJIIJ ? 1 : 0).put("is_video_first_frame_received", c1279540jOy.LJJIIJZLJL ? 1 : 0).put("is_audio_first_frame_received", c1279540jOy.LJJIIZ ? 1 : 0);
                long j9 = c1279540jOy.LJIJI;
                if (j9 != 0) {
                    objValueOf = Long.valueOf(j9 - c1279540jOy.LJIILIIL);
                } else {
                    objValueOf = -1;
                }
                JSONObject jSONObjectPut3 = jSONObjectPut2.put("first_audio_frame_decoded_time", objValueOf);
                long j10 = c1279540jOy.LJIJ;
                if (j10 != 0) {
                    objValueOf2 = Long.valueOf(j10 - c1279540jOy.LJIILIIL);
                } else {
                    objValueOf2 = -1;
                }
                JSONObject jSONObjectPut4 = jSONObjectPut3.put("first_video_frame_render_time", objValueOf2);
                long j11 = c1279540jOy.LJIJ;
                if (j11 != 0) {
                    objValueOf3 = Long.valueOf(j11);
                } else {
                    objValueOf3 = -1;
                }
                JSONObject jSONObjectPut5 = jSONObjectPut4.put("first_video_frame_render_timestamp", objValueOf3);
                if (c1279540jOy.LJJIIJ) {
                    objValueOf4 = Long.valueOf(c1279540jOy.LJIILJJIL - c1279540jOy.LJIILIIL);
                } else {
                    objValueOf4 = -1;
                }
                JSONObject jSONObjectPut6 = jSONObjectPut5.put("first_frame_view", objValueOf4);
                if (!c1279540jOy.LJJIIJ) {
                    objValueOf5 = Long.valueOf(j4 - c1279540jOy.LJIILIIL);
                } else {
                    objValueOf5 = -1;
                }
                JSONObject jSONObjectPut7 = jSONObjectPut6.put("play_time_on_no_frame", objValueOf5);
                long j12 = c1279540jOy.LJIILL;
                if (j12 != 0) {
                    objValueOf6 = Long.valueOf(j12 - c1279540jOy.LJIILIIL);
                } else {
                    objValueOf6 = -1;
                }
                JSONObject jSONObjectPut8 = jSONObjectPut7.put("first_video_frame_demux_time", objValueOf6);
                long j13 = c1279540jOy.LJIILL;
                if (j13 != 0) {
                    objValueOf7 = Long.valueOf(j13);
                } else {
                    objValueOf7 = -1;
                }
                JSONObject jSONObjectPut9 = jSONObjectPut8.put("first_video_frame_demux_timestamp", objValueOf7);
                long j14 = c1279540jOy.LJIILLIIL;
                if (j14 != 0) {
                    objValueOf8 = Long.valueOf(j14);
                } else {
                    objValueOf8 = -1;
                }
                JSONObject jSONObjectPut10 = jSONObjectPut9.put("first_video_packet_received_timestamp", objValueOf8);
                long j15 = c1279540jOy.LJIIZILJ;
                if (j15 != 0) {
                    objValueOf9 = Long.valueOf(j15 - c1279540jOy.LJIILIIL);
                } else {
                    objValueOf9 = -1;
                }
                JSONObject jSONObjectPut11 = jSONObjectPut10.put("first_video_frame_decoded_time", objValueOf9);
                long j16 = c1279540jOy.LJIIZILJ;
                if (j16 != 0) {
                    objValueOf10 = Long.valueOf(j16);
                } else {
                    objValueOf10 = -1;
                }
                JSONObject jSONObjectPut12 = jSONObjectPut11.put("first_video_frame_decoded_timestamp", objValueOf10);
                long j17 = c1279540jOy.LJIJJ;
                if (j17 != 0) {
                    objValueOf11 = Long.valueOf(j17);
                } else {
                    objValueOf11 = -1;
                }
                JSONObject jSONObjectPut13 = jSONObjectPut12.put("subscribe_success_timestamp", objValueOf11);
                long j18 = c1279540jOy.LJIJJLI;
                if (j18 != 0) {
                    objValueOf12 = Long.valueOf(j18);
                } else {
                    objValueOf12 = -1;
                }
                JSONObject jSONObjectPut14 = jSONObjectPut13.put("subscribe_signaling_send_timestamp", objValueOf12);
                long j19 = c1279540jOy.LJIL;
                if (j19 != 0) {
                    objValueOf13 = Long.valueOf(j19);
                } else {
                    objValueOf13 = -1;
                }
                JSONObject jSONObjectPut15 = jSONObjectPut14.put("prepare_start_timestamp", objValueOf13);
                long j20 = c1279540jOy.LJJ;
                if (j20 != 0) {
                    objValueOf14 = Long.valueOf(j20);
                } else {
                    objValueOf14 = -1;
                }
                JSONObject jSONObjectPut16 = jSONObjectPut15.put("prepare_start_ts", objValueOf14);
                long j21 = c1279540jOy.LJJI;
                if (j21 != 0) {
                    objValueOf15 = Long.valueOf(j21);
                } else {
                    objValueOf15 = -1;
                }
                JSONObject jSONObjectPut17 = jSONObjectPut16.put("prepare_end_timestamp", objValueOf15);
                long j22 = c1279540jOy.LJJIFFI;
                if (j22 != 0) {
                    objValueOf16 = Long.valueOf(j22);
                } else {
                    objValueOf16 = -1;
                }
                JSONObject jSONObjectPut18 = jSONObjectPut17.put("lyrax_engine_create_start_timestamp", objValueOf16);
                long j23 = c1279540jOy.LJJII;
                if (j23 != 0) {
                    objValueOf17 = Long.valueOf(j23);
                } else {
                    objValueOf17 = -1;
                }
                JSONObject jSONObjectPut19 = jSONObjectPut18.put("lyrax_engine_create_end_timestamp", objValueOf17);
                long j24 = c1279540jOy.LJJIII;
                if (j24 != 0) {
                    objValueOf18 = Long.valueOf(j24);
                } else {
                    objValueOf18 = -1;
                }
                JSONObject jSONObjectPut20 = jSONObjectPut19.put("connected_timestamp", objValueOf18).put("init_code", c1279540jOy.LJJZZI).put("subscribe_code", c1279540jOy.LJJZZIII).put("decode_code", c1279540jOy.LJL).put("render_code", c1279540jOy.LJLI);
                C1278260jMu c1278260jMu = c1279540jOy.LIZ;
                if (c1278260jMu != null) {
                    j = c1278260jMu.LIZIZ;
                } else {
                    j = 0;
                }
                JSONObject jSONObjectPut21 = jSONObjectPut20.put("start_play_timestamp", j);
                C1278260jMu c1278260jMu2 = c1279540jOy.LIZ;
                if (c1278260jMu2 != null) {
                    j2 = c1278260jMu2.LIZIZ;
                } else {
                    j2 = 0;
                }
                c1279540jOy.LJII(jSONObjectPut21.put("start", j2).put("stream_id", c1279540jOy.LJIIJJI).put("network_type", c1279540jOy.LJIIL).put("codec_type", c1279540jOy.LJJLIIIJJIZ).put("is_hardware_codec", c1279540jOy.LJJLIIIJLJLI).put("current_width", c1279540jOy.LJJLIIJ).put("current_height", c1279540jOy.LJJLIL).put("real_video_framerate", c1279540jOy.LJJLIIIJLLLLLLLZ).put("lyrax_first_frame_status", c1279540jOy.LJLIIIL));
                C1278260jMu c1278260jMu3 = c1279540jOy.LIZ;
                if (c1278260jMu3 == null || c1278260jMu3.LIZJ != 0) {
                    c1279540jOy.LJIIIZ();
                }
                if (z) {
                    int i = 1;
                    JSONObject jSONObjectPut22 = new JSONObject().put("event_key", "play_stop").put("is_low_latency_used", 1);
                    C1278260jMu c1278260jMu4 = c1279540jOy.LIZ;
                    if (c1278260jMu4 != null) {
                        j3 = c1278260jMu4.LIZIZ;
                    } else {
                        j3 = 0;
                    }
                    JSONObject jSONObjectPut23 = jSONObjectPut22.put("start", j3);
                    C1278260jMu c1278260jMu5 = c1279540jOy.LIZ;
                    if (c1278260jMu5 == null || c1278260jMu5.LIZJ != 0) {
                        i = 0;
                    }
                    JSONObject jSONObjectPut24 = jSONObjectPut23.put("is_stream_received", i ^ 1);
                    C1278260jMu c1278260jMu6 = c1279540jOy.LIZ;
                    if (c1278260jMu6 != null) {
                        if (c1278260jMu6.LIZJ == 0) {
                            objValueOf19 = 0L;
                        } else {
                            objValueOf19 = Long.valueOf(c1278260jMu6.LIZJ);
                        }
                    } else {
                        objValueOf19 = null;
                    }
                    JSONObject jSONObjectPut25 = jSONObjectPut24.put("first_frame_render_end", objValueOf19);
                    long j25 = c1279540jOy.LJJ;
                    if (j25 != 0) {
                        objValueOf20 = Long.valueOf(j25);
                    } else {
                        objValueOf20 = -1;
                    }
                    c1279540jOy.LJII(jSONObjectPut25.put("prepare_start_ts", objValueOf20));
                }
            }
            ILyraxSubscriber iLyraxSubscriber = c1277680jLy.LIZ;
            if (iLyraxSubscriber != null) {
                iLyraxSubscriber.removeVideoFrameSink(c1277680jLy.LJ);
            }
            ILyraxSubscriber iLyraxSubscriber2 = c1277680jLy.LIZ;
            if (iLyraxSubscriber2 != null) {
                iLyraxSubscriber2.unsubscribe();
            }
            C1277550jLl c1277550jLl = c1277680jLy.LJ;
            if (c1277550jLl != null) {
                c1277550jLl.LIZJ();
            }
            c1277680jLy.LJ = null;
            c1277680jLy.LJJIFFI = enumC1279390jOj2;
        }
        C1C7U.LIZIZ("LyraxPlayerImpl@d373.stop$1L");
    }

    public ARunnableS4S0110100_20(Object obj, boolean z, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
        this.j2 = j;
    }
}
