package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0fGS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120500fGS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC1120490fGR enumC1120490fGR) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("step", enumC1120490fGR.getValue());
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("tiktokec_rd_live_bottom_promotion_container_event", linkedHashMap);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
