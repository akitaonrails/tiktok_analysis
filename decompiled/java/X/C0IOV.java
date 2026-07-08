package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.util.LiveOptDedupRoomExp;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0IOV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IOV {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Long l, ArrayList arrayList) {
        if (LiveOptDedupRoomExp.INSTANCE.enable() && l != null && arrayList != null && !arrayList.isEmpty()) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Room room = (Room) C13LP.LJJJLZIJ(i, arrayList);
                    if (room != null && room.getId() == l.longValue()) {
                        return true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
