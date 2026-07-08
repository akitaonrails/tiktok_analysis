package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Htx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455710Htx {
    public static final C455710Htx LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public volatile C09U0 LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C455710Htx.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C455710Htx c455710Htx = new C455710Htx();
        LIZIZ = c455710Htx;
        C09U0 c09u0 = c455710Htx.LIZ;
        if (c09u0 == null) {
            synchronized (c455710Htx) {
                c09u0 = c455710Htx.LIZ;
                if (c09u0 == null) {
                    c09u0 = (C09U0) C1807670x8n.p();
                    c455710Htx.LIZ = c09u0;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c09u0.LIZ.plus(C2296908zH.LIZ()));
    }

    public static Map LIZ() {
        C0Z7V c0z7vLJIILJJIL;
        String strLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService != null && (c0z7vLJIILJJIL = iIMBusinessChatService.LJIILJJIL()) != null && (strLIZIZ = c0z7vLJIILJJIL.LIZIZ(C461720I8s.LIZJ())) != null) {
            linkedHashMap.put("account_type", strLIZIZ);
        }
        return linkedHashMap;
    }

    public static void LIZJ(C455710Htx c455710Htx, Map map) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c455710Htx.getClass();
        C23250099c.LIZLLL(LIZLLL, null, null, new C455700Htw(interfaceC1493505szLIZIZ, map, null), 3);
    }

    public static void LIZIZ(C455710Htx c455710Htx, String str, String str2, Map map) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c455710Htx.getClass();
        C23250099c.LIZLLL(LIZLLL, null, null, new C455690Htv(map, interfaceC1493505szLIZIZ, str, str2, null), 3);
    }
}
