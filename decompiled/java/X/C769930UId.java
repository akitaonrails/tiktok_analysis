package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0UId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C769930UId {
    public static final Set<Integer> LIZ;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(140001);
        LIZ = linkedHashSet;
    }

    public static String LIZ(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1256931900) {
                if (iHashCode != 513444979) {
                    if (iHashCode == 1660861214) {
                        str.equals("effect_gift");
                        return "default";
                    }
                    return "default";
                }
                if (!str.equals("effect_gift_game")) {
                    return "default";
                }
                return "interactive_game";
            }
            if (!str.equals("effect_gift_music")) {
                return "default";
            }
            return "music";
        }
        return "default";
    }
}
