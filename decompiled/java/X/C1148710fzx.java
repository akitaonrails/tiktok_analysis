package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadActionConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0fzx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148710fzx extends AbstractC1097350ef7 {
    public final Map<String, String> LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, Object> LIZJ;
    public final boolean LIZLLL;
    public final Map<String, Boolean> LJ;
    public final String LJFF;
    public SMBOptInQualificationResponse.ResponseData LJI;
    public Function0<String> LJII;
    public Function0<String> LJIIIIZZ;

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
        String strInvoke;
        String str = preloadStrategyConfig.preCheckKey;
        if (Intrinsics.LJFF(str, "preload_industry_list")) {
            strInvoke = this.LJII.invoke();
        } else if (Intrinsics.LJFF(str, "preload_service_opt_in_enable")) {
            strInvoke = this.LJIIIIZZ.invoke();
        } else {
            strInvoke = "";
        }
        if (strInvoke.length() > 0) {
            String strLIZIZ = C1547760qNa.LIZIZ(strInvoke);
            PreloadActionConfig preloadActionConfig = preloadStrategyConfig.preloadAction;
            if (preloadActionConfig != null) {
                preloadActionConfig.scheme = strLIZIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("roma schema=");
            sbLIZ.append(strInvoke);
            sbLIZ.append(" \n --final schema = ");
            sbLIZ.append(strLIZIZ);
            C20441214yg.LIZIZ("ServicePlusOptInPreloadScene", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC1097350ef7, X.InterfaceC1097470efJ
    public final boolean LJFF(PreloadStrategyConfig preloadStrategyConfig) {
        SMBOptInQualificationResponse.ResponseData responseData = this.LJI;
        boolean z = false;
        if (responseData == null || !responseData.qualification || !C1148720fzy.LIZ()) {
            return false;
        }
        String str = preloadStrategyConfig.preCheckKey;
        if (Intrinsics.LJFF(str, "preload_industry_list")) {
            SMBOptInQualificationResponse.ResponseData responseData2 = this.LJI;
            if (responseData2 != null && responseData2.hasValidatedIndustryLabel) {
                z = true;
            }
            return !z;
        }
        if (Intrinsics.LJFF(str, "preload_service_opt_in_enable")) {
            SMBOptInQualificationResponse.ResponseData responseData3 = this.LJI;
            if (responseData3 != null && responseData3.hasValidatedIndustryLabel) {
                return true;
            }
            return false;
        }
        return super.LJFF(preloadStrategyConfig);
    }

    public C1148710fzx(Map map, Map map2, Map map3) {
        Map<String, Boolean> mapLJ = C2097608Jq.LJ();
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
        this.LIZLLL = true;
        this.LJ = mapLJ;
        this.LJFF = "live_pcs_service_plus_opt_in";
        this.LJII = new C1148730fzz();
        this.LJIIIIZZ = new C1148740g00();
    }
}
