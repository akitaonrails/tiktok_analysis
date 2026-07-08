package X;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: X.1Ato, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193981Ato extends AbstractC2194001Atq {
    @Override // X.InterfaceC2194031Att
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractC2194001Atq
    public final boolean LIZLLL(String str) {
        return !this.LIZ.contains(str);
    }

    public C2193981Ato(HashSet hashSet, HashMap map) {
        super(hashSet, map);
    }

    @Override // X.AbstractC2194001Atq
    public final boolean LJ(HashSet<String> hashSet, String str) {
        return !hashSet.contains(str);
    }
}
