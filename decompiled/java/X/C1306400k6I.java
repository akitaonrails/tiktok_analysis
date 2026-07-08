package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0k6I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306400k6I {
    public final String LIZ;
    public Map<String, Object> LIZIZ;
    public Pair<String, ? extends Map<String, ? extends Object>> LIZJ;

    public C1306400k6I(String str) {
        this.LIZ = str;
    }

    public final void LIZ(Object obj, String str) {
        Map<String, Object> linkedHashMap = this.LIZIZ;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.LIZIZ = linkedHashMap;
        linkedHashMap.put(str, obj);
    }
}
