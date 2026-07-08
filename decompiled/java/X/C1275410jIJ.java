package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.abnormal_detect.ITTLHAbnormalDetectNativeCallback;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectConfigJava;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectResultJava;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectStats;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275410jIJ {
    public final TTLHAbnormalDetectConfigJava LIZLLL;
    public final WeakReference<InterfaceC1269120j8A> LJFF;
    public WeakReference<TTLHAbnormalDetectorJava> LIZ = new WeakReference<>(null);
    public WeakReference<TTLHAbnormalDetectorJava> LIZIZ = new WeakReference<>(null);
    public final Object LJII = new Object();
    public final Map<String, WeakReference<TTLHAbnormalDetectorJava>> LIZJ = Collections.synchronizedMap(new HashMap());
    public WeakReference<InterfaceC1269120j8A> LJ = new WeakReference<>(null);
    public final C1275400jII LJI = new ITTLHAbnormalDetectNativeCallback() { // from class: X.0jII
        @Override // com.ss.ttlivestreamer.core.abnormal_detect.ITTLHAbnormalDetectNativeCallback
        public final void firstAbnormalCallback(TTLHAbnormalDetectResultJava tTLHAbnormalDetectResultJava) {
            C1275410jIJ c1275410jIJ = this.LIZ;
            synchronized (c1275410jIJ.LJII) {
                try {
                    InterfaceC1269120j8A interfaceC1269120j8A = c1275410jIJ.LJ.get();
                    InterfaceC1269120j8A interfaceC1269120j8A2 = c1275410jIJ.LJFF.get();
                    if (interfaceC1269120j8A != null) {
                        interfaceC1269120j8A.firstAbnormalCallback(tTLHAbnormalDetectResultJava);
                    } else if (interfaceC1269120j8A2 != null) {
                        interfaceC1269120j8A2.firstAbnormalCallback(tTLHAbnormalDetectResultJava);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    };

    public final TTLHAbnormalDetectorJava LIZ(EnumC1270450jAJ enumC1270450jAJ) {
        TTLHAbnormalDetectConfigJava tTLHAbnormalDetectConfigJavaClone = this.LIZLLL.m354clone();
        if (!tTLHAbnormalDetectConfigJavaClone.upStreamEnable) {
            return null;
        }
        int i = C1275420jIK.LIZJ[enumC1270450jAJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                tTLHAbnormalDetectConfigJavaClone.nodeName = "";
                return null;
            }
            tTLHAbnormalDetectConfigJavaClone.nodeName = "EffectAbnormal";
            TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava = new TTLHAbnormalDetectorJava(tTLHAbnormalDetectConfigJavaClone, this.LJI);
            this.LIZIZ = new WeakReference<>(tTLHAbnormalDetectorJava);
            return tTLHAbnormalDetectorJava;
        }
        tTLHAbnormalDetectConfigJavaClone.nodeName = "CaptureAbnormal";
        TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava2 = new TTLHAbnormalDetectorJava(tTLHAbnormalDetectConfigJavaClone, this.LJI);
        this.LIZ = new WeakReference<>(tTLHAbnormalDetectorJava2);
        return tTLHAbnormalDetectorJava2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0jII] */
    public C1275410jIJ(TTLHAbnormalDetectConfigJava tTLHAbnormalDetectConfigJava, InterfaceC1269120j8A interfaceC1269120j8A) {
        this.LIZLLL = tTLHAbnormalDetectConfigJava.m354clone();
        this.LJFF = new WeakReference<>(interfaceC1269120j8A);
    }

    public final TTLHAbnormalDetectorJava LIZIZ(int i, String str) {
        if (!this.LIZLLL.downStreamEnable) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        TTLHAbnormalDetectConfigJava tTLHAbnormalDetectConfigJavaClone = this.LIZLLL.m354clone();
        tTLHAbnormalDetectConfigJavaClone.isRemote = true;
        tTLHAbnormalDetectConfigJavaClone.remoteUserId = str;
        tTLHAbnormalDetectConfigJavaClone.streamIndex = i;
        tTLHAbnormalDetectConfigJavaClone.nodeName = strLIZIZ;
        TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava = new TTLHAbnormalDetectorJava(tTLHAbnormalDetectConfigJavaClone, this.LJI);
        synchronized (this.LIZJ) {
            try {
                this.LIZJ.put(strLIZIZ, new WeakReference<>(tTLHAbnormalDetectorJava));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tTLHAbnormalDetectorJava;
    }

    public final boolean LIZJ(TEBundle tEBundle, boolean z) {
        TTLHAbnormalDetectStats tTLHAbnormalDetectStatsUpdateStats;
        TTLHAbnormalDetectStats tTLHAbnormalDetectStatsUpdateStats2;
        TTLHAbnormalDetectStats tTLHAbnormalDetectStatsUpdateStats3;
        int i = 0;
        if (tEBundle == null) {
            return false;
        }
        HashMap map = new HashMap();
        C1275460jIO c1275460jIO = new C1275460jIO();
        C1275470jIP c1275470jIP = new C1275470jIP();
        TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava = this.LIZ.get();
        TTLHAbnormalDetectStats tTLHAbnormalDetectStatsUpdateStats4 = null;
        if (tTLHAbnormalDetectorJava != null) {
            tTLHAbnormalDetectStatsUpdateStats2 = tTLHAbnormalDetectorJava.updateStats("pushStream", this.LIZLLL.minStatsIntervalMs);
            tTLHAbnormalDetectStatsUpdateStats = tTLHAbnormalDetectorJava.updateStats("heartBeat", this.LIZLLL.minStatsIntervalMsLt);
        } else {
            tTLHAbnormalDetectStatsUpdateStats = null;
            tTLHAbnormalDetectStatsUpdateStats2 = null;
        }
        tEBundle.setString("source_abnormal", "Unknown");
        if (tTLHAbnormalDetectStatsUpdateStats2 != null) {
            tEBundle.setString("source_abnormal", tTLHAbnormalDetectStatsUpdateStats2.abnormalType);
            map.put("source_abnormal", tTLHAbnormalDetectStatsUpdateStats2.toJson());
        }
        tEBundle.setString("source_abnormal_lt", "Unknown");
        if (tTLHAbnormalDetectStatsUpdateStats != null) {
            tEBundle.setString("source_abnormal_lt", tTLHAbnormalDetectStatsUpdateStats.abnormalType);
            tEBundle.setInt("source_black_count", tTLHAbnormalDetectStatsUpdateStats.blackCount);
            tEBundle.setInt("source_black_detect_count", tTLHAbnormalDetectStatsUpdateStats.blackDetectCount);
            c1275460jIO.LIZ(tTLHAbnormalDetectStatsUpdateStats.isBlackOut(), EnumC1275430jIL.kCamera);
            tEBundle.setInt("source_green_count", tTLHAbnormalDetectStatsUpdateStats.greenCount);
            tEBundle.setInt("source_green_detect_count", tTLHAbnormalDetectStatsUpdateStats.greenDetectCount);
            c1275470jIP.LIZ(tTLHAbnormalDetectStatsUpdateStats.isGreenOut(), EnumC1275440jIM.kCamera);
        }
        TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava2 = this.LIZIZ.get();
        if (tTLHAbnormalDetectorJava2 != null) {
            tTLHAbnormalDetectStatsUpdateStats4 = tTLHAbnormalDetectorJava2.updateStats("pushStream", this.LIZLLL.minStatsIntervalMs);
            tTLHAbnormalDetectStatsUpdateStats3 = tTLHAbnormalDetectorJava2.updateStats("heartBeat", this.LIZLLL.minStatsIntervalMsLt);
        } else {
            tTLHAbnormalDetectStatsUpdateStats3 = null;
        }
        tEBundle.setString("effect_abnormal", "Unknown");
        if (tTLHAbnormalDetectStatsUpdateStats4 != null) {
            tEBundle.setString("effect_abnormal", tTLHAbnormalDetectStatsUpdateStats4.abnormalType);
            map.put("effect_abnormal", tTLHAbnormalDetectStatsUpdateStats4.toJson());
        }
        tEBundle.setString("effect_abnormal_lt", "Unknown");
        if (tTLHAbnormalDetectStatsUpdateStats3 != null) {
            tEBundle.setString("effect_abnormal_lt", tTLHAbnormalDetectStatsUpdateStats3.abnormalType);
            tEBundle.setInt("effect_black_count", tTLHAbnormalDetectStatsUpdateStats3.blackCount);
            tEBundle.setInt("effect_black_detect_count", tTLHAbnormalDetectStatsUpdateStats3.blackDetectCount);
            c1275460jIO.LIZ(tTLHAbnormalDetectStatsUpdateStats3.isBlackOut(), EnumC1275430jIL.kEffect);
            tEBundle.setInt("effect_green_count", tTLHAbnormalDetectStatsUpdateStats3.greenCount);
            tEBundle.setInt("effect_green_detect_count", tTLHAbnormalDetectStatsUpdateStats3.greenDetectCount);
            c1275470jIP.LIZ(tTLHAbnormalDetectStatsUpdateStats3.isGreenOut(), EnumC1275440jIM.kEffect);
        }
        if (z) {
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            synchronized (this.LIZJ) {
                try {
                    for (Map.Entry<String, WeakReference<TTLHAbnormalDetectorJava>> entry : this.LIZJ.entrySet()) {
                        String key = entry.getKey();
                        TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava3 = entry.getValue().get();
                        if (tTLHAbnormalDetectorJava3 != null) {
                            TTLHAbnormalDetectStats tTLHAbnormalDetectStatsUpdateStats5 = tTLHAbnormalDetectorJava3.updateStats("pushStream", this.LIZLLL.minStatsIntervalMs);
                            TTLHAbnormalDetectStats tTLHAbnormalDetectStatsUpdateStats6 = tTLHAbnormalDetectorJava3.updateStats("heartBeat", this.LIZLLL.minStatsIntervalMsLt);
                            map2.put(key, tTLHAbnormalDetectStatsUpdateStats5);
                            map3.put(key, tTLHAbnormalDetectStatsUpdateStats6);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!map2.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        jSONObject.put((String) entry2.getKey(), ((TTLHAbnormalDetectStats) entry2.getValue()).abnormalType);
                        map.put((String) entry2.getKey(), ((TTLHAbnormalDetectStats) entry2.getValue()).toJson());
                    }
                    tEBundle.setString("remote_abnormal", C786410Ut5.J3(jSONObject));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("remote report put error: ");
                    sbLIZ.append(e);
                    AVLog.e("TTLHAbnormalDetectManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (!map3.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    for (Map.Entry entry3 : map3.entrySet()) {
                        jSONObject2.put((String) entry3.getKey(), ((TTLHAbnormalDetectStats) entry3.getValue()).abnormalType);
                        i += ((TTLHAbnormalDetectStats) entry3.getValue()).blackCount;
                        i2 += ((TTLHAbnormalDetectStats) entry3.getValue()).greenCount;
                        i3 += ((TTLHAbnormalDetectStats) entry3.getValue()).errorCount;
                        if (i4 == 0 && ((TTLHAbnormalDetectStats) entry3.getValue()).errorCode != 0) {
                            i4 = ((TTLHAbnormalDetectStats) entry3.getValue()).errorCode;
                        }
                        i5 += ((TTLHAbnormalDetectStats) entry3.getValue()).blackDetectCount;
                        i6 += ((TTLHAbnormalDetectStats) entry3.getValue()).greenDetectCount;
                        c1275460jIO.LIZ(((TTLHAbnormalDetectStats) entry3.getValue()).isBlackOut(), EnumC1275430jIL.kRemote);
                        c1275470jIP.LIZ(((TTLHAbnormalDetectStats) entry3.getValue()).isGreenOut(), EnumC1275440jIM.kRemote);
                    }
                    tEBundle.setString("remote_abnormal_lt", C786410Ut5.J3(jSONObject2));
                    tEBundle.setInt("remote_black_count", i);
                    tEBundle.setInt("remote_green_count", i2);
                    tEBundle.setInt("remote_frame_error_count", i3);
                    tEBundle.setInt("remote_frame_error_code", i4);
                    tEBundle.setInt("remote_black_detect_count", i5);
                    tEBundle.setInt("remote_green_detect_count", i6);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("remote report put error: ");
                    sbLIZ2.append(e2);
                    AVLog.e("TTLHAbnormalDetectManager", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        } else {
            if (tEBundle.contains("remote_abnormal")) {
                tEBundle.remove("remote_abnormal");
            }
            if (tEBundle.contains("remote_abnormal_lt")) {
                tEBundle.remove("remote_abnormal_lt");
            }
            if (tEBundle.contains("remote_black_count")) {
                tEBundle.remove("remote_black_count");
            }
            if (tEBundle.contains("remote_green_count")) {
                tEBundle.remove("remote_green_count");
            }
            if (tEBundle.contains("remote_frame_error_count")) {
                tEBundle.remove("remote_frame_error_count");
            }
            if (tEBundle.contains("remote_frame_error_code")) {
                tEBundle.remove("remote_frame_error_code");
            }
            if (tEBundle.contains("remote_black_detect_count")) {
                tEBundle.remove("remote_black_detect_count");
            }
            if (tEBundle.contains("remote_green_detect_count")) {
                tEBundle.remove("remote_green_detect_count");
            }
        }
        tEBundle.setInt("is_blackout", c1275460jIO.LIZ);
        tEBundle.setInt("blackout_type", c1275460jIO.LIZIZ);
        tEBundle.setInt("is_greenout", c1275470jIP.LIZ);
        tEBundle.setInt("greenout_type", c1275470jIP.LIZIZ);
        if (this.LIZLLL.enableDetailedReport) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                for (Map.Entry entry4 : map.entrySet()) {
                    jSONObject3.put((String) entry4.getKey(), entry4.getValue());
                }
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
                AVLog.w("TTLHAbnormalStats", e3.toString());
            }
            tEBundle.setString("abnormal_detect_message", C786410Ut5.J3(jSONObject3));
            return true;
        }
        return true;
    }
}
