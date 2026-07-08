package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0vDX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733730vDX {
    public final ConcurrentHashMap<String, String> LIZ;

    public C1733730vDX() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        concurrentHashMap.put("type", "module");
        concurrentHashMap.put("module_name", "bottom_banner_verify");
        concurrentHashMap.put("click_for", "verify");
        concurrentHashMap.put("enter_from", "self_banner_verify");
        concurrentHashMap.put("source_page_type", "video");
        ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
        concurrentHashMap2.putAll(concurrentHashMap);
        this.LIZ = concurrentHashMap2;
    }
}
