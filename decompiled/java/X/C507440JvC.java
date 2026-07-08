package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0JvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507440JvC {
    public static final Map<Integer, C507450JvD> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, new C507450JvD(1, "emotes"));
        linkedHashMap.put(2, new C507450JvD(2, "badge"));
        linkedHashMap.put(5, new C507450JvD(5, "perks"));
        linkedHashMap.put(6, new C507450JvD(6, "limited_content"));
        linkedHashMap.put(7, new C507450JvD(7, "discord"));
        linkedHashMap.put(8, new C507450JvD(8, "sub_only_video"));
        linkedHashMap.put(9, new C507450JvD(9, "sub_only_space"));
        linkedHashMap.put(-4, new C507450JvD(-4, "about_me"));
        linkedHashMap.put(-2, new C507450JvD(-2, "main_page"));
        linkedHashMap.put(-5, new C507450JvD(-5, "spotlight"));
        linkedHashMap.put(-6, new C507450JvD(-6, "subfest"));
        linkedHashMap.put(-7, new C507450JvD(-7, "multi_tier"));
        LIZ = linkedHashMap;
    }

    public static C507450JvD LIZ(int i) {
        C507450JvD c507450JvD = (C507450JvD) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (c507450JvD == null) {
            return new C507450JvD(0, "unknown");
        }
        return c507450JvD;
    }
}
