package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.FullDsl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PatchLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Scene;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkGeckoDslDownloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicDslFallbackOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkDslUpdateRequestMaxThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMockUseLocalDslSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestDslMonitorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLimitDslUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestRequestLimitThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutApplogCombineSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveIoOptExperience;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303170k15 implements InterfaceC968960bK2 {
    public EnumC1154700g9c LIZ = EnumC1154700g9c.LOCAL;
    public final ConcurrentHashMap<String, DslLayout> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Layout> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Integer> LIZLLL = new ConcurrentHashMap<>();

    public final void LIZ() {
        C20441214yg.LJIIIZ("LiveDslManagerV2", "clear");
        this.LIZJ.clear();
        this.LIZIZ.clear();
    }

    public final String LJIIIZ() {
        this.LIZ = EnumC1154700g9c.LOCAL;
        try {
            return LJIIJ(new InputStreamReader(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getAssets().open("tiktok_live_link_mic_local/dsl.json")));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AZW.LJFF(LJII(198), "read dsl.json error", e.getMessage(), null);
            return "";
        }
    }

    public static String LJII(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
        sbLIZ.append("_LiveDslManagerV2_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIJ(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        bufferedReader.close();
                        return sb.toString();
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1303200k18.LIZJ(false, 10001, e.toString());
                    C1CC2.LIZ("LinkMic DSL IO exception occurs.", e);
                    bufferedReader.close();
                    return null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                bufferedReader.close();
                throw th;
            }
        }
    }

    public final String LIZIZ(String str) throws IOException {
        Object c098200Yq;
        if (LinkMicSdkGeckoDslDownloadSetting.getValue()) {
            File fileLJII = C1143780fs0.LJII(C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_link_mic"), "dsl.json");
            if (fileLJII != null && fileLJII.exists() && !LiveSdkMockUseLocalDslSetting.INSTANCE.isEnable()) {
                this.LIZ = EnumC1154700g9c.GECKO;
                if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
                    try {
                        c098200Yq = LJIIJ(new InputStreamReader(new C0VSP(fileLJII)));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                } else {
                    c098200Yq = LJIIJ(new InputStreamReader(new C0VSP(fileLJII)));
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                return (String) c098200Yq;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_getDslContent-362");
            LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            return LJIIIZ();
        }
        return LJIIIZ();
    }

    public final void LIZLLL(FullDsl fullDsl) {
        Layout next;
        Map<String, PatchLayout> map;
        PatchLayout patchLayout;
        for (Scene scene : fullDsl.getScene()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : scene.layoutId.entrySet()) {
                Iterator<Layout> it2 = fullDsl.getLayouts().iterator();
                do {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!Intrinsics.LJFF(next.layoutId, entry.getValue()));
                Layout layout = next;
                if (layout != null) {
                    linkedHashMap.put(entry.getKey(), layout);
                    layout.setScene(scene.scene);
                    layout.setVersion(scene.version);
                    layout.setBusinessType(entry.getKey());
                    HashMap map2 = new HashMap();
                    Map<String, Map<String, PatchLayout>> patches = fullDsl.getPatches();
                    if (patches != null) {
                        for (Map.Entry<String, Map<String, PatchLayout>> entry2 : patches.entrySet()) {
                            Map<String, Map<String, PatchLayout>> patches2 = fullDsl.getPatches();
                            if (patches2 != null && (map = patches2.get(entry2.getKey())) != null && (patchLayout = map.get(entry.getValue())) != null) {
                                map2.put(entry2.getKey(), patchLayout);
                            }
                            layout.setPatches(map2);
                        }
                    }
                }
            }
            this.LIZIZ.put(LJI(scene.scene, scene.version), new DslLayout(scene.scene, scene.version, linkedHashMap));
        }
        for (Layout layout2 : fullDsl.getLayouts()) {
            this.LIZJ.put(layout2.layoutId, layout2);
        }
        if (!LiveIoOptExperience.INSTANCE.enableLiveDslOpt()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LinkMicEnableDslPatchSetting allLayoutCache=");
            sbLIZ.append(this.LIZJ);
            C20441214yg.LIZIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC968960bK2
    public final boolean LJ(String str) {
        return this.LIZJ.containsKey(str);
    }

    public final void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryToUpdateGecko ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C20441214yg.LJIIIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_LiveDslManagerV2#init");
        LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJIIL(String str) {
        int iIntValue;
        LiveSdkMultiGuestDslMonitorSetting liveSdkMultiGuestDslMonitorSetting = LiveSdkMultiGuestDslMonitorSetting.INSTANCE;
        if (liveSdkMultiGuestDslMonitorSetting.isEnable() && !liveSdkMultiGuestDslMonitorSetting.getHasReported()) {
            if (liveSdkMultiGuestDslMonitorSetting.getDslUpdateCount() >= LiveSdkDslUpdateRequestMaxThresholdSetting.INSTANCE.getValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC1303240k1C.DSL.getValue());
                sbLIZ.append("_LiveDslManagerV2_");
                sbLIZ.append(233);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("dsl update count reach 100 times, request detail:");
                sbLIZ2.append(this.LIZLLL);
                C1AZW.LJFF(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                liveSdkMultiGuestDslMonitorSetting.setHasReported(true);
                this.LIZLLL.clear();
            } else {
                liveSdkMultiGuestDslMonitorSetting.setDslUpdateCount(liveSdkMultiGuestDslMonitorSetting.getDslUpdateCount() + 1);
                if (this.LIZLLL.containsKey(str)) {
                    Integer num = this.LIZLLL.get(str);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    this.LIZLLL.put(str, Integer.valueOf(iIntValue + 1));
                } else {
                    this.LIZLLL.put(str, 1);
                }
            }
        }
        LiveSdkMultiGuestLimitDslUpdateSetting liveSdkMultiGuestLimitDslUpdateSetting = LiveSdkMultiGuestLimitDslUpdateSetting.INSTANCE;
        if (liveSdkMultiGuestLimitDslUpdateSetting.isEnable() && liveSdkMultiGuestLimitDslUpdateSetting.getDslUpdateCount() >= LiveSdkMultiGuestRequestLimitThresholdSetting.INSTANCE.getValue()) {
            C20441214yg.LJ("LiveDslManagerV2", "update dsl request reach max threshold and has been limited, so return");
        } else {
            liveSdkMultiGuestLimitDslUpdateSetting.setDslUpdateCount(liveSdkMultiGuestLimitDslUpdateSetting.getDslUpdateCount() + 1);
            ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).nd1(new AbstractC1552040qUU() { // from class: X.0k16
                @Override // X.AbstractC1552040qUU
                public final void LJIJ(UpdatePackage updatePackage, Throwable th) throws JSONException {
                    if (LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isDslDownloadFailedReportEnable()) {
                        JSONObject jSONObjectLIZ = C1303200k18.LIZ(null);
                        jSONObjectLIZ.put("sub_event", "dsl_download_failed");
                        jSONObjectLIZ.put("gecko_channel", "tiktok_live_link_mic");
                        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_linkmic_layout_exception", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()));
                        c474500IjALIZIZ.LJJIIJZLJL(jSONObjectLIZ);
                        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                            c474500IjALIZIZ.LIZ();
                        } else {
                            c474500IjALIZIZ.LJJIJLIJ();
                            c474500IjALIZIZ.LJJIJL();
                        }
                        C1304680k3W.LIZ.LIZ(40005, C786410Ut5.J3(jSONObjectLIZ), null);
                    }
                }
            }, "tiktok_live_link_mic");
        }
    }

    public static String LJI(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ(String str, Function0 function0) {
        C23250099c.LIZLLL(C2296808zG.LIZIZ(), C0PEM.LIZJ, null, new C1303060k0u(this, str, function0, null), 2);
    }

    public final void LJIIJJI(int i, String str) throws JSONException {
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layout not found ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        C20441214yg.LJ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ == EnumC1154700g9c.LOCAL) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        boolean value = LinkMicSdkGeckoDslDownloadSetting.getValue();
        if (LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isLayoutNotFoundReportEnable()) {
            JSONObject jSONObjectLIZ = C1303200k18.LIZ(null);
            jSONObjectLIZ.put("sub_event", "layout_not_found");
            jSONObjectLIZ.put("layout_id", str);
            jSONObjectLIZ.put("layout_version", i);
            jSONObjectLIZ.put("is_local_file", i2);
            jSONObjectLIZ.put("is_gecko_enable", value ? 1 : 0);
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_linkmic_layout_exception", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()));
            c474500IjALIZIZ.LJJIIJZLJL(jSONObjectLIZ);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                c474500IjALIZIZ.LIZ();
            } else {
                c474500IjALIZIZ.LJJIJLIJ();
                c474500IjALIZIZ.LJJIJL();
            }
            C1304680k3W.LIZ.LIZ(40004, C786410Ut5.J3(jSONObjectLIZ), null);
        }
    }

    public final void LJIIIIZZ(String str, InterfaceC1303160k14 interfaceC1303160k14, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("query ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        Layout layout = this.LIZJ.get(str);
        if (layout != null) {
            C20441214yg.LJIIIZ("LiveDslManagerV2", "queryForCheck target cache");
            interfaceC1303160k14.LIZ(layout);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("_queryForCheck-170");
            LIZJ(C2188811AlT.LIZIZ(sbLIZ2), new C1303120k10(interfaceC1303160k14, this, str));
        }
    }

    @Override // X.InterfaceC968960bK2
    public final void LJJJ(int i, int i2, InterfaceC1303110k0z interfaceC1303110k0z, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("query scene=");
        sbLIZ.append(i);
        sbLIZ.append(" version=");
        sbLIZ.append(i2);
        C20441214yg.LJIIIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        DslLayout dslLayout = this.LIZIZ.get(LJI(i, i2));
        if (dslLayout != null) {
            C20441214yg.LJIIIZ("LiveDslManagerV2", "target cache");
            interfaceC1303110k0z.LIZ(dslLayout);
            return;
        }
        if (LinkmicDslFallbackOptimizeSetting.INSTANCE.enable()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_query-72");
            C23250099c.LIZLLL(C2296808zG.LIZIZ(), C0PEM.LIZJ, null, new C1303080k0w(this, i, i2, C2188811AlT.LIZIZ(sbLIZ2), interfaceC1303110k0z, null), 2);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("_query-74");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append("_handleIOAllOld");
        LIZJ(C2188811AlT.LIZIZ(sbLIZ4), new C1303100k0y(i, i2, this, interfaceC1303110k0z));
    }

    @Override // X.InterfaceC968960bK2
    public final void LJJL(int i, String str, InterfaceC1303160k14 interfaceC1303160k14, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("query ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LiveDslManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        Layout layout = this.LIZJ.get(str);
        if (layout != null) {
            C20441214yg.LJIIIZ("LiveDslManagerV2", "target cache");
            interfaceC1303160k14.LIZ(layout);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("_query-130");
            LIZJ(C2188811AlT.LIZIZ(sbLIZ2), new C1303130k11(i, interfaceC1303160k14, this, str));
        }
    }
}
