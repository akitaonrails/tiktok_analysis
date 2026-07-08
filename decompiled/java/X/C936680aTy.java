package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936680aTy {
    public static void LIZ(SeiAppData seiAppData, Map map, Function0 function0) {
        HashMap map2 = new HashMap();
        List<SeiRegion> list = seiAppData.grids;
        boolean z = false;
        if (list != null) {
            int size = list.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                SeiRegion seiRegion = (SeiRegion) ListProtector.get(list, i);
                if (!TextUtils.isEmpty(seiRegion.uidStr)) {
                    map2.put(seiRegion.uidStr, Integer.valueOf(seiRegion.position));
                    if (!map.containsKey(seiRegion.uidStr)) {
                        z2 = true;
                    }
                }
            }
            z = z2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkedListChange, hasNewGuestChange:");
        sbLIZ.append(z);
        C937310aUz.LJII("MultiGuestV3FeedMaskWindowHandler", C2188811AlT.LIZIZ(sbLIZ));
        map.putAll(map2);
        if (z) {
            function0.invoke();
        }
    }
}
