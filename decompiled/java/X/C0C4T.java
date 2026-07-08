package X;

import com.bytedance.ies.abmock.ConfigItem;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C4T, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C4T {
    public static final C0C4T LIZ = new C0C4T();

    public static void LIZJ(String str) {
        Boolean boolValueOf;
        if (str == null) {
            return;
        }
        ConfigItem configItem = (ConfigItem) ((HashMap) C2503109rR.LIZ).get(str);
        if (configItem != null) {
            boolValueOf = Boolean.valueOf(configItem.isHybrid);
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C0CR3.LJ(C0CR3.LIZ, "not_hybrid", str, null, false, 12);
            return;
        }
        String strLIZIZ = C0C4X.LIZJ.LIZIZ(C0C4S.LIZJ(str), null);
        if (strLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preciseExposeVid ");
            sbLIZ.append(str);
            sbLIZ.append(" but vid is null");
            C2188811AlT.LIZIZ(sbLIZ);
            C0CR3.LJ(C0CR3.LIZ, "vid_empty", str, null, false, 12);
            return;
        }
        if (((HashMap) C2503109rR.LIZIZ).containsKey(str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("precise expose Vid key:");
            sbLIZ2.append(str);
            sbLIZ2.append(",vid:");
            sbLIZ2.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("precise expose for full expose experiment Vid key:");
            sbLIZ3.append(str);
            sbLIZ3.append(",vid:");
            sbLIZ3.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        C0C4U.LIZ.LIZ(strLIZIZ, false);
        C0CR3.LJ(C0CR3.LIZ, "success", str, strLIZIZ, false, 8);
    }

    public static Object LIZIZ(String str, boolean z) {
        ConfigItem configItem;
        Object obj;
        boolean zLIZ = C306900C1g.LIZ(str);
        if (zLIZ && str != null) {
            C306900C1g.LIZ.put(str, Boolean.TRUE);
            C0CR3.LJ(C0CR3.LIZ, "time_out", str, null, z, 4);
        }
        if ((!zLIZ || !z) && str != null && C0C4X.LIZJ.contains(str)) {
            if (!zLIZ && str != null) {
                C306900C1g.LIZ.put(str, Boolean.FALSE);
            }
            LIZJ(str);
            return null;
        }
        Map<String, ConfigItem> map = C2503109rR.LIZ;
        if (map == null || (configItem = (ConfigItem) ((HashMap) map).get(str)) == null || (obj = configItem.defaultValue) == null) {
            return null;
        }
        return obj;
    }

    public static final Object LIZ(Object obj, String str, boolean z) {
        boolean zLIZ = C306900C1g.LIZ(str);
        if (zLIZ && str != null) {
            C306900C1g.LIZ.put(str, Boolean.TRUE);
            C0CR3.LJ(C0CR3.LIZ, "time_out", str, null, z, 4);
        }
        if ((!zLIZ || !z) && str != null && C0C4X.LIZJ.contains(str)) {
            if (!zLIZ && str != null) {
                C306900C1g.LIZ.put(str, Boolean.FALSE);
            }
            LIZJ(str);
            return null;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
