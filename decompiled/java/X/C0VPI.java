package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.sku.PcsServiceSkuNativeFormAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VPI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VPI extends C09AY implements InterfaceC1631620sYq<String, JSONObject, Map<String, ? extends String>, Unit> {
    public final /* synthetic */ PcsServiceSkuNativeFormAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VPI(PcsServiceSkuNativeFormAssem pcsServiceSkuNativeFormAssem) {
        super(3);
        this.LL = pcsServiceSkuNativeFormAssem;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, JSONObject jSONObject, Map<String, ? extends String> map) {
        String str2;
        Map<String, ? extends String> map2 = map;
        if (Intrinsics.LJFF(str, "instant_page_perf") && map2 != null && (str2 = map2.get("perf_data")) != null) {
            try {
                this.LL.Jo(str2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }
}
