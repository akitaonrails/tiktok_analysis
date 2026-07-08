package X;

import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00Bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C038600Bs {
    public static final Map<String, C10QP> LIZ;
    public static final List<C10OI> LIZIZ;

    static {
        List<C10OI> listSingletonList = Collections.singletonList(new C10QP() { // from class: X.10OI
            public static boolean LIZIZ;
            public static final String LIZJ = "trigger_login_by_forecast";

            @Override // X.C10QP
            public final List<FilterAbilityModel> LIZ() {
                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                return C1697810uHb.LJIILJJIL(C10OM.LJIIL);
            }

            @Override // X.C10QP
            public final void run() {
                if (LIZIZ) {
                    return;
                }
                if (((IProactiveTriggersService) ServiceManager.get().getService(IProactiveTriggersService.class)).LJIILJJIL(C19248710Sf.LIZIZ.LJII())) {
                    C20684815ws.onEventV3(LIZJ);
                }
                LIZIZ = true;
            }
        });
        LIZIZ = listSingletonList;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listSingletonList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C10OI c10oi : listSingletonList) {
            c10oi.getClass();
            linkedHashMap.put("forecast_show_login_task", c10oi);
        }
        LIZ = linkedHashMap;
    }
}
