package X;

import com.ss.android.ugc.aweme.pns.gatekeeper.api.tools.PNSGKToolItem;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.100J, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C100J {
    public static C100I LIZ(PNSGKToolItem pNSGKToolItem) {
        String str;
        boolean zBooleanValue;
        C100K c100k;
        Map map;
        Boolean bool;
        Boolean bool2;
        C100P c100p = C100L.Companion;
        Object obj = pNSGKToolItem.getRaw().get("action_type");
        if (!(obj instanceof String)) {
            obj = null;
        }
        c100p.getClass();
        boolean zBooleanValue2 = false;
        for (C100L c100l : C100L.values()) {
            if (Intrinsics.LJFF(c100l.getRaw(), obj)) {
                C100Q c100q = C100M.Companion;
                Object obj2 = pNSGKToolItem.getRaw().get("params_type");
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                c100q.getClass();
                for (C100M c100m : C100M.values()) {
                    if (Intrinsics.LJFF(c100m.getRaw(), obj2)) {
                        Object obj3 = pNSGKToolItem.getRaw().get("params");
                        if (!(obj3 instanceof String) || (str = (String) obj3) == null || str.length() <= 0) {
                            return null;
                        }
                        String signal = pNSGKToolItem.getSignal();
                        Object obj4 = pNSGKToolItem.getRaw().get("persistent");
                        if ((obj4 instanceof Boolean) && (bool2 = (Boolean) obj4) != null) {
                            zBooleanValue = bool2.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        C100R c100r = C100K.Companion;
                        Object obj5 = pNSGKToolItem.getRaw().get("scope");
                        if (!(obj5 instanceof String)) {
                            obj5 = null;
                        }
                        c100r.getClass();
                        C100K[] c100kArrValues = C100K.values();
                        int length = c100kArrValues.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                c100k = c100kArrValues[i];
                                if (Intrinsics.LJFF(c100k.getRaw(), obj5)) {
                                    break;
                                }
                                i++;
                            } else {
                                c100k = C100K.UID;
                                break;
                            }
                        }
                        Object obj6 = pNSGKToolItem.getRaw().get("trigger");
                        if (obj6 instanceof Map) {
                            map = (Map) obj6;
                        } else {
                            map = null;
                        }
                        Object obj7 = pNSGKToolItem.getRaw().get("dry_run");
                        if ((obj7 instanceof Boolean) && (bool = (Boolean) obj7) != null) {
                            zBooleanValue2 = bool.booleanValue();
                        }
                        return new C100I(signal, c100l, c100m, str, zBooleanValue, c100k, map, zBooleanValue2);
                    }
                }
                return null;
            }
        }
        return null;
    }
}
