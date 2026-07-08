package X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yRU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857700yRU implements Serializable {
    public static final int $stable = 8;
    public final Map<String, String> commonParams;
    public final List<String> hashTags;
    public final boolean isAIGC;
    public final String msgId;
    public final List<String> urls;

    public final boolean isAIGC() {
        return this.isAIGC;
    }

    public C1857700yRU(List<String> list, String str, boolean z, Map<String, String> map, List<String> list2) {
        this.urls = list;
        this.msgId = str;
        this.isAIGC = z;
        this.commonParams = map;
        this.hashTags = list2;
    }
}
