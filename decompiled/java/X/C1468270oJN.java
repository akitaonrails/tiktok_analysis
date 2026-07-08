package X;

import Y.ARunnableS123S0100000_23;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468270oJN {
    public float LIZ;
    public boolean LIZIZ;
    public C1468180oJE LJ;
    public int LIZJ = Integer.MIN_VALUE;
    public final ReentrantLock LJFF = new ReentrantLock();
    public C1468970oKV LIZLLL = new C1468970oKV();

    public final void LIZ() {
        this.LIZLLL.getClass();
        this.LIZLLL.getClass();
        Map map = this.LJ.LJJJJLL;
        if (map != null) {
            Map map2 = (Map) ((HashMap) map).get("fileKey");
            ArrayList arrayList = new ArrayList();
            if (map2 != null) {
                for (String str : map2.values()) {
                    if (str.equals("") || str.equals(CardStruct.IStatusCode.DEFAULT)) {
                        return;
                    } else {
                        arrayList.add(str);
                    }
                }
            }
            int i = 0;
            while (i < arrayList.size()) {
                String str2 = (String) ListProtector.get(arrayList, i);
                i++;
                for (int i2 = i; i2 < arrayList.size(); i2++) {
                    if (str2.equals(ListProtector.get(arrayList, i2))) {
                        return;
                    }
                }
            }
            this.LIZLLL.LIZ = System.currentTimeMillis();
            C1468970oKV c1468970oKV = this.LIZLLL;
            c1468970oKV.LIZJ = this.LIZJ;
            C1468180oJE c1468180oJE = this.LJ;
            if (c1468180oJE != null) {
                c1468970oKV.LIZIZ = Integer.MIN_VALUE;
                c1468970oKV.LJJIJLIJ = c1468180oJE.LJJLIIIJLLLLLLLZ;
                c1468970oKV.LJJIL = 0;
                c1468970oKV.LJJIIZI = c1468180oJE.LJIILL;
                c1468970oKV.LJJIJ = c1468180oJE.LJJI;
                c1468970oKV.LJJIJL = c1468180oJE.LJJIJLIJ;
                Map map3 = c1468180oJE.LJJJJLL;
                if (map3 != null) {
                    HashMap map4 = (HashMap) map3;
                    if (map4.get("bitrateMapTable") != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : ((Map) map4.get("bitrateMapTable")).entrySet()) {
                                jSONObject.put(((Integer) entry.getKey()).toString(), entry.getValue());
                            }
                            this.LIZLLL.LJJIJIL = jSONObject;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    HashMap map5 = (HashMap) map3;
                    if (map5.get("video_bitrate") != null) {
                        Iterator it2 = ((ArrayList) map5.get("video_bitrate")).iterator();
                        while (it2.hasNext()) {
                            this.LIZLLL.LJJIJIIJI.add((Integer) it2.next());
                        }
                    }
                    HashMap map6 = (HashMap) map3;
                    if (map6.get("audio_bitrate") != null) {
                        Iterator it3 = ((ArrayList) map6.get("audio_bitrate")).iterator();
                        while (it3.hasNext()) {
                            this.LIZLLL.LJJIJIIJIL.add((Integer) it3.next());
                        }
                    }
                }
            }
            final C1468970oKV c1468970oKV2 = this.LIZLLL;
            EngineThreadPool.addExecuteTask(new Runnable(this, c1468970oKV2) { // from class: X.0oKU
                public final C1468270oJN LL;
                public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
                public final C1468970oKV LLILLL;

                public final void LIZ() {
                    if (this.LL == null) {
                        return;
                    }
                    C1468970oKV c1468970oKV3 = this.LLILLL;
                    HashMap map7 = new HashMap();
                    C799510VXx.LIZJ(c1468970oKV3.LIZ, "local_time_ms", map7);
                    C799510VXx.LIZIZ(c1468970oKV3.LIZIZ, "is_abr", map7);
                    C799510VXx.LJ("vtype", c1468970oKV3.LJJIJL, map7);
                    C799510VXx.LIZIZ(c1468970oKV3.LIZJ, "sample_interval", map7);
                    C799510VXx.LIZIZ(0, "video_sample_count", map7);
                    C799510VXx.LJFF("video_sample_interval", c1468970oKV3.LIZLLL, map7);
                    C799510VXx.LJFF("video_network_speed_sampling_set", c1468970oKV3.LJ, map7);
                    C799510VXx.LJFF("video_network_speed_sampling_load_types", c1468970oKV3.LJFF, map7);
                    C799510VXx.LJFF("video_network_speed_predict_set", c1468970oKV3.LJI, map7);
                    C799510VXx.LJFF("video_network_speed_predict_load_types", c1468970oKV3.LJII, map7);
                    C799510VXx.LJFF("video_play_bitrate_set", c1468970oKV3.LJIIIIZZ, map7);
                    C799510VXx.LJFF("video_download_bitrate_set", c1468970oKV3.LJIIIZ, map7);
                    C799510VXx.LJFF("video_download_size_set", c1468970oKV3.LJIIJ, map7);
                    C799510VXx.LJFF("video_download_costtime_set", c1468970oKV3.LJIIJJI, map7);
                    C799510VXx.LJFF("video_tcpInfo_rtt_set", c1468970oKV3.LJIIL, map7);
                    C799510VXx.LJFF("video_tcpInfo_lastRecvDate", c1468970oKV3.LJIILIIL, map7);
                    C799510VXx.LJFF("video_mdl_loader_type", c1468970oKV3.LJIILJJIL, map7);
                    C799510VXx.LIZIZ(0, "audio_sample_count", map7);
                    C799510VXx.LJFF("audio_sample_interval", c1468970oKV3.LJIILL, map7);
                    C799510VXx.LJFF("audio_network_speed_sampling_set", c1468970oKV3.LJIILLIIL, map7);
                    C799510VXx.LJFF("audio_network_speed_sampling_load_types", c1468970oKV3.LJIIZILJ, map7);
                    C799510VXx.LJFF("audio_network_speed_predict_set", c1468970oKV3.LJIJ, map7);
                    C799510VXx.LJFF("audio_network_speed_predict_load_types", c1468970oKV3.LJIJI, map7);
                    C799510VXx.LJFF("audio_play_bitrate_set", c1468970oKV3.LJIJJ, map7);
                    C799510VXx.LJFF("audio_download_bitrate_set", c1468970oKV3.LJIJJLI, map7);
                    C799510VXx.LJFF("audio_download_size_set", c1468970oKV3.LJIL, map7);
                    C799510VXx.LJFF("audio_download_costtime_set", c1468970oKV3.LJJ, map7);
                    C799510VXx.LJFF("audio_tcpInfo_rtt_set", c1468970oKV3.LJJI, map7);
                    C799510VXx.LJFF("audio_tcpInfo_lastRecvDate", c1468970oKV3.LJJIFFI, map7);
                    C799510VXx.LJFF("audio_mdl_loader_type", c1468970oKV3.LJJII, map7);
                    C799510VXx.LJFF("buffer_len_set", c1468970oKV3.LJJIII, map7);
                    C799510VXx.LJFF("play_speed_set", c1468970oKV3.LJJIIJ, map7);
                    C799510VXx.LJFF("play_pos_set", c1468970oKV3.LJJIIJZLJL, map7);
                    C799510VXx.LIZIZ(c1468970oKV3.LJJIIZ, "index", map7);
                    C799510VXx.LJ("player_sessionid", c1468970oKV3.LJJIIZI, map7);
                    C799510VXx.LJ("video_id", c1468970oKV3.LJJIJ, map7);
                    C799510VXx.LJFF("video_bitrate_set", c1468970oKV3.LJJIJIIJI, map7);
                    C799510VXx.LJFF("audio_bitrate_set", c1468970oKV3.LJJIJIIJIL, map7);
                    C799510VXx.LIZIZ(c1468970oKV3.LJJIJLIJ, "is_multi_dimensions", map7);
                    C799510VXx.LIZIZ(c1468970oKV3.LJJIL, "is_multi_dimensions_input", map7);
                    JSONObject jSONObject2 = new JSONObject(map7);
                    try {
                        jSONObject2.put("bitrate_map_table", c1468970oKV3.LJJIJIL);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    BPEAHandler bPEAHandler = this.LLILLJJLI;
                    if (bPEAHandler == null || bPEAHandler.getLooper() == null) {
                        C0WPS.instance.addEventV2(true, jSONObject2, "videoplayer_sample");
                    } else {
                        C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS123S0100000_23(jSONObject2, 132));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoEventSampleRecord$AsyncGetLogDataRunnable@696a.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoEventSampleRecord$AsyncGetLogDataRunnable@696a.run");
                }

                {
                    this.LL = this;
                    this.LLILLL = c1468970oKV2;
                }
            });
            this.LIZLLL = new C1468970oKV();
        }
    }

    public final void LIZIZ() {
        this.LJFF.lock();
        try {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                LIZ();
            }
            this.LJFF.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJFF.unlock();
            throw th;
        }
    }

    public C1468270oJN(C1468180oJE c1468180oJE) {
        this.LJ = c1468180oJE;
    }
}
