package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895190Z9x {
    public static final C895190Z9x LIZ = new C895190Z9x();
    public static final HashMap<String, List<C169A>> LIZIZ;

    static {
        new ConcurrentHashMap();
        LIZIZ = new HashMap<>();
    }

    public static C829840Wgw LIZ(String str) {
        int conversationType;
        int unreadCount;
        long createdAt;
        String string;
        long updatedTime;
        List listLLIIII;
        C869590Y9l lastShowMessage;
        C869590Y9l lastShowMessage2;
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        String strValueOf = String.valueOf(C0YNP.LJII(str));
        IStreakService.LJJIIZ.getClass();
        int msgType = 0;
        StreakData streakDataR = C06LY.LIZ().r(str, false);
        C595710NYb c595710NYbLIZJ = C0O26.LIZJ(AFwS248S0000000_14.get$arr$(368), strValueOf);
        InterfaceC897380ZIi.LIZIZ.getClass();
        C595660NXw c595660NXwLIZIZ = C897370ZIh.LIZ().LIZIZ(c595710NYbLIZJ);
        C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
        if (c0y8tLJIL != null) {
            conversationType = c0y8tLJIL.getConversationType();
            unreadCount = (int) c0y8tLJIL.getUnreadCount();
            C869590Y9l lastShowMessage3 = c0y8tLJIL.getLastShowMessage();
            if (lastShowMessage3 != null) {
                msgType = lastShowMessage3.getMsgType();
            }
        } else {
            conversationType = 0;
            unreadCount = 0;
        }
        long conversationShortId = 0;
        if (c0y8tLJIL != null && (lastShowMessage2 = c0y8tLJIL.getLastShowMessage()) != null) {
            createdAt = lastShowMessage2.getCreatedAt();
        } else {
            createdAt = 0;
        }
        Boolean boolValueOf = null;
        if (c0y8tLJIL != null && (lastShowMessage = c0y8tLJIL.getLastShowMessage()) != null) {
            string = Long.valueOf(lastShowMessage.getSender()).toString();
        } else {
            string = null;
        }
        boolean zLJFF = Intrinsics.LJFF(string, curUserId);
        if (c0y8tLJIL != null) {
            updatedTime = c0y8tLJIL.getUpdatedTime();
        } else {
            updatedTime = 0;
        }
        boolean zLIZ = C06GX.LIZ();
        if (c0y8tLJIL != null) {
            conversationShortId = c0y8tLJIL.getConversationShortId();
        }
        if (c0y8tLJIL != null) {
            boolValueOf = Boolean.valueOf(c0y8tLJIL.isMute());
        }
        C2269851Dst c2269851Dst = new C2269851Dst(curUserId, str, conversationShortId, strValueOf, conversationType, unreadCount, msgType, createdAt, zLJFF, updatedTime, streakDataR, c595660NXwLIZIZ, zLIZ, boolValueOf);
        HashMap<String, List<C169A>> map = LIZIZ;
        synchronized (map) {
            try {
                List<C169A> list = map.get(str);
                if (list == null || (listLLIIII = C13LP.LLIIII(list)) == null) {
                    listLLIIII = C13BV.INSTANCE;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return new C829840Wgw(str, c2269851Dst, listLLIIII);
    }
}
