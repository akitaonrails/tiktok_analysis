package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Jv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507380Jv6 {
    public static final Map<Integer, C499010Jhb> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, new C499010Jhb("emotes"));
        linkedHashMap.put(2, new C499010Jhb("badge"));
        linkedHashMap.put(5, new C499010Jhb("perks"));
        linkedHashMap.put(6, new C499010Jhb("limited_content"));
        linkedHashMap.put(7, new C499010Jhb("discord"));
        linkedHashMap.put(4, new C499010Jhb("sub_gift"));
        linkedHashMap.put(8, new C499010Jhb("sub_only_video"));
        linkedHashMap.put(9, new C499010Jhb("sub_only_space"));
        linkedHashMap.put(-4, new C499010Jhb("about_me"));
        linkedHashMap.put(-2, new C499010Jhb("main_page"));
        linkedHashMap.put(-5, new C499010Jhb("spotlight"));
        linkedHashMap.put(-6, new C499010Jhb("subfest"));
        linkedHashMap.put(-7, new C499010Jhb("multi_tier"));
        LIZ = linkedHashMap;
    }

    public static C499010Jhb LIZ(int i) {
        C499010Jhb c499010Jhb = (C499010Jhb) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (c499010Jhb == null) {
            return new C499010Jhb("unknown");
        }
        return c499010Jhb;
    }
}
