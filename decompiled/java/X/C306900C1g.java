package X;

import com.bytedance.ies.abmock.ConfigItem;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C306900C1g {
    public static final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();

    public static boolean LIZ(String str) {
        ConfigItem configItem;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str == null || (configItem = (ConfigItem) ((HashMap) C2503109rR.LIZ).get(str)) == null || !configItem.isHybrid) {
            return false;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZ;
        if (concurrentHashMap.containsKey(str) && Intrinsics.LJFF(concurrentHashMap.get(str), Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        if (!concurrentHashMap.containsKey(str) && !C0C4X.LIZJ.contains(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            z3 = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkTimeout ");
        sbLIZ.append(str);
        sbLIZ.append(" is timeout:");
        sbLIZ.append(z3);
        C2188811AlT.LIZIZ(sbLIZ);
        return z3;
    }
}
