package X;

import Y.ACallableS425S0100000_20;
import Y.ARunnableS0S0102100_20;
import Y.ARunnableS0S1102100_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS1S0101200_20;
import Y.ARunnableS4S0101100_20;
import Y.ARunnableS4S1101100_20;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.pusher.core.engine.AdaptiveController;
import com.ss.pusher.core.engine.MediaEncodeStream;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.NodeOptParams;
import com.ss.pusher.core.params.SwitchParams;
import com.ss.pusher.core.statics.StaticsReport;
import com.ss.pusher.core.transport.LibRTMPTransport;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1278770jNj extends C1278950jO1 {
    public final WeakReference<C1278740jNg> LIZ;
    public final C1277590jLp LIZIZ;
    public final C1278910jNx LIZJ;
    public final C1278990jO5 LIZLLL;
    public final C1278990jO5 LJ;
    public final C1279070jOD LJIIIZ;
    public final C1278880jNu LJIIJ;
    public final C1279050jOB LJIIJJI;
    public final boolean LJIJJLI;
    public int LJJ;
    public long LJJI;
    public long LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public long LJJIIZ;
    public final StringBuffer LJFF = new StringBuffer();
    public final StringBuffer LJI = new StringBuffer();
    public final StringBuffer LJII = new StringBuffer();
    public final StringBuffer LJIIIIZZ = new StringBuffer();
    public long LJIIL = 0;
    public long LJIILIIL = 0;
    public int LJIILJJIL = 200;
    public int LJIILL = 0;
    public boolean LJIILLIIL = false;
    public String LJIIZILJ = "";
    public long LJIJ = 0;
    public int LJIJI = 0;
    public long LJIJJ = -1;
    public EnumC1278980jO4 LJIL = EnumC1278980jO4.Unknown;
    public int LJJIIZI = 0;
    public long LJJIJ = -1;

    @Override // X.C1278950jO1
    public final void LJJIIJZLJL() {
        this.LJJ = 1 | this.LJJ;
    }

    @Override // X.C1278950jO1
    public final void LJIJ() {
        C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            C1278770jNj c1278770jNj = c1278740jNg.LLJI;
            c1278770jNj.LJJIIZ = 0L;
            c1278770jNj.LJJIIJ = 0;
            c1278770jNj.LJJIIJZLJL = 0;
            c1278770jNj.LJJI = 0L;
            c1278770jNj.LJJIFFI = 0L;
            c1278770jNj.LJJIJ = -1L;
            c1278770jNj.LJIIL = 0L;
            c1278770jNj.LJIJ = 0L;
            c1278770jNj.LJJIIZI = 0;
            c1278770jNj.LJIILJJIL = 200;
            c1278770jNj.LJIILL = 0;
            c1278770jNj.LJIILLIIL = false;
            c1278770jNj.LJIJI = 0;
            c1278770jNj.LJIL = EnumC1278980jO4.Unknown;
            c1278740jNg.LLILZIL.removeMessages(101);
            C786410Ut5.LJLJJI(101, c1278740jNg.LLILLJJLI, c1278740jNg.LLILZIL);
        }
        getClass();
    }

    @Override // X.C1278950jO1
    public final void LJIJI() {
        C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            c1278740jNg.LLILZIL.removeMessages(101);
        }
        getClass();
    }

    @Override // X.C1278950jO1
    public final void LJIJJ() {
        getClass();
    }

    @Override // X.C1278950jO1
    public final void LJJ() {
        C1278880jNu c1278880jNu = this.LJIIJ;
        if (c1278880jNu.LJII) {
            c1278880jNu.LJII = false;
            c1278880jNu.LJI = System.currentTimeMillis();
            C786410Ut5.LJLIIL(((long) c1278880jNu.LIZJ) * 1000, c1278880jNu.LIZ.LIZ, c1278880jNu.LIZIZ);
        }
    }

    @Override // X.C1278950jO1
    public final void LJJI() {
        C1278880jNu c1278880jNu = this.LJIIJ;
        if (c1278880jNu.LJII) {
            return;
        }
        c1278880jNu.LJFF = 1;
        c1278880jNu.LIZ.LIZ.removeCallbacks(c1278880jNu.LIZIZ);
        c1278880jNu.LIZ();
        c1278880jNu.LJ = -1;
        c1278880jNu.LJFF = 0;
        c1278880jNu.LJII = true;
    }

    public final boolean LJJIJIL() {
        LiveSdkSetting liveSdkSetting = this.LIZIZ.LJI;
        if (liveSdkSetting.LIZJ.enableReportStallLog > 0) {
            return true;
        }
        liveSdkSetting.mPushBase.getClass();
        return false;
    }

    @Override // X.C1278950jO1
    public final long LIZIZ() {
        return System.currentTimeMillis() - this.LJIILIIL;
    }

    @Override // X.C1278950jO1
    public final void LJIIL() {
        this.LJIIL = System.currentTimeMillis();
    }

    @Override // X.C1278950jO1
    public final void LIZJ(String str) {
        StringBuffer stringBuffer = this.LJFF;
        stringBuffer.append(str);
        stringBuffer.append("\n");
    }

    @Override // X.C1278950jO1
    public final void LIZLLL(String str) {
        StringBuffer stringBuffer = this.LJFF;
        stringBuffer.append(str);
        stringBuffer.append("\n");
    }

    @Override // X.C1278950jO1
    public final void LJII(String str) {
        StringBuffer stringBuffer = this.LJFF;
        stringBuffer.append(str);
        stringBuffer.append("\n");
    }

    @Override // X.C1278950jO1
    public final void LJIIIIZZ(final int i) {
        long j;
        float f;
        AdaptiveController adaptiveControllerLIZ;
        if (this.LJIILIIL == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (LJJIJIL() && this.LJIJ == 0) {
            this.LJIJ = jCurrentTimeMillis;
        }
        final C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            final int i2 = this.LJIILJJIL;
            final int i3 = this.LJIILL;
            final boolean z = this.LJIILLIIL;
            final long j2 = this.LJIILIIL;
            final long j3 = c1278740jNg.LLILZ;
            if (j3 == 0) {
                f = 0.0f;
            } else {
                f = (0 * 1.0f) / j3;
            }
            final long jCurrentTimeMillis2 = System.currentTimeMillis();
            String str = "";
            SwitchParams switchParams = c1278740jNg.LLIZLLLIL;
            if (switchParams.LIZ) {
                if (switchParams.LJFF) {
                    synchronized (c1278740jNg.LLJ) {
                        try {
                            adaptiveControllerLIZ = c1278740jNg.LLJ.LIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                } else {
                    adaptiveControllerLIZ = c1278740jNg.LLJ.LIZ();
                }
                if (adaptiveControllerLIZ != null) {
                    str = (String) C1283060jUe.LIZ(adaptiveControllerLIZ.LIZLLL, new ACallableS425S0100000_20(adaptiveControllerLIZ, 8));
                }
            }
            final String str2 = str;
            final float f2 = f;
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new Runnable() { // from class: X.0jNp
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    C1278740jNg c1278740jNg2 = c1278740jNg;
                    long j4 = jCurrentTimeMillis2;
                    int i4 = i;
                    int i5 = i3;
                    int i6 = i2;
                    boolean z2 = z;
                    long j5 = j2;
                    long j6 = j3;
                    float f3 = f2;
                    String str3 = str2;
                    c1278740jNg2.getClass();
                    C1C7U.LIZ("VeLiveLogService@5388.onRTMPConnectEnd$1L");
                    JSONObject jSONObjectLIZIZ = c1278740jNg2.LIZIZ(null, j4);
                    if (jSONObjectLIZIZ != null) {
                        try {
                            jSONObjectLIZIZ.put("event_key", "connect_end").put("state", i4).put("reconnect_count", i5).put("error_code", i6).put("error_count", i5).put("first_connect", z2).put("push_duration", j4 - j5).put("push_stream_count", j6).put("encode_0fps_ratio", f3).put("width", c1278740jNg2.LLIZ.width).put("height", c1278740jNg2.LLIZ.height);
                            if (!TextUtils.isEmpty(str3)) {
                                jSONObjectLIZIZ.put("strategy_levels_duration", new JSONObject(str3));
                            }
                            JSONObject jSONObject = new JSONObject();
                            c1278740jNg2.LLJI.LJJIJ(jSONObjectLIZIZ);
                            c1278740jNg2.LIZ(jSONObjectLIZIZ);
                            if (jSONObject.length() > 0) {
                                jSONObjectLIZIZ.put("message", jSONObject);
                            }
                            c1278740jNg2.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        c1278740jNg2.LLILZ = 0L;
                    }
                    C1C7U.LIZIZ("VeLiveLogService@5388.onRTMPConnectEnd$1L");
                }
            });
            j = 0;
        } else {
            j = 0;
        }
        this.LJIILIIL = j;
        this.LJIILJJIL = 200;
        this.LJIILL = 0;
        this.LJIILLIIL = false;
    }

    @Override // X.C1278950jO1
    public final void LJIIJ(final int i) {
        final C1278740jNg c1278740jNg = this.LIZ.get();
        C1279070jOD c1279070jOD = this.LJIIIZ;
        final C1279040jOA c1279040jOA = c1279070jOD.LIZ;
        final C1279080jOE c1279080jOE = c1279070jOD.LIZIZ;
        if (c1278740jNg != null && c1279040jOA != null && c1279080jOE != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new Runnable() { // from class: X.0jO3
                @Override // java.lang.Runnable
                public final void run() {
                    C1278740jNg c1278740jNg2 = c1278740jNg;
                    long j = jCurrentTimeMillis;
                    C1279040jOA c1279040jOA2 = c1279040jOA;
                    C1279080jOE c1279080jOE2 = c1279080jOE;
                    int i2 = i;
                    c1278740jNg2.getClass();
                    C1C7U.LIZ("VeLiveLogService@5388.onRTMPConnectResult$1L");
                    JSONObject jSONObjectLIZIZ = c1278740jNg2.LIZIZ(null, j);
                    if (jSONObjectLIZIZ != null) {
                        try {
                            jSONObjectLIZIZ.put("event_key", "connect_result").put("scene_code", c1279040jOA2.LIZJ).put("connect_success", c1279080jOE2.LIZ).put("has_first_connected", i2).put("retry_cnt", c1279080jOE2.LIZIZ).put("stream_retry_cnt", c1279080jOE2.LIZJ).put("rtmp_code1", c1279040jOA2.LIZLLL).put("rtmp_code2", c1279040jOA2.LJ).put("rtmp_code3", c1279040jOA2.LJFF).put("rtmp_msg", c1279040jOA2.LJI);
                            c1278740jNg2.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    C1C7U.LIZIZ("VeLiveLogService@5388.onRTMPConnectResult$1L");
                }
            });
        }
    }

    @Override // X.C1278950jO1
    public final void LJIILIIL(String str) {
        StringBuffer stringBuffer = this.LJFF;
        stringBuffer.append(str);
        stringBuffer.append("\n");
    }

    @Override // X.C1278950jO1
    public final void LJIILJJIL(String str) {
        StringBuffer stringBuffer = this.LJIIIIZZ;
        stringBuffer.append(str);
        stringBuffer.append("\n");
    }

    @Override // X.C1278950jO1
    public final void LJIIZILJ(int i) {
        this.LJIJI++;
        C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new ARunnableS4S0101100_20(c1278740jNg, System.currentTimeMillis(), i, 0));
        }
    }

    @Override // X.C1278950jO1
    public final void LJJIIZ(long j) {
        this.LJJIJ = j;
    }

    public final void LJJIIZI(JSONObject jSONObject) throws JSONException {
        String strLIZ;
        String strLIZJ;
        Object objLIZIZ;
        C1278820jNo c1278820jNo = (C1278820jNo) this.LIZJ.LJI();
        Object objLIZLLL = "";
        if (c1278820jNo == null) {
            strLIZ = "";
        } else {
            strLIZ = c1278820jNo.LIZ();
        }
        C1278820jNo c1278820jNo2 = (C1278820jNo) this.LIZJ.LJI();
        if (c1278820jNo2 == null) {
            strLIZJ = "";
        } else {
            strLIZJ = c1278820jNo2.LIZJ();
        }
        if (!TextUtils.isEmpty(strLIZJ)) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZJ);
                sbLIZ.append(strLIZ.substring(strLIZ.lastIndexOf(47) + 1));
                objLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                objLIZIZ = strLIZ;
            }
        } else {
            objLIZIZ = strLIZ;
        }
        JSONObject jSONObjectPut = jSONObject.put("url", objLIZIZ).put("publish_url", strLIZ).put("cdn_ip", this.LJIIZILJ);
        EnumC1269800j9G enumC1269800j9G = EnumC1269800j9G.url;
        int i = 0;
        if (EnumC1269800j9G.CheckMask(0, enumC1269800j9G)) {
            objLIZIZ = null;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("url", objLIZIZ);
        if (EnumC1269800j9G.CheckMask(0, enumC1269800j9G)) {
            strLIZ = null;
        }
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("publish_url", strLIZ);
        C1283040jUc c1283040jUc = (C1283040jUc) this.LIZJ.LIZLLL();
        if (c1283040jUc != null) {
            i = c1283040jUc.LJ;
        }
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("quic_load_succ", i);
        C1278820jNo c1278820jNo3 = (C1278820jNo) this.LIZJ.LJI();
        if (c1278820jNo3 != null) {
            objLIZLLL = c1278820jNo3.LIZLLL();
        }
        jSONObjectPut4.put("live_stream_session_id", objLIZLLL);
    }

    public final void LJJIJ(JSONObject jSONObject) throws JSONException {
        C1278990jO5 c1278990jO5;
        C1278990jO5 c1278990jO52;
        jSONObject.put("rate_adjust_times", this.LJJIIJ).put("rate_adjust_up_times", this.LJJIIJZLJL).put("rate_adjust_down_times", this.LJJIIJ - this.LJJIIJZLJL).put("fps_adjust_times", this.LJJIIZI).put("send_package_slow_times", this.LJIJI).put("video_encode_error_code", this.LJJIFFI).put("audio_encode_error_code", this.LJJI);
        if (LJJIJIL() && (c1278990jO5 = this.LIZLLL) != null && (c1278990jO52 = this.LJ) != null) {
            c1278990jO52.LIZ(c1278990jO5);
            this.LJ.LIZIZ(jSONObject);
            C1278990jO5 c1278990jO53 = this.LJ;
            c1278990jO53.LIZ = 0L;
            c1278990jO53.LIZIZ = 0L;
            c1278990jO53.LIZJ = 0L;
            c1278990jO53.LIZLLL = 0L;
            c1278990jO53.LJFF = 0;
            c1278990jO53.LJI = 0;
            c1278990jO53.LJII = 0;
            c1278990jO53.LJIIIIZZ = 0;
            c1278990jO53.LJ = 0L;
            c1278990jO53.LJIIIZ = 0;
        }
    }

    public final void LJJIJIIJI(JSONObject jSONObject) throws JSONException {
        int i;
        JSONObject jSONObjectPut = jSONObject.put("sandbox_proceed_cost", this.LJJIJ);
        C1283040jUc c1283040jUc = (C1283040jUc) this.LIZJ.LIZLLL();
        int i2 = 0;
        if (c1283040jUc != null && c1283040jUc.LJFF) {
            i = 1;
        } else {
            i = 0;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("protocol_downgraded", i);
        C1283040jUc c1283040jUc2 = (C1283040jUc) this.LIZJ.LIZLLL();
        if (c1283040jUc2 != null) {
            i2 = c1283040jUc2.LJIIIZ;
        }
        jSONObjectPut2.put("protocol_downgraded_type", i2);
    }

    public final void LJJIJIIJIL(JSONObject jSONObject) {
        Object obj;
        boolean z;
        WeakReference<Object> weakReference = this.LIZJ.LJIILIIL;
        if (weakReference == null || (obj = weakReference.get()) == null) {
            obj = null;
        }
        C1278800jNm c1278800jNm = (C1278800jNm) obj;
        C1278820jNo c1278820jNo = (C1278820jNo) this.LIZJ.LJI();
        NodeOptParams nodeOptParams = this.LIZIZ.LJI.nodeOpt;
        if (c1278800jNm != null && c1278820jNo != null && nodeOptParams != null) {
            boolean z2 = nodeOptParams.preparedIp;
            boolean z3 = nodeOptParams.strategyNodeOpt;
            String str = "";
            String str2 = "";
            if (c1278800jNm.LJIIJ) {
                z = c1278800jNm.LJIIJJI;
                str = c1278800jNm.LJIIL;
                synchronized (c1278800jNm) {
                }
                str2 = "";
            } else {
                z = false;
            }
            if (c1278800jNm.LJII) {
                c1278800jNm.LJII = false;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    for (String str3 : c1278800jNm.LJI.keySet()) {
                        List<String> list = c1278800jNm.LJI.get(str3);
                        if (list != null && !list.isEmpty()) {
                            JSONArray jSONArray = new JSONArray();
                            Iterator<String> it2 = list.iterator();
                            while (it2.hasNext()) {
                                jSONArray.put(it2.next());
                            }
                            jSONObject2.put(str3, list);
                        }
                    }
                    c1278800jNm.LJIIIIZZ = jSONObject2;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            JSONObject jSONObject3 = c1278800jNm.LJIIIIZZ;
            if (SystemClock.elapsedRealtime() - c1278820jNo.LJII >= 300000) {
                C786410Ut5.LJJZZIII(c1278820jNo.LIZIZ.LIZIZ, new ARunnableS120S0100000_20(c1278820jNo, 470));
            }
            try {
                jSONObject.put("node_optimize_info", new JSONObject().put("hit_node_optimize", z).put("suggest_ip_scene_code", c1278800jNm.LIZ).put("evaluator_symbol", str).put("enable_node_probe_poll", z2).put("node_probe_ips", C786410Ut5.J3(jSONObject3)).put("enable_strategy_node_opt", z3).put("request_id", str2).put("dns_server_ip", c1278820jNo.LJIIIIZZ).put("strategy_node_optimizer_infos", (Object) null));
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // X.C1278950jO1
    public final boolean LIZ(StaticsReport staticsReport, C1278870jNt c1278870jNt) {
        MediaEncodeStream mediaEncodeStream;
        boolean zLIZIZ;
        LibRTMPTransport libRTMPTransport;
        C1278760jNi c1278760jNiLIZIZ = this.LIZJ.LIZIZ();
        if (c1278760jNiLIZIZ != null) {
            mediaEncodeStream = c1278760jNiLIZIZ.LLJILLL;
        } else {
            mediaEncodeStream = null;
        }
        boolean z = false;
        if (mediaEncodeStream != null) {
            zLIZIZ = mediaEncodeStream.LIZIZ(staticsReport);
            c1278870jNt.LIZ = staticsReport.getDouble("estream_venc_real_fps");
            c1278870jNt.LIZIZ = staticsReport.getDouble("estream_send_encode_fps");
            c1278870jNt.LIZJ = staticsReport.getDouble("estream_transport_real_fps");
            c1278870jNt.LJFF = staticsReport.getDouble("estream_venc_real_bps");
            c1278870jNt.LJI = staticsReport.getDouble("estream_transport_real_bps");
            c1278870jNt.LJII = staticsReport.getDouble("estream_aenc_real_bps");
            c1278870jNt.LJIIJ = (int) staticsReport.getDouble("estream_video_drop_count");
            c1278870jNt.LJIIJJI = (int) staticsReport.getDouble("estream_transport_video_drop_count");
            c1278870jNt.LJIIL = (int) staticsReport.getDouble("estream_transport_duration");
            c1278870jNt.LJIILIIL = staticsReport.getDouble("estream_transport_package_delay");
            c1278870jNt.LJIIZILJ = staticsReport.getInt("estream_video_enc_psnr_key_frame");
            c1278870jNt.LJIJ = staticsReport.getInt("estream_video_enc_psnr_no_key_frame");
            staticsReport.getInt("estream_audio_stream_db");
            c1278870jNt.LJIIIIZZ = staticsReport.getInt("estream_real_video_gop");
        } else {
            zLIZIZ = false;
        }
        C1278940jO0 c1278940jO0 = (C1278940jO0) this.LIZJ.LJFF();
        if (c1278940jO0 != null) {
            if (zLIZIZ && (libRTMPTransport = c1278940jO0.LJIIL) != null && libRTMPTransport.getStaticsReport(staticsReport)) {
                z = true;
            }
            c1278870jNt.LJIILL = (int) c1278940jO0.LIZIZ(1);
            c1278870jNt.LJIILLIIL = (int) c1278940jO0.LIZIZ(1001);
            c1278870jNt.LJIJI = c1278940jO0.LIZIZ(3);
            c1278870jNt.LJIJJ = c1278940jO0.LIZIZ(4);
            c1278870jNt.LJIJJLI = c1278940jO0.LIZIZ(10);
            C1278820jNo c1278820jNo = (C1278820jNo) this.LIZJ.LJI();
            if (c1278820jNo != null) {
                c1278820jNo.LIZ();
            }
            c1278870jNt.LJIILJJIL = this.LJIL;
            return z;
        }
        return zLIZIZ;
    }

    @Override // X.C1278950jO1
    public final void LJ(int i, int i2) {
        C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new ARunnableS0S0102100_20(c1278740jNg, System.currentTimeMillis(), i2, i, 0));
        }
    }

    @Override // X.C1278950jO1
    public final void LJFF(int i, String str) {
        this.LJIILJJIL = i;
        this.LJIIJ.LJ = i;
        C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new ARunnableS4S1101100_20(c1278740jNg, System.currentTimeMillis(), str, i, 0));
        }
    }

    @Override // X.C1278950jO1
    public final void LJIILL(int i, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_stamp", jCurrentTimeMillis).put("audio_count", i).put("video_count", j);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuffer stringBuffer = this.LJII;
        stringBuffer.append(C786410Ut5.J3(jSONObject));
        stringBuffer.append("\n");
    }

    @Override // X.C1278950jO1
    public final void LJIILLIIL(int i, long j) {
        C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new ARunnableS1S0101200_20(c1278740jNg, System.currentTimeMillis(), i, j, 0));
        }
    }

    @Override // X.C1278950jO1
    public final void LJJIII(long j, boolean z) {
        if (z) {
            this.LJJI = j;
        } else {
            this.LJJIFFI = j;
        }
    }

    @Override // X.C1278950jO1
    public final void LJJIIJ(String str, boolean z) {
        if (z) {
            this.LJJIII = str;
        } else {
            this.LJJII = str;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0jOB] */
    public C1278770jNj(final C1277590jLp c1277590jLp, C1278740jNg c1278740jNg, C1278910jNx c1278910jNx) {
        this.LIZ = new WeakReference<>(c1278740jNg);
        this.LIZIZ = c1277590jLp;
        this.LIZJ = c1278910jNx;
        c1278910jNx.getClass();
        c1278910jNx.LJII = new WeakReference<>(this);
        this.LIZLLL = new C1278990jO5();
        this.LJ = new C1278990jO5();
        this.LJIIIZ = new C1279070jOD();
        this.LJIIJ = new C1278880jNu(c1277590jLp, c1278910jNx);
        this.LJIIJJI = new Object(c1277590jLp) { // from class: X.0jOB
            public final void finalize() {
            }

            {
                c1277590jLp.LJI.mPushBase.getClass();
            }
        };
        c1277590jLp.LJI.mPushBase.getClass();
        this.LJIJJLI = c1277590jLp.LJI.switchParams.LJFF;
    }

    @Override // X.C1278950jO1
    public final void LJI(int i, long j, boolean z) {
        C1278990jO5 c1278990jO5;
        if (LJJIJIL() && (c1278990jO5 = this.LIZLLL) != null) {
            c1278990jO5.getClass();
            if (j >= 0) {
                if (z) {
                    if (i == 1) {
                        c1278990jO5.LIZLLL += j;
                        c1278990jO5.LJI++;
                    } else if (i == 0) {
                        c1278990jO5.LIZJ += j;
                        c1278990jO5.LJFF++;
                    }
                } else if (i == 1) {
                    c1278990jO5.LIZIZ += j;
                    c1278990jO5.LJIIIIZZ++;
                } else if (i == 0) {
                    c1278990jO5.LIZ += j;
                    c1278990jO5.LJII++;
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_stamp", jCurrentTimeMillis).put("stall_type", "send_stall").put("is_audio", z).put("stall_time", j).put("stall_reason", i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuffer stringBuffer = this.LJI;
        stringBuffer.append(jSONObject);
        stringBuffer.append("\n");
    }

    @Override // X.C1278950jO1
    public final void LJIJJLI(int i, final long j, String str) {
        char c;
        final String str2 = str;
        if (i == 1) {
            c = 1;
        } else {
            c = 0;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "unknown";
        }
        this.LJJIIJ++;
        if (c > 0) {
            this.LJJIIJZLJL++;
        }
        final C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            final long j2 = this.LJJIIZ;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new Runnable() { // from class: X.0jNw
                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder sbLIZ;
                    String str3;
                    C1278740jNg c1278740jNg2 = c1278740jNg;
                    long j3 = jCurrentTimeMillis;
                    long j4 = j2;
                    long j5 = j;
                    String str4 = str2;
                    c1278740jNg2.getClass();
                    C1C7U.LIZ("VeLiveLogService@5388.onBitrateAdjust$1L");
                    JSONObject jSONObjectLIZIZ = c1278740jNg2.LIZIZ(null, j3);
                    if (jSONObjectLIZIZ != null) {
                        try {
                            JSONObject jSONObjectPut = jSONObjectLIZIZ.put("event_key", "bitrate_adjust").put("bitrate_beforeadjust", j4).put("bitrate_afteradjust", j5).put("min_bitrate", c1278740jNg2.LLIZ.minBitrate).put("max_bitrate", c1278740jNg2.LLIZ.maxBitrate);
                            if (j5 > j4) {
                                sbLIZ = C2188811AlT.LIZ();
                                str3 = "up-";
                            } else {
                                sbLIZ = C2188811AlT.LIZ();
                                str3 = "down-";
                            }
                            sbLIZ.append(str3);
                            sbLIZ.append(str4);
                            jSONObjectPut.put("adjustment", C2188811AlT.LIZIZ(sbLIZ));
                            C1278770jNj c1278770jNj = c1278740jNg2.LLJI;
                            jSONObjectLIZIZ.put("message", c1278770jNj.LJIIIIZZ.length() != 0 ? c1278770jNj.LJIIIIZZ.toString() : "null");
                            c1278770jNj.LJIIIIZZ.setLength(0);
                            c1278740jNg2.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    C1C7U.LIZIZ("VeLiveLogService@5388.onBitrateAdjust$1L");
                }
            });
        }
        this.LJJIIZ = j;
    }

    @Override // X.C1278950jO1
    public final void LJIL(int i, int i2, String str) {
        String str2;
        this.LJJIIZI++;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (i2 > i) {
            str2 = "up-";
        } else {
            str2 = "down-";
        }
        sbLIZ.append(str2);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new ARunnableS0S1102100_20(c1278740jNg, System.currentTimeMillis(), i, i2, strLIZIZ, 0));
        }
    }

    @Override // X.C1278950jO1
    public final void LJJIFFI(int i, int i2, int i3) {
        C1279070jOD c1279070jOD = this.LJIIIZ;
        if (c1279070jOD != null) {
            c1279070jOD.LIZIZ = new C1279080jOE(i, i2, i3);
        }
    }

    @Override // X.C1278950jO1
    public final void LJIIIZ(final int i, final String str, final int i2, final long j, final boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJIILJJIL = i;
        this.LJIIJ.LJ = i;
        this.LJIILL = i2;
        this.LJIILLIIL = z;
        if (i == 200) {
            this.LJIILIIL = jCurrentTimeMillis;
        }
        final C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            final long jCurrentTimeMillis2 = System.currentTimeMillis();
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new Runnable() { // from class: X.0jNs
                @Override // java.lang.Runnable
                public final void run() {
                    C1278740jNg c1278740jNg2 = c1278740jNg;
                    long j2 = jCurrentTimeMillis2;
                    int i3 = i;
                    int i4 = i2;
                    boolean z2 = z;
                    long j3 = j;
                    String str2 = str;
                    c1278740jNg2.getClass();
                    C1C7U.LIZ("VeLiveLogService@5388.onRTMPConnectFail$1L");
                    JSONObject jSONObjectLIZIZ = c1278740jNg2.LIZIZ(null, j2);
                    if (jSONObjectLIZIZ != null) {
                        try {
                            jSONObjectLIZIZ.put("event_key", "connect_fail").put("connect_status", i3 == 200).put("error_code", i3).put("error_count", i4).put("first_connect", z2).put("dns_parse_time", j3).put("default_bitrate", c1278740jNg2.LLIZ.defaultBitrate / LSPassThroughRecordSizeConfig.DEFAULT).put("min_bitrate", c1278740jNg2.LLIZ.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT).put("max_bitrate", c1278740jNg2.LLIZ.maxBitrate / LSPassThroughRecordSizeConfig.DEFAULT).put("audio_bitrate", c1278740jNg2.LLIZ.audioBitrate / LSPassThroughRecordSizeConfig.DEFAULT).put("message", str2).put("enable_cert_verify", c1278740jNg2.LLILZLL.LJI.LIZIZ.enableCertVerify);
                            c1278740jNg2.LLJI.LJJIJIIJI(jSONObjectLIZIZ);
                            c1278740jNg2.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    C1C7U.LIZIZ("VeLiveLogService@5388.onRTMPConnectFail$1L");
                }
            });
        }
    }

    @Override // X.C1278950jO1
    public final void LJJII(int i, int i2, int i3, String str, long j) {
        C1279070jOD c1279070jOD = this.LJIIIZ;
        if (c1279070jOD != null) {
            c1279070jOD.LIZ = new C1279040jOA(i, i2, i3, str, j);
        }
    }

    @Override // X.C1278950jO1
    public final void LJIIJJI(final long j, String str, final int i, final int i2, final int i3, final boolean z) {
        final long j2;
        C1278990jO5 c1278990jO5;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJIILJJIL = i;
        this.LJIIJ.LJ = i;
        this.LJIILL = i2;
        this.LJIILLIIL = z;
        if (i == 200) {
            this.LJIILIIL = jCurrentTimeMillis;
        }
        long j3 = this.LJIIL;
        if (j3 != 0) {
            j2 = jCurrentTimeMillis - j3;
        } else {
            j2 = 0;
        }
        if (LJJIJIL()) {
            long j4 = this.LJIJ;
            if (j4 > 0 && (c1278990jO5 = this.LIZLLL) != null) {
                long j5 = jCurrentTimeMillis - j4;
                if (j5 >= 0) {
                    c1278990jO5.LJ += j5;
                    c1278990jO5.LJIIIZ++;
                }
                this.LJIJ = 0L;
            }
        }
        if (str != null) {
            this.LJIIZILJ = str;
        }
        final C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new Runnable() { // from class: X.0jNr
                @Override // java.lang.Runnable
                public final void run() {
                    C1278740jNg c1278740jNg2 = c1278740jNg;
                    long j6 = jCurrentTimeMillis;
                    int i4 = i;
                    long j7 = j2;
                    int i5 = i2;
                    boolean z2 = z;
                    long j8 = j;
                    int i6 = i3;
                    c1278740jNg2.getClass();
                    C1C7U.LIZ("VeLiveLogService@5388.onRTMPConnectStart$1L");
                    JSONObject jSONObjectLIZIZ = c1278740jNg2.LIZIZ(null, j6);
                    if (jSONObjectLIZIZ != null) {
                        try {
                            jSONObjectLIZIZ.put("event_key", "connect_start").put("connect_status", i4 == 200).put("connect_elapse", j7).put("error_code", i4).put("error_count", i5).put("first_connect", z2).put("dns_parse_time", j8).put("default_bitrate", c1278740jNg2.LLIZ.defaultBitrate / LSPassThroughRecordSizeConfig.DEFAULT).put("min_bitrate", c1278740jNg2.LLIZ.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT).put("max_bitrate", c1278740jNg2.LLIZ.maxBitrate / LSPassThroughRecordSizeConfig.DEFAULT).put("audio_bitrate", c1278740jNg2.LLIZ.audioBitrate / LSPassThroughRecordSizeConfig.DEFAULT).put("enable_cert_verify", c1278740jNg2.LLILZLL.LJI.LIZIZ.enableCertVerify).put("width", c1278740jNg2.LLIZ.width).put("height", c1278740jNg2.LLIZ.height).put("rate_control_type", i6);
                            c1278740jNg2.LLJI.LJJIJIIJI(jSONObjectLIZIZ);
                            c1278740jNg2.LLJI.LJJIJIIJIL(jSONObjectLIZIZ);
                            c1278740jNg2.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    C1C7U.LIZIZ("VeLiveLogService@5388.onRTMPConnectStart$1L");
                }
            });
        }
    }
}
