package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.17xl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21199917xl {
    public static final C21199917xl LIZ = new C21199917xl();
    public static final HashMap<Long, C21200017xm> LIZIZ = new HashMap<>();

    public static void LIZIZ(Room room) {
        CommerceStruct commerceStruct;
        if (room != null && (commerceStruct = room.getCommerceStruct()) != null && commerceStruct.commercePermission == 1) {
            C21200017xm c21200017xmRemove = LIZIZ.remove(Long.valueOf(room.getId()));
            if (c21200017xmRemove != null) {
                c21200017xmRemove.LIZIZ.clear();
                c21200017xmRemove.LIZJ.clear();
                c21200017xmRemove.LIZLLL = null;
                c21200017xmRemove.LJ = null;
            }
        }
    }

    public final C21200017xm LIZ(Long l) {
        if (l != null && C21200717xt.LIZ()) {
            HashMap<Long, C21200017xm> map = LIZIZ;
            if (map.get(l) == null) {
                synchronized (this) {
                    try {
                        if (map.get(l) == null) {
                            map.put(l, new C21200017xm());
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return map.get(l);
        }
        return null;
    }
}
