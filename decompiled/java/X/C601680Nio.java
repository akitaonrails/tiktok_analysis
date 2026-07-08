package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Nio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601680Nio {
    public static String LIZ = "";
    public static final ConcurrentHashMap<String, C601670Nin> LIZIZ = new ConcurrentHashMap<>();

    static {
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LJ(new InterfaceC1400360mXq() { // from class: X.0Nip
            @Override // X.InterfaceC1400360mXq
            public final void LLLLLLZZ(int i, User user, User user2) {
                if (i == 3) {
                    return;
                }
                Iterator it2 = C15442062u.LJI(C601680Nio.LIZ(), C601680Nio.LIZIZ.keySet()).iterator();
                while (it2.hasNext()) {
                    C601680Nio.LIZIZ.remove(it2.next());
                }
            }
        });
    }

    public static String LIZ() {
        C0I0B c0i0b = C0I0B.LJFF;
        if (!((C1400340mXo) c0i0b.LIZ()).LIZJ(LIZ)) {
            String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            LIZ = curUserId;
        }
        return LIZ;
    }

    public static Map LIZIZ(String str) {
        C601670Nin c601670NinPutIfAbsent;
        ConcurrentHashMap<String, C601670Nin> concurrentHashMap = LIZIZ;
        String strLIZ = LIZ();
        C601670Nin c601670Nin = concurrentHashMap.get(strLIZ);
        if (c601670Nin == null && (c601670NinPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZ, (c601670Nin = new C601670Nin()))) != null) {
            c601670Nin = c601670NinPutIfAbsent;
        }
        Map<String, Object> map = c601670Nin.LIZ.get(str);
        if (map == null) {
            return C2097608Jq.LJ();
        }
        return map;
    }
}
