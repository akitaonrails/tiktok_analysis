package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0rfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597190rfJ {
    public static boolean LIZ(C1597310rfV c1597310rfV) {
        Integer num;
        Integer num2;
        Boolean bool;
        if (!C298520Bn0.LIZ() || C295190Bhd.LIZ()) {
            return false;
        }
        if (!C1599090riN.LIZ()) {
            return !c1597310rfV.LIZJ(EnumC1597060rf6.HIGHLIGHT).isEmpty();
        }
        Map<String, Object> mapLIZ = c1597310rfV.LIZ(EnumC1597060rf6.STORY);
        if (C1209404oG.LIZ()) {
            Object obj = mapLIZ.get("has_more");
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && !bool.booleanValue()) {
                if (c1597310rfV.LIZJ(EnumC1597060rf6.HIGHLIGHT).isEmpty()) {
                    return false;
                }
                return true;
            }
            Object obj2 = mapLIZ.get("mix_rank_highlights_total_count");
            if (!(obj2 instanceof Integer) || (num2 = (Integer) obj2) == null || num2.intValue() <= 0) {
                return false;
            }
            return true;
        }
        Object obj3 = mapLIZ.get("highlight_total_count");
        if (!(obj3 instanceof Integer) || (num = (Integer) obj3) == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }
}
