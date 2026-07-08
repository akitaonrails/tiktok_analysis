package X;

import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: X.0RiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703430RiX {
    public final LinkedHashMap<String, C703360RiQ> LIZ = new LinkedHashMap<>();

    public C703430RiX(Set<String> set) {
        for (String str : C13LP.LJLLJ(set)) {
            this.LIZ.put(str, new C703360RiQ(str));
        }
    }

    public final C703360RiQ LIZ(String str) {
        LinkedHashMap<String, C703360RiQ> linkedHashMap = this.LIZ;
        C703360RiQ c703360RiQ = linkedHashMap.get(str);
        if (c703360RiQ == null) {
            c703360RiQ = new C703360RiQ(str);
            linkedHashMap.put(str, c703360RiQ);
        }
        return c703360RiQ;
    }
}
