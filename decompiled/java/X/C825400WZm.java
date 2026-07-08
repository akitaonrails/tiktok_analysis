package X;

import com.bytedance.pns.engine.builtin.StrategyProtocol;
import com.bytedance.pumbaa.aspect.apicalling.sdk.SDKConfig;
import com.bytedance.pumbaa.aspect.apicalling.sdk.SDKServiceImpl;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0WZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825400WZm implements StrategyProtocol {
    public static final C825400WZm LIZ = new C825400WZm();
    public static JSONArray LIZIZ;

    @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
    public final boolean LIZIZ() {
        return true;
    }

    @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
    public final C825550Wa1 config() {
        return new C825550Wa1(Collections.singleton(new C825470WZt("sdk_common_report", C825410WZn.LIZJ, C2097608Jq.LJIIIIZZ(new Pair(C825410WZn.LIZLLL, "sdk"), new Pair(C825410WZn.LJ, LIZIZ), new Pair(C825410WZn.LJFF, C825410WZn.LJI)))), "sdk_local_strategy", "1");
    }

    @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
    public final C825530WZz LIZ(InterfaceC825580Wa4 interfaceC825580Wa4) {
        boolean z;
        Object objLIZ;
        Integer num;
        SDKConfig sDKConfig = SDKServiceImpl.LIZ;
        if (sDKConfig != null && sDKConfig.enableLocalGuardStrategy) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0WR6 c0wr6Query = interfaceC825580Wa4.contextInfo().query("origin_api_id");
            if (c0wr6Query != null) {
                objLIZ = c0wr6Query.LIZ();
            } else {
                objLIZ = null;
            }
            if ((objLIZ instanceof Integer) && (num = (Integer) objLIZ) != null && sDKConfig.LIZIZ(num.intValue()) && !sDKConfig.LIZ(num.intValue())) {
                C0WRU.LIZ(interfaceC825580Wa4, "builtin", "sdk_local:not_hit_sample_return_null");
                return null;
            }
            C0WRU.LIZ(interfaceC825580Wa4, "builtin", "sdk_local:guard_common_report_return_actions");
            List listSingletonList = Collections.singletonList("sdk_common_report");
            C13BV c13bv = C13BV.INSTANCE;
            return new C825530WZz(listSingletonList, true, c13bv, c13bv);
        }
        C0WRU.LIZ(interfaceC825580Wa4, "builtin", "sdk_local:disabled_return_null");
        return null;
    }
}
