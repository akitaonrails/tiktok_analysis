package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.strategy.LinkMicLayoutConfig;
import com.ss.ttlivestreamer.livestreamv2.strategy.SimulcastConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274110jGD implements InterfaceC1274230jGP {
    public JSONObject LIZ;
    public final C1274810jHL LIZIZ;
    public final C1274890jHT LIZJ;
    public LinkMicLayoutConfig LJ;
    public volatile String LJFF;
    public boolean LJI;
    public boolean LJII;
    public SimulcastConfig LJIIIIZZ;
    public final AbstractC1273900jFs LJIIIZ;
    public final boolean LJIIJ;
    public C1271990jCn[] LJIIJJI;
    public C1272000jCo LJIIL;
    public Pair<Integer, SimulcastConfig.StreamConfig> LJIILIIL;
    public Pair<Integer, SimulcastConfig.StreamConfig> LJIILJJIL;
    public String LJIILLIIL;
    public boolean LJIIZILJ;
    public String LIZLLL = "not_set";
    public String LJIILL = "";
    public float LJIJ = 2.0f;

    @Override // X.InterfaceC1274230jGP
    public final void LJIJJ(C1274890jHT c1274890jHT) {
    }

    @Override // X.InterfaceC1274230jGP
    public final String LJIL() {
        return null;
    }

    public static SimulcastConfig.StreamConfig LIZLLL() {
        SimulcastConfig.StreamConfig streamConfig = new SimulcastConfig.StreamConfig();
        streamConfig.name = "dummy";
        streamConfig.encodeWidth = 1440;
        streamConfig.encodeHeight = 2560;
        streamConfig.fps = 15;
        streamConfig.bitrate = 0;
        return streamConfig;
    }

    @Override // X.InterfaceC1274230jGP
    public final String LJIIJ() {
        Pair<Integer, SimulcastConfig.StreamConfig> pair = this.LJIILIIL;
        int iIntValue = pair != null ? ((Integer) pair.first).intValue() : 0;
        Pair<Integer, SimulcastConfig.StreamConfig> pair2 = this.LJIILJJIL;
        if (pair2 != null && ((Integer) pair2.first).intValue() > iIntValue) {
            iIntValue = ((Integer) this.LJIILJJIL.first).intValue();
        }
        SimulcastConfig simulcastConfig = this.LJIIIIZZ;
        return simulcastConfig != null ? (simulcastConfig.mode.equals("dual") && iIntValue == 0) ? "big_normal" : iIntValue < simulcastConfig.streamConfigs.size() ? ((SimulcastConfig.StreamConfig) ListProtector.get(simulcastConfig.streamConfigs, iIntValue)).name : "" : "";
    }

    @Override // X.InterfaceC1274230jGP
    public final void LJIIJJI() {
        C1271990jCn[] c1271990jCnArr = this.LJIIJJI;
        C1272000jCo c1272000jCo = this.LJIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchToLinkMic rtcVideoEncoderConfigs:");
        sbLIZ.append(c1271990jCnArr);
        sbLIZ.append(" videoPerformanceConfig:");
        sbLIZ.append(c1272000jCo);
        AVLog.logKibana(4, "SimulcastManager", C2188811AlT.LIZIZ(sbLIZ), null);
        if (c1271990jCnArr == null) {
            C1271990jCn c1271990jCn = new C1271990jCn();
            c1271990jCn.LIZJ = 15;
            c1271990jCn.LIZ = 360;
            c1271990jCn.LIZIZ = 640;
            c1271990jCn.LIZLLL = 1200;
            if (this.LIZIZ.LJIJJLI.LJIIIIZZ() == 2) {
                C1271990jCn c1271990jCn2 = new C1271990jCn();
                c1271990jCn2.LIZJ = 15;
                c1271990jCn2.LIZ = 1440;
                c1271990jCn2.LIZIZ = 2560;
                c1271990jCn2.LIZLLL = 0;
                c1271990jCnArr = new C1271990jCn[]{c1271990jCn2, c1271990jCn};
            } else {
                c1271990jCnArr = new C1271990jCn[]{c1271990jCn};
            }
        }
        this.LIZJ.LJJIII(c1271990jCnArr);
        if (c1272000jCo != null) {
            this.LIZJ.LJJIFFI(c1272000jCo);
        }
    }

    @Override // X.InterfaceC1274230jGP
    public final boolean LJIILL() {
        return this.LJII && this.LJI;
    }

    @Override // X.InterfaceC1274230jGP
    public final boolean LJIIZILJ() {
        return this.LIZIZ.LJIJJLI.LJI() && C1271270jBd.LIZ.LJFF(2) && "layout_linkmic_float_full".equals(this.LIZLLL) && this.LJIIJ;
    }

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
    public final void LJJ() {
        if (this.LJIIIZ.LLD().LJJLIIIJILLIZJL != null) {
            this.LJIIIZ.LLD().LJJLIIIJILLIZJL.updateFeature("enable_linkmic_simulcast", this.LJI ? 1 : 0);
            this.LJIIIZ.LLD().LJJLIIIJILLIZJL.updateFeature("linkmic_layout_config", this.LIZ);
            this.LJIIIZ.LLD().LJJLIIIJILLIZJL.updateFeature("prev_multi_stream_stats", this.LJIILL);
            this.LJIIIZ.LLD().LJJLIIIJILLIZJL.updateFeature("linkmic_layout_config_id", this.LIZLLL);
            this.LJIIIZ.LLD().LJJLIIIJILLIZJL.updateFeature("simulcast_type", this.LJFF);
            this.LJIIIZ.LLD().LJJLIIIJILLIZJL.updateFeature("simulcast_stream_name", this.LJIILLIIL);
            return;
        }
        C1267110j4v c1267110j4v = new C1267110j4v();
        c1267110j4v.LIZ = this.LJI ? 1 : 0;
        c1267110j4v.LJ = this.LIZ;
        c1267110j4v.LIZLLL = this.LJIILL;
        c1267110j4v.LIZIZ = this.LIZLLL;
        c1267110j4v.LIZJ = this.LJFF;
        c1267110j4v.LJFF = this.LJIILLIIL;
        this.LJIIIZ.LLLLLLZZ(c1267110j4v);
    }

    @Override // X.InterfaceC1274230jGP
    public final boolean LJIJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceUpdateRtcEncoderConfig mRtcVideoEncoderConfigs:");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(" mVideoPerformanceConfig:");
        sbLIZ.append(this.LJIIL);
        AVLog.logKibana(5, "SimulcastManager", C2188811AlT.LIZIZ(sbLIZ), null);
        C1271990jCn[] c1271990jCnArr = this.LJIIJJI;
        C1272000jCo c1272000jCo = this.LJIIL;
        if (c1271990jCnArr == null || c1272000jCo == null) {
            return false;
        }
        this.LIZJ.LJJI(c1271990jCnArr);
        this.LIZJ.LJJIFFI(c1272000jCo);
        return true;
    }

    @Override // X.InterfaceC1274230jGP
    public final LinkMicLayoutConfig LJFF() {
        return this.LJ;
    }

    @Override // X.InterfaceC1274230jGP
    public final SimulcastConfig LJIILLIIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1274230jGP
    public final String LJIJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1274230jGP
    public final String LJIJJLI() {
        return this.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    @Override // X.InterfaceC1274230jGP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJII(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto Lf
            X.0jCo r0 = r2.LJIIL
            if (r0 == 0) goto L1d
            java.lang.String r1 = r2.LJIILLIIL
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L20
            return r1
        Lf:
            r0 = 1
            if (r3 != r0) goto L1d
            android.util.Pair<java.lang.Integer, com.ss.ttlivestreamer.livestreamv2.strategy.SimulcastConfig$StreamConfig> r0 = r2.LJIILJJIL
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.second
            com.ss.ttlivestreamer.livestreamv2.strategy.SimulcastConfig$StreamConfig r0 = (com.ss.ttlivestreamer.livestreamv2.strategy.SimulcastConfig.StreamConfig) r0
            java.lang.String r1 = r0.name
            goto L8
        L1d:
            java.lang.String r1 = ""
            goto L8
        L20:
            java.lang.String r0 = "default"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274110jGD.LJII(int):java.lang.String");
    }

    @Override // X.InterfaceC1274230jGP
    public final void LJIIIIZZ(JSONObject jSONObject) {
        String str;
        try {
            jSONObject.put("layout_config_id", this.LIZLLL);
            jSONObject.put("linkmic_biz_id", this.LIZIZ.LJJIJ);
            C1275140jHs c1275140jHs = this.LIZIZ.LJII;
            if (c1275140jHs == null) {
                str = "";
            } else {
                str = c1275140jHs.LIZLLL;
            }
            jSONObject.put("channel_id", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1274230jGP
    public final void LJIIIZ(String str) {
        this.LJIILL = str;
        LJJ();
    }

    @Override // X.InterfaceC1274230jGP
    public final void LJIILIIL(boolean z) {
        this.LJII = z;
        if (!z) {
            this.LJIIIZ.LJLIL();
        }
    }

    public final void LIZ(float f, boolean z) {
        this.LJIIZILJ = z;
        this.LJIJ = f;
        SimulcastConfig simulcastConfig = this.LJIIIIZZ;
        ArrayList arrayList = new ArrayList();
        String str = simulcastConfig.mode;
        str.getClass();
        if (!str.equals("single")) {
            if (str.equals("dual")) {
                arrayList.add(ListProtector.get(simulcastConfig.streamConfigs, 0));
                arrayList.add(ListProtector.get(simulcastConfig.streamConfigs, 1));
            }
        } else {
            if (this.LIZIZ.LJIJJLI.LJIIIIZZ() == 2) {
                SimulcastConfig.StreamConfig streamConfig = new SimulcastConfig.StreamConfig();
                streamConfig.name = "dummy";
                streamConfig.encodeWidth = 1440;
                streamConfig.encodeHeight = 2560;
                streamConfig.fps = 15;
                streamConfig.bitrate = 0;
                arrayList.add(streamConfig);
            }
            arrayList.add(ListProtector.get(simulcastConfig.streamConfigs, 0));
        }
        C1271990jCn[] c1271990jCnArr = new C1271990jCn[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            SimulcastConfig.StreamConfig streamConfig2 = (SimulcastConfig.StreamConfig) ListProtector.get(arrayList, i);
            C1271990jCn c1271990jCn = new C1271990jCn();
            c1271990jCn.LJ = streamConfig2.name;
            c1271990jCn.LIZJ = streamConfig2.fps;
            c1271990jCn.LIZIZ = streamConfig2.encodeHeight;
            c1271990jCn.LIZ = streamConfig2.encodeWidth;
            c1271990jCn.LIZLLL = streamConfig2.bitrate;
            AbstractC1273900jFs abstractC1273900jFs = this.LJIIIZ;
            if (abstractC1273900jFs != null && abstractC1273900jFs.LLD() != null && this.LJIIZILJ) {
                c1271990jCn.LIZLLL = (int) (streamConfig2.bitrate * this.LJIJ);
            }
            if (LJIIZILJ()) {
                c1271990jCn.LIZ = streamConfig2.encodeHeight / 2;
                int i2 = streamConfig2.bitrate_1_2;
                if (i2 > 0) {
                    c1271990jCn.LIZLLL = i2;
                }
            }
            c1271990jCnArr[i] = c1271990jCn;
        }
        this.LJIIJJI = c1271990jCnArr;
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZIZ.LIZJ.LIZ();
        if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LLJI() && this.LIZIZ.LJIJJLI.LJIIIZ()) {
            C1269630j8z c1269630j8z = (C1269630j8z) C1269570j8t.LIZIZ(EnumC1269590j8v.SimulcastUpdateLayoutConfig, C1269570j8t.LJFF);
            C1271990jCn[] c1271990jCnArr2 = this.LJIIJJI;
            C1272000jCo c1272000jCo = this.LJIIL;
            c1269630j8z.LJII = c1271990jCnArr2;
            c1269630j8z.LJIIIIZZ = c1272000jCo;
            int i3 = C1269570j8t.LIZIZ;
            AbstractC1273900jFs abstractC1273900jFs2 = this.LJIIIZ;
            if (abstractC1273900jFs2 != null) {
                abstractC1273900jFs2.LLL(c1269630j8z.LIZJ(i3));
                abstractC1273900jFs2.LJLI(c1269630j8z);
                return;
            }
            return;
        }
        if (this.LIZJ.LJIJ()) {
            this.LIZJ.LJJI(c1271990jCnArr);
            this.LIZJ.LJJIFFI(this.LJIIL);
        } else {
            AVLog.logKibana(5, "SimulcastManager", "setLayoutEncoderConfigAndDefaultPerfConfig mRTCEngine is not ready", null);
        }
    }

    public final void LJ(C1271990jCn[] c1271990jCnArr, C1272000jCo c1272000jCo) {
        if (this.LIZJ.LJIJ()) {
            if (c1271990jCnArr != null) {
                this.LIZJ.LJJI(c1271990jCnArr);
            }
            if (c1272000jCo != null) {
                this.LIZJ.LJJIFFI(c1272000jCo);
                return;
            }
            return;
        }
        AVLog.logKibana(5, "SimulcastManager", "setLayoutEncoderConfigAndDefaultPerfConfig mRTCEngine is not ready", null);
    }

    @Override // X.InterfaceC1274230jGP
    public final void LJIILJJIL(String str, LinkMicLayoutConfig linkMicLayoutConfig) {
        JSONObject jSONObjectOptJSONObject;
        SimulcastConfig simulcastConfig;
        int i;
        this.LJIIIZ.LJLIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLayoutConfig() called with: configId = [");
        sbLIZ.append(str);
        sbLIZ.append("], linkMicLayoutConfig = [");
        sbLIZ.append(linkMicLayoutConfig);
        sbLIZ.append(" simulcastType:");
        sbLIZ.append(this.LJFF);
        AVLog.logKibana(4, "SimulcastManager", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LIZLLL = str;
        this.LJ = linkMicLayoutConfig;
        this.LIZ = linkMicLayoutConfig.LIZ;
        String str2 = this.LJFF;
        JSONObject jSONObject = linkMicLayoutConfig.LIZ;
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null && (simulcastConfig = (SimulcastConfig) GsonProtectorUtils.fromJson(new Gson(), C786410Ut5.J3(jSONObjectOptJSONObject), SimulcastConfig.class)) != null) {
            this.LJIIIIZZ = simulcastConfig;
            ArrayList arrayList = new ArrayList();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setLayoutEncoderConfigAndDefaultPerfConfig simulcastConfig:");
            sbLIZ2.append(simulcastConfig);
            AVLog.logKibana(4, "SimulcastManager", C2188811AlT.LIZIZ(sbLIZ2), null);
            String str3 = simulcastConfig.mode;
            str3.getClass();
            int i2 = 1;
            if (!str3.equals("single")) {
                if (str3.equals("dual")) {
                    if (simulcastConfig.streamConfigs.size() < 2) {
                        AVLog.logKibana(4, "SimulcastManager", "setLayoutEncoderConfigAndDefaultPerfConfig DUAL_MODE, simulcastConfig.streamConfigs size < 2", null);
                        if (this.LIZIZ.LJIJJLI.LJIIIIZZ() == 2) {
                            arrayList.add(LIZLLL());
                        }
                        arrayList.add(new SimulcastConfig.StreamConfig());
                    } else {
                        arrayList.add(ListProtector.get(simulcastConfig.streamConfigs, 0));
                        arrayList.add(ListProtector.get(simulcastConfig.streamConfigs, 1));
                    }
                }
            } else if (simulcastConfig.streamConfigs.isEmpty()) {
                AVLog.logKibana(4, "SimulcastManager", "setLayoutEncoderConfigAndDefaultPerfConfig SINGLE_MODE, simulcastConfig.streamConfigs.isEmpty", null);
                if (this.LIZIZ.LJIJJLI.LJIIIIZZ() == 2) {
                    arrayList.add(LIZLLL());
                }
                arrayList.add(new SimulcastConfig.StreamConfig());
            } else {
                if (this.LIZIZ.LJIJJLI.LJIIIIZZ() == 2) {
                    SimulcastConfig.StreamConfig streamConfigLIZLLL = LIZLLL();
                    streamConfigLIZLLL.fps = ((SimulcastConfig.StreamConfig) ListProtector.get(simulcastConfig.streamConfigs, 0)).fps;
                    arrayList.add(streamConfigLIZLLL);
                }
                arrayList.add(ListProtector.get(simulcastConfig.streamConfigs, 0));
            }
            C1271990jCn[] c1271990jCnArr = new C1271990jCn[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                SimulcastConfig.StreamConfig streamConfig = (SimulcastConfig.StreamConfig) ListProtector.get(arrayList, i3);
                C1271990jCn c1271990jCn = new C1271990jCn();
                c1271990jCn.LJ = streamConfig.name;
                c1271990jCn.LIZJ = streamConfig.fps;
                c1271990jCn.LIZIZ = streamConfig.encodeHeight;
                c1271990jCn.LIZ = streamConfig.encodeWidth;
                c1271990jCn.LIZLLL = streamConfig.bitrate;
                AbstractC1273900jFs abstractC1273900jFs = this.LJIIIZ;
                if (abstractC1273900jFs != null && abstractC1273900jFs.LLD() != null && this.LJIIZILJ) {
                    c1271990jCn.LIZLLL = (int) (streamConfig.bitrate * this.LJIJ);
                }
                if (LJIIZILJ()) {
                    c1271990jCn.LIZ = streamConfig.encodeHeight / 2;
                    int i4 = streamConfig.bitrate_1_2;
                    if (i4 > 0) {
                        c1271990jCn.LIZLLL = i4;
                    }
                }
                c1271990jCnArr[i3] = c1271990jCn;
            }
            C1272000jCo c1272000jCo = new C1272000jCo();
            boolean zContains = this.LIZLLL.contains("_fov_opti");
            this.LJIIIZ.LLD().LJJIJ = zContains;
            if (zContains) {
                SimulcastConfig.StreamConfig streamConfig2 = (SimulcastConfig.StreamConfig) ListProtector.get(simulcastConfig.streamConfigs, 0);
                this.LJIIIZ.LLD().LJJIJIL = streamConfig2.effectWidth * streamConfig2.effectHeight;
            }
            int i5 = simulcastConfig.defaultIndex;
            if (i5 >= 0) {
                i2 = i5;
            }
            SimulcastConfig.StreamConfig streamConfig3 = (SimulcastConfig.StreamConfig) ListProtector.get(simulcastConfig.streamConfigs, i2);
            TEBundle tEBundle = new TEBundle();
            int i6 = streamConfig3.effectWidth;
            if (i6 > 0 && streamConfig3.effectHeight > 0 && this.LJIIIZ != null) {
                tEBundle.setInt("cap_adapted_width", i6);
                tEBundle.setInt("cap_adapted_height", streamConfig3.effectHeight);
                tEBundle.setInt("fps", streamConfig3.fps);
                if (LJIIZILJ()) {
                    tEBundle.setInt("cap_adapted_width", streamConfig3.effectHeight / 2);
                }
            }
            AbstractC1273900jFs abstractC1273900jFs2 = this.LJIIIZ;
            if (abstractC1273900jFs2 != null) {
                abstractC1273900jFs2.LJJLIIJ(tEBundle);
            }
            tEBundle.release();
            c1272000jCo.LIZ = streamConfig3.encodeWidth;
            c1272000jCo.LIZIZ = streamConfig3.encodeHeight;
            c1272000jCo.LIZJ = streamConfig3.fps;
            this.LJIILLIIL = streamConfig3.name;
            if (LJIIZILJ()) {
                c1272000jCo.LIZ = c1272000jCo.LIZIZ / 2;
            }
            this.LJIILIIL = new Pair<>(Integer.valueOf(i2), streamConfig3);
            this.LJIIJJI = c1271990jCnArr;
            this.LJIIL = c1272000jCo;
            AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZIZ.LIZJ.LIZ();
            if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LLJI() && this.LIZIZ.LJIJJLI.LJIIIZ()) {
                C1269630j8z c1269630j8z = (C1269630j8z) C1269570j8t.LIZIZ(EnumC1269590j8v.SimulcastUpdateLayoutConfig, C1269570j8t.LJFF);
                C1271990jCn[] c1271990jCnArr2 = this.LJIIJJI;
                C1272000jCo c1272000jCo2 = this.LJIIL;
                c1269630j8z.LJII = c1271990jCnArr2;
                c1269630j8z.LJIIIIZZ = c1272000jCo2;
                int i7 = C1269570j8t.LIZIZ;
                AbstractC1273900jFs abstractC1273900jFs3 = this.LJIIIZ;
                if (abstractC1273900jFs3 != null) {
                    abstractC1273900jFs3.LLL(c1269630j8z.LIZJ(i7));
                    abstractC1273900jFs3.LJLI(c1269630j8z);
                }
            } else if (this.LIZJ.LJIJ()) {
                this.LIZJ.LJJI(c1271990jCnArr);
                this.LIZJ.LJJIFFI(c1272000jCo);
            } else {
                AVLog.logKibana(5, "SimulcastManager", "setLayoutEncoderConfigAndDefaultPerfConfig mRTCEngine is not ready", null);
            }
            TEBundle tEBundle2 = new TEBundle();
            AbstractC1273900jFs abstractC1273900jFs4 = this.LJIIIZ;
            if (abstractC1273900jFs4 != null && abstractC1273900jFs4.LLD() != null && abstractC1273900jFs4.LLD().LJLJI.LJIIZILJ != null) {
                int i8 = simulcastConfig.captureWidth;
                if (i8 > 0 && (i = simulcastConfig.captureHeight) > 0 && this.LJIIIZ != null) {
                    LIZIZ(i8, i, tEBundle2);
                }
                AbstractC1273900jFs abstractC1273900jFs5 = this.LJIIIZ;
                if (abstractC1273900jFs5.LJJIIJZLJL() != null && abstractC1273900jFs5.LJJIIJZLJL().LIZLLL != null) {
                    abstractC1273900jFs5.LJJIIJZLJL();
                    abstractC1273900jFs5.LLD().LIZ.mVPassInteractCfg.getClass();
                }
                Pair<Integer, Integer> pairLIZJ = C1274140jGG.LIZJ(abstractC1273900jFs5, linkMicLayoutConfig.captureFpsMin, linkMicLayoutConfig.captureFpsMax);
                int iIntValue = ((Integer) pairLIZJ.first).intValue();
                int iIntValue2 = ((Integer) pairLIZJ.second).intValue();
                if (iIntValue > 0) {
                    tEBundle2.setInt("videoCaptureMinFps", iIntValue);
                }
                if (iIntValue2 > 0) {
                    tEBundle2.setInt("videoCaptureFps", iIntValue2);
                }
                this.LJIIIZ.LJJLIIJ(tEBundle2);
                tEBundle2.release();
            }
            LJJ();
            if (this.LJIIIZ.LJLLJ() != null && !TextUtils.isEmpty(str)) {
                this.LJIIIZ.LLLLLL();
            }
            this.LJIILJJIL = null;
            this.LJIILL = "";
            return;
        }
        AVLog.logKibana(4, "SimulcastManager", "updateLayoutConfig simulcastConfig == null, return ", null);
    }

    public C1274110jGD(C1274810jHL c1274810jHL, C1274890jHT c1274890jHT, boolean z) {
        this.LJFF = "simulcast";
        this.LIZIZ = c1274810jHL;
        this.LIZJ = c1274890jHT;
        AbstractC1273900jFs abstractC1273900jFsLIZ = c1274810jHL.LIZJ.LIZ();
        this.LJIIIZ = abstractC1273900jFsLIZ;
        abstractC1273900jFsLIZ.LLLLIILLL(this);
        this.LJFF = "simulcast";
        this.LJIIJ = z;
    }

    public final void LIZIZ(int i, int i2, TEBundle tEBundle) {
        AbstractC1273900jFs abstractC1273900jFs = this.LJIIIZ;
        if (abstractC1273900jFs != null && abstractC1273900jFs.LLD() != null && abstractC1273900jFs.LLD().LJLJI.LJIIZILJ != null) {
            Context context = abstractC1273900jFs.LLD().LJLJI.LJIIZILJ;
            boolean z = true;
            if (abstractC1273900jFs.LJJLIIIJILLIZJL(true) != 1) {
                z = false;
            }
            C1274150jGH c1274150jGHLIZLLL = C1274140jGG.LIZLLL(i2, i, context, z);
            int i3 = c1274150jGHLIZLLL.LIZIZ;
            int i4 = c1274150jGHLIZLLL.LIZ;
            tEBundle.setInt("videoCaptureWidth", i3);
            tEBundle.setInt("videoCaptureHeight", i4);
        }
    }

    public final Pair<Integer, SimulcastConfig.StreamConfig> LIZJ(int i, int i2, int i3) {
        List<SimulcastConfig.StreamConfig> list;
        SimulcastConfig simulcastConfig = this.LJIIIIZZ;
        if (simulcastConfig != null && (list = simulcastConfig.streamConfigs) != null && list.size() > 0) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                SimulcastConfig.StreamConfig streamConfig = (SimulcastConfig.StreamConfig) ListProtector.get(list, i4);
                if (LJIIZILJ()) {
                    int i5 = streamConfig.encodeHeight;
                    if (i >= i5 / 2 && i2 >= i5 && i3 >= streamConfig.fps) {
                        return new Pair<>(Integer.valueOf(i4), streamConfig);
                    }
                } else if (i >= streamConfig.encodeWidth && i2 >= streamConfig.encodeHeight && i3 >= streamConfig.fps) {
                    return new Pair<>(Integer.valueOf(i4), streamConfig);
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1274230jGP
    public final void LJIIL(int i, int i2, int i3, boolean z) {
        this.LJIILJJIL = LIZJ(i, i2, i3);
    }

    @Override // X.InterfaceC1274230jGP
    public final void LJI(int i, int i2, int i3, String str, String str2) {
        if (!str2.equals(this.LIZLLL)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updatePerfConfig() called, configId not equals mLayoutConfigId, configId:");
            sbLIZ.append(str2);
            sbLIZ.append(" mLayoutConfigId:");
            sbLIZ.append(this.LIZLLL);
            AVLog.logKibana(4, "SimulcastManager", C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updatePerfConfig() called with: name = [");
        sbLIZ2.append(str);
        sbLIZ2.append("], w = [");
        sbLIZ2.append(i);
        sbLIZ2.append("], h = [");
        sbLIZ2.append(i2);
        sbLIZ2.append("], fps = [");
        sbLIZ2.append(i3);
        sbLIZ2.append(e3.f);
        AVLog.logKibana(4, "SimulcastManager", C2188811AlT.LIZIZ(sbLIZ2), null);
        C1272000jCo c1272000jCo = new C1272000jCo();
        c1272000jCo.LIZ = i;
        c1272000jCo.LIZIZ = i2;
        if (LJIIZILJ()) {
            c1272000jCo.LIZ = i2 / 2;
        }
        c1272000jCo.LIZJ = i3;
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZIZ.LIZJ.LIZ();
        if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LLJI() && this.LIZIZ.LJIJJLI.LJIIIZ()) {
            C1269630j8z c1269630j8z = (C1269630j8z) C1269570j8t.LIZIZ(EnumC1269590j8v.SimulcastUpdateLayoutConfig, C1269570j8t.LJFF);
            c1269630j8z.LJII = null;
            c1269630j8z.LJIIIIZZ = c1272000jCo;
            int i4 = C1269570j8t.LIZIZ;
            AbstractC1273900jFs abstractC1273900jFs = this.LJIIIZ;
            if (abstractC1273900jFs != null) {
                abstractC1273900jFs.LLL(c1269630j8z.LIZJ(i4));
                abstractC1273900jFs.LJLI(c1269630j8z);
            }
        } else {
            this.LIZJ.LJJIFFI(c1272000jCo);
        }
        this.LJIIL = c1272000jCo;
        this.LJIILIIL = LIZJ(i, i2, i3);
        this.LJIILLIIL = str;
        LJJ();
    }
}
