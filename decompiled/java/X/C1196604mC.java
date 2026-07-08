package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ml.request.meta.FlashCommonConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1196604mC extends C09AY implements Function0<Map<String, ? extends List<FlashCommonConfig>>> {
    public C1196604mC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends List<FlashCommonConfig>> invoke() {
        Map map;
        HashMap map2 = new HashMap();
        String strLIZIZ = C0R1F.LIZIZ("flash_applog_config");
        try {
            if ((strLIZIZ.length() > 0) && (map = (Map) C08JS.LIZIZ().LJIIIIZZ(strLIZIZ, new TypeToken<Map<String, ? extends List<FlashCommonConfig>>>() { // from class: X.04Zi
            }.getType())) != null) {
                map2.putAll(map);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1337780kuu.LIZ(e, null, 6);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashApplogConfigMap:");
        sbLIZ.append(map2);
        C2188811AlT.LIZIZ(sbLIZ);
        return map2;
    }
}
