package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.strategy.SimulcastConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1274270jGT implements Runnable {
    public boolean LL;
    public final /* synthetic */ C1274810jHL LLILLJJLI;

    public final void LIZ() {
        C1274280jGU c1274280jGU;
        final Map<String, C1275040jHi> statisticResult;
        InterfaceC1274490jGp interfaceC1274490jGpLJI;
        String strLJIL;
        InterfaceC1272820jE8 interfaceC1272820jE8LLIIIL;
        if (this.LL) {
            boolean z = true;
            AVLog.debugTrace(this);
            C1274810jHL c1274810jHL = this.LLILLJJLI;
            C1274990jHd c1274990jHd = c1274810jHL.LJIIIZ;
            AbstractC1273900jFs abstractC1273900jFsLIZ = c1274810jHL.LIZLLL.LIZIZ.LIZ();
            C1274290jGV c1274290jGV = c1274990jHd.LIZ;
            if (c1274290jGV != null) {
                synchronized (c1274290jGV) {
                    c1274280jGU = new C1274280jGU();
                    System.currentTimeMillis();
                    c1274280jGU.LIZ = (int) c1274290jGV.LIZJ;
                    c1274280jGU.LIZIZ = (int) c1274290jGV.LIZLLL;
                    c1274280jGU.LIZJ = (int) c1274290jGV.LJ;
                    c1274280jGU.LIZLLL = (int) c1274290jGV.LJFF;
                    c1274280jGU.LJ = c1274290jGV.LJI;
                    c1274280jGU.LJFF = c1274290jGV.LJIILLIIL;
                    c1274280jGU.LJI = c1274290jGV.LJIIZILJ;
                    ArrayList arrayList = new ArrayList();
                    c1274280jGU.LJII = arrayList;
                    arrayList.addAll(c1274290jGV.LJIJ);
                    ArrayList arrayList2 = new ArrayList();
                    c1274280jGU.LJIIIIZZ = arrayList2;
                    arrayList2.addAll(c1274290jGV.LJIJI);
                    ArrayList arrayList3 = new ArrayList();
                    c1274280jGU.LJIIIZ = arrayList3;
                    arrayList3.addAll(c1274290jGV.LJIJJ);
                    ArrayList arrayList4 = new ArrayList();
                    c1274280jGU.LJIIJ = arrayList4;
                    arrayList4.addAll(c1274290jGV.LJIJJLI);
                    c1274280jGU.LJIIJJI = c1274290jGV.LJJIII;
                    c1274280jGU.LJJJJZ = c1274290jGV.LJIL;
                    c1274280jGU.LJJJJZI = c1274290jGV.LJJ;
                    c1274280jGU.LJJL = c1274290jGV.LJJI;
                    c1274280jGU.LJJLI = c1274290jGV.LJJIFFI;
                    c1274280jGU.LJJIJIL = c1274290jGV.LJII;
                    c1274280jGU.LJJIJL = c1274290jGV.LJIIIIZZ;
                    c1274280jGU.LJJIJLIJ = c1274290jGV.LJIIIZ;
                    c1274280jGU.LJJIL = c1274290jGV.LJIIJ;
                    c1274280jGU.LJJIZ = c1274290jGV.LJIIJJI;
                    c1274280jGU.LJJJ = c1274290jGV.LJIIL;
                    c1274280jGU.LJJJI = c1274290jGV.LJIILIIL;
                    c1274280jGU.LJJJIL = c1274290jGV.LJIILJJIL;
                    c1274280jGU.LJJLIIIJLJLI = c1274290jGV.LJJIIZ;
                    c1274280jGU.LJJLIIIJLLLLLLLZ = abstractC1273900jFsLIZ.LLLLLJLJLL();
                    if (!c1274290jGV.LJJIIJZLJL && (interfaceC1272820jE8LLIIIL = abstractC1273900jFsLIZ.LLIIIL()) != null) {
                        c1274290jGV.LJJII.setScopeMonitorOptService((C1268940j7s) interfaceC1272820jE8LLIIIL.getService(C1268940j7s.class));
                        c1274290jGV.LJJIIJZLJL = true;
                    }
                    if (c1274290jGV.LIZ) {
                        abstractC1273900jFsLIZ.LLFFF(c1274290jGV.LJJII);
                        c1274290jGV.LJJII.getVideoSourceDeliverFps();
                        if (abstractC1273900jFsLIZ.LLIZLLLIL()) {
                            if (abstractC1273900jFsLIZ.LLJ()) {
                                c1274280jGU.LJIILLIIL = abstractC1273900jFsLIZ.LLJJJJJIL("key_pre_encode_fps").getFloat("key_pre_encode_fps", 0.0f);
                                c1274280jGU.LJIJ = abstractC1273900jFsLIZ.LLJJJJJIL("key_effect_out_fps").getFloat("key_effect_out_fps", 0.0f);
                            } else {
                                c1274280jGU.LJIILLIIL = abstractC1273900jFsLIZ.LLJJJJJIL("key_effect_out_fps").getFloat("key_effect_out_fps", 0.0f);
                            }
                        } else if (abstractC1273900jFsLIZ.LLJJ()) {
                            c1274280jGU.LJIILLIIL = abstractC1273900jFsLIZ.LLFZ();
                        } else {
                            c1274280jGU.LJIILLIIL = (float) C1274640jH4.LIZ(c1274290jGV.LJJII.getVideoSourceDeliverFps());
                        }
                        c1274280jGU.LJIIZILJ = c1274280jGU.LJIILLIIL;
                        if (abstractC1273900jFsLIZ.LLD() != null && abstractC1273900jFsLIZ.LLD().LIZ != null && abstractC1273900jFsLIZ.LLD().LIZ.LJIL()) {
                            c1274280jGU.LJIIZILJ = abstractC1273900jFsLIZ.LJLLLLLL();
                        }
                        c1274280jGU.LJIL = c1274290jGV.LJJII.getVideoFrameElapseV2();
                        c1274280jGU.LJJ = c1274290jGV.LJJII.getLong("camera_average_exposure_time");
                        c1274280jGU.LJJI = c1274290jGV.LJJII.getLong("camera_average_fps");
                        c1274280jGU.LJJIFFI = c1274290jGV.LJJII.getLong("camera_iso_info");
                        c1274280jGU.LJJII = c1274290jGV.LJJII.getInt("camera_capture_width");
                        c1274280jGU.LJJIII = c1274290jGV.LJJII.getInt("camera_capture_height");
                        c1274280jGU.LJJIIJ = c1274290jGV.LJJII.getInt("camera_type");
                        c1274280jGU.LJJIIJZLJL = c1274290jGV.LJJII.getInt("current_capture_device");
                        c1274280jGU.LJJIIZ = c1274290jGV.LJJII.getDouble("camera_avg_result_fps");
                        c1274280jGU.LJJIIZI = c1274290jGV.LJJII.getString("camera_fps_range");
                        c1274280jGU.LJJIJ = c1274290jGV.LJJII.getLong("nobuffercnt");
                        c1274280jGU.LJJIJIIJI = c1274290jGV.LJJII.getBool("skip_effect");
                        c1274280jGU.LJJIJIIJIL = c1274290jGV.LJJII.getInt("camera_target_fps");
                    }
                    AudioDeviceModule audioDeviceModuleLJLLI = abstractC1273900jFsLIZ.LJLLI();
                    if (audioDeviceModuleLJLLI != null) {
                        int option = (int) audioDeviceModuleLJLLI.getOption(1);
                        int option2 = (int) audioDeviceModuleLJLLI.getOption(2);
                        int option3 = (int) audioDeviceModuleLJLLI.getOption(3);
                        int option4 = (int) audioDeviceModuleLJLLI.getOption(8);
                        int option5 = (int) audioDeviceModuleLJLLI.getOption(9);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("");
                        sbLIZ.append(option);
                        sbLIZ.append(",");
                        sbLIZ.append(option2);
                        sbLIZ.append(",");
                        sbLIZ.append(option3);
                        sbLIZ.append(",");
                        sbLIZ.append(0);
                        sbLIZ.append(",");
                        sbLIZ.append(option5);
                        sbLIZ.append(",");
                        sbLIZ.append(option4);
                        c1274280jGU.LJIJJLI = C2188811AlT.LIZIZ(sbLIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("");
                        sbLIZ2.append(option);
                        sbLIZ2.append(",");
                        sbLIZ2.append(option2);
                        sbLIZ2.append(",");
                        sbLIZ2.append(option3);
                        sbLIZ2.append(",-");
                        c1274280jGU.LJIIL = C2188811AlT.LIZIZ(sbLIZ2);
                        audioDeviceModuleLJLLI.isHeadSet();
                        c1274280jGU.LJIILIIL = audioDeviceModuleLJLLI.getReportJsonStats();
                    }
                    if (abstractC1273900jFsLIZ.LLJ()) {
                        c1274280jGU.LJIILL = abstractC1273900jFsLIZ.LLJJJJJIL("key_in_cap_fps").getFloat("key_in_cap_fps", 0.0f);
                    } else {
                        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI = abstractC1273900jFsLIZ.LJIJJLI();
                        if (interfaceC1268690j7TLJIJJLI != null) {
                            c1274280jGU.LJIILL = interfaceC1268690j7TLJIJJLI.LLILL();
                            JSONObject jSONObjectLJJLIIIJ = interfaceC1268690j7TLJIJJLI.LJJLIIIJ();
                            if (jSONObjectLJJLIIIJ != null) {
                                c1274280jGU.LJIILJJIL = new JSONObject();
                                try {
                                    synchronized (jSONObjectLJJLIIIJ) {
                                        try {
                                            if (!jSONObjectLJJLIIIJ.isNull("mipmap")) {
                                                c1274280jGU.LJIILJJIL.put("mipmap", jSONObjectLJJLIIIJ.get("mipmap"));
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    }
                    c1274290jGV.LIZIZ = 0;
                    c1274290jGV.LIZJ = 0.0f;
                    c1274290jGV.LIZLLL = 0.0f;
                    c1274290jGV.LJ = 0.0f;
                    c1274290jGV.LJFF = 0.0f;
                    c1274290jGV.LJI = 0;
                    c1274290jGV.LJIILL = 0;
                    c1274290jGV.LJIILLIIL = 0.0f;
                    c1274290jGV.LJIIZILJ = 0.0f;
                    c1274290jGV.LJJIII = 0;
                }
            } else {
                c1274280jGU = null;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LLILLJJLI.LJJJIL);
            sbLIZ3.append("|");
            c1274280jGU.LJIJJ = C2188811AlT.LIZIZ(sbLIZ3);
            C1274810jHL c1274810jHL2 = this.LLILLJJLI;
            c1274810jHL2.LJJJIL = "";
            if (c1274810jHL2.LJJIZ) {
                LIZIZ(c1274280jGU);
                C1274810jHL c1274810jHL3 = this.LLILLJJLI;
                if (c1274810jHL3.LJIILJJIL.LJJIJIIJI) {
                    try {
                        c1274810jHL3.LIZJ.LIZ().LJJLI(this.LLILLJJLI.LJIIZILJ);
                        C1274810jHL c1274810jHL4 = this.LLILLJJLI;
                        int[] iArr = c1274810jHL4.LJIIZILJ;
                        c1274280jGU.LJJJJ = iArr[0];
                        c1274280jGU.LJJJJI = iArr[1];
                        AbstractC1273900jFs abstractC1273900jFsLIZ2 = c1274810jHL4.LIZJ.LIZ();
                        if ((abstractC1273900jFsLIZ2 == null || !abstractC1273900jFsLIZ2.LLJ()) && this.LLILLJJLI.LJZI()) {
                            C1269410j8d c1269410j8dLLIILZL = this.LLILLJJLI.LIZJ.LIZ().LLIILZL();
                            if (c1269410j8dLLIILZL != null) {
                                c1274280jGU.LJJJJLI = c1269410j8dLLIILZL.LJ;
                                c1274280jGU.LJJJJLL = c1269410j8dLLIILZL.LJFF;
                                c1274280jGU.LJJJJJL = c1269410j8dLLIILZL.LIZJ;
                                c1274280jGU.LJJJJL = c1269410j8dLLIILZL.LIZLLL;
                                c1274280jGU.LJJJJIZL = c1269410j8dLLIILZL.LIZ;
                                c1274280jGU.LJJJJJ = c1269410j8dLLIILZL.LIZIZ;
                            }
                            c1274280jGU.LJJJLIIL = this.LLILLJJLI.LIZJ.LIZ().LLJJIII();
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                C1274810jHL c1274810jHL5 = this.LLILLJJLI;
                c1274280jGU.LJJJLL = c1274810jHL5.LJJIJ;
                c1274280jGU.LJJJZ = c1274810jHL5.LJIILIIL;
                c1274280jGU.LJJJLZIJ = c1274810jHL5.LL;
                c1274280jGU.LJJLIIIJL = c1274810jHL5.LJLJI;
                InterfaceC1274230jGP interfaceC1274230jGPLJLLI = c1274810jHL5.LJLLI();
                if (interfaceC1274230jGPLJLLI == null || !interfaceC1274230jGPLJLLI.LJIILL()) {
                    c1274280jGU.LJJLIIIJ = "";
                    c1274280jGU.LJJLIIIIJ = "";
                    c1274280jGU.LJJLIIIJILLIZJL = null;
                } else {
                    c1274280jGU.LJJLIIIJ = interfaceC1274230jGPLJLLI.LJII(1);
                    c1274280jGU.LJJLIIIIJ = interfaceC1274230jGPLJLLI.LJII(0);
                    InterfaceC1274230jGP interfaceC1274230jGPLJLLI2 = this.LLILLJJLI.LJLLI();
                    if (interfaceC1274230jGPLJLLI2 != null) {
                        strLJIL = interfaceC1274230jGPLJLLI2.LJIL();
                        String strLJIIJ = interfaceC1274230jGPLJLLI2.LJIIJ();
                        if (strLJIIJ != null) {
                            strLJIL = strLJIIJ;
                        }
                        if (interfaceC1274230jGPLJLLI2.LJFF() != null) {
                            c1274280jGU.LJJLIIIJJIZ = interfaceC1274230jGPLJLLI2.LJFF().simulcastConfig.streamConfigs;
                        }
                    } else {
                        strLJIL = "";
                    }
                    c1274280jGU.LJJLIIIJILLIZJL = strLJIL;
                    if (interfaceC1274230jGPLJLLI2 != null && interfaceC1274230jGPLJLLI2.LJIILLIIL() != null) {
                        SimulcastConfig simulcastConfigLJIILLIIL = interfaceC1274230jGPLJLLI2.LJIILLIIL();
                        if (simulcastConfigLJIILLIIL != null) {
                            c1274280jGU.LJJLIIIJJI = simulcastConfigLJIILLIIL.mode;
                        } else {
                            c1274280jGU.LJJLIIIJJI = null;
                        }
                    }
                }
                this.LLILLJJLI.getClass();
                final HashMap map = new HashMap();
                C1275410jIJ c1275410jIJ = this.LLILLJJLI.LJLJLJ;
                if (c1275410jIJ != null) {
                    TEBundle tEBundle = new TEBundle();
                    if (c1275410jIJ.LIZJ(tEBundle, true)) {
                        if (tEBundle.contains("source_abnormal")) {
                            map.put("source_abnormal", tEBundle.getString("source_abnormal"));
                        }
                        if (tEBundle.contains("effect_abnormal")) {
                            map.put("effect_abnormal", tEBundle.getString("effect_abnormal"));
                        }
                        if (tEBundle.contains("remote_abnormal")) {
                            map.put("remote_abnormal", tEBundle.getString("remote_abnormal"));
                        }
                        if (tEBundle.contains("source_abnormal_lt")) {
                            map.put("source_abnormal_lt", tEBundle.getString("source_abnormal_lt"));
                        }
                        if (tEBundle.contains("effect_abnormal_lt")) {
                            map.put("effect_abnormal_lt", tEBundle.getString("effect_abnormal_lt"));
                        }
                        if (tEBundle.contains("remote_abnormal_lt")) {
                            map.put("remote_abnormal_lt", tEBundle.getString("remote_abnormal_lt"));
                        }
                        if (tEBundle.contains("abnormal_detect_message")) {
                            map.put("abnormal_detect_message", tEBundle.getString("abnormal_detect_message"));
                        }
                        if (tEBundle.contains("is_blackout")) {
                            map.put("is_blackout", String.valueOf(tEBundle.getInt("is_blackout")));
                        }
                        if (tEBundle.contains("blackout_type")) {
                            map.put("blackout_type", String.valueOf(tEBundle.getInt("blackout_type")));
                        }
                        if (tEBundle.contains("source_black_count")) {
                            map.put("source_black_count", String.valueOf(tEBundle.getInt("source_black_count")));
                        }
                        if (tEBundle.contains("effect_black_count")) {
                            map.put("effect_black_count", String.valueOf(tEBundle.getInt("effect_black_count")));
                        }
                        if (tEBundle.contains("remote_black_count")) {
                            map.put("remote_black_count", String.valueOf(tEBundle.getInt("remote_black_count")));
                        }
                        if (tEBundle.contains("is_greenout")) {
                            map.put("is_greenout", String.valueOf(tEBundle.getInt("is_greenout")));
                        }
                        if (tEBundle.contains("greenout_type")) {
                            map.put("greenout_type", String.valueOf(tEBundle.getInt("greenout_type")));
                        }
                        if (tEBundle.contains("source_green_count")) {
                            map.put("source_green_count", String.valueOf(tEBundle.getInt("source_green_count")));
                        }
                        if (tEBundle.contains("effect_green_count")) {
                            map.put("effect_green_count", String.valueOf(tEBundle.getInt("effect_green_count")));
                        }
                        if (tEBundle.contains("remote_green_count")) {
                            map.put("remote_green_count", String.valueOf(tEBundle.getInt("remote_green_count")));
                        }
                        if (tEBundle.contains("remote_frame_error_count")) {
                            map.put("remote_frame_error_count", String.valueOf(tEBundle.getInt("remote_frame_error_count")));
                        }
                        if (tEBundle.contains("remote_frame_error_code")) {
                            map.put("remote_frame_error_code", String.valueOf(tEBundle.getInt("remote_frame_error_code")));
                        }
                        if (tEBundle.contains("source_black_detect_count")) {
                            map.put("source_black_detect_count", String.valueOf(tEBundle.getInt("source_black_detect_count")));
                        }
                        if (tEBundle.contains("effect_black_detect_count")) {
                            map.put("effect_black_detect_count", String.valueOf(tEBundle.getInt("effect_black_detect_count")));
                        }
                        if (tEBundle.contains("remote_black_detect_count")) {
                            map.put("remote_black_detect_count", String.valueOf(tEBundle.getInt("remote_black_detect_count")));
                        }
                        if (tEBundle.contains("source_green_detect_count")) {
                            map.put("source_green_detect_count", String.valueOf(tEBundle.getInt("source_green_detect_count")));
                        }
                        if (tEBundle.contains("effect_green_detect_count")) {
                            map.put("effect_green_detect_count", String.valueOf(tEBundle.getInt("effect_green_detect_count")));
                        }
                        if (tEBundle.contains("remote_green_detect_count")) {
                            map.put("remote_green_detect_count", String.valueOf(tEBundle.getInt("remote_green_detect_count")));
                        }
                        tEBundle.release();
                    }
                }
                TTLHSceneDetector tTLHSceneDetector = this.LLILLJJLI.LJLJLLL;
                if (tTLHSceneDetector != null) {
                    tTLHSceneDetector.updateStatisticMap(map);
                }
                AbstractC1273900jFs abstractC1273900jFsLIZ3 = this.LLILLJJLI.LIZLLL.LIZIZ.LIZ();
                if (abstractC1273900jFsLIZ3 != null && abstractC1273900jFsLIZ3.LLJIJIL()) {
                    c1274280jGU.LJJLJ = abstractC1273900jFsLIZ3.LLFII();
                    C1273190jEj c1273190jEj = this.LLILLJJLI.LJLLILLLL;
                    if (c1273190jEj != null) {
                        c1274280jGU.LJJLIIJ = c1273190jEj.LLIZ;
                        c1274280jGU.LJJLIL = c1273190jEj.LLJILLL.getRealRatePerSecond();
                    }
                }
                Iterator it2 = ((ConcurrentHashMap) this.LLILLJJLI.LJJIFFI).entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    C1274860jHQ c1274860jHQ = (C1274860jHQ) ((Map.Entry) it2.next()).getValue();
                    if (c1274860jHQ != null && (interfaceC1274490jGpLJI = c1274860jHQ.LJI()) != null && interfaceC1274490jGpLJI.LJJLIIIIJ()) {
                        break;
                    }
                }
                map.put("native_render_enabled", z ? "1" : CardStruct.IStatusCode.DEFAULT);
                C1274910jHV c1274910jHV = this.LLILLJJLI.LJIIIZ.LIZJ;
                if (c1274910jHV == null || (statisticResult = c1274910jHV.getStatisticResult()) == null) {
                    statisticResult = null;
                } else {
                    for (Map.Entry<String, C1275040jHi> entry : statisticResult.entrySet()) {
                        entry.getValue();
                        entry.getKey();
                    }
                }
                InterfaceC1271140jBQ interfaceC1271140jBQ = this.LLILLJJLI.LJJ;
                if (interfaceC1271140jBQ instanceof C1271130jBP) {
                    C1271130jBP c1271130jBP = (C1271130jBP) interfaceC1271140jBQ;
                    if (statisticResult != null) {
                        for (Map.Entry<String, C1275040jHi> entry2 : statisticResult.entrySet()) {
                            C1275040jHi value = entry2.getValue();
                            C1274460jGm c1274460jGm = (C1274460jGm) ((ConcurrentHashMap) c1271130jBP.LIZLLL).get(entry2.getKey());
                            if (c1274460jGm != null) {
                                Object obj = c1274460jGm.LLIZLLLIL;
                                value.LJ = obj instanceof C1272880jEE ? ((VideoSink) obj).getAvgRenderCountAndInvalidate() : -1.0f;
                            }
                        }
                    }
                }
                C1274810jHL c1274810jHL6 = this.LLILLJJLI;
                JSONObject jSONObjectLJIIJ = c1274810jHL6.LJIILJJIL.LJIIL == EnumC1274430jGj.ANCHOR ? c1274810jHL6.LJIILLIIL.LJIIJ() : null;
                C1274810jHL c1274810jHL7 = this.LLILLJJLI;
                final C1274830jHN c1274830jHN = c1274810jHL7.LJIIIIZZ;
                final Map<String, C1275340jIC> mapLIZJ = c1274810jHL7.LJIIIZ.LIZJ();
                this.LLILLJJLI.LJIIIZ.getClass();
                c1274830jHN.getClass();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final JSONObject jSONObject = jSONObjectLJIIJ;
                final C1274280jGU c1274280jGU2 = c1274280jGU;
                C1274690jH9.LJ(new Runnable() { // from class: X.0jGS
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    public final void LIZIZ() {
                        C1273620jFQ c1273620jFQLLII;
                        JSONObject status;
                        JSONObject jSONObjectLLIIZ;
                        int i;
                        int i2;
                        AbstractC1273900jFs abstractC1273900jFs;
                        C1268130j6Z c1268130j6Z;
                        C1269820j9I c1269820j9I;
                        JSONObject jSONObjectLIZIZ = c1274830jHN.LIZIZ(jCurrentTimeMillis, "rtc_push_stream");
                        if (jSONObjectLIZIZ == null) {
                            return;
                        }
                        try {
                            AbstractC1273900jFs abstractC1273900jFs2 = c1274830jHN.LJJIII;
                            if (abstractC1273900jFs2 != null) {
                                abstractC1273900jFs2.LLLLLZ();
                                C1269910j9R c1269910j9RLJIJJ = c1274830jHN.LJJIII.LJZI().LJIJJ();
                                if (c1269910j9RLJIJJ != null && (c1269820j9I = c1269910j9RLJIJJ.LIZIZ) != null) {
                                    jSONObjectLIZIZ.put("stream_quality", c1269820j9I.LIZIZ).put("ttnet_network_quality", c1269820j9I.LIZJ).put("network_quality_v3", c1269820j9I.LIZ);
                                }
                            }
                            C1274280jGU c1274280jGU3 = c1274280jGU2;
                            if (c1274280jGU3 != null) {
                                JSONObject jSONObjectPut = jSONObjectLIZIZ.put("send_audio_bitrate", c1274280jGU3.LIZ).put("receive_audio_bitrate", c1274280jGU2.LIZIZ).put("send_video_bitrate", c1274280jGU2.LIZJ).put("receive_video_bitrate", c1274280jGU2.LIZLLL).put("user_count", c1274280jGU2.LJ).put("real_video_framerate", c1274280jGU2.LJFF).put("encode_fps", c1274280jGU2.LJI).put("send_encode_fps", c1274280jGU2.LJI).put("rtc_tx_quality", c1274280jGU2.LJIIJJI);
                                c1274280jGU2.getClass();
                                jSONObjectPut.put("asource_fps", 0).put("width", c1274280jGU2.LJJJJZ).put("height", c1274280jGU2.LJJJJZI).put("rms", c1274280jGU2.LJIJJLI).put("in_cap_fps", c1274280jGU2.LJIILL).put("out_cap_fps", c1274280jGU2.LJIILLIIL).put("out_effect_fps", c1274280jGU2.LJIJ).put("preview_fps", c1274280jGU2.LJIIZILJ).put("business_id", c1274280jGU2.LJJJLL).put("layout_config_id", c1274280jGU2.LJJJLZIJ).put("rtc_connect", c1274280jGU2.LJJJZ).put("is_hw", c1274280jGU2.LJJL ? 1 : 0).put("codec_type", c1274280jGU2.LJJLI).put("codec_type_name", C1152900g6i.LIZ(c1274280jGU2.LJJLI)).put("capture_utc_ts", c1274280jGU2.LJJLIIIJL).put("hardware_roi_ratio", c1274280jGU2.LJJLIIIJLJLI);
                                AbstractC1273900jFs abstractC1273900jFs3 = c1274830jHN.LJJIII;
                                jSONObjectLIZIZ.put("enableAdaptiveLinkMicLayoutParamsFeature", abstractC1273900jFs3 != null && abstractC1273900jFs3.LLIZ());
                                AbstractC1273900jFs abstractC1273900jFs4 = c1274830jHN.LJJIII;
                                if (abstractC1273900jFs4 == null || !abstractC1273900jFs4.LLILZLL() || (c1268130j6Z = c1274830jHN.LJJIIJ) == null) {
                                    String str = c1274280jGU2.LJJLIIIJJI;
                                    if (str != null) {
                                        jSONObjectLIZIZ.put("multi_stream_model_type", str);
                                    }
                                    if (!TextUtils.isEmpty(c1274280jGU2.LJJLIIIJ)) {
                                        jSONObjectLIZIZ.put("multi_stream_reason_network", c1274280jGU2.LJJLIIIJ);
                                    }
                                    if (!TextUtils.isEmpty(c1274280jGU2.LJJLIIIIJ)) {
                                        jSONObjectLIZIZ.put("multi_stream_reason_perf", c1274280jGU2.LJJLIIIIJ);
                                    }
                                    if (!TextUtils.isEmpty(c1274280jGU2.LJJLIIIJILLIZJL)) {
                                        jSONObjectLIZIZ.put("multi_stream_type", c1274280jGU2.LJJLIIIJILLIZJL);
                                    }
                                    C1274280jGU c1274280jGU4 = c1274280jGU2;
                                    List<SimulcastConfig.StreamConfig> list = c1274280jGU4.LJJLIIIJJIZ;
                                    List<Integer> list2 = c1274280jGU4.LJII;
                                    List<Integer> list3 = c1274280jGU4.LJIIIIZZ;
                                    List<Integer> list4 = c1274280jGU4.LJIIIZ;
                                    List<Integer> list5 = c1274280jGU4.LJIIJ;
                                    if (list != null && list2 != null && list3 != null && list4 != null && list5 != null) {
                                        try {
                                            ArrayList arrayList5 = (ArrayList) list3;
                                            if (((ArrayList) list2).size() == arrayList5.size()) {
                                                int size = arrayList5.size();
                                                ArrayList arrayList6 = (ArrayList) list4;
                                                if (size == arrayList6.size() && arrayList6.size() == ((ArrayList) list5).size() && "dual".equals(c1274280jGU2.LJJLIIIJJI) && "big_normal".equals(c1274280jGU2.LJJLIIIJILLIZJL)) {
                                                    jSONObjectLIZIZ.put("multi_stream_resolution_width", LIZ(list, list2));
                                                    jSONObjectLIZIZ.put("multi_stream_resolution_height", LIZ(list, list3));
                                                    jSONObjectLIZIZ.put("multi_stream_encode_fps", LIZ(list, list4));
                                                    jSONObjectLIZIZ.put("multi_stream_push_fps", LIZ(list, list5));
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                        }
                                    }
                                } else {
                                    try {
                                        C1274280jGU c1274280jGU5 = c1274280jGU2;
                                        JSONObject jSONObjectLIZJ = c1268130j6Z.LIZJ(c1274280jGU5.LJJJJZ, c1274280jGU5.LJJJJZI, c1274280jGU5.LJII, c1274280jGU5.LJIIIIZZ, c1274280jGU5.LJIIIZ, c1274280jGU5.LJIIJ);
                                        if (jSONObjectLIZJ.length() > 0) {
                                            C190800oM.LIZIZ(jSONObjectLIZIZ, jSONObjectLIZJ);
                                        }
                                    } catch (Throwable th4) {
                                        TryCatchGuardChecker.doCheck(th4);
                                    }
                                }
                                try {
                                    C190800oM.LIZIZ(jSONObjectLIZIZ, c1274280jGU2.LJJLIIIJLLLLLLLZ);
                                } catch (Throwable th5) {
                                    TryCatchGuardChecker.doCheck(th5);
                                }
                                if (c1274830jHN.LIZIZ.LJJIJIIJI) {
                                    jSONObjectLIZIZ.put("adapted_resolution_width", c1274280jGU2.LJJJJ).put("adapted_resolution_height", c1274280jGU2.LJJJJI);
                                    AbstractC1273900jFs abstractC1273900jFs5 = c1274830jHN.LJJIII;
                                    if (abstractC1273900jFs5 != null && !abstractC1273900jFs5.LLJ() && (abstractC1273900jFs = c1274830jHN.LJJIII) != null && abstractC1273900jFs.LLJJ()) {
                                        jSONObjectLIZIZ.put("videoAdapter_crop_x", c1274280jGU2.LJJJJLI);
                                        jSONObjectLIZIZ.put("videoAdapter_crop_y", c1274280jGU2.LJJJJLL);
                                        jSONObjectLIZIZ.put("videoAdapter_crop_Width", c1274280jGU2.LJJJJJL);
                                        jSONObjectLIZIZ.put("videoAdapter_crop_Height", c1274280jGU2.LJJJJL);
                                        jSONObjectLIZIZ.put("videoAdapter_out_Width", c1274280jGU2.LJJJJIZL);
                                        jSONObjectLIZIZ.put("videoAdapter_out_Height", c1274280jGU2.LJJJJJ);
                                        jSONObjectLIZIZ.put("videoAdapter_isSkipCropAndScale", c1274280jGU2.LJJJLIIL);
                                    }
                                    AbstractC1273900jFs abstractC1273900jFs6 = c1274830jHN.LJJIII;
                                    jSONObjectLIZIZ.put("enable_event_driven_phase1", abstractC1273900jFs6 != null ? Boolean.valueOf(abstractC1273900jFs6.LLJI()) : "unknow");
                                    AbstractC1273900jFs abstractC1273900jFs7 = c1274830jHN.LJJIII;
                                    jSONObjectLIZIZ.put("enable_video_pipeline_opt", abstractC1273900jFs7 != null ? Boolean.valueOf(abstractC1273900jFs7.LLJJ()) : "unknow");
                                    AbstractC1273900jFs abstractC1273900jFs8 = c1274830jHN.LJJIII;
                                    jSONObjectLIZIZ.put("enable_pre_effect_process_node", abstractC1273900jFs8 != null ? Boolean.valueOf(abstractC1273900jFs8.LLJILLL()) : "unknow");
                                    AbstractC1273900jFs abstractC1273900jFs9 = c1274830jHN.LJJIII;
                                    jSONObjectLIZIZ.put("is_single_view", abstractC1273900jFs9 != null ? Boolean.valueOf(abstractC1273900jFs9.LJJII()) : "false");
                                    AbstractC1273900jFs abstractC1273900jFs10 = c1274830jHN.LJJIII;
                                    if (abstractC1273900jFs10 != null && abstractC1273900jFs10.LLJIJIL()) {
                                        jSONObjectLIZIZ.put("single_view_set_mix_fps", c1274280jGU2.LJJLIIJ);
                                        jSONObjectLIZIZ.put("single_view_real_mix_fps", c1274280jGU2.LJJLIL);
                                        jSONObjectLIZIZ.put("media_player_info", c1274280jGU2.LJJLJ);
                                    }
                                    AbstractC1273900jFs abstractC1273900jFs11 = c1274830jHN.LJJIII;
                                    if (abstractC1273900jFs11 != null && abstractC1273900jFs11.LLJ()) {
                                        jSONObjectLIZIZ.put("videoParamsCenterParams", c1274830jHN.LJJIII.LLILL());
                                    }
                                }
                                C1269340j8W c1269340j8W = c1274830jHN.LJJ;
                                if (c1269340j8W != null) {
                                    jSONObjectLIZIZ.put("initial_camera_width", c1269340j8W.LJIJ());
                                    jSONObjectLIZIZ.put("initial_camera_height", c1274830jHN.LJJ.LJIIZILJ());
                                    C1269140j8C c1269140j8C = c1274830jHN.LJJ.LJLJI;
                                    int i3 = c1269140j8C.LJJJJJ;
                                    int i4 = c1269140j8C.LJJJJJL;
                                    C1271250jBb c1271250jBb = C1271270jBd.LIZ;
                                    jSONObjectLIZIZ.put("initial_encode_width", c1271250jBb.LIZ.LJ(i3, i4, 0));
                                    C1269140j8C c1269140j8C2 = c1274830jHN.LJJ.LJLJI;
                                    int i5 = c1269140j8C2.LJJJJJ;
                                    int i6 = c1269140j8C2.LJJJJJL;
                                    C1271260jBc c1271260jBc = c1271250jBb.LIZ;
                                    if (i6 <= 0) {
                                        c1271260jBc.getClass();
                                    } else if (c1271260jBc.LJFF(0) && (i5 * 1.0f) / i6 >= c1271260jBc.LIZLLL() && (i2 = c1271260jBc.LJJI) > 0) {
                                        i6 = (((i6 + i2) - 1) / i2) * i2;
                                    }
                                    jSONObjectLIZIZ.put("initial_encode_height", i6);
                                    C1269140j8C c1269140j8C3 = c1274830jHN.LJJ.LJLJI;
                                    jSONObjectLIZIZ.put("initial_effect_width", c1271250jBb.LIZ.LJ(c1269140j8C3.LJJJJI, c1269140j8C3.LJJJJIZL, 0));
                                    C1269140j8C c1269140j8C4 = c1274830jHN.LJJ.LJLJI;
                                    int i7 = c1269140j8C4.LJJJJI;
                                    int i8 = c1269140j8C4.LJJJJIZL;
                                    C1271260jBc c1271260jBc2 = c1271250jBb.LIZ;
                                    if (i8 <= 0) {
                                        c1271260jBc2.getClass();
                                    } else if (c1271260jBc2.LJFF(0) && (i7 * 1.0f) / i8 >= c1271260jBc2.LIZLLL() && (i = c1271260jBc2.LJJI) > 0) {
                                        i8 = (((i8 + i) - 1) / i) * i;
                                    }
                                    jSONObjectLIZIZ.put("initial_effect_height", i8);
                                }
                                C1269340j8W c1269340j8W2 = c1274830jHN.LJJ;
                                if (c1269340j8W2 != null) {
                                    jSONObjectLIZIZ.put("thermal_score", c1269340j8W2.LJJJZ);
                                    jSONObjectLIZIZ.put("perf_score", c1274830jHN.LJJ.LJJL);
                                }
                                C1274280jGU c1274280jGU6 = c1274280jGU2;
                                int i9 = c1274280jGU6.LJJIIJZLJL;
                                if (i9 == 1 || i9 == 2) {
                                    jSONObjectLIZIZ.put("camera_type", c1274280jGU6.LJJIIJ);
                                    jSONObjectLIZIZ.put("camera_capture_width", c1274280jGU2.LJJII);
                                    jSONObjectLIZIZ.put("camera_capture_height", c1274280jGU2.LJJIII);
                                    jSONObjectLIZIZ.put("camera_avg_result_fps", c1274280jGU2.LJJIIZ);
                                    jSONObjectLIZIZ.put("camera_real_fps", c1274280jGU2.LJJIIZ);
                                    jSONObjectLIZIZ.put("camera_real_fps_range", c1274280jGU2.LJJIIZI);
                                    jSONObjectLIZIZ.put("skip_effect", c1274280jGU2.LJJIJIIJI);
                                }
                                jSONObjectLIZIZ.put("camera_target_fps", c1274280jGU2.LJJIJIIJIL);
                                jSONObjectLIZIZ.put("camera_real_fps_range", c1274280jGU2.LJJIIZI);
                                jSONObjectLIZIZ.put("capture_device", c1274280jGU2.LJJIIJZLJL);
                                c1274280jGU2.getClass();
                            }
                            jSONObjectLIZIZ.put("remote_user_info", c1274830jHN.LJFF(statisticResult));
                            C1274830jHN c1274830jHN2 = c1274830jHN;
                            Map map2 = mapLIZJ;
                            c1274830jHN2.getClass();
                            jSONObjectLIZIZ.put("local_auxstream_info", C1274830jHN.LJ(map2));
                            if (c1274280jGU2 != null) {
                                JSONObject jSONObjectLJI = c1274830jHN.LJI();
                                jSONObjectLJI.put("local_mic_db", c1274280jGU2.LJIIL);
                                jSONObjectLJI.put("adm_status", c1274280jGU2.LJIILIIL);
                                jSONObjectLJI.put("rtc_push_frame_elapse", c1274280jGU2.LJIJI);
                                jSONObjectLJI.put("rtc_last_message", c1274280jGU2.LJIJJ);
                                JSONObject jSONObject2 = c1274280jGU2.LJIILJJIL;
                                if (jSONObject2 != null && jSONObject2.length() > 0) {
                                    jSONObjectLJI.put("camera", c1274280jGU2.LJIILJJIL);
                                }
                                c1274830jHN.LJIJJLI(jSONObjectLJI, c1274280jGU2);
                                jSONObjectLIZIZ.put("message", C786410Ut5.J3(jSONObjectLJI));
                            }
                            c1274280jGU2.getClass();
                            C1274970jHb c1274970jHb = c1274830jHN.LIZIZ;
                            if (c1274970jHb != null) {
                                int i10 = C1275130jHr.LIZLLL[c1274970jHb.LIZ().LJII.ordinal()];
                                jSONObjectLIZIZ.put("video_codec", i10 != 1 ? i10 != 2 ? "" : "bytevc1" : "h264");
                            }
                            C1269340j8W c1269340j8W3 = c1274830jHN.LJJ;
                            jSONObjectLIZIZ.put("pusher_type", c1269340j8W3 != null ? c1269340j8W3.LJIL() : "");
                            C1269340j8W c1269340j8W4 = c1274830jHN.LJJ;
                            jSONObjectLIZIZ.put("is_pusher_fallback", (c1269340j8W4 == null || !c1269340j8W4.LJLJI.LJJIL.LJFF) ? 0 : 1);
                            AbstractC1273900jFs abstractC1273900jFs12 = c1274830jHN.LJJIII;
                            if (abstractC1273900jFs12 != null) {
                                if (abstractC1273900jFs12.LLJILJILJ() && (jSONObjectLLIIZ = c1274830jHN.LJJIII.LLIIZ()) != null) {
                                    jSONObjectLIZIZ.put("video_buffer_pool_status", jSONObjectLLIIZ);
                                }
                                InterfaceC1268640j7O interfaceC1268640j7OLJIIL = c1274830jHN.LJJIII.LJIIL();
                                if (interfaceC1268640j7OLJIIL != null) {
                                    jSONObjectLIZIZ.put("buffer_block_cnt", interfaceC1268640j7OLJIIL.LJLJL());
                                    jSONObjectLIZIZ.put("super_resolution_effect", interfaceC1268640j7OLJIIL.LLIIIL());
                                    jSONObjectLIZIZ.put("can_enable_effect_downsampling", interfaceC1268640j7OLJIIL.LJLJJLL());
                                    jSONObjectLIZIZ.put("effect_downsampling_scale", interfaceC1268640j7OLJIIL.LLIIZ());
                                    jSONObjectLIZIZ.put("hardware_roi_enable", interfaceC1268640j7OLJIIL.LLIIIJ());
                                    jSONObjectLIZIZ.put("hardware_roi_switch_reason", interfaceC1268640j7OLJIIL.LJJLJLI());
                                    if (c1274830jHN.LJJIII.LLIZLLLIL()) {
                                        jSONObjectLIZIZ.put("bmf_video_filter", c1274830jHN.LJJIII.LLILIL().optString("bmf_video_filter"));
                                    } else if (c1274830jHN.LJJIII.LLJILLL()) {
                                        c1274830jHN.LJJIII.LLIFFJFJJ();
                                    } else {
                                        if ((interfaceC1268640j7OLJIIL instanceof C1272090jCx) && (status = ((C1272090jCx) interfaceC1268640j7OLJIIL).getStatus()) != null) {
                                            jSONObjectLIZIZ.put("bmf_video_filter", status);
                                        }
                                        if (interfaceC1268640j7OLJIIL instanceof C1272090jCx) {
                                        }
                                    }
                                }
                            }
                            C1269340j8W c1269340j8W5 = c1274830jHN.LJJ;
                            if (c1269340j8W5 != null && c1269340j8W5.LJIIL() != null) {
                                jSONObjectLIZIZ.put("probe_engine", c1274830jHN.LJJ.LJIIL().value());
                            }
                            C1269340j8W c1269340j8W6 = c1274830jHN.LJJ;
                            if (c1269340j8W6 != null && !TextUtils.isEmpty(c1269340j8W6.LJJIJLIJ())) {
                                jSONObjectLIZIZ.put("ttlh_video_quality_strategy_version", c1274830jHN.LJJ.LJJIJLIJ());
                            }
                            C1269340j8W c1269340j8W7 = c1274830jHN.LJJ;
                            if (c1269340j8W7 != null && c1269340j8W7.LJJJJIZL && c1274280jGU2 != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("txVideoKBitrate", c1274280jGU2.LJJIJIL);
                                jSONObject3.put("rxVideoKBitrate", c1274280jGU2.LJJIJL);
                                jSONObject3.put("txLostrate", c1274280jGU2.LJJIJLIJ);
                                jSONObject3.put("rxLostrate", c1274280jGU2.LJJIL);
                                jSONObject3.put("txJitter", c1274280jGU2.LJJIZ);
                                jSONObject3.put("rxJitter", c1274280jGU2.LJJJ);
                                jSONObject3.put("rtt", c1274280jGU2.LJJJI);
                                jSONObjectLIZIZ.put("network_info", jSONObject3);
                                jSONObjectLIZIZ.put("network_connection_type", c1274280jGU2.LJJJIL);
                                jSONObjectLIZIZ.put("video_capture_fps", c1274830jHN.LJJ.LJJIII());
                            }
                            Map map3 = map;
                            if (map3 != null) {
                                for (Map.Entry entry3 : map3.entrySet()) {
                                    jSONObjectLIZIZ.put((String) entry3.getKey(), entry3.getValue());
                                }
                            }
                            C1274830jHN c1274830jHN3 = c1274830jHN;
                            C1269340j8W c1269340j8W8 = c1274830jHN3.LJJ;
                            if (c1269340j8W8 != null && c1269340j8W8.LIZ.LJIIJJI) {
                                jSONObjectLIZIZ.put("battery_value", c1274830jHN3.LJJIII.LJZ());
                                jSONObjectLIZIZ.put("is_charging", c1274830jHN.LJJIII.LLILZ());
                                jSONObjectLIZIZ.put("device_motion_status", c1274830jHN.LJJIII.LL());
                                jSONObjectLIZIZ.put("is_ecom_for_anchor", c1274830jHN.LJJIII.LLILZIL());
                            }
                            C1269340j8W c1269340j8W9 = c1274830jHN.LJJ;
                            if (c1269340j8W9 != null && c1269340j8W9.LIZ.LJIL() && (c1273620jFQLLII = c1274830jHN.LJJIII.LLII()) != null) {
                                try {
                                    jSONObjectLIZIZ.put("effect_real_process_time", c1273620jFQLLII.LIZ());
                                } catch (JSONException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    throw new RuntimeException(e2);
                                }
                            }
                            try {
                                JSONObject jSONObject4 = jSONObject;
                                if (jSONObject4 != null) {
                                    C190800oM.LIZIZ(jSONObjectLIZIZ, jSONObject4);
                                }
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                C786410Ut5.v3();
                            }
                            c1274830jHN.LJJ(jSONObjectLIZIZ);
                        } catch (JSONException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            AVLog.ioe("live_client_monitor_log", String.valueOf(e4));
                        } catch (Exception e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            throw new RuntimeException(e5);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("InteractLogService@7e74.onInteractStatus$1");
                        try {
                            LIZIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("InteractLogService@7e74.onInteractStatus$1");
                    }

                    public static String LIZ(List list, List list2) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (int i = 0; i < ((ArrayList) list2).size(); i++) {
                            try {
                                jSONObject2.put(((SimulcastConfig.StreamConfig) ListProtector.get(list, i)).name, ListProtector.get(list2, i));
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        return C786410Ut5.J3(jSONObject2);
                    }
                });
            }
            if (!this.LL || C1274690jH9.LIZIZ() == null) {
                return;
            }
            C1274690jH9.LJI(this);
            C1274690jH9.LIZLLL(this.LLILLJJLI.LJIILJJIL.LJJ * LSPassThroughRecordSizeConfig.DEFAULT, this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl$LogReportRunnable@7361.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl$LogReportRunnable@7361.run");
    }

    public RunnableC1274270jGT(C1274810jHL c1274810jHL) {
        this.LLILLJJLI = c1274810jHL;
    }

    public final void LIZIZ(C1274280jGU c1274280jGU) {
        int i;
        C1274310jGX c1274310jGX;
        double size;
        C1274350jGb c1274350jGb = this.LLILLJJLI.LJJI;
        if (c1274350jGb != null && (c1274310jGX = c1274350jGb.LLJI) != null) {
            synchronized (c1274310jGX.LIZ) {
                try {
                    c1274310jGX.LIZJ(System.currentTimeMillis());
                    Iterator it2 = ((ArrayList) c1274310jGX.LIZ).iterator();
                    size = 0.0d;
                    double d = 0.0d;
                    while (it2.hasNext()) {
                        d += ((C1274320jGY) it2.next()).LIZ;
                    }
                    if (((ArrayList) c1274310jGX.LIZ).size() > 0) {
                        size = d / ((double) ((ArrayList) c1274310jGX.LIZ).size());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            i = (int) (size + 0.5d);
            c1274310jGX.LIZIZ();
            if (i > 9999) {
                i = 9999;
            }
        } else {
            i = 0;
        }
        c1274280jGU.LJIJI = i * 10000;
    }
}
