package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.streak.impl.monitor.RestoreDelayCallbackData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06EC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06EC {
    public static final C06EC LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final ConcurrentHashMap<String, C06EH> LIZLLL;
    public static final ConcurrentHashMap<String, C09AE> LJ;
    public static final C054G LJFF;
    public static final C1231704rr LJI;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06EC.class, "ttDispatcher", "getTtDispatcher()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C06EC c06ec = new C06EC();
        LIZIZ = c06ec;
        LIZLLL = new ConcurrentHashMap<>();
        LJ = new ConcurrentHashMap<>();
        C1598406Nq c1598406Nq = c06ec.LIZ;
        if (c1598406Nq == null) {
            synchronized (c06ec) {
                c1598406Nq = c06ec.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c06ec.LIZ = c1598406Nq;
                }
            }
        }
        LJFF = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LJI = new C1231704rr("RestoreDelayMonitor", null, 6);
    }

    public static void LIZ(C06EC c06ec, RestoreDelayCallbackData restoreDelayCallbackData, long j, boolean z) {
        String str;
        C0I0B.LJFF.LIZIZ();
        c06ec.getClass();
        long j2 = restoreDelayCallbackData.receiveRestoreResponse;
        long j3 = restoreDelayCallbackData.clickRestoreButton;
        long j4 = j2 - j3;
        long jLongValue = -1;
        if (j4 <= 0) {
            j4 = -1;
        }
        long j5 = j - j3;
        if (!z) {
            jLongValue = ((Number) C06EJ.LIZ.getValue()).longValue();
        } else if (j5 > 0) {
            jLongValue = j5;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("click_to_restore_response", String.valueOf(j4));
        pairArr[1] = new Pair("click_to_restore_message", String.valueOf(jLongValue));
        pairArr[2] = new Pair("restore_result", String.valueOf(restoreDelayCallbackData.restoreResult));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("has_restore_message", str);
        C20684815ws.LJIILLIIL("streak_restore_latency", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
