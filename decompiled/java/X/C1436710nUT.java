package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0nUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436710nUT {
    public static C1436780nUa LIZJ;
    public static final C1436710nUT LIZ = new C1436710nUT();
    public static final Map<String, C1436790nUb> LIZIZ = new LinkedHashMap();
    public static final int LIZLLL = 5000;
    public static final int LJ = 12;
    public static final Map<String, InterfaceC1436810nUd> LJFF = new LinkedHashMap();

    public static void LIZ() {
        Map<String, C1436790nUb> map = LIZIZ;
        if (!map.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check2cancelModerationQuery, current list is ");
            sbLIZ.append(map);
            LJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LJ("check2cancelModerationQuery, empty list cancel push&loop");
        ((IMainService) ServiceManager.get().getService(IMainService.class)).unRegisterModerationResultPush();
        C1436780nUa c1436780nUa = LIZJ;
        if (c1436780nUa != null) {
            c1436780nUa.LIZ();
        }
        LIZJ = null;
    }

    public static void LIZIZ() {
        for (Map.Entry entry : ((LinkedHashMap) LIZIZ).entrySet()) {
            String str = (String) entry.getKey();
            C1436790nUb c1436790nUb = (C1436790nUb) entry.getValue();
            if (c1436790nUb.LIZIZ >= LJ) {
                C1436730nUV c1436730nUV = C1436730nUV.LIZ;
                int i = LIZLLL;
                c1436730nUV.getClass();
                C1436730nUV.LIZ(c1436790nUb, true, -1, i);
                Map<String, InterfaceC1436810nUd> map = LJFF;
                InterfaceC1436810nUd interfaceC1436810nUd = (InterfaceC1436810nUd) ((LinkedHashMap) map).get(str);
                if (interfaceC1436810nUd != null) {
                    interfaceC1436810nUd.LIZ(str);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("doMsgTimeOutEvent, target uri is ");
                    sbLIZ.append(str);
                    LJ(C2188811AlT.LIZIZ(sbLIZ));
                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().onSaveLocalTimeoutEvent(str);
                }
                LIZIZ.remove(str);
                map.remove(str);
            }
        }
    }

    public static void LIZLLL() {
        Iterator it2 = ((LinkedHashMap) LIZIZ).values().iterator();
        while (it2.hasNext()) {
            ((C1436790nUb) it2.next()).LIZIZ++;
        }
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doMsgTransmission, data is ");
        sbLIZ.append(str);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().saveLocalByUniqueURI(str);
    }

    public static void LJ(String str) {
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("PubilshVideoModeration", str);
    }
}
