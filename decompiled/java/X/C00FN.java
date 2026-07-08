package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.WatchReason;
import com.bytedance.android.livesdkapi.depend.model.live.WatchReasonItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00FN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FN {
    public static final boolean LIZ(Room room) {
        Long l;
        Map<Long, Long> map = room.adminEcShowPermission;
        if (map != null && (l = map.get(8L)) != null && l.longValue() == 1) {
            return true;
        }
        return false;
    }

    public static final String LIZIZ(Room room) {
        List<WatchReasonItem> list;
        WatchReason watchReason = room.innerWatchReason;
        if (watchReason != null && (list = watchReason.watchReasons) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<WatchReasonItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().reasonId));
            }
            return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        return null;
    }

    public static final boolean LIZJ(Room room) {
        if (room.hasCommerceGoods) {
            return true;
        }
        CommerceStruct commerceStruct = room.getCommerceStruct();
        if (commerceStruct != null && commerceStruct.commercePermission == 1) {
            return true;
        }
        return false;
    }
}
