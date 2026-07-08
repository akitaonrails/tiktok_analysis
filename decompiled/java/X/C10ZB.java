package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.10ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ZB {
    public static final Map<String, Integer> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("(?:share/)?@.*/video/(\\w+)/?", 0);
        linkedHashMap.put("(?:share/)?@.*/photo/(\\w+)/?", 38);
        linkedHashMap.put("(?:share/)?@.*/live/(\\w+)/?", 1);
        linkedHashMap.put("(?:share/)?@([\\w\\.]+)/?($|\\?.*)", 2);
        linkedHashMap.put("(?:share/)?tag/([^/?]+)", 3);
        linkedHashMap.put("(?:share/)?music/[^/?]*-(\\d+)(?=(?:[?/]|$))", 4);
        linkedHashMap.put("@.*/playlist/[^/?]*-(\\d+)(?=(?:[?/]|$))", 27);
        linkedHashMap.put("(?:share/)?playlist-music/[^/?]*-(\\d+)(?=(?:[?/]|$))", 25);
        linkedHashMap.put("(?:share/)?stickers?/(?:detail/)?(?:.*-)?(\\w+)/?", 5);
        linkedHashMap.put("(?:share/)?discover/([^/?]+)", 24);
        linkedHashMap.put("/find/([^/?]+)", 24);
        linkedHashMap.put("/channel/([^/?]+)", 24);
        linkedHashMap.put("revenue/subscription/invitation", 28);
        linkedHashMap.put("live/subscription", 36);
        linkedHashMap.put("(?:@([\\w\\.]+)/)?now/", 29);
        linkedHashMap.put("live/monetization/square/", 32);
        linkedHashMap.put("messages/chat", 31);
        linkedHashMap.put("@.+/collection/(.+-\\d+)?", 33);
        linkedHashMap.put("place/[^/?]*-(\\d+)(?=(?:[?/]|$))", 34);
        linkedHashMap.put("product/.*", 39);
        LIZ = linkedHashMap;
    }
}
