package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IAgeGradService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CZT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CZT {
    public static final C0CZT LIZ = new C0CZT();
    public static final Map<String, Boolean> LIZIZ = new LinkedHashMap();
    public static String LIZJ = C461720I8s.LIZIZ();

    public static boolean LIZ() {
        if (!C290950Ban.LIZ()) {
            return false;
        }
        String strLIZIZ = C461720I8s.LIZIZ();
        if (!Intrinsics.LJFF(strLIZIZ, LIZJ)) {
            LIZIZ.put(LIZJ, Boolean.FALSE);
        }
        LIZJ = strLIZIZ;
        Map<String, Boolean> map = LIZIZ;
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(strLIZIZ);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = ((IAgeGradService) ServiceManager.get().getService(IAgeGradService.class)).LIZIZ("poi_publish") == 1;
        map.put(strLIZIZ, Boolean.valueOf(z));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAgeGraduationUtil isGraduateUser get from pns, state = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }
}
