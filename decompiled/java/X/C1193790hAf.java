package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AnchorInfoComponent;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.anchor.chat.VideoCardShowPoiAnchor;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0hAf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193790hAf implements C0ZYL, InterfaceC497601wk {
    public AnchorInfoComponent LL;
    public final Map<String, Boolean> LLILLJJLI = new LinkedHashMap();
    public final Keva LLILLL;
    public String LLILZ;

    @Override // X.C0ZYL
    public final void LIZIZ() {
    }

    @Override // X.C0ZYL
    public final String LIZLLL() {
        String str;
        AnchorInfoComponent anchorInfoComponent = this.LL;
        return (anchorInfoComponent == null || (str = anchorInfoComponent.keyword) == null) ? "" : str;
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2107308Nj.LIZ.plus(C2296908zH.LIZ());
    }

    public C1193790hAf() {
        Keva keva = C1185900gxw.LIZ;
        this.LLILLL = C1185900gxw.LIZ;
    }

    @Override // X.C0ZYL
    public final boolean enable() {
        AnchorInfoComponent anchorInfoComponent;
        String str;
        if (PoiEnableExperiment.LIZJ()) {
            Integer num = PoiServerConfigSettings.LIZ().poiConsumptionReverse;
            if ((num != null ? num.intValue() : 0) == 1 || C306710C0n.LIZ() || (anchorInfoComponent = this.LL) == null || (str = anchorInfoComponent.id) == null) {
                return false;
            }
            Integer num2 = VideoCardShowPoiAnchor.LIZ().videoCardShowPoiAnchor;
            if (num2 != null && num2.intValue() == 0) {
                return false;
            }
            Integer num3 = VideoCardShowPoiAnchor.LIZ().videoCardShowPoiAnchor;
            if (num3 != null && num3.intValue() == 1) {
                return true;
            }
            Integer num4 = VideoCardShowPoiAnchor.LIZ().videoCardShowPoiAnchor;
            if (num4 != null && num4.intValue() == 2) {
                Boolean bool = (Boolean) ((LinkedHashMap) this.LLILLJJLI).get(str);
                if (bool != null) {
                    return bool.booleanValue();
                }
                try {
                    Integer numIsTtKeyCategory = ((PoiAnchorData) C08JS.LIZIZ().LJII(anchorInfoComponent.extra, PoiAnchorData.class)).isTtKeyCategory();
                    boolean z = numIsTtKeyCategory == null || numIsTtKeyCategory.intValue() != 0;
                    this.LLILLJJLI.put(str, Boolean.valueOf(z));
                    return z;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            Integer num5 = VideoCardShowPoiAnchor.LIZ().videoCardShowPoiAnchor;
            if (num5 != null && num5.intValue() == 3) {
                Boolean bool2 = (Boolean) ((LinkedHashMap) this.LLILLJJLI).get(str);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                try {
                    Long l = ((PoiAnchorData) C08JS.LIZIZ().LJII(anchorInfoComponent.extra, PoiAnchorData.class)).favCnt;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    Integer num6 = VideoCardShowPoiAnchor.LIZ().favCnt;
                    boolean z2 = jLongValue >= ((long) (num6 != null ? num6.intValue() : 0));
                    this.LLILLJJLI.put(str, Boolean.valueOf(z2));
                    return z2;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return false;
    }

    @Override // X.C0ZYL
    public final void LIZ(AnchorInfoComponent anchorInfoComponent, String str) {
        this.LL = anchorInfoComponent;
        this.LLILZ = str;
    }

    @Override // X.C0ZYL
    public final void LIZJ(String str, Map<String, String> map) {
        AnchorInfoComponent anchorInfoComponent = this.LL;
        if (anchorInfoComponent == null) {
            return;
        }
        C23250099c.LIZLLL(this, C0PEM.LIZJ, null, new C1193810hAh(str, anchorInfoComponent, this, map, null), 2);
    }

    @Override // X.C0ZYL
    public final void LJ(Context context, String str, Map<String, String> map) {
        ActionLinkComponent actionLinkComponent;
        List<String> list;
        ActionLinkComponent actionLinkComponent2;
        List<String> list2;
        String str2;
        AnchorInfoComponent anchorInfoComponent = this.LL;
        if (anchorInfoComponent != null && (actionLinkComponent = anchorInfoComponent.schema) != null && (list = actionLinkComponent.data) != null && !list.isEmpty() && (actionLinkComponent2 = anchorInfoComponent.schema) != null && (list2 = actionLinkComponent2.data) != null && (str2 = (String) ListProtector.get(list2, 0)) != null && str2.length() != 0) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str2);
            smartRouteBuildRoute.withParam("poi_id", anchorInfoComponent.id);
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.withParam("enter_method", "video_card");
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                smartRouteBuildRoute.withParam((String) entry.getKey(), (String) entry.getValue());
            }
            smartRouteBuildRoute.open();
            C23250099c.LIZLLL(this, C0PEM.LIZJ, null, new C1193800hAg(str, anchorInfoComponent, this, map, null), 2);
        }
    }
}
