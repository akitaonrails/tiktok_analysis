package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0opC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488000opC {
    public static final C1488000opC LIZ = new C1488000opC();

    public static Map LIZ(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            float f = context.getResources().getDisplayMetrics().density;
            linkedHashMap.put("density", String.valueOf(f));
            int iLJIIIIZZ = C14KQ.LJIIIIZZ(context);
            linkedHashMap.put("screen_width_px", String.valueOf(iLJIIIIZZ));
            linkedHashMap.put("sw", String.valueOf((int) (iLJIIIIZZ / f)));
            int iLJ = C14KQ.LJ(context);
            linkedHashMap.put("screen_height_px", String.valueOf(iLJ));
            linkedHashMap.put("sh", String.valueOf((int) (iLJ / f)));
            linkedHashMap.put("is_corner_radius_updated", "1");
            linkedHashMap.put("tux_radius_exp", "2");
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }
}
