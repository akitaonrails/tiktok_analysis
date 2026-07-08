package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06ED, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06ED {
    public static final C06ED LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public static final ConcurrentHashMap<String, C06EW> LJ;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06ED.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C06ED c06ed = new C06ED();
        LIZIZ = c06ed;
        C1598406Nq c1598406Nq = c06ed.LIZ;
        if (c1598406Nq == null) {
            synchronized (c06ed) {
                c1598406Nq = c06ed.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c06ed.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LJ = new ConcurrentHashMap<>();
    }

    public static void LIZ(C06EW c06ew, boolean z, Integer num, String str) {
        String string;
        C066K c066k = C066K.LIZIZ;
        C06ET c06et = c06ew.LIZ;
        C0I0B.LJFF.LIZIZ();
        c066k.getClass();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", C06H2.CHAT.getValue());
        pairArr[1] = new Pair("panel_type", c06et.LIZ);
        pairArr[2] = new Pair("is_load_success", C066K.LIZ(z));
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        pairArr[3] = new Pair("error_code", string);
        pairArr[4] = new Pair("error_msg", str);
        C20684815ws.LJIILLIIL("load_streak_lynx_panel", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
