package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768000w6o {
    public static final C1768000w6o LIZ = new C1768000w6o();

    public static void LIZ(Map map) {
        map.put("is_first_launch", Integer.valueOf(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0));
        map.put("is_cold_launch", Integer.valueOf(!((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot() ? 1 : 0));
        if (C1121104a1.LIZ == null) {
            C1121104a1.LIZ = Boolean.valueOf(!C1257480ipO.LIZ.contains("is_first_show_mall"));
        }
        map.put("is_first_enter_mall", Integer.valueOf(Intrinsics.LJFF(C1121104a1.LIZ, Boolean.TRUE) ? 1 : 0));
        C1552540qVI.LIZ.getClass();
        map.put("is_ug_allowlist_user", C1552540qVI.LIZIZ().getSecond());
    }

    public static void LIZIZ(String str, Map map) {
        C1018703yb.LIZIZ(str, map);
        C1740030vNh.LIZ.getClass();
    }
}
