package X;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: X.1Atp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193991Atp extends AbstractC2194001Atq {
    @Override // X.InterfaceC2194031Att
    public final boolean LIZIZ() {
        HashSet<String> hashSet = this.LIZ;
        if (hashSet != null && !hashSet.isEmpty()) {
            return false;
        }
        HashMap<String, HashSet<String>> map = this.LIZIZ;
        return map == null || map.isEmpty();
    }

    @Override // X.AbstractC2194001Atq
    public final boolean LIZLLL(String str) {
        HashSet<String> hashSet = this.LIZ;
        if (hashSet != null && hashSet.contains(str)) {
            return true;
        }
        return false;
    }

    public C2193991Atp(HashSet hashSet, HashMap map) {
        super(hashSet, map);
    }

    @Override // X.AbstractC2194001Atq
    public final boolean LJ(HashSet<String> hashSet, String str) {
        return hashSet.contains(str);
    }
}
