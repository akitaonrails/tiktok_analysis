package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.017y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2836017y {
    public static final LinkedList<Long> LIZ = new LinkedList<>();
    public static final HashMap<Long, Long> LIZIZ = new HashMap<>();
    public static final Keva LIZJ;

    static {
        Keva repo = Keva.getRepo("gift_send");
        LIZJ = repo;
        Iterator it2 = a0.LJJLIIIJILLIZJL(repo.getString(LIZ(), ""), new String[]{" "}, 0, 6).iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{","}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() == 2) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                if (lLJIILIIL != null && lLJIILIIL2 != null) {
                    LIZ.add(lLJIILIIL);
                    LIZIZ.put(lLJIILIIL, lLJIILIIL2);
                }
            }
        }
    }

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recent_gifts_");
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
        Collection<Long> collectionValues = LIZIZ.values();
        if (collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            if (((Long) it2.next()).longValue() > jCurrentTimeMillis) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        Collection<Long> collectionValues = LIZIZ.values();
        if (collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            if (((Long) it2.next()).longValue() > jCurrentTimeMillis) {
                return true;
            }
        }
        return false;
    }
}
