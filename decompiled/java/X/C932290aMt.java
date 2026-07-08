package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFollowOptimizeSetting;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0aMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932290aMt {
    public static Map LIZ() {
        if (!C931790aM5.LIZIZ()) {
            return C2097608Jq.LJIIZILJ(C940110aZV.LJ);
        }
        if (MultiGuestFollowOptimizeSetting.INSTANCE.followFallback()) {
            return C2097608Jq.LJIIZILJ(C940110aZV.LJ);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, C11PQ<Long>> entry : C751900TeW.LJFF.entrySet()) {
            Long key = entry.getKey();
            Long lLJLZ = entry.getValue().LJLZ();
            linkedHashMap.put(key, Long.valueOf(lLJLZ != null ? lLJLZ.longValue() : -1L));
        }
        return linkedHashMap;
    }

    public static boolean LIZIZ(long j, boolean z) {
        Long l = (Long) LIZ().get(Long.valueOf(j));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isGuestFollowed, userId=");
        sbLIZ.append(j);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(l);
        C20441214yg.LIZIZ("MultiGuestV3GuestMaskControllerV2", C2188811AlT.LIZIZ(sbLIZ));
        if (l == null || (l.longValue() != 1 && l.longValue() != 2)) {
            if (z && l == null) {
                return true;
            }
            return false;
        }
        return true;
    }
}
