package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.066L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C066L {
    public static final C066L LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public static final ConcurrentHashMap<String, C066M> LJ;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C066L.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C066L c066l = new C066L();
        LIZIZ = c066l;
        C1598406Nq c1598406Nq = c066l.LIZ;
        if (c1598406Nq == null) {
            synchronized (c066l) {
                c1598406Nq = c066l.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c066l.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LJ = new ConcurrentHashMap<>();
    }

    public static void LIZ(C066M c066m) {
        long jLongValue;
        long jLongValue2;
        C066K c066k = C066K.LIZIZ;
        String str = c066m.LIZ;
        String str2 = c066m.LIZIZ;
        long j = c066m.LIZJ;
        long j2 = c066m.LIZLLL;
        Long l = c066m.LJ;
        long jLongValue3 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = c066m.LJFF;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        Long l3 = c066m.LJI;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        }
        C0I0B.LJFF.LIZIZ();
        c066k.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("conversation_id", str), new Pair("conversation_type", String.valueOf(C1567806Bw.LIZIZ(str))), new Pair("enter_from", str2), new Pair("click_time", String.valueOf(j)), new Pair("start_request_time", String.valueOf(j2)), new Pair("get_response_time", String.valueOf(jLongValue)), new Pair("send_message_time", String.valueOf(jLongValue2)), new Pair("pet_invite_cmd_message_time", String.valueOf(jLongValue3)));
        C06C6.LIZIZ.getClass();
        mapLJIIJ.put("pet_type", C1567906Bx.LIZJ(C06C6.LIZIZ(str)));
        C20684815ws.LJIILLIIL("streak_pet_invite_sent_latency", mapLJIIJ);
    }

    public static void LIZIZ(String str, boolean z) {
        C066M c066mRemove;
        ConcurrentHashMap<String, C066M> concurrentHashMap = LJ;
        C066M c066m = concurrentHashMap.get(str);
        if (c066m != null) {
            c066m.LJ = Long.valueOf(System.currentTimeMillis());
        }
        if (z && (c066mRemove = concurrentHashMap.remove(str)) != null) {
            LIZ(c066mRemove);
        }
    }
}
