package X;

import Y.AComparatorS39S0000000_20;
import Y.ARunnableS120S0100000_20;
import android.os.Build;
import android.os.Handler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.bytertc.engine.BitRateTable;
import com.ss.bytertc.engine.VideoDegradeConfig;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.lyrax.augur.AugurAdaptiveWrapper;
import com.ss.lyrax.video.LinkMicVideoConfig;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.NetDegradeTableItem;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.CaptureBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j6Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268130j6Z {
    public final C1266350j3h LIZ;
    public final LiveSdkSetting LIZIZ;
    public JSONObject LIZLLL;
    public JSONObject LJFF;
    public final int LJIIJ;
    public final int LJIIJJI;
    public boolean LJIIL;
    public final boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public C1267280j5C LJIJI;
    public AugurAdaptiveWrapper LJIJJ;
    public InterfaceC1268200j6g LJIJJLI;
    public Map<String, ? extends Object> LJIL;
    public final InterfaceC1266960j4g LJJ;
    public final C1268170j6d LJJIIJ;
    public final Handler LJJIIZ;
    public boolean LJJIIZI;
    public int LJJIJ;
    public boolean LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public int LJJIJL;
    public boolean LJJIJLIJ;
    public C1267140j4y LJJIL;
    public long LJJIZ;
    public long LJJJ;
    public int LIZJ = -1;
    public int LJ = -1;
    public int LJI = 720;
    public int LJII = 1280;
    public float LJIIIIZZ = 0.5f;
    public float LJIIIZ = 0.5f;
    public String LJIJ = "not_set_generate_strategy";
    public String LJJI = "default";
    public String LJJIFFI = "default";
    public String LJJII = "default";
    public final List<C1268180j6e> LJJIII = new ArrayList();
    public final ARunnableS120S0100000_20 LJJIIJZLJL = new ARunnableS120S0100000_20(this, 354);
    public final List<Long> LJJJI = new ArrayList();

    public final void LIZ() {
        C1268090j6V c1268090j6V;
        C1266350j3h c1266350j3h = this.LIZ;
        if (c1266350j3h != null) {
            C1267280j5C c1267280j5C = c1266350j3h.LLZZZZ;
            if (c1267280j5C != null && (c1268090j6V = c1267280j5C.LIZJ) != null && ((HashMap) c1268090j6V.LIZIZ).containsKey("linkmic_performance_strategy")) {
                ((HashMap) c1268090j6V.LIZIZ).remove("linkmic_performance_strategy");
            }
            AugurAdaptiveWrapper augurAdaptiveWrapper = c1266350j3h.c;
            if (augurAdaptiveWrapper != null) {
                augurAdaptiveWrapper.clearStrategyReport("linkmic_performance_strategy");
            }
        }
    }

    public final void LJFF() {
        AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", "reset", null);
        LJI();
        this.LJJIJLIJ = false;
        LJIIJJI(false);
        LIZ();
    }

    public final void LJI() {
        synchronized (this.LJJIII) {
            try {
                ((ArrayList) this.LJJIII).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJJIIZI = false;
        this.LJJIJIIJI = false;
        Handler handler = this.LJJIIZ;
        if (handler != null) {
            handler.removeCallbacks(this.LJJIIJZLJL);
        }
        this.LIZJ = -1;
        this.LIZLLL = null;
        this.LJFF = null;
        this.LJ = -1;
        this.LJJI = "default";
        this.LJJIFFI = "default";
        this.LJJII = "default";
        this.LJJIL = null;
        this.LJIJ = "not_set";
    }

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
    public final void LJIIL() {
        if (this.LJIJI != null) {
            C1267120j4w c1267120j4w = new C1267120j4w();
            c1267120j4w.LIZ = this.LJI;
            c1267120j4w.LIZIZ = this.LJII;
            c1267120j4w.LIZJ = this.LJIIIIZZ;
            c1267120j4w.LIZLLL = this.LJIIIZ;
            c1267120j4w.LJ = this.LJIIL ? 1 : 0;
            c1267120j4w.LJI = this.LJIILJJIL ? 1 : 0;
            c1267120j4w.LJII = 2.0f;
            c1267120j4w.LJFF = this.LJIILIIL ? 1 : 0;
            String str = this.LJIJ;
            if (str == null) {
                str = "not_set_generate_strategy";
            }
            c1267120j4w.LJIIIIZZ = str;
            C1267080j4s c1267080j4s = this.LJIJI.LIZLLL;
            c1267080j4s.LIZ(c1267080j4s.LJIILL, c1267120j4w);
            C1267080j4s c1267080j4s2 = this.LJIJI.LIZLLL;
            C1267110j4v c1267110j4v = c1267080j4s2.LJII;
            c1267110j4v.LIZ = 0;
            c1267080j4s2.LIZ(c1267110j4v, c1267110j4v);
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.LJIJJ;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.updateFeature("linkmic_canvas_width", this.LJI);
            augurAdaptiveWrapper.updateFeature("linkmic_canvas_height", this.LJII);
            augurAdaptiveWrapper.updateFeature("linkmic_window_width_ratio", this.LJIIIIZZ);
            augurAdaptiveWrapper.updateFeature("linkmic_window_height_ratio", this.LJIIIZ);
            augurAdaptiveWrapper.updateFeature("linkmic_enable_simulcast", this.LJIIL ? 1 : 0);
            augurAdaptiveWrapper.updateFeature("enable_linkmic_simulcast", 0);
            augurAdaptiveWrapper.updateFeature("linkmic_enable_high_bitrate", this.LJIILJJIL ? 1 : 0);
            augurAdaptiveWrapper.updateFeature("linkmic_high_bitrate_ratio", 2.0f);
            augurAdaptiveWrapper.updateFeature("linkmic_enable_dual_channel", this.LJIILIIL ? 1 : 0);
            augurAdaptiveWrapper.updateFeature("linkmic_layout_config_id_for_generate_strategy", this.LJIJ);
        }
    }

    public final void LIZIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableSimulcast enable:");
        sbLIZ.append(z);
        sbLIZ.append(" enableSimulcast:");
        sbLIZ.append(this.LJIIL);
        AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LJIIL = z;
        if (!z) {
            LIZ();
        }
    }

    public final void LJ(JSONObject jSONObject) {
        try {
            C1268180j6e c1268180j6e = new C1268180j6e(JSONObjectProtectorUtils.getInt(jSONObject, "bitrate"), JSONObjectProtectorUtils.getInt(jSONObject, "capture_height"), JSONObjectProtectorUtils.getInt(jSONObject, "capture_width"), JSONObjectProtectorUtils.getInt(jSONObject, "effect_height"), JSONObjectProtectorUtils.getInt(jSONObject, "effect_width"), JSONObjectProtectorUtils.getInt(jSONObject, "encode_height"), JSONObjectProtectorUtils.getInt(jSONObject, "encode_width"), JSONObjectProtectorUtils.getInt(jSONObject, "fps"), jSONObject.optString("name", "unknown"));
            synchronized (this.LJJIII) {
                try {
                    ((ArrayList) this.LJJIII).add(c1268180j6e);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (JSONException th) {
        } catch (Exception th2) {
        }
    }

    public final void LJII(String str) {
        if (!this.LJJIJLIJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("do not triggerLinkMicVideoParamsGenerate source:");
            sbLIZ.append(str);
            AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("triggerLinkMicVideoParamsGenerate source:");
        sbLIZ2.append(str);
        AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ2), null);
        C1267280j5C c1267280j5C = this.LJIJI;
        if (c1267280j5C != null) {
            c1267280j5C.LIZIZ("generate_linkmic_video_params");
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.LJIJJ;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.triggerLinkMicVideoParamsGenerate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022d  */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.0j6Z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268130j6Z.LJIIIZ(java.lang.String):void");
    }

    public final void LJIIJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("min_bitrate_table");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() == 2) {
                    int iOptInt = jSONArrayOptJSONArray2.optInt(0, 0);
                    int iOptInt2 = jSONArrayOptJSONArray2.optInt(1, 0);
                    BitRateTable bitRateTable = new BitRateTable();
                    bitRateTable.pixels = iOptInt;
                    bitRateTable.minKbps = iOptInt2;
                    arrayList.add(bitRateTable);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (Intrinsics.LJFF(next, "bigStreamEncodeParams") || Intrinsics.LJFF(next, "normalStreamEncodeParams")) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, next);
                int i2 = JSONObjectProtectorUtils.getInt(jSONObject2, "fps");
                int i3 = JSONObjectProtectorUtils.getInt(jSONObject2, "encode_width");
                int i4 = JSONObjectProtectorUtils.getInt(jSONObject2, "encode_height");
                int i5 = JSONObjectProtectorUtils.getInt(jSONObject2, "max_bitrate");
                VideoEncoderConfig.VideoDegradeLevels videoDegradeLevels = new VideoEncoderConfig.VideoDegradeLevels();
                ArrayList arrayList3 = new ArrayList();
                synchronized (this.LJJIII) {
                    try {
                        if (Intrinsics.LJFF(next, "bigStreamEncodeParams")) {
                            if (((ArrayList) this.LJJIII).size() == 3) {
                                VideoDegradeConfig videoDegradeConfig = new VideoDegradeConfig();
                                videoDegradeConfig.upThresholdKbps = -1;
                                videoDegradeConfig.downThresholdKbps = -1;
                                videoDegradeConfig.framerate = ((C1268180j6e) ((ArrayList) this.LJJIII).get(2)).LJII;
                                videoDegradeConfig.width = ((C1268180j6e) ((ArrayList) this.LJJIII).get(2)).LJI;
                                videoDegradeConfig.height = ((C1268180j6e) ((ArrayList) this.LJJIII).get(2)).LJFF;
                                arrayList3.add(videoDegradeConfig);
                            }
                        } else if (Intrinsics.LJFF(next, "normalStreamEncodeParams")) {
                            int size = ((ArrayList) this.LJJIII).size() - 1;
                            if (((ArrayList) this.LJJIII).size() == 3) {
                                size = ((ArrayList) this.LJJIII).size() - 2;
                            }
                            while (-1 < size) {
                                VideoDegradeConfig videoDegradeConfig2 = new VideoDegradeConfig();
                                videoDegradeConfig2.upThresholdKbps = -1;
                                videoDegradeConfig2.downThresholdKbps = -1;
                                videoDegradeConfig2.framerate = ((C1268180j6e) ((ArrayList) this.LJJIII).get(size)).LJII;
                                videoDegradeConfig2.width = ((C1268180j6e) ((ArrayList) this.LJJIII).get(size)).LJI;
                                videoDegradeConfig2.height = ((C1268180j6e) ((ArrayList) this.LJJIII).get(size)).LJFF;
                                arrayList3.add(videoDegradeConfig2);
                                size--;
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                videoDegradeLevels.perf = arrayList3;
                JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("net_degrade_table");
                if (jSONArrayOptJSONArray3 != null) {
                    String string = jSONArrayOptJSONArray3.toString();
                    ArrayList arrayList4 = new ArrayList();
                    if (string != null && !a0.LJJJIL(string)) {
                        try {
                            for (NetDegradeTableItem netDegradeTableItem : (List) new Gson().LJIIIIZZ(string, new TypeToken<List<? extends NetDegradeTableItem>>() { // from class: X.04ZR
                            }.getType())) {
                                VideoDegradeConfig videoDegradeConfig3 = new VideoDegradeConfig();
                                videoDegradeConfig3.upThresholdKbps = netDegradeTableItem.up_threshold_kbps;
                                videoDegradeConfig3.downThresholdKbps = netDegradeTableItem.down_threshold_kbps;
                                videoDegradeConfig3.framerate = netDegradeTableItem.fps;
                                videoDegradeConfig3.width = netDegradeTableItem.width;
                                videoDegradeConfig3.height = netDegradeTableItem.height;
                                arrayList4.add(videoDegradeConfig3);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    videoDegradeLevels.f440net = arrayList4;
                }
                arrayList2.add(new VideoEncoderConfig(i3, i4, i2, i5, 0, arrayList, videoDegradeLevels));
            }
        }
        if (arrayList2.size() > 1) {
            C08XD.LJJ(arrayList2, new AComparatorS39S0000000_20(15));
        }
        InterfaceC1268200j6g interfaceC1268200j6g = this.LJIJJLI;
        if (interfaceC1268200j6g != null) {
            interfaceC1268200j6g.LIZLLL(arrayList2);
        }
    }

    public final void LJIIJJI(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLinkMicPerformanceStrategyFeature enableLinkMicPerformanceStrategy:");
        sbLIZ.append(z);
        AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ), null);
        if (this.LJIJI != null) {
            C1267190j53 c1267190j53 = new C1267190j53();
            c1267190j53.LJ = z ? 1 : 0;
            c1267190j53.LIZ = this.LIZJ;
            c1267190j53.LIZIZ = this.LJ;
            c1267190j53.LIZJ = this.LIZLLL;
            c1267190j53.LIZLLL = this.LJFF;
            C1267080j4s c1267080j4s = this.LJIJI.LIZLLL;
            c1267080j4s.LIZ(c1267080j4s.LJIILLIIL, c1267190j53);
        }
        AugurAdaptiveWrapper augurAdaptiveWrapper = this.LJIJJ;
        if (augurAdaptiveWrapper != null) {
            augurAdaptiveWrapper.updateFeature("linkmic_enable_performance_strategy", z ? 1 : 0);
            augurAdaptiveWrapper.updateFeature("linkmic_current_performance_level", this.LIZJ);
            augurAdaptiveWrapper.updateFeature("linkmic_performance_levels", this.LIZLLL);
            augurAdaptiveWrapper.updateFeature("linkmic_performance_mode", this.LJ);
            augurAdaptiveWrapper.updateFeature("linkmic_encode_configs", this.LJFF);
            augurAdaptiveWrapper.updateFeature("linkmic_simulcast_mode", this.LJJI);
        }
        C1266350j3h c1266350j3h = this.LIZ;
        if (c1266350j3h != null) {
            c1266350j3h.LLLLLZ();
        }
    }

    public final void LJIILIIL(JSONObject jSONObject) {
        String strJ3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePerformanceLevels levels:");
        if (jSONObject != null) {
            strJ3 = C786410Ut5.J3(jSONObject);
        } else {
            strJ3 = null;
        }
        sbLIZ.append(strJ3);
        C2188811AlT.LIZIZ(sbLIZ);
        synchronized (this.LJJIII) {
            try {
                ((ArrayList) this.LJJIII).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                Object obj = jSONObject.get(itKeys.next());
                if (obj instanceof JSONObject) {
                    LJ((JSONObject) obj);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1268130j6Z(C1266350j3h c1266350j3h, LiveSdkSetting liveSdkSetting) throws JSONException {
        LinkMicVideoConfig linkMicVideoConfigLJIJ;
        int i;
        boolean z;
        InterfaceC1266960j4g interfaceC1266960j4gLJIJI;
        C1269160j8E c1269160j8E;
        C1269160j8E c1269160j8E2;
        VPassInteractCfg vPassInteractCfg;
        this.LIZ = c1266350j3h;
        this.LIZIZ = liveSdkSetting;
        int i2 = 8;
        this.LJIIJ = 8;
        this.LJIIJJI = 2;
        this.LJIILL = 15;
        this.LJIILLIIL = 10;
        this.LJIIZILJ = 2000;
        if (liveSdkSetting != null) {
            linkMicVideoConfigLJIJ = liveSdkSetting.LJIJ();
            if (linkMicVideoConfigLJIJ != null) {
                i2 = linkMicVideoConfigLJIJ.widthStride;
            }
        } else {
            linkMicVideoConfigLJIJ = null;
        }
        this.LJIIJ = i2;
        if (linkMicVideoConfigLJIJ != null) {
            i = linkMicVideoConfigLJIJ.heightStride;
        } else {
            i = 2;
        }
        this.LJIIJJI = i;
        this.LJIILL = linkMicVideoConfigLJIJ != null ? linkMicVideoConfigLJIJ.linkMicNormalFps : 15;
        this.LJIILLIIL = linkMicVideoConfigLJIJ != null ? linkMicVideoConfigLJIJ.cameraResolutionDiffThreshold : 10;
        this.LJIIZILJ = linkMicVideoConfigLJIJ != null ? linkMicVideoConfigLJIJ.strategyRunTimeoutMs : 2000;
        if (liveSdkSetting != null && (vPassInteractCfg = liveSdkSetting.mVPassInteractCfg) != null && vPassInteractCfg.LJIIIIZZ() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILIIL = z;
        if (c1266350j3h != null && (c1269160j8E2 = c1266350j3h.LLILZLL) != null) {
            interfaceC1266960j4gLJIJI = c1269160j8E2.LJIJI();
        } else {
            interfaceC1266960j4gLJIJI = null;
        }
        this.LJJ = interfaceC1266960j4gLJIJI;
        this.LJJIIJ = new C1268170j6d();
        this.LJJIIZ = c1266350j3h != null ? c1266350j3h.LL : null;
        if (c1266350j3h != null && (c1269160j8E = c1266350j3h.LLILZLL) != null) {
            c1269160j8E.LJJIJIL = 76800;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("linkMicVideoConfig", linkMicVideoConfigLJIJ);
        jSONObject.put("enableDualChannel", z);
        AVLog.logApiCall("linkmic_video_api", "LinkMicVideoParamsManager init", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268130j6Z.LIZLLL(int, int):java.lang.String");
    }

    public final void LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        C1266350j3h c1266350j3h;
        boolean z;
        CaptureBase captureBase;
        List<String> list;
        int[] iArr = {i3, i4};
        C1266350j3h c1266350j3h2 = this.LIZ;
        if (c1266350j3h2 != null) {
            c1266350j3h2.LJJLI(iArr);
        }
        if ((i3 != iArr[0] || i4 != iArr[1]) && (c1266350j3h = this.LIZ) != null) {
            c1266350j3h.LLLLZ(true);
        }
        if (i3 * i4 < 76800) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleFovSmallWindowOpt enableFovSmallWindowOpt ");
        sbLIZ.append(z);
        AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ), null);
        C1266350j3h c1266350j3h3 = this.LIZ;
        if (c1266350j3h3 != null) {
            C1269160j8E c1269160j8E = c1266350j3h3.LLILZLL;
            if (c1269160j8E != null) {
                c1269160j8E.LJJIJ = z;
            }
            C1271270jBd.LIZ.LJIIIZ(true);
        }
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("videoCaptureWidth", i);
        tEBundle.setInt("videoCaptureHeight", i2);
        tEBundle.setInt("cap_adapted_width", i3);
        tEBundle.setInt("cap_adapted_height", i4);
        tEBundle.setInt("fps", i5);
        LiveSdkSetting liveSdkSetting = this.LIZIZ;
        if (liveSdkSetting == null || (captureBase = liveSdkSetting.captureBase) == null || (list = captureBase.camera15FpsDisallowList) == null || !list.contains(Build.MODEL.toLowerCase(Locale.ROOT))) {
            tEBundle.setInt("videoCaptureFps", i5);
        }
        C1266350j3h c1266350j3h4 = this.LIZ;
        if (c1266350j3h4 != null) {
            c1266350j3h4.LJJLIIJ(tEBundle);
        }
        tEBundle.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZJ(int r18, int r19, java.util.List r20, java.util.List r21, java.util.List r22, java.util.List r23) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268130j6Z.LIZJ(int, int, java.util.List, java.util.List, java.util.List, java.util.List):org.json.JSONObject");
    }
}
