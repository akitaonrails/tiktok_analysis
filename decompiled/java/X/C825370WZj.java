package X;

import com.bytedance.pumbaa.aspect.apicalling.sdk.SDKConfig;
import com.bytedance.pumbaa.aspect.apicalling.sdk.SDKServiceImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0WZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825370WZj {
    public static void LIZ(SDKConfig sDKConfig) {
        List<String> list;
        try {
            SDKServiceImpl.LIZ = sDKConfig;
            C825400WZm c825400WZm = C825400WZm.LIZ;
            try {
                if (sDKConfig == null || (list = sDKConfig.guardFields) == null) {
                    C825400WZm.LIZIZ = null;
                } else {
                    C825400WZm.LIZIZ = new JSONArray((Collection) list);
                }
                C825480WZu.LIZJ(c825400WZm);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("PB_3rd_SDK", AFwS200S0000000_13.get$arr$(358), 3, null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                C0WSW.LIZ("PB_3rd_SDK", AFwS200S0000000_13.get$arr$(359), 6, th);
            }
            SDKServiceImpl.LIZIZ = true;
            C0WSW.LIZ("PB_3rd_SDK", new AwS557S0100000_13(sDKConfig, 11), 3, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList3 = C0WSW.LIZ;
            C0WSW.LIZ("PB_3rd_SDK", new AwS557S0100000_13(e, 12), 6, e);
        }
    }
}
