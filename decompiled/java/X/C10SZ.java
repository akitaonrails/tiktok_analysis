package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.10SZ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10SZ extends C09AY implements Function0<C11NZ<IPluginService.PluginConfigResponse>> {
    public final /* synthetic */ PluginService LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ List<PluginService.PluginApi.CachedPlugin> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C10T0 LLIZLLLIL;
    public final /* synthetic */ C259800zU<Integer> LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ String LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10SZ(PluginService pluginService, Boolean bool, Boolean bool2, List<PluginService.PluginApi.CachedPlugin> list, boolean z, int i, String str, C10T0 c10t0, C259800zU<Integer> c259800zU, boolean z2, int i2, int i3, int i4, String str2) {
        super(0);
        this.LL = pluginService;
        this.LLILLJJLI = bool;
        this.LLILLL = bool2;
        this.LLILZ = list;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = str;
        this.LLIZLLLIL = c10t0;
        this.LLJ = c259800zU;
        this.LLJI = z2;
        this.LLJIJIL = i2;
        this.LLJILJIL = i3;
        this.LLJILJILJ = i4;
        this.LLJILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11NZ<IPluginService.PluginConfigResponse> invoke() throws JSONException {
        PluginService pluginService = this.LL;
        PluginService.PluginApi pluginApi = pluginService.api;
        Boolean bool = this.LLILLJJLI;
        Boolean bool2 = this.LLILLL;
        Boolean bool3 = Boolean.FALSE;
        String firstInstallVersion = pluginService.getFirstInstallVersion();
        String json = GsonProtectorUtils.toJson(new Gson(), this.LLILZ);
        Boolean boolValueOf = Boolean.valueOf(this.LLILZIL);
        Integer numValueOf = Integer.valueOf(this.LLILZLL);
        String str = this.LLIZ;
        String ssaid = this.LL.getSsaid();
        String str2 = this.LLIZLLLIL.LIZ;
        Boolean boolLIZLLL = C1514430pVp.LIZLLL();
        Integer num = this.LLJ.element;
        Integer numValueOf2 = Integer.valueOf(this.LLJI ? 1 : 0);
        int i = this.LLJIJIL;
        Integer numValueOf3 = i != -1 ? Integer.valueOf(i) : null;
        Long memorySize = this.LL.getMemorySize();
        Double screenDp = this.LL.getScreenDp();
        Integer numValueOf4 = Integer.valueOf(this.LLJILJIL);
        Integer numValueOf5 = Integer.valueOf(this.LLJILJILJ);
        String lowerCase = Build.MODEL.toLowerCase(Locale.ROOT);
        String attributionType = this.LL.getAttributionType();
        String attributionDetail = this.LL.getAttributionDetail();
        String adsGroupId = this.LL.getAdsGroupId();
        String requiredModelDecisionMap = this.LL.getRequiredModelDecisionMap();
        List<Long> downstreamExperimentFilterIds = this.LL.getDownstreamExperimentFilterIds();
        String str3 = this.LLJILLL;
        C10T0 c10t0 = this.LLIZLLLIL;
        return pluginApi.LIZ(bool, bool2, bool3, firstInstallVersion, json, boolValueOf, numValueOf, str, ssaid, str2, boolLIZLLL, num, numValueOf2, numValueOf3, null, memorySize, screenDp, numValueOf4, numValueOf5, lowerCase, attributionType, attributionDetail, adsGroupId, requiredModelDecisionMap, downstreamExperimentFilterIds, str3, c10t0.LIZIZ, c10t0.LIZJ, c10t0.LIZLLL).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.08Ld
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C0X52 c0x52 = (C0X52) obj;
                ((INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class)).LJIILJJIL(c0x52.LIZ);
                return c0x52.LIZIZ;
            }
        });
    }
}
