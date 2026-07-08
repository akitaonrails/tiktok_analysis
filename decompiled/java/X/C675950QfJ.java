package X;

import android.graphics.Bitmap;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0QfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675950QfJ {
    public static final C675950QfJ LIZ = new C675950QfJ();
    public static final int LIZIZ;
    public static final ConcurrentHashMap<String, C676330Qfv> LIZJ;
    public static final ConcurrentLinkedQueue<String> LIZLLL;

    static {
        int iIntValue = C1205704nf.LIZ() ? 3 + ((Number) C107000aq.LIZ.getValue()).intValue() : 3;
        LIZIZ = iIntValue;
        LIZJ = new ConcurrentHashMap<>(iIntValue);
        LIZLLL = new ConcurrentLinkedQueue<>();
    }

    public static Keva LIZ() {
        String curUserId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ecom_photo_search_");
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C676330Qfv LIZIZ(String str) {
        return LIZJ.get(str);
    }

    public static C676330Qfv LIZJ(String str) {
        LIZLLL.remove(str);
        return LIZJ.remove(str);
    }

    public static void LIZLLL(Bitmap bitmap, String str) {
        if (C1205704nf.LIZ()) {
            ConcurrentHashMap<String, C676330Qfv> concurrentHashMap = LIZJ;
            if (concurrentHashMap.containsKey(str)) {
                LIZ.getClass();
                C676330Qfv c676330QfvLIZJ = LIZJ(str);
                if (c676330QfvLIZJ == null) {
                    c676330QfvLIZJ = new C676330Qfv();
                }
                LIZLLL.add(str);
                c676330QfvLIZJ.LIZ = bitmap;
                concurrentHashMap.put(str, c676330QfvLIZJ);
                return;
            }
        }
        ConcurrentHashMap<String, C676330Qfv> concurrentHashMap2 = LIZJ;
        if (concurrentHashMap2.size() >= LIZIZ) {
            String strPoll = LIZLLL.poll();
            if (strPoll == null) {
                strPoll = "";
            }
            concurrentHashMap2.remove(strPoll);
        }
        if (!C1205704nf.LIZ() && concurrentHashMap2.containsKey(str)) {
            return;
        }
        LIZLLL.add(str);
        C676330Qfv c676330Qfv = concurrentHashMap2.get(str);
        if (c676330Qfv == null) {
            c676330Qfv = new C676330Qfv();
        }
        c676330Qfv.LIZ = bitmap;
        concurrentHashMap2.put(str, c676330Qfv);
    }

    public static void LJ(String str, byte[] bArr) {
        ConcurrentHashMap<String, C676330Qfv> concurrentHashMap = LIZJ;
        if (concurrentHashMap.containsKey(str)) {
            C676330Qfv c676330QfvLIZJ = LIZJ(str);
            if (c676330QfvLIZJ == null) {
                c676330QfvLIZJ = new C676330Qfv();
            }
            LIZLLL.add(str);
            c676330QfvLIZJ.LIZIZ = bArr;
            concurrentHashMap.put(str, c676330QfvLIZJ);
            return;
        }
        if (concurrentHashMap.size() >= LIZIZ) {
            String strPoll = LIZLLL.poll();
            if (strPoll == null) {
                strPoll = "";
            }
            concurrentHashMap.remove(strPoll);
        }
        LIZLLL.add(str);
        C676330Qfv c676330Qfv = concurrentHashMap.get(str);
        if (c676330Qfv == null) {
            c676330Qfv = new C676330Qfv();
        }
        c676330Qfv.LIZIZ = bArr;
        concurrentHashMap.put(str, c676330Qfv);
    }
}
