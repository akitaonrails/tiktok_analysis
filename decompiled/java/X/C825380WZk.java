package X;

import com.bytedance.pumbaa.aspect.apicalling.systemapi.SystemApiConfig;
import com.bytedance.pumbaa.aspect.apicalling.systemapi.SystemApiServiceImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0WZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825380WZk {
    public static void LIZ(SystemApiConfig systemApiConfig) {
        List<String> list;
        try {
            SystemApiServiceImpl.LIZ = systemApiConfig;
            C825390WZl c825390WZl = C825390WZl.LIZ;
            try {
                if (systemApiConfig == null || (list = systemApiConfig.guardFields) == null) {
                    C825390WZl.LIZIZ = null;
                } else {
                    C825390WZl.LIZIZ = new JSONArray((Collection) list);
                }
                C825480WZu.LIZJ(c825390WZl);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("PB_SYSTEM_API", AFwS200S0000000_13.get$arr$(360), 3, null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                C0WSW.LIZ("PB_SYSTEM_API", AFwS200S0000000_13.get$arr$(361), 6, th);
            }
            SystemApiServiceImpl.LIZIZ = true;
            C0WSW.LIZ("PB_SYSTEM_API", new AwS557S0100000_13(systemApiConfig, 14), 3, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList3 = C0WSW.LIZ;
            C0WSW.LIZ("PB_SYSTEM_API", new AwS557S0100000_13(e, 15), 6, null);
        }
    }
}
