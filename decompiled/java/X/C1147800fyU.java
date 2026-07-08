package X;

import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServiceBioFormPreloadSetting;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadActionConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import webcast.api.sub.FormInfo;

/* JADX INFO: renamed from: X.0fyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147800fyU extends AbstractC1097350ef7 {
    public final Map<String, String> LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, Object> LIZJ;
    public final boolean LIZLLL;
    public final Map<String, Boolean> LJ;
    public final String LJFF;
    public C1784870wY1 LJI;

    @Override // X.InterfaceC1097470efJ
    public final boolean LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1097470efJ
    public final Map<String, String> LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1097470efJ
    public final Map<String, Boolean> LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1097470efJ
    public final Map<String, Object> LJII() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1097470efJ
    public final Map<String, String> getLogParam() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1097470efJ
    public final String getSceneKey() {
        return this.LJFF;
    }

    @Override // X.AbstractC1097350ef7, X.InterfaceC1097470efJ
    public final void LIZIZ(PreloadStrategyConfig preloadStrategyConfig) {
        C1784870wY1 c1784870wY1;
        C1822300xWO c1822300xWO;
        List<FormInfo> list;
        String str;
        List<String> listLIZ;
        C1822300xWO c1822300xWO2;
        List<FormInfo> list2;
        FormInfo formInfo;
        if (Intrinsics.LJFF(preloadStrategyConfig.preCheckKey, "preload_service_plus_form_submit") && (c1784870wY1 = this.LJI) != null && (c1822300xWO = c1784870wY1.LIZIZ) != null && (list = c1822300xWO.LJIIJ) != null && (!list.isEmpty())) {
            C1784870wY1 c1784870wY12 = this.LJI;
            String str2 = "";
            if (c1784870wY12 == null || (c1822300xWO2 = c1784870wY12.LIZIZ) == null || (list2 = c1822300xWO2.LJIIJ) == null || (formInfo = (FormInfo) ListProtector.get(list2, 0)) == null || (str = formInfo.schema) == null) {
                str = "";
            }
            PreloadActionConfig preloadActionConfig = preloadStrategyConfig.preloadAction;
            if (preloadActionConfig != null) {
                preloadActionConfig.scheme = str;
            }
            try {
                MatchResult matchResultFind$default = Regex.find$default(new Regex("gecko/resource/(.*?)/index\\.html"), URLDecoder.decode(str, "UTF-8"), 0, 2, null);
                if (matchResultFind$default != null && (listLIZ = matchResultFind$default.LIZ()) != null) {
                    String str3 = listLIZ.get(1);
                    if (str3 != null) {
                        str2 = str3;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("ServicePlusBioPreloadScene", e);
            }
            PreloadActionConfig preloadActionConfig2 = preloadStrategyConfig.preloadAction;
            if (preloadActionConfig2 != null) {
                preloadActionConfig2.channel = str2;
                preloadActionConfig2.schemeUniquePath = str2;
            }
        }
    }

    @Override // X.AbstractC1097350ef7, X.InterfaceC1097470efJ
    public final boolean LJFF(PreloadStrategyConfig preloadStrategyConfig) {
        String str;
        C1822300xWO c1822300xWO;
        C1822300xWO c1822300xWO2;
        List<FormInfo> list;
        C1822300xWO c1822300xWO3;
        C1822300xWO c1822300xWO4;
        List<FormInfo> list2;
        FormInfo formInfo;
        C1822300xWO c1822300xWO5;
        List<FormInfo> list3;
        if (Intrinsics.LJFF(preloadStrategyConfig.preCheckKey, "preload_service_plus_form_submit")) {
            C1784870wY1 c1784870wY1 = this.LJI;
            boolean z = false;
            if (c1784870wY1 != null && (c1822300xWO5 = c1784870wY1.LIZIZ) != null && (list3 = c1822300xWO5.LJIIJ) != null && list3.isEmpty()) {
                return false;
            }
            C1784870wY1 c1784870wY12 = this.LJI;
            if (c1784870wY12 == null || (c1822300xWO4 = c1784870wY12.LIZIZ) == null || (list2 = c1822300xWO4.LJIIJ) == null || (formInfo = (FormInfo) ListProtector.get(list2, 0)) == null || (str = formInfo.schema) == null) {
                str = "";
            }
            PreloadActionConfig preloadActionConfig = preloadStrategyConfig.preloadAction;
            if (preloadActionConfig != null) {
                preloadActionConfig.scheme = str;
            }
            C1784870wY1 c1784870wY13 = this.LJI;
            if (c1784870wY13 != null && (c1822300xWO = c1784870wY13.LIZIZ) != null && c1822300xWO.LJII > 1 && c1784870wY13 != null && (c1822300xWO2 = c1784870wY13.LIZIZ) != null && c1822300xWO2.LIZIZ && LivePcsServiceBioFormPreloadSetting.INSTANCE.getValue() && a0.LJJIIZI(str, "webview", false)) {
                z = true;
                C0JJO c0jjoXf = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf();
                C1784870wY1 c1784870wY14 = this.LJI;
                if (c1784870wY14 == null || (c1822300xWO3 = c1784870wY14.LIZIZ) == null || (list = c1822300xWO3.LJIIJ) == null) {
                    list = C13BV.INSTANCE;
                }
                c0jjoXf.LJIILIIL(list);
            }
            return z;
        }
        return super.LJFF(preloadStrategyConfig);
    }

    public C1147800fyU(Map map, Map map2, Map map3) {
        Map<String, Boolean> mapLJ = C2097608Jq.LJ();
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
        this.LIZLLL = true;
        this.LJ = mapLJ;
        this.LJFF = "live_pcs_service_plus_bio_page";
    }
}
